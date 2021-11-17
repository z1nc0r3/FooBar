import java.util.Arrays;

public class FooBar_versionSort {
    public static void main(String[] args) {
        String[] versions = {"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"};

        for (int i=0; i<versions.length; i++){
            for (int j=i+1; j<versions.length; j++){
                String temp;

                if (compareVersion(versions[i], versions[j]) == 1){
                    temp = versions[j];
                    versions[j] = versions[i];
                    versions[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(versions));
    }

    public static int compareVersion(String v1, String v2){
        String[] v1_arr = v1.split("\\.");
        String[] v2_arr = v2.split("\\.");
        int checker = v1_arr.length > v2_arr.length ? 1 : -1;

        for (int i=0; i<Math.min(v1_arr.length, v2_arr.length); i++){
            if (Integer.parseInt(v1_arr[i]) > Integer.parseInt(v2_arr[i])) {
                checker = 1;
                break;
            }
            else if (Integer.parseInt(v1_arr[i]) < Integer.parseInt(v2_arr[i])) {
                checker = -1;
                break;
            }
            else
                continue;
        }

        return checker;
    }
}