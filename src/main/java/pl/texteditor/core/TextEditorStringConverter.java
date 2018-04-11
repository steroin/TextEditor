package pl.texteditor.core;

import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.util.StringConverter;

public class TextEditorStringConverter extends StringConverter<TextFlow> {
    @Override
    public String toString(TextFlow object) {
        return getText(object);
    }

    @Override
    public TextFlow fromString(String string) {
        return new TextFlow(new Text(string));
    }

    private String getText(TextFlow textFlow) {
        StringBuilder sb = new StringBuilder();
        textFlow.getChildren().forEach(node -> sb.append(((Text) node).getText()));
        return sb.toString();
    }
}
