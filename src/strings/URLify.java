package strings;

/**
 * Two Pointer Approach
 */
public class URLify {

    public static void main(String[] args) {
        System.out.println(convertURL("Ms. Akshita Chawla     ",18));
    }

    public static String convertURL(String input, int trueLength){
        int spaceCount = 0;
        char[] chars = input.toCharArray();
        for(int i = 0; i < trueLength; i++){
            if (chars[i] == ' '){
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount*2;

        for(int i = trueLength - 1 ; i > 0; i--){
                if(chars[i] == ' '){
                    chars[index-1]='0';
                    chars[index-2]='2';
                    chars[index-3]='%';
                    index = index-3;
                }
                else {
                    chars[index-1] = chars[i];
                    index--;
                }
        }

        return new String(chars);
    }
}
