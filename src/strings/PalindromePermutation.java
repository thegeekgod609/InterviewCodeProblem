package strings;

public class PalindromePermutation {

    public static void main(String[] args) {

    }

    public  static  boolean checkPalindromePermutation(String input){

        boolean isEven = input.length() % 2 == 0;

        // Build a Map
        char[] chars = input.toCharArray();
        int[] frequencyTable = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : chars) {
            int x = getCharNum(c);

        }
        // Iterate over the map

        //TODO: Change
        return  true;
    }

    public static int getCharNum(Character c){
        //int c = i
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        if(a<=c && c <=z){
            return c-a;
        }

        return -1;
    }
}
