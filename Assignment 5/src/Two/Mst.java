package Two;

import java.util.Scanner;

public class Mst
{
    public  int visited[] = new int[20];
    public  int cost[][] = new int[10][10];
    public int min_cost;
      
    public void calc(int n)
    {   
        int flag[] = new int[n+1];
        int i,j,minimum=999,num_edges=1,a=1,b=1,minpos_i=1,minpos_j=1;
          
  while(num_edges < n)
        {    
             
            for(i=1,minimum=999;i<=n;i++)
             for(j=1;j<=n;j++)
              if(this.cost[i][j]<minimum)
                if(this.visited[i]!=0)
                 {
                      minimum=this.cost[i][j];
                      a=minpos_i=i;
                      b=minpos_j=j;
                 }
 if(this.visited[minpos_i]==0 || this.visited[minpos_j]==0)
             {
  System.out.println("Edge Number \t"+num_edges+"\t from Vertex \t"+a+"\t  to Vertex \t"+b+"-mincost:"+minimum+" \n");
                      this.min_cost=this.min_cost+minimum;
        num_edges=num_edges+1; 
                      this.visited[b]=1;
             }
                   this.cost[a][b]=this.cost[b][a]=999;   
         
         
  }   
          
    }
    public static void main(String args[])
    {
        int nodes,i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Nodes \n");
        nodes = in.nextInt();
        Mst p = new Mst();
        System.out.println("Enter the Cost Matrix Weights : \n");
        for(i=1;i<=nodes;i++)
          for(j=1;j<=nodes;j++)
          {
            p.cost[i][j]=in.nextInt();
            if(p.cost[i][j]==0)
              p.cost[i][j]=999;
          }
        
        p.visited[1]=1;
        p.calc(nodes);
        in.close();
          
    }   
}
