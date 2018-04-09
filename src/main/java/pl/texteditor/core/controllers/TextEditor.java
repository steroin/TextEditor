package pl.texteditor.core.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TextEditor extends AnchorPane {
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
}
