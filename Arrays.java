import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        // These are considered a reference. They do not hold any value
        // default value for string is null
        String[] stringArr = new String[5];
        // default value for int is 0
        int[] numArr = new int[5];
        // you can also initialize an array in the same line 
        int[] initNumArr = {0,1,2};
        // default value for boolean is false

        ArrayList<String> stringList = new ArrayList<>();

        System.out.println(stringArr.length);
        System.out.println(numArr[2]);
        System.out.println(stringList);

        // we can also loop through these arrays
        for(int i = 0; i<initNumArr.length; i++) {
            System.out.println(initNumArr[i]);
        }
    }

}