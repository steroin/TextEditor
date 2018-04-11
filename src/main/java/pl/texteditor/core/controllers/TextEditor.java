package pl.texteditor.core.controllers;

import com.sun.javafx.collections.ObservableListWrapper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import pl.texteditor.core.TextEditorCellFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TextEditor extends AnchorPane implements Initializable {

    @FXML
    private ListView<TextFlow> textEditorListView;

    public TextEditor() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/editor/TextEditor.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textEditorListView.setCellFactory(new TextEditorCellFactory());
        mockListView();
    }

    private void mockListView() {
        List<TextFlow> lines = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lines.add(new TextFlow(new Text("sadsasasdasd")));
        }
        textEditorListView.setItems(new ObservableListWrapper<>(lines));
    }
}
