import java.util.Scanner;

public class Stack {
    static final int CAPACITY = 5;
    static int choice;
    static int stack[] = new int[CAPACITY];
    static int top = -1;
    static int capacity;
    static int item;

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        while (true) {

            System.out.println("Enter your choice : ");
            System.out.println("1. Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Traverse");
            System.out.println("5.Exit\n\n");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                System.out.println("Enter the element to be pushed : ");
                int n = sc.nextInt();
                push(n);
                break;
                case 2 : item = pop();
                        if(item==0)
                        {
                            System.out.println("Stack is empty \n");
                        }else
                        {
                            System.out.println("Popped item is : "+item);
                        }
                         break;
                case 3 : item=peek();
                        if(item==0)
                        {
                            System.out.println("Stack is empty\n");
                        }else
                        {
                            System.out.println("Peek element is : "+item);
                        }
                         break;
                case 4 : traverse();
                          break;
                case 5 : System.exit(0);
                         break;
                default : System.out.println("Invalid Option \n");


            }
        }
    }
    public static Boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public static Boolean isFull()
    {
        if(top==CAPACITY-1)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public static void push(int ele)
    {

            if(isFull())
            {
                System.out.println("Stack is full \n");
            }else
            {
                stack[++top] = ele;
                System.out.println(+ele+" Pushed successfully\n");
            }

    }
    public static int pop()
    {
        if(isEmpty())
        {
            return 0;
        }else
        {
            return stack[top--];

        }

    }
    public static int peek()
    {
        if(isEmpty())
        {
            return 0;
        }else
        {
            return stack[top];
        }
    }

    public static void traverse()
    {
       if(isEmpty())
       {
           System.out.println("Stack is empty\n");
       }else
       {
           int i=0;
           System.out.println("Stack elements are : \n");
           for(;i<=top;i++)
           {
               System.out.println(""+stack[i]);
           }

       }
    }



}
