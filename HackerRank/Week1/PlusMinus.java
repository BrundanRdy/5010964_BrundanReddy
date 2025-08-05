import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static void plusMinus(List<Integer> arr) {
    int posCount = 0;
    int negCount = 0;
    int zeroCount = 0;
    for(int i=0;i<arr.size();i++){
        if(arr.get(i) > 0){
            posCount++;
        }else if(arr.get(i) < 0){
            negCount++;
        }else{
            zeroCount++;
        }
    }
    double posRatio = (double)posCount/arr.size();
    System.out.printf("%.6f\n",posRatio);
    double negRatio = (double)negCount/arr.size();
    System.out.printf("%.6f\n",negRatio);
    double zerosRatio = (double)zeroCount/arr.size();
    System.out.printf("%.6f\n",zerosRatio); 
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}