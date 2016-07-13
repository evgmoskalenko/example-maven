package autoTests.utils.convertors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.String.format;

public class PrimitiveConverter {

    private static final Logger logger = LogManager.getLogger(PrimitiveConverter.class);

    public void floatToChar(float floatValue) {
        char charValue = (char) floatValue;
        logger.info(format("Float to Char: Input float value is '%s'. Output char value is '%s'", floatValue, charValue));
    }

    public void intToChar(int intValue) {
        char charValue = (char) intValue;
        logger.info(format("Int to Char: Input int value is '%d'. Output char value is '%s'", intValue, charValue));
    }

    public void charToInt(char charValue) {
        int intValue = charValue;
        logger.info(format("Char to Int: Input float value is '%s'. Output char value is '%d'", charValue, intValue));
    }

}
