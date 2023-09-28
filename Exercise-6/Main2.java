import mypack.converter.DistanceConverter;
import mypack.converter.TimeConverter;
import java.util.Scanner;

class Main2
{
    public static void main(String[] args)
    {
        int choice1=0,choice2=0;
        Scanner scanner=new Scanner(System.in);
        DistanceConverter d=new DistanceConverter();
        TimeConverter t=new TimeConverter();
        double km=0,meter=0,miles=0,min=0,hr=0,sec=0;
        do
        {
            System.out.println("CONVERTER PROGRAM\n");
            System.out.println("Choice:\n1.Distance Converter\n2.Time Converter\n3.Exit\n");
            System.out.println("Enter the choice: ");
            choice1=scanner.nextInt();
            System.out.println();
            switch(choice1)
            {
                case 1:
                    System.out.println("DISTANCE CONVERTER\n");
                    System.out.println("Choices:\n1.meter to KM\n2.miles to KM\n3.KM to meter\n4.KM to miles\n");
                    System.out.println("Enter the choice: ");
                    choice2=scanner.nextInt();
                    System.out.println();
                    switch(choice2)
                    {
                        case 1:
                            System.out.println("METER TO KM\n");
                            System.out.println("Enter the meter value: ");
                            meter=scanner.nextDouble();
                            System.out.println(meter+" meters to KM = "+d.meter2KM(meter)+" km\n");
                            break;
                        case 2:
                            System.out.println("MILES TO KM\n");
                            System.out.println("Enter the miles value: ");
                            miles=scanner.nextDouble();
                            System.out.println(miles+" miles to KM = "+d.miles2KM(miles)+" km\n");
                            break;
                        case 3:
                            System.out.println("KM TO METER\n");
                            System.out.println("Enter the km value: ");
                            km=scanner.nextDouble();
                            System.out.println(km+" km to METER = "+d.KM2meter(km)+" meter\n");
                            break;
                        case 4:
                            System.out.println("KM TO miles\n");
                            System.out.println("Enter the miles value: ");
                            km=scanner.nextDouble();
                            System.out.println(km+" km to miles = "+d.KM2miles(km)+" miles\n");
                            break;
                        default:
                            System.out.println("Invalid choice\n");
                    }
                    break;
                case 2:
                    System.out.println("TIME CONVERTER\n");
                    System.out.println("Choices:\n1.Hours to minutes\n2.Minutes to seconds\n3.Minutes to hours\n4.Seconds to minutes\n");
                    System.out.println("Enter the choice: ");
                    choice2=scanner.nextInt();
                    System.out.println();
                    switch(choice2)
                    {
                        case 1:
                            System.out.println("Hours to minutes\n");
                            System.out.println("Enter the hour value: ");
                            hr=scanner.nextDouble();
                            System.out.println(hr+" hrs to minutes = "+t.hr2min(hr)+" min \n");
                            break;
                        case 2:
                            System.out.println("Minutes to seconds\n");
                            System.out.println("Enter the min value: ");
                            min=scanner.nextDouble();
                            System.out.println(min+" min to seconds = "+t.min2sec(min)+" sec \n");
                            break;
                        case 3:
                            System.out.println("Minutes to hours\n");
                            System.out.println("Enter the min value: ");
                            min=scanner.nextDouble();
                            System.out.println(min+" min to hours = "+t.min2hr(min)+" hrs \n");
                            break;
                        case 4:
                            System.out.println("Seconds to minutes\n");
                            System.out.println("Enter the seconds value: ");
                            sec=scanner.nextDouble();
                            System.out.println(sec+" sec to minutes = "+t.sec2min(sec)+" min \n");
                            break;
                        default:
                            System.out.println("Invalid choice\n");
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice!\n");
            }
        }while(choice1!=3);
    }
}