https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	 Stack<Integer> s=new Stack<>();
	 int b[]=new int[n];
	 s.push(-1);
	 for(int i=n-1;i>=0;i--)
	 {
	     while(s.peek()>=arr[i])
	     s.pop();
	     b[i]=s.peek();
	     s.push(arr[i]);
	     
	 }
	 return b;
	} 
}




class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	  int i=0;
	    int ans[]=new int[n];
	    for( i=0;i<n-1;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[i]>arr[j])
	            {
	                ans[i]=arr[j];
	                break;
	            }
	            ans[i]=-1;
	        }
	        
	    }
	    ans[i]=-1;
	    return ans;
	} 
}
