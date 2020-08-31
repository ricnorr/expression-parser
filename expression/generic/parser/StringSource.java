package expression.generic.parser;

public class StringSource implements ExpressionSource {

    private final String data;
    private int pointer;

    public StringSource(String data) {
        this.data = data;
    }
    public char nextChar() {
        return data.charAt(pointer++);
    }
    public int getPointer() {
        return pointer;
    }
    public char backChar() {return data.charAt((--pointer) - 1);}
    public boolean hasNext() {
        return pointer < data.length();
    }

}
