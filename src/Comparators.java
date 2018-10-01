import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Comparators {
    static Person P1 = new Person(55);
    static Person P2 = new Person(155);
    static Person P3 = new Person(57);
    static Person P4 = new Person(58);
    static Person P5 = new Person(59);
    static ArrayList<Person> ArrL = new ArrayList<>(Arrays.asList(P1, P2, P3/*, P4, P5*/));

    public static void main(String[] args) {
        /*Person P1 = new Person(55);
        Person P2 = new Person(56);
        Person P3 = new Person(155);
        Person P4 = new Person(58);
        Person P5 = new Person(59);*/

        Comparator<Person> comparator = Comparator.comparing(obj -> obj.getNum());
        //ArrL.sort(comparator);
        Collections.sort(ArrL, comparator);
        //ArrL.sort(Comparator.comparing(Person::getNum));
        //ArrL.sort((a,b)->a.compareTo(b));
        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        for (Person p: ArrL) {
            //System.out.print(p.getNum()+"     ");
            System.out.print(p+"     ");

        }
        P1.compareTo(100);
    }
}

class Person implements Comparable <Person>
{
    private String name = "qwerty";
    private Integer num=55;
    public Person(String name)
    {
        this.name = name;
    }
    public Person(Integer i)
    {
        this.num = i;
        name = name + i.toString();
    }
    String getName()
    {return name;}
    Integer getNum()
    {return num;}

    public String toString()
    {
        return this.getName();
    }
    public int compareTo(Person p)
    {
        //return name.compareTo(p.getName());
        return num-p.num;
    }
    public int compareTo(Integer i)
    {
        return num-i;
    }

}

class PersonNameComparator implements Comparator<Person>{

    public int compare(Person a, Person b){

        return a.getName().compareTo(b.getName());
    }
}
class PersonAgeComparator implements Comparator<Person>{

    public int compare(Person a, Person b){

        if(a.getNum()> b.getNum())
            return 1;
        else if(a.getNum()< b.getNum())
            return -1;
        else
            return 0;
    }
}

  /* Reports Comparators defined as lambda expressions which could be expressed using methods like Comparator.comparing().
        Some comparators like (person1, person2) -> person1.getName().compareTo(person2.getName()) could be simplified like this:
        Comparator.comparing(Person::getName).
        Also suggests to replace chain comparisons with Comparator.thenComparing(), e.g. int res = o1.first.compareTo(o2.first);
        if(res == 0) res = o1.second.compareTo(o2.second); if(res == 0) res = o1.third - o2.third; return res; will be replaced
        with objs.sort(Comparator.comparing((Obj o) -> o.first).thenComparing(o -> o.second).thenComparingInt(o -> o.third));
   */