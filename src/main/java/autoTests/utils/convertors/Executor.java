package autoTests.utils.convertors;

public class Executor {

    static float floatValue = 65.5f;
    static int   intValue   = 65;
    static char  charValue  = 'A';

    public static void main(String args[]) {
        PrimitiveConverter primitiveConverter = new PrimitiveConverter();

        primitiveConverter.floatToChar(floatValue);
        primitiveConverter.intToChar(intValue);
        primitiveConverter.charToInt(charValue);
        primitiveConverter.charToInt('B');
        primitiveConverter.charToInt('C');
        primitiveConverter.charToInt('D');
        primitiveConverter.charToInt('F');
        primitiveConverter.charToInt('G');
        primitiveConverter.charToInt('H');
        primitiveConverter.charToInt('i');
        primitiveConverter.charToInt('I');
        primitiveConverter.charToInt('j');
        primitiveConverter.charToInt('J');
        primitiveConverter.charToInt('K');
    }

}
