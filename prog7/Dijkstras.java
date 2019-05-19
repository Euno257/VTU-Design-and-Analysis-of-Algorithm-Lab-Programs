import java.util.*;
public class Dijkstras
{
  final static int infinity = 9999;
  final static int MAX = 20;
  static int a[][];
  static int n;
  static Scanner in = new Scanner(System.in);

  public static void main(String args[])
  {
    System.out.println("Enter the number of vertices:");
    n = in.nextInt();
    System.out.println("Enter the cost adjacency matrix");
    a = new int[MAX][MAX];
    for (int i=1;i<=n;i++)
      for (int j=1;j<=n;j++)
        a[i][j] = in.nextInt();
    int s = 0;
    System.out.println("\nEnter the source vertex");
    s=in.nextInt();
    Dijkstra(s); //function to find shortest path
  }
  public static void Dijkstra(int s)
  {
    int V[] = new int[MAX]; //Array to check whether vertex is visited or not
    int d[] = new int[MAX]; //distance from source to each vertex
    int u,v;
    for(int i=1;i<=n;i++)
    {
      V[i]=0; //initially every vertex is not visited
      d[i] = a[s][i]; //weights from source
    }
    V[s]=1;
    d[s]=0;
    int i=2;
    while(i<=n)
    {
      u = Extract_Min(V,d); //vertex with min distance from source
      V[u]=1;
      i++;
      for(v=1;v<=n;v++)
      {
        if((d[u]+a[u][v]<d[v]) && V[v]==0)
          d[v]= d[u]+a[u][v];
      }
    }
    for(i=1;i<=n;i++)
        if(i!=s)
          System.out.println(i+":"+d[i]);
  }
  public static int Extract_Min(int V[],int d[])
  {
    int i,j,min;
    j=1;
    min = infinity;
    for(i=1;i<n;i++)
      if(d[i]<min && V[i]==0)
      {
        min = d[i];
        j=i;
      }
      return (j);
  }

}
