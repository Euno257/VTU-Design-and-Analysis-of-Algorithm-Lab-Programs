import java.util.*;
class StackMethods
{
  int top;
  int size;
  int stack[];
  public StackMethods(int arraySize)
  {
    size = arraySize;
    stack = new int[size];
    top= -1;
  }
  public void push(int value)
  {
    if(top==size-1)
    {
      system.out.println("Stack is full, can't push a value");
    }
    else
    {
      top = top+1;
      stack[top]=value;
    }
  }
  public int pop()
  {
    if(top==-1)
    {
      System.out.println("Stack is empty");
      return -1;
    }
    else
    {
      top--;
      return stack[top--];
    }
  }
}
