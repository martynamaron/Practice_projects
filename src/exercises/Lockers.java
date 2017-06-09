package exercises;

public class Lockers {

    private static boolean[] lockers = new boolean[101];

    public static void whichLockersAreOpen() {
        for (int iteration = 1; iteration < 101; iteration++) {
            int start = 0;
            for (boolean lckr : lockers) {
                if (start + iteration <= 100) {
                    lockers[start + iteration] = !lockers[start + iteration];
                    start = start + iteration;
                } else break;
            }
            System.out.println("Locker " + iteration + " is " + lockers[iteration]);
        }
    }
}
