class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int [] color = new int [n];
        Arrays.fill(color,-1);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n;i++){
            if(color[i] == -1){
                q.add(i);
                color[i]=0;

                while(!q.isEmpty()){
                    int m = q.poll();
                    for(int it : graph[m]){
                        if(color[it]== -1){
                            color[it] =   1 - color[m];
                            q.add(it);
                        }
                        else{
                            if(color[it] == color[m]){
                                return false;
                            }
                        }
                    }
                }

            }

        }
        return true;

        
    }
}