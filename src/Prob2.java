import java.util.HashMap;
import java.util.Map;

public class Prob2 {
    public static void main(String[] args) {
        Map< Integer, String> map=new HashMap<Integer, String>();

        map.put(101, "Hemendra");
        map.put(99, "Andrew");
        map.put(103, "Anish");
        map.put(18, "Mohan");
        map.put(11, "Christine");
        map.put(109, "Rebeca");
        map.put(111, "David");
        map.put(19, "Rahim");
        map.put(10, "Krishna");
        map.put(1001, "Krishna");

        map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue().reversed()).forEach(System.out::print);
    }
}
