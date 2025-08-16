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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                int orgPlace = c - 'a';
                int newPlace = (orgPlace + k) % 26;
                char newCh = (char)(newPlace + 'a');
                ans.append(newCh);
            }else if(c >= 'A' && c <= 'Z'){
                int orgPalce = c - 'A';
                int newPlace = (orgPalce + k) % 26;
                char newCh = (char) (newPlace + 'A');
                ans.append(newCh);
            }else{
                ans.append(c);
            }
            
        }
        return ans.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
