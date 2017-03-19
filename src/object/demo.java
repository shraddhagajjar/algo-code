/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author shraddha
 */
public class demo{
  private int max ;
  private int [] p ; //array that has prime number 
  private int pkount ;
  private long steps ;
  private boolean display = false;
  static IntUtil u = new IntUtil();
  
  demo(int n) {
    max = n ;
    p = new int[n+1] ;
    pkount = 0 ;  
    steps = 0 ;
  }
  
  public void bruteForce() {
	  
    for(int i=2;i<max;i++){
    	boolean isPrime =true;
    	for(int j=2;j<i;j++){
    		steps++;
    		if(i%j==0){
    			isPrime=false;
    			break;
    		}
    	}
    	if(isPrime){
    		p[pkount++] = i;
    	}
    }
  }
  
  public void uptoSquareRoot() {
	    for(int i=2;i<max;i++){
	    	boolean isPrime =true;
	    	for(int j=2;j<=Math.sqrt(i);j++){
	    		steps++;
	    		if(i%j==0){
	    			isPrime=false;
	    			break;
	    		}
	    	}
	    	if(isPrime){
	    		p[pkount++] = i;
	    	}
	    }
  }
  
  public void uptoPrimeNumbers() {
    p[pkount++] = 2 ;
    for(int i=3;i<=max;i++){
    	boolean divisible =false;
    	for(int j=0;j*j< pkount;j++){
    		if((i%p[j])==0){
    			steps++;
    			divisible=true;
    			break;
    		}
    	}
    	if(!divisible){
    		p[pkount++]=i;
    	}
    }
  }
  
  public void SieveOfEratosthenes() {
    boolean [] a = new boolean[max + 1] ;
    for (int i = 0; i <= max; ++i) {
      a[i] = true ;
    }
    a[0] = false ;
    a[1] = false ;
  for (int i=2; (i * i<=max); ++i)
{
int j=i * i;
for(; j<=max;)
{
++steps;
a[j]=false;
j=j+i;
}
}

  }
  
  //YOU CANNOT CHANGE BELOW
  public void pLn(String t) {
    System.out.println(t);
    if (display) {
      u.pLn(p,0,pkount) ;
    }
    System.out.println("The numbers of primes from 2 to " + max + " = " + pkount);
    System.out.println("The number of steps is = " + steps) ;
    if (pkount >= 999) {
      System.out.println("The 1000 prime is = " + p[999]) ;
    }
    if (pkount >= 9999) {
      System.out.println("The 10000 prime is = " + p[10000-1]) ;
    }
  }
  
  //YOU CANNOT CHANGE BELOW
  public static void assertAnswers(demo a, demo b) {
    if(a.pkount == b.pkount != false)
    {
        u.myassert(a.pkount == b.pkount);
        
        for (int i = 0 ; i < a.pkount; ++i) {
        u.myassert(a.p[i] == b.p[i]);
    }
    }
    
  }

  //YOU CANNOT CHANGE BELOW
  private static void testAll(int n) {
    if (n < 2000) {
      demo b = new demo(n) ;
      b.bruteForce() ;
      demo s = new demo(n) ;
      s.uptoSquareRoot() ;
      assertAnswers(b,s);
      System.out.println("bruteforce and uptoSquareRoot methods produces same answers") ;
    }
    System.out.println("============uptoPrimeNumbers start " + n + " ---------------------") ;
    demo p = new demo(n) ;
    p.uptoPrimeNumbers() ;
    System.out.println("uptoPrimeNumbers done") ;
    System.out.println("============ SieveOfEratosthene start " + n + " ---------------------") ;
    demo e = new demo(n) ;
    e.SieveOfEratosthenes() ;
    System.out.println("SieveOfEratosthene done") ;
    assertAnswers(p,e);
    System.out.println("uptoPrimeNumbers and SieveOfEratosthene methods produces same answers") ;
    System.out.flush();
  }
  
  //YOU CANNOT CHANGE BELOW
  public static void main(String[] args) {
    System.out.println("Sieve.java");
    testAll(16);
    testAll(1000);
    testAll(50000);
    testAll(500000);
    System.out.println("DONE");
  }
}