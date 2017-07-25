package exercises;

//https://leetcode.com/problems/number-complement/#/description
public class BinaryComplement {

    public int getBinaryComplement(int number) {
        String numberConvertedToBinary = Integer.toBinaryString(number);
        System.out.println("Number as binary: " + numberConvertedToBinary);
        char[] numberConvertedToBinaryArray = numberConvertedToBinary.toCharArray();
        int[] complementNumber = new int[numberConvertedToBinary.length()];
        for (int i = 0; i < numberConvertedToBinaryArray.length; i++) {
            if (numberConvertedToBinaryArray[i] == '0') {
                complementNumber[i] = 1;
            } else {
                complementNumber[i] = 0;
            }
        }
        StringBuilder binary = new StringBuilder();
        for (int n : complementNumber) {
            binary.append(n);
        }
        String asBinary = binary.toString();
        System.out.println("Complement number as binary: " + asBinary);
        return Integer.parseInt(asBinary, 2);
    }
}
