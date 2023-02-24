import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        for(int i = 0; i < arr.size(); i = i + 3){
            arr.set(i, arr.get(i).toUpperCase());
        }
        System.out.println(arr);
    }
}
