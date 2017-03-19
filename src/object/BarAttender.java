/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;
import java.util.Random;
/**
 *
 * @author shraddha
 */
public class BarAttender {
 
  private int min; //Work in the range of min to max
  private int max;
  
  BarAttender(int min, int max){
    this.min = min ;
    this.max = max  ;
  }
  
  private int guess(int g, boolean show) {
    //WRITE CODE HERE. ONLY PROCEDURE TO WRITE
      if(show)
      {
          return g;
      }
      return g;
  } 
  // Cannot change code below
  private static void test(int s, int b, int m, boolean useRandom,boolean show) {
    Random r = new Random() ;
    int min = b ;
    int max = s ; 
    BarAttender h = new BarAttender(s,b);
    for (int i = 0; i < m; ++i) {
      int v = i + s ;
      if (useRandom) {
        v = RandomInt.getRandomInt(r,s,b); //This gives number between 1 to 1000000-1
      }
      int n = h.guess(v,show) ;
      if (n > max) {
        max = n;
      }
      if (n < min) {
        min = n ;
      }
    System.out.println("For numbers  between " + s + " to " +  b +  " ---" +n);
      
    } 
    System.out.print("For numbers  between " + s + " to " +  b +  " ");
    if (useRandom) {
       System.out.print("(random numbers)") ;
    }else {
      System.out.print("(not random numbers)") ;
    }
    System.out.println(" the min guess is " + min + " max guess is " + max) ;
  }

  // Cannot change code below
  private static void testBench() { 
    test(1,10,10,false,true) ;
  //  test(1,1000000,1000,false,false);
   // test(1,1000000,1000,true,false);
  }

  // Cannot change code below
  public static void main(String[] args) {
    System.out.println("BarAttender.java");
    testBench();
    System.out.println("DONE");
  }
}



