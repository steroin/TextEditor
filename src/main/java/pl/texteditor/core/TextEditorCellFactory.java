package pl.texteditor.core;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.text.TextFlow;
import javafx.util.Callback;

public class TextEditorCellFactory implements Callback<ListView<TextFlow>, ListCell<TextFlow>> {
    @Override
    public ListCell<TextFlow> call(ListView<TextFlow> param) {
        return new TextFieldListCell<>(new TextEditorStringConverter());
    }
}
