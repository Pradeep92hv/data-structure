
https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


int longestUniqueSubsttr(String s){
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        int l=0,i=0,j=0;
        
        for(i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            while(map.containsKey(c))
            {
                char ch=s.charAt(j);
                if(map.get(ch)==1)
                map.remove(ch);
                else
                map.put(ch,map.get(ch)-1);
                j++;
            }
            map.put(c,map.getOrDefault(c,0)+1);
            
            l=Math.max(l,i-j+1);
            
        }
        return l;
        
    }
