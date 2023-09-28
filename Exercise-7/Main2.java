import java.util.*;

interface StackMethods <E>
{
    Boolean isFull();
    Boolean isEmpty();
    void push(E obj);
    E pop();
}

class Stack<E> implements StackMethods <E>
{
    int top;
    E[] data;
    public Stack(E[] arr)
    {
        data=arr;
    }

    public Boolean isFull()
    {
        if(top==data.length)
            return true;
        else
            return false;
    }

    public Boolean isEmpty()
    {
        if(top==0)
            return true;
        else
            return false;
    }

    public void push(E element)
    {
        if(isFull()==false)
        {
            data[top]=element;
            top++;
        }
        else
        {
            System.out.println("Stack overflow. Cannot push the element "+element);
        }
    }

    public E pop()
    {
        if(isEmpty()==false)
            return data[--top];
        else
        {
            System.out.println("Stack underflow. Cannot pop an element");
            return null;
        }
    }
}

class Main2 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int choice1,choice2;
        do
        {
            System.out.println("Choices: ");
            System.out.println("1.Integer datatype\n2.Double datatype\n3.String datatype\n4.Exit\n");
            System.out.println("Enter the choice: ");
            choice1=scanner.nextInt();
            switch(choice1)
            {
                case 1:
                    Integer a1[]=new Integer[2];
                    Stack<Integer> s1=new Stack<Integer>(a1);
                    do
                    {
                        System.out.println("Choices: ");
                        System.out.println("1.Push()\n2.Pop()\n3.IsFull()\n4.IsEmpty()\n5.Back Menu\n");
                        System.out.println("Enter the choice: ");
                        choice2=scanner.nextInt();
                        switch(choice2)
                        {
                            case 1:
                                System.out.println("\nEnter the integer element you want to  push: ");
                                int data=scanner.nextInt();
                                s1.push(data);
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("Popped element is: "+s1.pop()+"\n");
                                break;
                            case 3:
                                System.out.println("\nIsFull? "+s1.isFull()+"\n");
                                break;
                            case 4:
                                System.out.println("\nIsEmpty? "+s1.isEmpty()+"\n");
                                break;
                            case 5:
                                System.out.println("\nBack menu\n");
                                break;
                            default:
                                System.out.println("\nInvalid choice...\n");
                        }
                    }while(choice2!=5);
                    break;
                case 2:
                    Double a2[]=new Double[2];
                    Stack<Double> s2=new Stack<Double>(a2);
                    do
                    {
                        System.out.println("Choices: ");
                        System.out.println("1.Push()\n2.Pop()\n3.IsFull()\n4.IsEmpty()\n5.Back Menu\n");
                        System.out.println("Enter the choice: ");
                        choice2=scanner.nextInt();
                        switch(choice2)
                        {
                            case 1:
                                System.out.println("\nEnter the double element you want to  push: ");
                                double data=scanner.nextDouble();
                                s2.push(data);
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("Popped element is: "+s2.pop()+"\n");
                                break;
                            case 3:
                                System.out.println("\nIsFull? "+s2.isFull()+"\n");
                                break;
                            case 4:
                                System.out.println("\nIsEmpty? "+s2.isEmpty()+"\n");
                                break;
                            case 5:
                                System.out.println("\nBack menu\n");
                                break;
                            default:
                                System.out.println("\nInvalid choice...\n");
                        }
                    }while(choice2!=5);
                    break;
                case 3:
                    String a3[]=new String[2];
                    Stack<String> s3=new Stack<String>(a3);
                    do
                    {
                        System.out.println("Choices: ");
                        System.out.println("1.Push()\n2.Pop()\n3.IsFull()\n4.IsEmpty()\n5.Back\n");
                        System.out.println("Enter the choice: ");
                        choice2=scanner.nextInt();
                        switch(choice2)
                        {
                            case 1:
                                System.out.println("\nEnter the string element you want to  push: ");
                                scanner.nextLine();
                                String data=scanner.nextLine();
                                s3.push(data);
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("Popped element is: "+s3.pop()+"\n");
                                break;
                            case 3:
                                System.out.println("\nIsFull? "+s3.isFull()+"\n");
                                break;
                            case 4:
                                System.out.println("\nIsEmpty? "+s3.isEmpty()+"\n");
                                break;
                            case 5:
                                System.out.println("\nBack menu\n");
                                break;
                            default:
                                System.out.println("\nInvalid choice...\n");
                        }
                    }while(choice2!=5);
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("\nInvalid choice...\n");
            }
        }while(choice1!=4);
    }
}