package java8;
import java8.*;

import java.util.function.Function;

public class MainComparator {
    public static void main(String[] args) {
        Comparator<Person> comAge=(P1, P2)->P2.getAge()- P1.getAge();
        Comparator<Person> comFirstName=(p1,p2)
-> p1.getFirstName().compareTo(p2.getFirstName());

        Comparator<Person> comLastName=(p1,p2)
                -> p1.getLastName().compareTo(p2.getLastName());

        Function<Person,Integer> f1=p->p.getAge();
        Function<Person,String> f2=p->p.getFirstName();
        Function<Person,String> f3=p->p.getLastName();

    }

}
