package Minggu4;
public class SequentialSearch {
    public static void main (String[] arsg) {
        int[][] exampleVariableOne = {{2,9,2,4,5,3,0,1},{1,2,3,4,5,6,7,8}};
        int target = 2;
        sequentialSearch(exampleVariableOne, target);
    }
    public static void sequentialSearch (int[][] parameterOne, int parameterTwo) {
//        String index = "false";
//        int j;
        // searches each index of the array until it reaches the last index
        for (int i =0; i<parameterOne.length; i++) {
            for (int j=0; j<8; j++) { //j<8 adl untuk index nya
//                System.out.println("Your target integer "+" ["+i+"]"+"["+j+"]");
            if (parameterOne[i][j] == parameterTwo) {
                System.out.println("Your target integer is index "+" ["+i+"]"+"["+j+"]");
//                break; //true
                
            }
                // if the target is found, int index is set as the value of i and
                // the for loop is terminated
            }
//            if (parameterOne[i][j] == parameterTwo) break;
        }
//        if (index == "false") {
//            System.out.println("Your target integer does not exist in the array");
//            
//        }else {
//            System.out.println("Your target integer is in index " + index + " of the array");
//        }
    }
}
