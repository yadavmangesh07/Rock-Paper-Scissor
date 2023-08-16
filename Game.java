import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("0-->Rock");
        System.out.println("1-->Paper");
        System.out.println("2-->Sicssor");
        System.out.println();
        System.out.println("<----------------------------------->");
        System.out.println();
        System.out.print("Enter the number of round to be played :");
        int t=sc.nextInt();
        
        
        int count =0;
        int comp=0;
        while(t!=0){
            System.out.print("Enter your choice :");
        int a=sc.nextInt();
        Random rn =new Random();
       
             int b=rn.nextInt(3);
            // int b=rn.nextInt(3);
            if (b==1 && a==2 || b==0 && a==1 || b==2 && a==0){
            System.out.println("You Won !!");
            count+=1;
        }
        else{
            System.out.println("You Lose");
            comp+=1;
        }
        System.out.println("The computer choice was :"+b);
        t--;
        }
        System.out.println("<----------------------------------->");
        System.out.println("Your points :"+count);
        System.out.println("Computer`s points :"+comp);
        if(count>comp){
            System.out.println("You won the round");
        }
        else if(count==comp){
            System.out.println("Match Draw");
        }
        else{
            System.out.println("You lost the round");
        }
        sc.close();
       

    
    }
}
