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

        // 

        // multidimensional arrays; add brackets for however deep you want the dimensions of your array to be
        int[][] multidimensionalArr = {{0,2,9}, {0,7}, {987, 102, 98, 9}};

        System.out.println(multidimensionalArr[0][2]);

        // multidimensional arrays can be created w/o initializing. the first array length must be given.
        int[][] noInitMultiArr = new int[4][];

        // we can loop through as we do in javascript
        for(int x = 0; x < multidimensionalArr.length; x++){
            for(int z = 0; z < multidimensionalArr[x].length; z++){
                System.out.print(multidimensionalArr[x][z] + "\t");
                // "\t" == tab
            }
            System.out.println();
        }

    }

}