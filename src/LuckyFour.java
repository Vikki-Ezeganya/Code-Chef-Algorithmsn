

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LuckyFour
{
    public static void main (String[] args) throws Exception
    {
        // your code goes here

        Scanner scanner = new Scanner(System.in);
        // System.out.println("input the number");
        if(scanner.hasNextLine()) {
            int T = Integer.valueOf(scanner.nextLine());
            getAllFours(T);
        }
        // scanner.close();
    }


    public static void getAllFours(int T) {

        Scanner scan = new Scanner(System.in);

        int[] kostyasList = new int[T];

        for (int i = 0; i < kostyasList.length; i++) {
            kostyasList[i] = scan.nextInt();
        }

        for (int i = 0; i < kostyasList.length; i++) {
            char[] items = String.valueOf(kostyasList[i]).toCharArray();

            ArrayList<Character> fours = new ArrayList<>();

            for (char item : items) {
                if (item == '4') {
                    fours.add(item);
                }
            }
            System.out.println(fours.size());
        }
        // scan.close();
    }
}
