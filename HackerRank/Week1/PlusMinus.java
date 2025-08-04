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