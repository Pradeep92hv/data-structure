https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/0





class Solution {
    public boolean canPair(int[] a, int k) {
        // Code here
         HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
         
         for(int i=0;i<a.length;i++)
         {
             int rem=a[i]%k;
             map.put(rem,map.getOrDefault(rem,0)+1);
         }
       
          for(int i=0;i<a.length;i++)
          {
                 int rem=a[i]%k;

            
               if(rem==0 && map.get(rem)%2==1)
               {
                   
                    return false;
               }
               
               else if(rem*2==k && map.get(rem)%2==1)
               {
                   
                    return false;
               }
            
               else
               {
                   if(rem!=0 && map.get(rem)!=map.get(k-rem))
                    return false;
                   
               }
               
              
          }
          return true;
    }
}
