import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.*;
public class Stream_API {

    public String largestNumber(final List<Integer> A)
    {
        String str = A.stream().filter(o1->o1>0).map(o1->o1.toString()).sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2)).collect(Collectors.joining());
        if(str.length()==0) str = "0";
        return str;
    }

    public static void main(String[] args) {

        String[] cities1 = {"Париж", "Лондон", "Мадрид"};
        Stream<String> citiesStream2 =Stream.of(cities1);
        int[] arr = {1,2,4,5,7};
        IntStream intStream = Arrays.stream(new int[]{1,2,4,5,7});
        IntStream intStream1 = Arrays.stream(arr);

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream() // получаем поток
                .filter(s->s.length()==6) // применяем фильтрацию по длине строки
                .forEach(s->System.out.println(s)); // выводим отфильтрованные строки на консоль

        String s = new String();
        List<Integer> ArrL = new ArrayList<>(Arrays.asList(980, 674, 250, 359, 98, 969, 143, 379, 363, 106, 838, 923, 969, 880, 997, 664, 152, 329, 975, 377, 995, 943, 369, 515, 722, 302, 496, 124, 692, 993, 341, 785, 400, 113, 302, 563, 121, 230, 358, 911, 437, 438, 494, 599, 168, 866, 689, 444, 684, 365, 470, 176, 910, 204, 324, 657, 161, 884, 623, 814, 231, 694, 399, 126, 426));
        //ArrayList<String> ArrL = new ArrayList<>(Arrays.asList("1", "15", "10", "5"));
        ArrayList<String> ArrL1 = new ArrayList<>();
        String str = ArrL.stream().filter(o1->o1>0).map(o1->o1.toString()).sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2)).collect(Collectors.joining());//.forEach(t->System.out.println(t));
        //List<String> ArrL5 = ArrL.stream().sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2)).collect(Collectors.toList());
        System.out.println(str);
        int klmnp=0;
        Stream_API SAPI = new Stream_API();
        System.out.println(SAPI.largestNumber(ArrL));
        //ArrL.add("12345");
    }
}
