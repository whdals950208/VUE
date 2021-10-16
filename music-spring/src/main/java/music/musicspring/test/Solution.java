package music.musicspring.test;

import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        String str = "pppppYYYY";
        int pC = 0;
        int yC =0;
        boolean result = true;

        String ig=str.toLowerCase();
        System.out.println(ig.length());
        for(int i=0;i<ig.length();i++){
            if(ig.charAt(i)=='p') pC++;
            else yC++;
        }
        if(pC!=yC) return ;

    }
}
