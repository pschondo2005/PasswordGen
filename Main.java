import java.util.*;
import java.io.*;
import java.math.*;


class Main {
  public String genPassword(int t)
    {
      String gen="";
      if(t==1)
      {
        //generate Lowercase
        String[] lower;
        (int)(97+Math.random()*25)
        File fileName1=new File("Lower.txt");
        outFile1.println(gen);
        inputFile1.close();   
        outFile1.close();

      }
      else if(t==2)
      {
        //generate Uppercase
        File fileName2=new File("Upper.txt");
        outFile2.println(gen);
        inputFile2.close();
        outFile2.close();

      }
      else if(t==3)
      {
                //generate all Case
        File fileName3=new File("Mixed_letters.txt");
        outFile3.println(gen);
        inputFile3.close();
        outFile3.close();

      }
      else if(t==4)
      {
                //generate all Char no Symbols
        File fileName4=new File("Mixed_letters_numbers.txt");
        outFile4.println(gen);
        inputFile4.close();
        outFile4.close();

      }
      else if(t==5)
      {
                //generate All char
        File fileName1=new File("Mixed_chars.txt");
        outFile5.println(gen);
        inputFile5.close();
        outFile5.close();

      }
      else if(t==0)
      {
        //exit

      }
      return gen;
    }
  public static void main(String[] args) {
    int type=0;
    Scanner scan=new Scanner(System.in);
    
    System.out.println("Welcome to the password generator! \n\n\nPlease select which type of password you would like to generate!\n\n1.Lowercase letters\n2.Uppercase letters\n3.Uppercase and Lowercase letters\n4.Uppercase, Lowercase, and Numbers\n5.Uppercase, Lowercase, Numbers and Symbols\n0.Exit\n\nEnter Selection by typing numbers 1,2,3,4,5 or 0 to Exit:");
     type=scan.nextInt();
  }
}