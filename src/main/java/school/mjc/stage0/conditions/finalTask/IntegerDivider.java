package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        switch (divider) {
            case (0):
                System.out.println("division by zero");
                break;
            default:
                int res1 = dividend / divider;
                int res2 = res1 * divider;
                if (res2 == dividend) {
                    System.out.println("can be divided completely");
                } else if (res2 < dividend || res2 > dividend) {
                    System.out.println("cannot be divided completely");
                }
                break;
        }

    }
}
