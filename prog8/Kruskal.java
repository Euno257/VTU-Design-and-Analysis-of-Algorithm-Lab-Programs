import java.util.*;
public class Kruskal
{
  public static int find(int v,int s[])
  {
    while(s[v]!=v)
      v = s[v];
    return v;
  }
  public static void union(int i,int j,int s[])
  {
    s[i]=j;
  }
  public static void kruskal(int n, int c[][])
  {
    int min,i,j,u=0,v=0;
    int s[] = new int[10];
    int t[][] = new int[10][2];
    for(i=0;i<n;i++)
        s[i]=i;
    int count=0;
    int sum=0;
    int k=0;
    while(count<n-1)
    {
      min = 999;
      for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
          {
            if(c[i][j]!=0 && c[i][j]<min)
            {
              min = c[i][j];
              u=i;
              v=j;
            }
          }
       }
       if(min==999)break;
       i = find(u,s);
       j = find(v,s);
       if(i!=j)
       {
         t[k][0]=u;
         t[k][1]=v;
         k++;
         count++;
         sum+=min;
         union(i,j,s);
       }
       c[u][v] = c[v][u] =999;
    }
    if(count == n-1)
    {
      System.out.println("cost of spanning tree is "+sum+"\n");
      System.out.println("Spanning tree is\n");
      for(k=0;k<n-1;k++)
      {
        System.out.println("\n"+t[k][0]+","+t[k][1]);
      }
    }
    else
      System.out.println("Spanning tree doesn't exists");
  }
  public static void main(String args[])
  {
    int n,i,j;
    int c[][] = new int[10][10];
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of nodes\n");
    n = in.nextInt();
    System.out.println("Enter the cost adjacency matrix\n");
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        c[i][j]= in.nextInt();
      }
    }
    kruskal(n, c);
  }
}
