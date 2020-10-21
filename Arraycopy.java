import java.util.Arrays; 
  
public class Arraycopy 
{ 
    public static void main(String args[]) 
    { 
       
        int[] arr = new int[] {5, 3 ,1}; 
  
        System.out.println("Original Array"); 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
  
        
        int[] copyArr = Arrays.copyOf(arr, 5); 
  
      
        copyArr[3] = 4; 
        copyArr[4] = 2; 
  
        System.out.println("\nNew array copy after modifications:"); 
        for (int i = 0; i < copyArr.length; i++) 
            System.out.print(copyArr[i] + " "); 
    } 
} 