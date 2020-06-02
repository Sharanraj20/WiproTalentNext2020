import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'smallestString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY substrings as parameter.
     */

    public static String smallestString(List<String> substrings) {
    // Write your code here
    int i=0,j,size=substrings.size();
    String temp;
    StringBuilder out=new StringBuilder();
    Collections.sort(substrings);
    for(String s:substrings){
        out.append(s);
    }
    return out.toString();
    }

}
