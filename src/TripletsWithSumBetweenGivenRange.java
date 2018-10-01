import java.util.ArrayList;
import java.util.Arrays;

public class TripletsWithSumBetweenGivenRange {

    public int solve(ArrayList<String> A)
    {
        /*ArrayList<Double> A1 = new ArrayList<Double>(Arrays.asList(10.0,10.0,-9.0,-10.0, 0.0)); // 0-1/3
        ArrayList<Double> A2 = new ArrayList<Double>(Arrays.asList(10.0,10.0,-9.0,-10.0, 0.0)); // 1/3-2/3
        ArrayList<Double> A3 = new ArrayList<Double>(Arrays.asList(10.0,10.0,-9.0,-10.0, 0.0)); // 2/3-1
        ArrayList<Double> A4 = new ArrayList<Double>(Arrays.asList(10.0,10.0,-9.0,-10.0, 0.0)); // 1-2*/
        ArrayList<Double> All_sectors = new ArrayList<Double>(Arrays.asList(10.0,10.0,-10.0,-10.0, 10.0,10.0,-10.0,-10.0, 10.0,10.0,-10.0,-10.0, 10.0,10.0,-10.0,-10.0));
        for(String s: A)
        {
            Double num = Double.parseDouble(s);
            if ( num <= 1.0 / 3 ) { sub_solution(All_sectors, num, 0); }
            else if ( num < 2.0 / 3 ) { sub_solution(All_sectors, num, 4); }
            else if ( num < 1 )     { sub_solution(All_sectors, num, 8); }
            else if ( num < 2 )     { sub_solution(All_sectors, num, 12); }
        }
        System.out.println(All_sectors);
        while(All_sectors.remove(new Double(10)));
        while(All_sectors.remove(new Double(-10)));
        System.out.println(All_sectors);
        for(int k=0; k<All_sectors.size(); k++)
        {
            for(int l=k+1; l<All_sectors.size(); l++)
            {
                for(int m=l+1; m<All_sectors.size(); m++)
                {
                    Double sum = All_sectors.get(k) + All_sectors.get(l) + All_sectors.get(m);
                    if( sum>1 && sum<2) {System.out.println(sum); System.out.println(1); return 1;}
                }
            }
        }
        /*if(A2.get(4)>=3) return 1;
        if( (A2.get(2)+A2.get(3)+A1.get(3))>1 && (A2.get(2)+A2.get(3)+A1.get(3))<2 ) return 1;
        if( (A2.get(3)+A1.get(2)+A1.get(3))>1 && (A2.get(3)+A1.get(2)+A1.get(3))<2 ) return 1;
        if( (A3.get(0)+A1.get(0)+A1.get(1))>1 && (A3.get(0)+A1.get(0)+A1.get(1))<2 ) return 1;
        if( (A3.get(0)+A3.get(1)+A1.get(0))>1 && (A3.get(0)+A3.get(1)+A1.get(0))<2 ) return 1;
        if( (A2.get(3)+A1.get(2)+A1.get(3))>1 && (A2.get(3)+A1.get(2)+A1.get(3))<2 ) return 1;
        if( (A3.get(0)+A1.get(0)+A1.get(1))>1 && (A3.get(0)+A1.get(0)+A1.get(1))<2 ) return 1;*/
        System.out.println(0);
        return 0;
    }

    private void sub_solution (ArrayList<Double> Arr_list, Double num, int index)
    {
        //Arr_list.set(4, Arr_list.get(4)+1);
        if( Arr_list.get(index+0)>=num )        {if( Arr_list.get(index+3)==-10 && Arr_list.get(index+1) != 10 ) {Arr_list.set(index+3,Arr_list.get(index+2));Arr_list.set(index+2,Arr_list.get(index+1));}
                                                    Arr_list.set(index+1,Arr_list.get(index+0)); Arr_list.set(index+0, num);}
        else if( (Arr_list.get(index+1)>=num) ) {if( Arr_list.get(index+3)==-10 && Arr_list.get(index+1) != 10 ) {Arr_list.set(index+3,Arr_list.get(index+2));Arr_list.set(index+2,Arr_list.get(index+1));}
                                                    Arr_list.set(index+1, num);}
        else if( (Arr_list.get(index+3)<=num) ) {Arr_list.set(index+2,Arr_list.get(index+3)); Arr_list.set(index+3, num);}
        else if( (Arr_list.get(index+2)<=num) ) {Arr_list.set(index+2, num);}
    }

    public static void main(String[] args) {

        //ArrayList<String> Arr = new ArrayList<>(Arrays.asList("0.1", "0.7", "1.8", "1.1", "1.4"));
        //ArrayList<String> Arr = new ArrayList<>(Arrays.asList("0.002804", "0.000298", "0.748024", "0.139023", "0.082317", "0.013348", "4.209490", "0.098512", "0.055635", "0.060427", "3.290499", "0.073212", "0.071914", "0.065654", "0.044422", "0.024968", "0.110226", "0.090197", "0.060240", "0.100432", "0.109920", "0.023673", "0.081927", "0.066987", "0.058557", "0.043674", "0.057256", "0.050478", "0.024976", "0.048124", "0.071043", "0.048199", "0.023894", "0.058934", "0.047465", "0.088664", "0.002571", "0.070546", "0.042776"));
        ArrayList<String> Arr = new ArrayList<>(Arrays.asList("0.297657", "0.420048", "0.053365", "0.437979", "0.375614", "0.264731", "0.060393", "0.197118", "0.203301", "0.128168"));
        TripletsWithSumBetweenGivenRange TWSBGR = new TripletsWithSumBetweenGivenRange();
        int a = TWSBGR.solve(Arr);
    }
}
