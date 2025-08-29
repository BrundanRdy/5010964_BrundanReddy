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
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
     Map<Character, Integer> charCount = new HashMap<>();
    
    for (char ch : s.toCharArray()) {
        charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
    }
    
    Map<Integer, Integer> freqCount = new HashMap<>();
    for (int freq : charCount.values()) {
        freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
    }
    
    if (freqCount.size() == 1) {
        return "YES";
    }
    
    if (freqCount.size() > 2) {
        return "NO";
    }
    
    Iterator<Map.Entry<Integer, Integer>> it = freqCount.entrySet().iterator();
    Map.Entry<Integer, Integer> entry1 = it.next();
    Map.Entry<Integer, Integer> entry2 = it.next();
    
    int freq1 = entry1.getKey();
    int count1 = entry1.getValue();
    int freq2 = entry2.getKey();
    int count2 = entry2.getValue();
    
    if ((freq1 == 1 && count1 == 1) || (freq2 == 1 && count2 == 1)) {
        return "YES";
    }
        if ((Math.abs(freq1 - freq2) == 1) && ((freq1 > freq2 && count1 == 1) || (freq2 > freq1 && count2 == 1))) {
        return "YES";
    }
    return "NO";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
