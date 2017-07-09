package exercises;

//https://leetcode.com/
public class RomanNumerals {

    private String[] I = {"", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix"};
    private String[] X = {"", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc"};
    private String[] C = {"", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm"};
    private String[] M = {"", "", "mm", "mmm"};

    public String convertToRomanNumerals(int num) {
        int m = num / 1000;
        int c = num % 1000 / 100;
        int x = num % 100 / 10;
        int i = num % 10;
        return (M[m] + C[c] + X[x] + I[i]).toUpperCase();
    }
}
