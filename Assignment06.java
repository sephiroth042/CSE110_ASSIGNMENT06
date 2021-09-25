// CSE 110     : 74845 / ONLINE
// Assignment  : 06
// Author      : MORRIS, CHRIS 1223564576
// Description : TEN METHODS-ARRAYS

import java.util.ArrayList;

public class Assignment06 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        printArray(myArray, ", ");
        printArray(myArray, " - ");
        getFirst(myArray);
        getLast(myArray);
        getAllButFirst(myArray);
        getIndexOfMin(myArray);
        getIndexOfMax(myArray);
        swapByIndex(myArray, 1, 4);
        removeAtIndex(myArray, 3);
        insertAtIndex(myArray, 2, 777);
        isSorted(myArray);
    }
    
    // 1) Write a public static method named printArray, 
    //   that takes two arguments. The first argument is an Array of int 
    //   and the second argument is a String. The method should print out 
    //   a list of the values in the array, each separated by the value of the second argument.
        public static void printArray(int[] inArray, String separator){
            String arrayItems = "";
            for(int i = 0; i < inArray.length; i++){
                if(i != inArray.length - 1){
                arrayItems += String.format("%d%s", inArray[i], separator);
                }
                else{arrayItems += String.format("%d", inArray[i]);}     
            }
            System.out.println(arrayItems);
        }
    
    // 2) Write a public static method named getFirst, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the first element of the array.
        public static int getFirst(int[] inArray){
            int arrayFirst = inArray[0];
            return arrayFirst;
        }
    
    // 3) Write a public static method named getLast, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the last element of the array.
        public static int getLast(int[] inArray){
            int arrayLast = inArray[inArray.length - 1]; 
            return arrayLast;
        }
    
    // 4) Write a public static method named getAllButFirst, 
    //    that takes an Array of int as an argument and creates and returns 
    //    a new array with all of the values in the argument array except the first value.
        public static int[] getAllButFirst(int[] inArray){
            int[] modifiedArray = new int[inArray.length - 1];
            for(int i = 1; i < inArray.length; i++ ){
                modifiedArray[i - 1] = inArray[i];
            }
            return modifiedArray;
        }
    

    // 5) Write a public static method named getIndexOfMin, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the least value in the array.
    public static int getIndexOfMin(int[] inArray){
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < inArray.length; i++ ){
            if(min > inArray[i]){
                min = inArray[i];
                index = i;
            }
        }
        return index;
    }
    
    
    // 6) Write a public static method named getIndexOfMax, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the largest value in the array.
        
        public static int getIndexOfMax(int[] inArray){
            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int i = 0; i < inArray.length; i++ ){
                if(max < inArray[i]){
                    max = inArray[i];
                    index = i;
                }
            }
            return index;
        }
    
    // 7) Write a public static method named swapByIndex, 
    //    that takes three arguments. The first argument is an Array of int, 
    //    and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments 
    //    in the array, and return a reference to the array.
        
        public static int[] swapByIndex(int[] inArray, int index1, int index2){
            int tempValue1 = inArray[index1];
            int tempValue2 = inArray[index2];
            inArray[index1] = tempValue2;
            inArray[index2] = tempValue1;
            return inArray;
        } 
    
    //8) Write a public static method named removeAtIndex, 
    //  that takes two arguments. The first argument is an Array of int, 
    //  and the second argument is an int index. This method create and return 
    //  a new array with all of the values in the argument array 
    //  except the value at the argument index.
        
        public static int[] removeAtIndex(int[] inArray, int index1){
            int[] arrayNew = new int[inArray.length - 1];
            int j = index1;
            for(int i = 0, k = 0; i < inArray.length; i++){
                if(i != j ){
                    arrayNew[k] = inArray[i];
                    k++;
                }
            }
            return arrayNew;
        }
    
    
    //9) Write a public static method named insertAtIndex, 
    //   that takes three arguments. The first argument is an Array of int, 
    //   the second argument is an int index, and the third argument is an int value. 
    //   This method create and return a new array with all of the values 
    //   in the argument array and including the third argument value 
    //   inserted at the index specified by the second argument value.
    public static int[] insertAtIndex(int[] inArray, int index1, int value){
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        for(int i = 0; i < inArray.length; i++){
            tempArray.add(i, inArray[i]);
        }
        tempArray.add(index1, value);
        int[] finalArray = tempArray.stream().mapToInt(i->i).toArray(); 
        return finalArray;
    
    }
    
    //10) Write a public static method named isSorted, 
    //    that takes an Array of int as an argument. 
    //    This method should return the boolean value true 
    //    if all the element values in the array are in ascending order; 
    //    otherwise the method should return the boolean value false.
    public static boolean isSorted(int[] inArray){
        int  prevValue = 0, tempValue = 0, counter = 0;
        boolean isSorted = false;
        for(int i = 0; i < inArray.length; i++){
        tempValue = inArray[i];
        if(tempValue > prevValue){
            counter++;
        }
        prevValue = tempValue;
    }
    if(counter == inArray.length){
        isSorted = true;
    }
    return isSorted;
    }
}
