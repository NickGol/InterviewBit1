import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hotel_Bookings_Possible {

    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K)
    {
        int i=0, j=0, cnt=0;
        arrive.sort((o1,o2)->o1.compareTo(o2));
        depart.sort((o1,o2)->o1.compareTo(o2));

        while( i<arrive.size() && j<depart.size() )
        {
            if(arrive.get(i)<depart.get(j))
            {
                cnt++;
                i++;
            }
            else {cnt--; j++;}
            if(cnt>K) return false;
        }
        return true;
        /*ArrayList<Integer> ArrL = new ArrayList<>();
        Integer buf = Integer.MIN_VALUE,  cnt = 0;
        for(int i=0; i<arrive.size(); i++)
        {
            for(int j =arrive.get(i); j<depart.get(i); j++)
            ArrL.add(j);
        }
        System.out.println(ArrL);
            ArrL.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(ArrL);
        for(Integer i: ArrL)
        {
            if(buf!=i) cnt=1;
            else cnt++;
            buf = i;
            if(cnt>K) { System.out.println(false); return false;}
            //System.out.println(false);
        }
        System.out.println(true);
        return true;*/
    }

    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(5));
        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(8));
        Hotel_Bookings_Possible HBP = new Hotel_Bookings_Possible();
        HBP.hotel(A1, A2, 1);
    }
}
