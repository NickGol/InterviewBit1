import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NobleInteger {
    int solve(ArrayList<Integer> A)
    {
        Collections.sort(A);
        A.add(Integer.MIN_VALUE);
        for(int i=0; i<A.size(); i++)
        {
            if( Math.abs(A.get(i)) == (A.size()-i-2) && A.get(i)!=A.get(i+1) )
            {
                System.out.println(1);
                System.out.println(i);
                return 1;//qqqqqqqqqqqqqqqqqqqqqqqqwwwwwwwww
            }
        }
        System.out.println(-1);
        return -1;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList( -6, -1, 4 ));
        NobleInteger NI = new NobleInteger();
        NI.solve(ArrL);
    }
}
