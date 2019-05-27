import java.util.*;
public class TSP
{
  public static void main(String args[])
  {
    int c[][] = new int[10][10];
    int tour[]= new int[10];
    int n,i,j,cost;
    System.out.println("Enter number of cities ");
    Scanner in = new Scanner(System.in);
    n=in.nextInt();

    System.out.println("Enter the cost matrix ");
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
        c[i][j]= in.nextInt();

    for(i=0;i<n;i++)
      tour[i]=i;

    cost = tsp_dp(c,tour,0,n);
    System.out.println("Minimum cost is "+cost);

    System.out.println("tour:");
    for(i=0;i<n;i++)
      System.out.println(tour[i]+"\t");
  }
  static int tsp_dp(int c[][],int tour[],int start, int n)
  {
    int i,j,k;
    int temp[]=new int[10];
    int mintour[]= new int[10];
    int mincost=99,ccost;

    if(start==n-2)
      return(c[tour[n-2]][tour[n-1]]+c[tour[n-1]][0]);

    for(i=start+1;i<n;i++)
      {
        for(j=0;j<n;j++)
          temp[j]=tour[j];
        temp[start+1] = tour[i];
        temp[i]= tour[start+1];

        ccost = tsp_dp(c,temp,start+1,n);

        if(c[tour[start]][tour[i]]+ccost < mincost)
         {
           mincost = c[tour[start]][tour[i]]+ccost;
           for(k=0;k<n;k++)
            mintour[k]=temp[k];
         }
      }
      for(i=0;i<n;i++)
        tour[i]=mintour[i];

      tour[i]= start;
      return mincost;

  }
}
