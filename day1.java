//-----swap first and last character-------------

import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder(sc.next());
        StringBuilder sb2 = new StringBuilder(sc.next());
        char a = sb1.charAt(0);
        char b = 'a';
        int k = 0;
        for(int i=sb2.length()-1;i>=0;i--){
            if(sb2.charAt(i)!='0'){
                b = sb2.charAt(i);
                k=i;
                break;
            }
        }
        sb1.insert(0,b);
        sb1.deleteCharAt(1);

        sb2.insert(k,a);
        sb2.deleteCharAt(k+1);

        int p = Integer.parseInt(sb1.toString());
        int q = Integer.parseInt(sb2.toString());
        System.out.println(p+q);
    }
}
