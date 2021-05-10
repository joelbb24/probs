import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighest {
    public static void main(String[] args) {
        String s = "lazy lazy lazy dog dog cat cat mouse rice";
        Map<String, Integer> map = new HashMap<>();
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        Arrays.stream(words).sequential().forEach(val -> map.put(val, map.getOrDefault(val, 0)+1));

        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).skip(1).limit(1).forEach(val -> result.append(val.getKey()));
        System.out.println(result.toString());
    }
}
