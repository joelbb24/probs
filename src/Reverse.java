import java.util.Arrays;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        String s = "Lazy dog jumps up the rope";

        List<String> res = Arrays.asList(s.split(" "));

        for(int i = res.size()-1; i>= 0; i--)
        {
            System.out.print(res.get(i)+" ");
        }
    }
}
