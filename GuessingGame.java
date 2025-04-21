import java.util.*;

import java.util.*;
class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the number guessing game");
    System.out.println("Press 1 for easy level \nPress 2 for medium level \n Press 3 for hard level");
    //to store the level
    int level = sc.nextInt();
    switch(level)
      {
          case 1:
              int r1 = (int)(Math.random()*10);
               System.out.println(r1);
              System.out.println("You have 4 attempts");
              System.out.println("Guess the number between 1 to 10");
              for(int i=1;i<=4;i++)
                {
                  int guess = sc.nextInt();
                  
                   if(guess==r1)
                  {
                    System.out.println("You guessed the number");
                    break;
                  }
                  else if(guess>r1)
                  {
                    if(i==4)
                    {
                      System.out.println("you lost the game") ;
                    }
                    else{
                      System.out.println("The number is less than "+guess);
                      System.out.println("You have "+(4-i)+" attempts left");
                    }
                  }
                  else if(guess<r1)
                  {
                    if(i==4)
                    {
                      System.out.println("you lost the game") ;
                    }
                    else{
                    System.out.println("The number is greater than "+guess);
                    System.out.println("You have "+(4-i)+" attempts left");
                    }
                  }
                  
                }
                  break;
          case 2:
              int r2 = (int)(Math.random()*100);
              System.out.println("You have 7 attempts");
              System.out.println("Guess the number between 1 to 100");
              for(int i=1;i<=7;i++)
                {
                  int guess = sc.nextInt();
                  if(i==7)
                    {
                     System.out.println("you lost the game") ;
                    }
                  else if(guess==r2)
                  {
                    System.out.println("You guessed the number");
                    break;
                  }
                  else if(guess>r2)
                  {
                    if(i==7)
                    {
                      System.out.println("you lost the game") ;
                    }
                    else{
                    System.out.println("The number is less than "+guess);
                    System.out.println("You have "+(7-i)+" attempts left");
                    }
                  }
                  else
                  { 
                    if(i==7)
                    {
                      System.out.println("you lost the game") ;
                    }
                    else{
                    System.out.println("The number is greater than "+guess);
                    System.out.println("You have "+(7-i)+" attempts left");
                    }
                  }
                }
                  break;
          case 3:
          int r3 = (int)(Math.random()*1000);
          System.out.println("You have 10 attempts");
          System.out.println("Guess the number between 1 to 1000");
          for(int i=1;i<=10;i++)
            {
              int guess = sc.nextInt();
              if(i==10)
                {
                 System.out.println("you lost the game") ;
                }
              else if(guess==r3)
              {
                System.out.println("You guessed the number");
                break;
              }
              else if(guess>r3)
              {
                if(i==10)
                {
                  System.out.println("you lost the game") ;
                }
                else{
                System.out.println("The number is less than "+guess);
                System.out.println("You have "+(10-i)+" attempts left");
                }
              }
              else
              {
                if(i==10)
                {
                  System.out.println("you lost the game") ;
                }
                else{
                System.out.println("The number is greater than "+guess);
                System.out.println("You have "+(10-i)+" attempts left");
                }
              }
            }
              break;
          default:
              System.out.println("Invalid input");
      }

  }
}
