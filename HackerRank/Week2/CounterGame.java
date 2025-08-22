import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String counterGame(long n) {
        boolean louies = true;
        while(n != 1){
            if(powerOfTwo(n)){
                n = n/2;
            }else{
                long largestPow = nextLargestPower(n);
                n = n - largestPow;
                
            }
            louies = !louies;
        }
        return louies ? "Richard" : "Louise";
    }
    public static boolean powerOfTwo(long n){
        double log2n = Math.log(n)/Math.log(2);
        return log2n == (int)Math.floor(log2n);
            
    }
    public static long nextLargestPower(long n){
        double log2n = Math.log(n)/Math.log(2);
        double exp = Math.floor(log2n);
        long power = (long)Math.pow(2, exp);
        if(power == n){
            return power / 2;
        }
        return power;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                String result = Result.counterGame(n);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
