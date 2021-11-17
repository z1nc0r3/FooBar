import java.util.ArrayList;
import java.util.Arrays;

public class FooBar_MinionsTasks {
    public static void main(String[] args){
        String n = "210022";
        int b = 3;
        boolean isConstant = false;

        ArrayList<String> checkList = new ArrayList<>();

        while (true) {
            String x= "", y;
            int k = n.length();

            int[] list = new int[k];

            for (int i = 0; i < k; i++) {
                list[i] = Integer.parseInt(Character.toString(n.charAt(i)));
            }
            Arrays.sort(list);

            StringBuilder sb = new StringBuilder(x);
            for (int j : list) {
                sb.append(j);
            }
            y = sb.toString();
            x = sb.reverse().toString();

            x = Integer.toString(Integer.parseInt(x, b), 10);
            y = Integer.toString(Integer.parseInt(y, b), 10);

            int sum = Integer.parseInt(x) - Integer.parseInt(y);

            n = Integer.toString((Integer.parseInt(Integer.toString(sum), 10)), b);

            if (checkList.size() > 0 && checkList.get(checkList.size() - 1).equals(n)) {
                isConstant = true;
                break;
            }

            if (checkList.contains(n))
                break;

            checkList.add(n);
        }

        if (isConstant)
            System.out.println(1);
        else
            System.out.println(checkList.size() - checkList.indexOf(n));
    }
}
