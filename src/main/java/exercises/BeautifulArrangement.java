package exercises;

//https://leetcode.com/problems/beautiful-arrangement/#/description
public class BeautifulArrangement {


    public int countArrangement(int number) {
        int[] arrangement = new int[number];
        for (int i = 0; i < number; i++) {
            arrangement[i] = i+1;
        }
        for (int i : arrangement){
            System.out.println("Entry: " + i);
        }
        isTheArrangementBeautiful(arrangement);

        return 0;
    }

    private boolean isTheArrangementBeautiful(int[] arrangement) {
        int position;
        int entry;
        for (int i = 0; i < arrangement.length; i++) {
            position = i + 1;
            entry = arrangement[i];
            if (position % entry == 0 || entry % position == 0) {
                return true;
            }
        }
        return false;
    }
}
