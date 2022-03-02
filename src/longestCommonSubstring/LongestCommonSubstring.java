package longestCommonSubstring;


import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 15-03-2021
 * Time: 23:00
 */

public class LongestCommonSubstring {

    static String LCS(String [] s) {
        String str = s[0];
        int length = str.length();
        String result = "";

        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j <= length; j++) {

                String stem = str.substring(i, j);
                int k = 1;

                for (k = 1; k < s.length; k++) {
                    if (!s[k].contains(stem)) {
                        break;
                    }
                }
                if (k == s.length && result.length() < stem.length()) {
                    result = stem;
                }

            }

        }


        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String S [] = new String[n];

        for(int index = 0; index < n; index++) {
            S[index] = sc.next();
        }


        String sub = LCS(S);

        System.out.println(sub);

    }
}