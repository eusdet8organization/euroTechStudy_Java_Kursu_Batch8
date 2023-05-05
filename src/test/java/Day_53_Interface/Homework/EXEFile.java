package Day_53_Interface.Homework;

public class EXEFile implements ReadFile{
    @Override
    public String open() {
        return "opening.exe";
    }

    @Override
    public String read() {
        return "readind.exe";
    }

    @Override
    public String save() {
        return "saving.exe";
    }

    @Override
    public String closed() {
        return "closing.exe";
    }
}
