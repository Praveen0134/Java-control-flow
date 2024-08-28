import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a =s.nextInt();
        System.out.print("Entered Number is ");
        if(a>0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else
        System.out.println("Zero");
        switch (a){
            case 0:{
                System.out.println("Sunday");
                break;
          }
           case 1:{
                System.out.println("MOnday");
                 break;
          }
           case 2:{
                System.out.println("Tuesday");
                 break;
          }
           case 3:{
                System.out.println("Wednesday");
                 break;
          }
           case 4:{
                System.out.println("Thursday");
                 break;
          }
           case 5:{
                System.out.println("Friday");
                 break;
          }
           case 6:{
                System.out.println("Saturday");
                 break;
          }
        }
          for(int i=1;i<=a;i++){
              System.out.print(i);
          }
          System.out.println();
          while(a>0){
              System.out.print(a);
              a--;
          }
          System.out.println();
          a++;
          do{
              System.out.print(a);
              a++;
          }while(a<=3);

        
        }
}