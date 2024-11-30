package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<Array extends Object>{
   Array[] array;

   public ArrayUtility(Array[] inputArray){
       array = inputArray;
   }

   public Integer countDuplicatesInMerge(Array[] arrayToMerge, Array valueToEvaluate){
       int count = 0;
       for (Array element: array){
           if (element.equals(valueToEvaluate)){
               count++;
           }
       }
       for (Array element: arrayToMerge){
           if (element.equals(valueToEvaluate)){
               count++;
           }
       } return count;

   }

   public Array getMostCommonFromMerge(Array[] arrayToMerge){
       Array CommonElement = null;
       int maxCount = 0;

       for (Array element: array){
           int count = countDuplicatesInMerge(arrayToMerge, element);

           if (count > maxCount){
               CommonElement = element;
               maxCount = count;
           }
       }

       for (Array element: arrayToMerge){
           int count = countDuplicatesInMerge(array, element);

           if (count > maxCount){
               CommonElement = element;
               maxCount = count;
           }
       }
       return CommonElement;

   }

   public int getNumberOfOccurrences(Array valueToEvaluate){
       return 0;
   }

   public Array[] removeValue(Array valueToRemove){
       return null;
   }

}
