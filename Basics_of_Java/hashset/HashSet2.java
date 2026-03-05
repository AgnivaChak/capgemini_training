package hashset;

import java.util.HashSet;

public class HashSet2 {

    public static void main(String[] args) {

        HashSet<Person> hs = new HashSet<Person>();

        Person p1 = new Person(1, "rohit@gmail.com", 30);
        Person p2 = new Person(1, "rohit@gmail.com", 35);
        Person p3 = new Person(2, "rohit@gmail.com", 40);

        hs.add(p1);
        hs.add(p2);
        hs.add(p3);

        System.out.println(hs);
    }
}
