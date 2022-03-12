public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
        int len = arr.length;
        int left = 0 ; 
        int right = left +  1; 
        int last = len - 1;
        int c,i,j ;
      for(i = 0 ; i <= last ; i++){
          c = 0;
          for(j = 0  ; j <= last ; j++){
          if(arr[i] == arr[j])
             c +=1;
          }
        if(c == 1){
          return  arr[i];
        }
          }
  
        return 0; 
 
    }
}


```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````

public class Solution{  

    public static int findUnique(int[] arr){
	
        int res = arr[0];
        for (int i = 1 ; i<arr.length ; i++){
            res = res^arr[i];
        }
        return res;
 
    }
}
