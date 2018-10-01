import java.util.*;

class comp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        String s1 = o1.toString();
        String s2 = o2.toString();
        return (s2+s1).compareTo(s1+s2);
    }
};

public class Solution1 {
    public String largestNumber(final List<Integer> A)
    {
        String str = new String();
        Collections.sort(A, new comp());
        if(A.get(0)==0)
            return "0";
        for(Integer num:A)
        {
            str = str.concat(num.toString());
        }
        //System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        //ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList(782, 240, 409, 678, 940, 502, 113, 686, 6, 825, 366, 686, 877, 357, 261, 772, 798, 29, 337, 646, 868, 974, 675, 271, 791, 124, 363, 298, 470, 991, 709, 533, 872, 780, 735, 19, 930, 895, 799, 395, 905));
        ArrayList<Integer> ArrL = new ArrayList<>(Arrays.asList(980, 674, 250, 359, 98, 969, 143, 379, 363, 106, 838, 923, 969, 880, 997, 664, 152, 329, 975, 377, 995, 943, 369, 515, 722, 302, 496, 124, 692, 993, 341, 785, 400, 113, 302, 563, 121, 230, 358, 911, 437, 438, 494, 599, 168, 866, 689, 444, 684, 365, 470, 176, 910, 204, 324, 657, 161, 884, 623, 814, 231, 694, 399, 126, 426));
        Solution1 Sol = new Solution1();
        Sol.largestNumber(ArrL);
    }

}





   /* public int compare(Integer o1, Integer o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        String sss = new String();
        int flag = 0, iii=0, sz1=0, sz2=0;
        sz1 = s1.length();
        sz2 = s2.length();
        if ( sz1 < sz2 ) {
            s1 = s1.concat(s2.substring(0, sz2-sz1));
            flag = 1;
        }
        if (s1.length() > s2.length()) {
            s2 = s2.concat(s1.substring(0, sz1-sz2));
            flag = 2;
        }

        iii = s2.compareTo(s1);
        if(iii==0)
            iii = s2.substring(sz2-1, sz2).compareTo(s1.substring(sz1-1, sz1));
        return iii;
    }*/


/** TRUE
 public String largestNumber(final List<Integer> nums) {
 String[] arr = new String[nums.size()];
 for(int i=0; i<nums.size(); i++){
 arr[i]=String.valueOf(nums.get(i));
 }

 Arrays.sort(arr, new Comparator<String>(){
 public int compare(String a, String b){
 return (b+a).compareTo(a+b);
 }
 });

 StringBuilder sb = new StringBuilder();
 for(String s: arr){
 sb.append(s);
 }

 while(sb.charAt(0)=='0'&&sb.length()>1)
 sb.deleteCharAt(0);

 return sb.toString();
 }*
 */
// Collections.sort(list, (o1, o2) -> (o2 + o1).compareTo(o1 + o2)); Синтаксис!!!!!!!!!!!!!!!!!!!!