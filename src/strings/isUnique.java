package strings;

public class isUnique {
    public static void main(String[] args) {

        System.out.println(isUnique("abbba"));
        System.out.println(isUnique("abcde"));


    }

    public static boolean isUnique(String s){

        boolean [] charSet = new boolean[128];
        for (int i = 0; i<s.length();i++){
            int val = s.charAt(i);
            if(charSet[val]){
                return false;
            }

            charSet[val] = true;

        }
        return true;
    }
}