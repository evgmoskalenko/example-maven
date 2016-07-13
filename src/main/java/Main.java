import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Zadachi zadachi = new Zadachi();
        zadachi.zadacha1();
        zadachi.zadacha2();
        zadachi.zadacha3();
        zadachi.zadacha4();
        zadachi.zadacha5();

        Fibonachi fibonachi = new Fibonachi();

        Sudoku sudoku = new Sudoku();
    }

}
