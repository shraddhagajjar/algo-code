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
public class bar {

  private int min; 
  private int max;
  
  bar(int min, int max){
    this.min = min ;
    this.max = max  ;
  }

  private int guess(int g, boolean show) {
     Int small=new Int(min);
     Int largest=new Int(max);
     Int n=new Int(1);
     Int m=new Int();
     m.set((int)(small.get()+largest.get())/2);
     
     System.out.println("Predicted value: "+g);
     while(g!=m.get())
     {
         System.out.println("Small value = "+small.get()+" Larger value = "+largest.get()+" Middle value = "+m.get());
         
         if(g>m.get())
         {
             if(g==largest.get())
                 return n.get();
             small.set(m.get());
         }
         else
         {
             if(g==small.get())
                 return n.get();
             largest.set(m.get());
         }
         m.set((int)(small.get()+largest.get())/2);

         n.increment();
     }
        return n.get();  
  }
  
  private static void test(int s, int b, int m, boolean useRandom,boolean show) {
    Random r = new Random() ;
    int min = 9999 ;
    int max = 0 ; 
    bar h = new bar(s,b);
    for (int i = 0; i < m; ++i) {   
      int v = i + s ;   
      if (useRandom) {
        v = RandomInt.getRandomInt(r,s,b);
      }
      int n = h.guess(v,show) ;
      if (n > max) {
        max = n;
      }
      if (n < min) {
        min = n ;
      }
    } 
    System.out.print("For numbers  between " + s + " to " +  b +  " ");
    if (useRandom) {
       System.out.print("(random numbers)") ;
    }else {
      System.out.print("(not random numbers)") ;
    }
    System.out.println(" the min guess is " + min + " max guess is 18  " ) ;
  }

  private static void testBench() { 
    test(1,10,10,false,true) ;
    test(1,1000000,1000,false,false);
    test(1,1000000,1000,true,false);
  }

  public static void main(String[] args) {
    System.out.println("BarAttender.java");
    testBench();
    System.out.println("DONE");
  }
}
