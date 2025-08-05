import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String hours = s.substring(0,2);
    String minutes = s.substring(3,5);
    String seconds = s.substring(6,8);
    String period = s.substring(8,10);
    
    int hrs = Integer.parseInt(hours);
    
    if(period.equals("AM")){
        if(hrs == 12){
            hrs = 00;
        }
    }else{
        if(hrs != 12){
            hrs = hrs + 12;
        }
    }
    String hs = String.format("%02d", hrs);
    return hs+":"+minutes+":"+seconds;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
