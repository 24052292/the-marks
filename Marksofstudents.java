
import java.util.Scanner;

public class Marksofstudents {
  public static void main(String[]args){
      Scanner scanner=new Scanner(System.in);
      
      System.out.println("Enter the marks for the student:");
      int marks= scanner.nextInt();
      
      if(marks>=80){
          System.out.println("Level-7:Outstanding achievement!");
      }else if(marks>=70){
          System.out.println("Leve-6:Excellent");
  }else if(marks>=50){
      System.out.println("Level-4:Pass");
  }else{
      System.out.println("Fail");
  }
  } 
}