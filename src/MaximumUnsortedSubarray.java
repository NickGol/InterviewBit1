import java.util.ArrayList;
import java.util.Arrays;

public class MaximumUnsortedSubarray {

    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> solution = new ArrayList<>();
        Integer up_index=-1, down_index=-1, res_index_begin=0, res_index_end=0;
        Integer min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0; i<A.size()-1; i++)
        {
            if(A.get(i)>A.get(i+1))
            {down_index = i; break;}
        }
        if(down_index==-1) {solution.add(-1); return solution;}

        for(int i=A.size()-1; i>0; i--)
        {
            if(A.get(i)<A.get(i-1))
            {up_index = i; break;}
        }
        for(int i=down_index; i<=up_index; i++)
        {
            min = A.get(i)<min ? A.get(i): min;
            max = A.get(i)>max ? A.get(i): max;
        }
        for(int i=0; i<=down_index; i++)
        {
            if(A.get(i)>min)
            {
                res_index_begin = i; break;
            }
        }
        for(int i=A.size()-1; i>=up_index; i--)
        {
            if(A.get(i)<max)
            {
                res_index_end = i; break;
            }
        }
        solution.add(res_index_begin);
        solution.add(res_index_end);
        System.out.println(solution);
        return solution;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList(3,55,56,4,5,105,75,77,8,9,101));
        MaximumUnsortedSubarray MUS = new MaximumUnsortedSubarray();
        MUS.subUnsort(ArrL);

    }
}
