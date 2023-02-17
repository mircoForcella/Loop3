import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>(Arrays.asList("January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));

        for(int i = 0; i < arr.size(); i = i + 3){
            arr.set(i, arr.get(i).toUpperCase());
        }
        System.out.println(arr);
    }
}
