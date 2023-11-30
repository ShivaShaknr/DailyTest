//odd number of occurence character


import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character>a = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i));
        }
        HashSet<Character>h = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            if(Collections.frequency(a,s.charAt(i))%2!=0){
                h.add(s.charAt(i));
            }
        }
        String res="";
        for(char c:h){
            res+=c;
        }
        if(res.length()==0){
            System.out.println(-1);
        }else {
            System.out.println(res);
        }

    }
}
