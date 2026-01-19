package array;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {23,34,1222,34324, 809,923823, 7,3,423,43, 2342};
        //reverseArray(arrayOfNumbers);
        reverseArray2pointer(arrayOfNumbers);
    }

    public static void reverseArray(int[] array){
        if(array==null||array.length==0){
            System.out.println("No reverse array");
            return;
        }

        int[] reverseArray = new int[array.length];

        for(int i=0;i<array.length;i++){
            reverseArray[i]=array[array.length-i-1];
        }

        for(int i =0;i<reverseArray.length;i++){
            System.out.println(i+" "+reverseArray[i]);
        }
    }

    public static void reverseArray2pointer(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("No reverse array");
            return;
        }

        int head = 0;
        int tail = array.length - 1;
        while (head < tail) {
            array[head++] = array[tail--];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " " + array[i]);
        }
    }

}
