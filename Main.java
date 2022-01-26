import java.util.*;
import java.io.*;
import java.math.*;


class Main {

  public static void genPassword(int t) throws IOException
    {
      if(t==1)
      {
        //generate Lowercase
         int[] lowerInts= new int[1000] ;
         char[] lower= new char[1000] ;

        for(int i=0;i<lowerInts.length;i++)
        {
          int k=(int)(97+Math.random()*25);
          lowerInts[i]=k;
        }
        for(int i=0;i<lowerInts.length;i++)
        {
          int st=lower[i];
          lower[i]=(char)st;
          System.out.print("\n"+lower[i]);
        }  
        File fileName1=new File("Lower.txt");
        PrintWriter outFile1 = new PrintWriter(fileName1);
        for(int ch:lowerInts)
        outFile1.print(ch);
       // inputFile1.close();   
        outFile1.close();

      }
      else if(t==2)
      {
        //generate Uppercase      
              char[] upper= new char[8] ;
             int[] upperInts= new int[1000] ;
         for(int i=0;i<upperInts.length;i++)
        {
          int k=(int)(65+Math.random()*25);
          upperInts[i]=k;
        }  
          for(int i=0;i<upper.length;i++)
        {
          int st=upperInts[i];
          upper[i]=(char)st;   
         System.out.print("\n"+upper[i]);

        }  
        File fileName2=new File("Upper.txt");
        PrintWriter outFile2 = new PrintWriter(fileName2);
        for(int ch:upperInts)
        outFile2.print(ch);     //   inputFile2.close();
        outFile2.close();

      }
      else if(t==3)
      {
                //generate all Case
              int[] mixedLetInts= new int[1000] ;
              char[] mixedLet= new char[8] ;
          for(int i=0;i<mixedLetInts.length;i++)
        {
          int k=(int)(65+Math.random()*50);
          if(k>90)
          k+=6;
          mixedLetInts[i]=k;
        }  
          for(int i=0;i<mixedLet.length;i++)
        {
          int st=mixedLetInts[i];
          mixedLet[i]=(char)st;
           System.out.print("\n"+mixedLet[i]);
        }  
        File fileName3=new File("Mixed_letters.txt");
        PrintWriter outFile3 = new PrintWriter(fileName3);
        for(int ch:mixedLetInts)
        outFile3.print(ch);       // inputFile3.close();
        outFile3.close();

      }
      else if(t==4)
      {
                //generate all Char no Symbols         
                 char[] mixedLetNum= new char[8] ;
                int[] mixedLetNumInts= new int[1000] ;
                for(int i=0;i<mixedLetNumInts.length;i++)
        {
          int k=(int)(48+Math.random()*60);
           if(k>57)
          k+=7;
           if(k>90)
          k+=6;
          mixedLetNumInts[i]=k;
        }  
         for(int i=0;i<mixedLetNum.length;i++)
        {
          int st=mixedLetNumInts[i];
          mixedLetNum[i]=(char)st;
          System.out.print("\n"+mixedLetNum[i]);
        }  
        File fileName4=new File("Mixed_letters_numbers.txt");
        PrintWriter outFile4 = new PrintWriter(fileName4);
        for(int ch:mixedLetNumInts)
        outFile4.print(ch);      //  inputFile4.close();
        outFile4.close();

      }
      else if(t==5)
      {
                //generate All char      
          char[] upperallChars= new char[8] ;
         int[] upperallCharsInts= new int[1000] ;
                for(int i=0;i<upperallCharsInts.length;i++)
        {
          int k=(int)(33+Math.random()*93);
          upperallCharsInts[i]=k;
        }  
         for(int i=0;i<upperallChars.length;i++)
        {
          int st=upperallCharsInts[i];
          upperallChars[i]=(char)st;
          System.out.print("\n"+upperallChars[i]);
        }  
        File fileName5=new File("Mixed_chars.txt");
        PrintWriter outFile5 = new PrintWriter(fileName5);
        for(int ch:upperallCharsInts)
        outFile5.print(ch);     //   inputFile5.close();
        outFile5.close();

      }
      else if(t==0)
      {
        //exit
      System.out.println("Have a nice day!");
      }
     }
    

  public static void main(String[] args) throws IOException  {
    int type=0;
    Scanner scan=new Scanner(System.in);
    
    System.out.println("Welcome to the password generator! \n\n\nPlease select which type of password you would like to generate!\n\n1.Lowercase letters\n2.Uppercase letters\n3.Uppercase and Lowercase letters\n4.Uppercase, Lowercase, and Numbers\n5.Uppercase, Lowercase, Numbers and Symbols\n0.Exit\n\nEnter Selection by typing numbers 1,2,3,4,5 or 0 to Exit:");
     type=scan.nextInt();
     genPassword(type);
           System.out.println("\nDo you wish to continue? enter 1 for yes or other for no");
           int pe=scan.nextInt();

           while(pe==1)
           {
             System.out.println("\nPlease select which type of password you would like to generate!\n\n1.Lowercase letters\n2.Uppercase letters\n3.Uppercase and Lowercase letters\n4.Uppercase, Lowercase, and Numbers\n5.Uppercase, Lowercase, Numbers and Symbols\n0.Exit\n\nEnter Selection by typing numbers 1,2,3,4,5 or 0 to Exit:");
                  type=scan.nextInt();
           genPassword(type);
            System.out.println("\nDo you wish to continue? enter 1 for yes or other for no");
           pe=scan.nextInt();
           }

     scan.close();
   
  }
}
