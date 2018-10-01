import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Wave_Array {

    public ArrayList<Integer> wave(ArrayList<Integer> A)
    {
        //ArrayList<Integer> A1 = A.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        A.sort((o1,o2)-> o1.compareTo(o2));
        System.out.println(A);
        Integer buf;
        for(int i=0; i<=A.size()-2; i+=2)
        {
            buf = A.get(i);
            A.set(i, A.get(i+1));
            A.set(i+1, buf);
        }
        System.out.println(A);
        return A;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList(10,2,3,4,5));
        Wave_Array WArr = new Wave_Array();
        WArr.wave(ArrL);
    }
}
