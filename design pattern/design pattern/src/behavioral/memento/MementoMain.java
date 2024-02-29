package behavioral.memento;

public class MementoMain {
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.write("Shoot And");
        editor.printText();
        editor.write("Shoot And Score");
        editor.printText();
        editor.write("Shoot And Score to Goal!");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

    }
}
