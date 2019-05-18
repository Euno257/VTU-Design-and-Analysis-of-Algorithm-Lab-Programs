import java.util.*;
public class Customer
{
  String str;
  String read()
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the name and DOB in <name,dd/mm/yyyy> format");
    str = in.nextLine();
    if(!str.startsWith("<")||!str.endsWith(">"))
    {
      System.out.println("Please enter in proper format");
      System.exit(0);
    }
    return str;
  }
  void display(String data)
  {
    String st = data.substring(0,data.length());
    StringTokenizer token = new StringTokenizer(str,"<,/,>");
    String finalString = null;
    while(token.hasMoreTokens())
    {
      if(finalString==null)
      {
        finalString = token.nextToken();
      }
      else
      {
        finalString = finalString+","+token.nextToken();
      }
    }
    System.out.println("The resultant string is "+"<"+finalString+">");
  }
  public static void main(String args[])
  {
    Customer c = new Customer();
    String data = c.read();
    c.display(data);
  }

}
