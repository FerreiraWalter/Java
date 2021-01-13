import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
   
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Walter");
        conjunto.add(1);
        conjunto.add('w');

        System.out.println(conjunto.size()
        );

        System.out.println(conjunto.remove("walter"));
        System.out.println(conjunto.remove("Walter"));

        System.out.println(conjunto.size()
        );

        System.out.println(conjunto.contains("Walter"));
        System.out.println(conjunto.contains(1));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

    }
}
