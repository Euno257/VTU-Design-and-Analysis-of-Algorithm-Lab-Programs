import java.util.*;
public class knapsack1
{
  public static int w[]=new int[10]; //weight
  public static int v[][] = new int[10][10]; //profit
  public static int value[] = new int[10]; //value

  static int max(int a, int b)
  {
    return(a>b)?a:b;
  }
  static int knap(int i, int j)
  {
    if(i==0||j==0)
      v[i][j]=0;
    else if(j<w[i])
      v[i][j]=knap(i-1,j);
    else
      v[i][j]=max(knap(i-1,j),value[i]+knap(i-1,j-w[i]));

    return v[i][j];
  }
  public static void main(String args[])
  {
    int n,w1; //no. of items and capacity of knapsack
    int i,j;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of items:");
    n = in.nextInt();
    System.out.println("Enter the capacity of knapsack:");
    w1 = in.nextInt();
    System.out.println("Enter the values ");
    for(i=1;i<=n;i++)
      value[i]= in.nextInt();
    System.out.println("Enter the weights ");
    for(i=1;i<=n;i++)
      w[i]= in.nextInt();
    int profit = knap(n,w1);
    System.out.println("Profit is "+profit);
  }
}
