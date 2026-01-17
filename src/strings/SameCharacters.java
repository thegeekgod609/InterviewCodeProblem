package strings;

public class SameCharacters {
    public static void main(String[] args) {

        System.out.println(haveSameCharacters("abbba","aabbb"));
        System.out.println(haveSameCharacters("abcde","deacb"));
        System.out.println(haveSameCharacters("abcde","abb"));
        System.out.println(haveSameCharacters("abcde","aabbb"));


    }

    public static boolean haveSameCharacters(String first, String second){

        // compare the length
        if(first.length()!=second.length()){
            return false;
        }

        //sort
        return sort(first).equals(sort(second));
    }

    public static String sort(String s){

        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);

    }


    // Counter Approach
    public static boolean haveSameCharactersApproach2(String first, String second){

        // compare the length
        if(first.length()!=second.length()){
            return false;
        }

        // Frequency check
        int[] letters = new int[128];

        char[] string_array = first.toCharArray();
        for(char c: string_array){
            letters[c]++;
        }

        for(int i = 0 ; i< second.length(); i++){
            int c = (int) second.charAt(i);
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }

        return true;
    }

}