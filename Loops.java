
public class Loops {
    public static void main(String[] args) {
        int x = 2;
        
        if (x == 5) {
            int i = 0;
            while (i < 5) {
                System.out.println("While I am " + i);
                i++;
            }
        } else {
            for(int j = 5; j > 0; j--){
                System.out.println("For I am " + j);
            }
        }
}
}