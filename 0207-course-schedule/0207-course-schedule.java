class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
      for(int i = 0; i< numCourses; i++){
        adj.add(new ArrayList<Integer>());
      }
      int [] indegree = new int [numCourses];
      int [] vis = new int [numCourses];
      for(int[] edge : prerequisites){
        int u = edge[0];
        int v = edge[1];
        adj.get(u).add(v);
        indegree[v]++;
      }
      int cnt = 0;
      Queue<Integer> q = new LinkedList<>();
      for(int i = 0; i< numCourses ; i++){
        if(indegree[i]==0){
            q.add(i);
        }
      }
      while(!q.isEmpty()){
        int node = q.poll();
        cnt++;
        for(int it : adj.get(node)){
            indegree[it]--;
            if(indegree[it] == 0 ){
                q.add(it);
            }
        }
      }
      return (cnt==numCourses);
    }
}