package exercises;

public class Lockers {

    private static boolean[] lockers = new boolean[101];

    public void whichLockersAreOpen() {
        for (int iteration = 1; iteration < 101; iteration++) {
            int start = 0;
            for (boolean lckr : lockers) {
                if (start + iteration <= 100) {
                    lockers[start + iteration] = !lockers[start + iteration];
                    start = start + iteration;
                } else break;
            }
            System.out.println("Locker " + iteration + " is " + getLockerState(lockers[iteration]));
        }
    }

    private String getLockerState(boolean isOpen){
        if (isOpen) {
            return "open";
        } else {
            return "closed";
        }
    }
}
