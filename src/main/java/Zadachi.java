import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zadachi {

    private static final Logger logger = LogManager.getLogger(Zadachi.class);

    public void zadacha1() {
        Integer a      = 128;
        Integer b      = 128;
        boolean result = a == b;
        logger.info(result);
    }

    public void zadacha2() {
        Integer a = 127;
        Integer b = 127;
        boolean result = a == b;
        logger.info(result);
    }

    public void zadacha3() {
        String a = "123";
        String b = "123";
        boolean result = a == b;
        logger.info(result);
    }

    public void zadacha4() {
        String a = new String("123");
        String b = new String("123");
        boolean result = a == b;
        logger.info(result);
    }

    public void zadacha5() {
        String a = new String("123");
        String b = new String("123");
        boolean result = a.equals(b);
        logger.info(result);
    }

    public void zadacha6() {
        //Написать метод поиска 3х минимумов в целочисленном ArrayList
    }

}
