import com.DesignPattern.Behavioral.Command.*;

public class CommandPatternDemo {

    public static void main(String[] args) {
        Document document = new Document();
        Editor editor = new Editor();

        Command writeHello = new WriteCommand(document, "Hello ");
        Command writeWorld = new WriteCommand(document, "World!");

        editor.executeCommand(writeHello);
        editor.executeCommand(writeWorld);

        System.out.println("Content after writes: " + document.read());

        editor.undoLastCommand();
        System.out.println("Content after undo: " + document.read());

        editor.undoLastCommand();
        System.out.println("Content after second undo: " + document.read());
    }
}
