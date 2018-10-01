import java.util.ArrayList;

public class KthRowofPascalsTriangle {

   /* public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> prev_row = new ArrayList<>();
        ArrayList<Integer> current_row = new ArrayList<>();
        current_row.add(1);
        if(A<=0) return current_row;
        for(int i=1; i<= A; i++)
        {
            prev_row = current_row;
            current_row = new ArrayList<>();
            for(int j=0; j<=i; j++)
            {
                if ( j==0 || j==i )
                    current_row.add(1);
                else {
                    current_row.add(prev_row.get(j-1)+prev_row.get(j));
                }
            }
        }
        System.out.println(current_row);
        return current_row;
    }*/

    public ArrayList<Integer> getRow(int A) {


        ArrayList<Integer> list = new ArrayList<Integer>(A+1);


        int line=A+1;
        int C = 1;  // used to represent C(line, i)
        for (int i = 1; i <= line; i++)
        {


            list.add(C);  // The first value in a line is always 1
            C = C * (line - i) / i;

        }

        System.out.println(list);
        return list;

    }

    public static void main(String[] args) {
        KthRowofPascalsTriangle KRPT = new KthRowofPascalsTriangle();
        KRPT.getRow(100);
    }
}
