public class MyRange {
    private static final char ASCIL_VALUE_1 = 48;
    private final String input;
    public MyRange(String input) {
        this.input = input;
    }

    public boolean isStratWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int getStart(){
        if (isStratWithInclude()){
            return  this.input.charAt(1) - ASCIL_VALUE_1;
        }
        else {
            return  -1;
        }
    }
}
