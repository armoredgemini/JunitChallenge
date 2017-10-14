package com.tarchuleta;

import com.sun.media.sound.SoftTuning;

/**
 * Created by Antonio on 10/9/2017.
 */
public class Utilities {

    // Return s a char array containing every nth char.
    // when sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n) {
        if(sourceArray == null || sourceArray.length < n ) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for(int i = n-1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }
        return result;
    }

    // removes pairs of the same char that are next to each other
    // removing one occurence of the character
    // ABBCDEEF -> APCDEF
    public String removePairs(String source) {


        if (source == null || source.length() < 2) {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for(int i=0; i < string.length-1; i++) {
            if( string[i] != string[i+1]) {
                sb.append(string[i]);
                //System.out.println(sb.toString());
            }
        }

    //    if(string[string.length-1] != string[string.length-2]) {
           sb.append(string[string.length-1]);
        //  }

        return sb.toString();
    }

    // perform a conversion based on some internal business rule
    public int converter(int a, int b) {
        return(a/b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        System.out.println(source.length());
        if(source.length() % 2 == 0) {
           return source;
        }

        return null;
    }
}
