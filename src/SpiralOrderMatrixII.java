import java.util.ArrayList;
import java.util.Arrays;

public class SpiralOrderMatrixII {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> ArrLII = new ArrayList<ArrayList<Integer>>(A);
        byte stage=0;
        int [][] buff_arr = new int [A][A];
        int x=-1, y=0, max_xy=A, min_xy=0;

        for (int i=0; i<A; i++) {
            // for each row make a *new* arraylist
            ArrayList<Integer> zero = new ArrayList<Integer>();
            // initialize that arraylist
            for (int j=0; j<A; j++) {
                zero.add(0);
            }
            // then add it to the row
            ArrLII.add(zero);
        }
        for( int i=1; i<=A*A; i++ )
        {
            switch (stage){
                case 0:  x++;
                    ArrLII.get(y).set(x,i);
                    if( x==max_xy-1 ) stage = 1;
                    break;
                case 1:  y++;
                    ArrLII.get(y).set(x,i);
                    if( y==max_xy-1 ) stage = 2;
                    break;
                case 2:   x--;
                    ArrLII.get(y).set(x,i);
                    if( x==min_xy ) stage = 3;
                    break;
                case 3:   y--;
                    ArrLII.get(y).set(x,i);
                    if( y==(min_xy+1) )
                    { stage = 0; max_xy--; min_xy++; }
                    break;
            }
        }
        System.out.println(ArrLII);
        return ArrLII;
    }

    public static void main(String args[])
    {
        SpiralOrderMatrixII som = new SpiralOrderMatrixII();
        som.generateMatrix(3);
    }
}

           /* switch (stage){
                case 0:  x++; ArrLII.get(min_xy).set(x, i); if( x==max_xy-1 ) stage = 1; break;
                case 1: if( y<max_xy-1 ) { y++; ArrLII.get(y).set(max_xy-1, i); } else stage = 2; break;
                case 2: if( x>min_xy )  { x--; ArrLII.get(y).set(x, i); } else stage = 3; break;
                case 3: if( y>(min_xy+1) ) { y--; ArrLII.get(min_xy).set(x, i); } else{ stage = 0; max_xy--; min_xy++; }break;
            }*/

           /*
                switch (stage){
                case 0:  x++;
                    buff_arr[y][x] = i;
                    if( x==max_xy-1 ) stage = 1;
                    break;
                case 1:  y++;
                    buff_arr[y][x] = i;
                    if( y==max_xy-1 ) stage = 2;
                    break;
                case 2:   x--;
                        buff_arr[y][x] = i;
                        if( x==min_xy ) stage = 3;
                        break;
                case 3:   y--;
                        buff_arr[y][x] = i;
                        if( y==(min_xy+1) )
                        { stage = 0; max_xy--; min_xy++; }
                        break;
            }
           * */