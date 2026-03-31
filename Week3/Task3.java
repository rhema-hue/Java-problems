import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[]arr={1,2,3,4,5,6,7,8};
        int key=5;
        int result= Arrays.binarySearch(arr,key);
        if(result>=0){
            System.out.println("The element"+" "+key+" "+"was found at index"+" "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}