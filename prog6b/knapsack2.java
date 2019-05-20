import java.util.*;

public class knapsack2
{
  public static void main(String args[])
  {
    float item[] = new float[20];
    float weight[] = new float[20];
    float profit[] = new float[20];
    float ratio[] = new float[20];

    float capacity;
    int n,i,j;
    float temp;
    Scanner in = new Scanner(System.in);
    System.out.println("\n Enter the number of objects ");
    n = in.nextInt();

    System.out.println("\n Enter items, weights and profit ");
    for(i=0;i<n;i++)
    {
      item[i]=in.nextFloat();
      weight[i]=in.nextFloat();
      profit[i]=in.nextFloat();
    }

    System.out.println("\n Enter the capacity of knapsack ");
    capacity = in.nextFloat();

    for(i=0;i<n;i++)
      ratio[i]= profit[i]/weight[i];

    for(i=0;i<n;i++)
      for(j=i+1;j<n;j++)
        if(ratio[i]<ratio[j])
        {
          temp = ratio[j];
          ratio[j] = ratio[i];
          ratio[i] = temp;

          temp = profit[j];
          profit[j] = profit[i];
          profit[i] = temp;

          temp = weight[j];
          weight[j] = weight[i];
          weight[i] = temp;

          temp = item[j];
          item[j] = item[i];
          item[i] = temp;
        }
        knapsack(n,item,weight,profit,capacity);
  }
  public static void knapsack(int n, float item[],float weight[],float profit[],float capacity)
  {
      float tp = 0; //tp: total profit
      float u = capacity;
      int i;
      float x[]= new float[20];

      for(i=0;i<n;i++)
        x[i]= (float)0.0;

      for(i=0;i<n;i++)
      {
        if(weight[i]>u)
          break;
        else
        {
            x[i]= (float)1.0;
            tp = tp + profit[i];
            u = (float)(u-weight[i]);
        }
      }
      if(i<n)
        x[i]=u/weight[i];
      tp = tp +(x[i] * profit[i]);

      System.out.println("\n The resultant vector is");
      for(i=0;i<n;i++)
        System.out.println("item"+item[i]+":"+x[i]);
      System.out.println("Maximum profit is "+tp);
  }
}
