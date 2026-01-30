class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0||t.length()>s.length()){
            return "";
        }
        Map<Character,Integer>Tmap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            Tmap.put(t.charAt(i),Tmap.getOrDefault(t.charAt(i),0)+1);
        }
        int l=0;int r=0;int create=0; int require=Tmap.size();
        int [] ans={-1,0,0};
        Map<Character,Integer>subString=new HashMap<>();
        while(r<s.length()){
            char c=s.charAt(r);
            int count=subString.getOrDefault(c,0);
            subString.put(c,count+1);
            if(Tmap.containsKey(c)&&subString.get(c).intValue()==Tmap.get(c).intValue()){
             create++;
            }
            while(create==require && l<=r){
           c= s.charAt(l);
           if(ans[0]==-1 || ans[0]>r-l+1){
            ans[0]=r-l+1;
            ans[1]=l;
            ans[2]=r;
           }
           subString.put(c,subString.get(c)-1);
           if(Tmap.containsKey(c)&&subString.get(c).intValue()<Tmap.get(c).intValue()){
            create--;
           }
           l++;
            }
            r++;
        }

     if(ans[0]==-1){
        return "";
     }
     else{
        return s.substring(ans[1],ans[2]+1);
     }

    }


}