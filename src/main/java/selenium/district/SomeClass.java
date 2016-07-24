package selenium.district;

public class SomeClass {

    private static final int BOLWE_MENWE = 0;
    private static final int MENWE_BOLWE = 1;

    /**
     * IF & ELSE
     */

    public static void someMethodWithIfElse(int bolweMenwe) {
        if (bolweMenwe == BOLWE_MENWE) {
            System.out.println("IF & ELSE: метод от большего к меньшему");
        } else if (bolweMenwe == MENWE_BOLWE){
            System.out.println("IF & ELSE: метод от меньшего к большему");
        }
    }

    /**
     * SwitchCase
     */

    public static void someMethodWithSwitchCase(int bolweMenwe) {
        switch (bolweMenwe) {
            case BOLWE_MENWE:
                System.out.println("SWITCH & CASE: метод от большего к меньшему");
                break;
            case MENWE_BOLWE:
                System.out.println("SWITCH & CASE: метод от меньшего к большему");
                break;
            default:
                throw new ExceptionInInitializerError("Error message - 'Invalid status..'");
        }
    }

    /**
     * SwitchCase with ENUM
     */

    enum Choice {
        Choice1, Choice2
    }

    public static void someMethodWithSwitchCaseAndEnum(Choice choice) {
        switch (choice) {
            case Choice1:
                System.out.println("SWITCH & CASE & ENUM: метод от большего к меньшему");
                break;
            case Choice2:
                System.out.println("SWITCH & CASE & ENUM: метод от меньшего к большему");
                break;
            default:
                throw new ExceptionInInitializerError("Error message - 'Invalid status..'");
        }
    }

    public static void main(String[] args) {
        someMethodWithIfElse(BOLWE_MENWE);
        someMethodWithIfElse(MENWE_BOLWE);

        someMethodWithSwitchCase(BOLWE_MENWE);
        someMethodWithSwitchCase(MENWE_BOLWE);

        Choice ch1 = Choice.Choice1;
        someMethodWithSwitchCaseAndEnum(ch1);
        Choice ch2 = Choice.Choice2;
        someMethodWithSwitchCaseAndEnum(ch2);

        someMethodWithSwitchCaseAndEnum(Choice.Choice1);
        someMethodWithSwitchCaseAndEnum(Choice.Choice2);
    }

}
