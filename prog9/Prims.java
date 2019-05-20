import java.util.*;
public class Prims
{
    public static void main(String args[])
    {
      int c[][] = new int[10][10];
      int visited[] = new int[10];
      int i,j,k=0;
      int s,min=999;

      System.out.println("Enter the number of vertices");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      System.out.println("Enter the weighted graph");
      for(i=1;i<=n;i++)
        for(j=1;j<=n;j++)
          c[i][j]= in.nextInt();

      for(i=1;i<=n;i++)
        visited[i]=0;

      System.out.println("Enter the source vertex");
      s=in.nextInt();
      visited[s]=1;

      int u=0,v=0,flag=0;
      int sum = 0;
      k=1;
      while(k<=n-1)
      {
         min=999;
         for(i=1;i<=n;i++)
           for(j=1;j<=n;j++)
           if(visited[i]==1 && visited[j]==0)
            if(i!=j && c[i][j]<min)
            {
             min=c[i][j];
             u=i;
             v=j;
            }
          visited[v]=1;

          sum=sum+min;
          System.out.println(u+","+v+"->"+min);
          k++;
      }
      for(i=1;i<=n;i++)
          if(visited[i]!=0)
            flag=1;
            
      if(flag==1)
        System.out.println("The cost of minimum spanning tree is "+ sum);
      else
          System.out.println("No spanning tree");
    }
}
