import java.util.ArrayList;

public class PascalTriangle {

    public ArrayList<ArrayList<Integer>> solve(int A) {
        Integer par1, par2;
        ArrayList<ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>();
        if(A>0)
        {
            ArrayList<Integer> step_arr = new ArrayList<>(1);
            step_arr.add(1);
            sol.add(step_arr);
            for (int i = 1; i < A; i++) {
                step_arr = new ArrayList<>(i);
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        par1 = 0;
                        par2 = sol.get(i - 1).get(j);
                    } else if (j == i) {
                        par1 = sol.get(i - 1).get(j - 1);
                        par2 = 0;
                    } else {
                        par1 = sol.get(i - 1).get(j - 1);
                        par2 = sol.get(i - 1).get(j);
                    }
                    step_arr.add(par1 + par2);
                }
                sol.add(step_arr);
            }
        }
        System.out.println(sol);
        return sol;
    }

    public static void main(String[] args) {
        PascalTriangle PT = new PascalTriangle();
        PT.solve(5);
    }
}
