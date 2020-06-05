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
     * Complete the 'stockPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY stocksProfit
     *  2. LONG_INTEGER target
     */

    public static int stockPairs(List<Integer> stocksProfit, long target) {
        int len=stocksProfit.size();
        int l=0;
    for(int i=0;i<len;i++){
        for(int j=i+1;j<len;j++)
        {
           target = stocksProfit.get(i) + stocksProfit.get(j);
            if(stocksProfit.get(i)+stocksProfit.get(j)==target){
            l=Integer.compare(stocksProfit.get(i),stocksProfit.get(j));
            }
        }
    }l++;
    return l;
    }

}
