import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<>(); //Line n1
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");
        list.addAll(list.subList(0, 4)); //Line n2
        System.out.println(list);




        String[] names = {"Mary","Jane","Elizabeth","Jo"};
        Arrays.sort(names, new Compare());
        for (String name: names) {
            System.out.println(name);
        }
    }

    public static class Compare implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s2.length() - s1.length();
        }
    }
}
