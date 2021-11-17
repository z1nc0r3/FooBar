import java.util.Arrays;

public class FooBarGreatestStaircase {
    public static void main(String[] args){
        int n = 7;  // (1,6) (2,5) (3,4) (1,2,4)
        int length = n;
        int counter = 0;

        int[] list = new int[7];

        for (int i=0; i<length; i++){
            list[i] = n--;
        }

        System.out.println(Arrays.toString(list));
    }
}
