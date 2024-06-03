import com.DesignPattern.Behavioral.Memento.*;

public class MementoPatternDemo {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CareTaker caretaker = new CareTaker();

        textEditor.setText("Hello");
        caretaker.saveMemento(textEditor.save());
        System.out.println("Text: " + textEditor.getText());

        textEditor.setText("Hello, World!");
        caretaker.saveMemento(textEditor.save());
        System.out.println("Text: " + textEditor.getText());

        textEditor.setText("Hello, World! How are you?");
        System.out.println("Text: " + textEditor.getText());

        textEditor.restore(caretaker.getMemento());
        System.out.println("Undo 1: " + textEditor.getText());

        textEditor.restore(caretaker.getMemento());
        System.out.println("Undo 2: " + textEditor.getText());
    }
}
