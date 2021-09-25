// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : <of the file contents>

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
                arrayItems += String.format("%d %s", inArray[i], separator);
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
            int arrayLast = inArray.length - 1; 
            return arrayLast;
        }
    
    // 4) Write a public static method named getAllButFirst, 
    //    that takes an Array of int as an argument and creates and returns 
    //    a new array with all of the values in the argument array except the first value.
        public static int[] getAllButFirst(int[] inArray){
            int[] modifiedArray = new int[inArray.length - 1];
            for(int i = 1; i <= inArray.length; i++ ){
                modifiedArray[i - 1] = inArray[i];
            }
            return modifiedArray;
        }
    

    // 5) Write a public static method named getIndexOfMin, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the least value in the array.
        public static int getIndexOfMin(int[] inArray){
            int tempMinValue = 0, tempMinIndex = 0, prevMinValue = 0, prevMinIndex = 0, finalMinIndex = 0;
            for(int i = 0; i < inArray.length; i++){
                tempMinValue = inArray[i];
                tempMinIndex = i;
                if(tempMinValue < prevMinValue){
                    finalMinIndex = tempMinIndex;
                }
                else{
                    finalMinIndex = prevMinIndex;
                }
                prevMinValue = tempMinValue;
                prevMinIndex = tempMinIndex;
            }
            return finalMinIndex;
        }
    
    
    // 6) Write a public static method named getIndexOfMax, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the largest value in the array.
        
        public static int getIndexOfMax(int[] inArray){
            int tempMaxValue = 0, tempMaxIndex = 0, prevMaxValue = 0, prevMaxIndex = 0, finalMax = 0;
            for(int i = 0; i < inArray.length; i++ ){
                tempMaxValue = inArray[i];
                tempMaxIndex = i;               
                if(tempMaxValue > prevMaxValue){
                    finalMax = tempMaxIndex;
                }
                else{
                    finalMax = prevMaxIndex;
                }
                prevMaxValue = tempMaxValue;
                prevMaxIndex = tempMaxIndex;
            }
            return finalMax;
        }
    
    // 7) Write a public static method named swapByIndex, 
    //    that takes three arguments. The first argument is an Array of int, 
    //    and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments 
    //    in the array, and return a reference to the array.
        
        public static int[] swapByIndex(int[] inArray, int index1, int index2){
            int tempIndex = index1;
            inArray[index1] = inArray[index2];
            inArray[index2] = inArray[tempIndex];
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
        int counter = 0;
        for(int i = 0; i < inArray.length; i++){
            counter++;
        }
        for(int i = counter - 1; i > index1; i--){
            inArray[i] = inArray[i - 1];
        }
        inArray[index1] = value;
        return inArray;
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
