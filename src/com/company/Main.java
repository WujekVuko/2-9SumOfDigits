package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    System.out.println("Podaj liczbę całkowitą: ");
        String s = in.nextLine();
        int sum = 0;
        int even = 0;
        float evenCount = 0;
        int odd = 0;
        float oddCount =0;
        for(int i = 0; i < s.length(); i++) {
            int pam = new Integer(String.valueOf(s.charAt(i))).intValue();
            sum += pam;
        }
        for(int i = 0; i < s.length(); i++){
            int pam = new Integer(String.valueOf(s.charAt(i))).intValue();
            if(pam%2 == 0){
                even += pam;
                evenCount++;
            }
            else{
                odd += pam;
                oddCount++;
            }

        }
        float endEven = even / evenCount;
        float endOdd = odd/oddCount;
        System.out.println("Suma cyfr to: " + sum);
        System.out.println ("Stosunek średniej arytmetycznej liczb parzystych  \ndo średniej arytmetycznej liczb nieparzystych wynosi: " + endEven + " : " + endOdd );
        System.out.println("even = " + even + " evenc = " + evenCount + " odd = " + odd + " oddc = " + oddCount);
        if (true )return;

    }
}
