/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;
import object.IntUtil;
/**
 *
 * @author shraddha
 */
class PowerBall{
  private int[] winningNumber ;
  private int[] ticketNumber ;
  private long cash ;
  private static final IntUtil u = new IntUtil();

  public void check()
  {
      
    int count = 0;
    boolean powerball;
    for (int i = 0; i<winningNumber.length; i++)
    {
        for(int j=0; j<ticketNumber.length; j++)
        {
            if(winningNumber[i]==ticketNumber[j])
            {
                count ++;
            }
        }
    }
    if(winningNumber[5] == ticketNumber[5] && (count==5))
    {
        System.out.println("You won jackport");
        cash = 1000000000000L;
    }
    else
    {
        if(winningNumber[5] == ticketNumber[5])
        {
            cash = 4;   
        }
        else if(count==1 &&(winningNumber[5] == ticketNumber[5]))
        {   
            cash = 4;   
        }
        else if(count==2 && (winningNumber[5] == ticketNumber[5]))
        {
            cash = 7;
        }
        else if(count==3 && (winningNumber[5] == ticketNumber[5]))
        {
            cash = 100;
        }
        else if(count ==4 && (winningNumber[5] == ticketNumber[5]) )
        {
            cash = 50000;
        }
        else if(count ==5 && (winningNumber[5] == ticketNumber[5]))
        {
            cash = 1000000;
        }
        else if(count == 3)
        {
            cash = 7;
        } 
        else if(count == 4)
        {
            cash = 100;
        }
        else if(count == 5)
        {
            cash = 1000000;
        }
    }
     
    //System.out.println("Out of 10000 times you win " + cash + "$") ;
  }
  PowerBall(int[] w, int [] t) 
  {
    winningNumber = w ;
    ticketNumber = t ;
    cash = 0 ;
    check() ;
   
  }
  private static void test1() {
    int[] w = {4,8,19,27,24,10} ;
    {
      int [] n= {4,8,19,27,24,10} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {24,27,19,8,4,10} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {24,27,19,8,4,5} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,127,119,18,14,10} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,127,119,18,14,5} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,127,119,18,14,5} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,124,19,119,18,14} ;
      PowerBall x = new PowerBall(w,n);
    }  
  }
  
  private static void testRandom() {
    int[] w = {4,8,19,27,24,10} ;
    int max = 10000 ;
    long c = 0 ;
    for (int i = 0; i < max; ++i) {    
      int [] n = u.generateRandomNumber(6,true,1,99);
      PowerBall x = new PowerBall(w,n); 
      c = c + x.cash;
       System.out.println("Out of " + max + " times you win " + c + "$") ;
    }
       System.out.println("Out of " + max + " times you win " + c + "$") ;
  }
  
  public static void main(String[] args) {
    System.out.println("PowerBall.java");
    test1();
    testRandom();
    
    System.out.println("Done");
  }
  
}

      