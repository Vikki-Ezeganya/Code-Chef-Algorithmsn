import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;



    /* Name of the class has to be "Main" only if the class is public. */
    class HighestDivisor
    {
        public static void main (String[] args) throws Exception
        {
            // your code goes here
            System.out.println(getBiggestDivisor(91));

        }

        public static int getBiggestDivisor(int N){
            ArrayList<Integer> divisor = new ArrayList<>();
            for(int i = 10; i > 0; i--) {
                if(N % i == 0) {
                    divisor.add(i);
                    break;
                }
            }

            return divisor.get(0);
        }
    }


