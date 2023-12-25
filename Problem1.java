import java.io.*;
class Problem1{
    static int search(int ar[], int size)
    {
        int low = 0;
        int high = ar.length-1;
        int mid;

        
        //Binary search implementation
        while(low <= high){
            mid = low + (high - low) / 2;
            //Look for the first element where difference between element and index is 2
            if(ar[mid]!=mid+1 && ar[mid-1]==mid){
                return (mid+1);
            }
            
            if(ar[mid]!=mid+1)
                high = mid-1;
            
            else
                low = mid + 1;
            
           
        }
        return -1;
      
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int ar[] = { 1,2,4, 5,6,7,8 };
        int size = ar.length;
        System.out.println("Missing number: "
                           + search(ar, size));
    }
}

//Time complexity- O(log n)
//Space Complexity- O(1) as no extra space is used.
//Intuition: We have to look for the first element where difference between element and index is 2 