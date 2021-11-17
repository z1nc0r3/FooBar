import java.util.ArrayList;
import java.util.Arrays;

public class GoogleFooBar_ElevatorMaintaince {
    public static void main(String[] args){

        ArrayList<ArrayList> list = new ArrayList<>();

        String[] versions = {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0", "0.1.1", "1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"};
        //0.1  1.0  1.0.2  1.0.12  1.1.1  1.1.2  1.2  1.2.1  1.3.3  1.11  2  2.0  2.0.0

        int max = 0;

        for (String word : versions){
            int ver = Integer.parseInt(Character.toString(word.charAt(0)));
            if (ver > max){
                max = ver;
            }
        }

        //System.out.println(max);

        for (int i=0; i<=max; i++){
            list.add(new ArrayList<String>());
        }

        for (int i=0; i<=max; i++){
            for (String word : versions){
                int ver = Integer.parseInt(Character.toString(word.charAt(0)));
                if (ver == i){
                    list.get(i).add(word);
                }
            }
        }

        for (int i=0; i<=max; i++) {
            System.out.println(list.get(i).toString());
        }

        ArrayList<String[]> stripped = new ArrayList<>();

        int counter = 0;
        for (Object x : list.get(1)){
            stripped.add(x.toString().split("\\."));
            System.out.print(Arrays.toString(stripped.get(counter)) + "    ");
            counter++;
        }


        System.out.println();
        for (int i=0; i<stripped.size(); i++){
            int sum = 0;

            try {
                sum += 1000*Integer.parseInt(stripped.get(i)[0]);
                sum += 100*Integer.parseInt(stripped.get(i)[1]);
                sum += 10*Integer.parseInt(stripped.get(i)[2]);
            }
            catch (Exception e) {
            }

            System.out.println(sum);
        }
    }
}



























