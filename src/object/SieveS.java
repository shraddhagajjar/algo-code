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
public class SieveS {
    
  private int max ;
  private int [] p ; //array that has prime number 
  private int pkount ;
  private long steps ;
  private boolean display = false;
  static IntUtil u = new IntUtil();
  
  SieveS(int n) {
    max = n ;
    p = new int[n+1] ;
    pkount = 0 ;  
    steps = 0 ;
  }
  
  public void bruteForce() {
    for(int i=2;i<max;i++){
    	boolean prime =true;
    	for(int j=2;j<i;j++){
    		++steps;
    		if(i%j==0){
    			prime=false;
    			break;
    		}
    	}
    	if(prime){
    		p[pkount] = i;
			pkount++;
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
	    	if(isPrime==true){
	    		p[pkount] = i;
				pkount++;
	    	}
	    }
  }
  
  public void uptoPrimeNumbers() {
    p[pkount++] = 2 ;
    for(int i=3;i<=max;i++){
    	boolean divisible =false;
    	for(int j=0;j*j< pkount;j++){
    		steps++;
    		if((i%p[j])==0){    			
    			divisible=true;
    			break;
    		}
    	}
    	if(!divisible){
    		p[pkount]=i;
			pkount++;
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
   	for(int i=2;(i*i <= max);++i){
   		steps++;
   		if(a[i]==true){
   			for(int j = i;i*j<=max;j++){
   				a[i*j] = false;
   			}
   		}
   	}
   	for(int i=0;i<=max;i++){
   		if(a[i]==true){
   			p[pkount] = i;
			pkount++;
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
  public static void assertAnswers(SieveS a, SieveS b) {
    u.myassert(a.pkount == b.pkount);
    for (int i = 0 ; i < a.pkount; ++i) {
      u.myassert(a.p[i] == b.p[i]);
    }
  }

  //YOU CANNOT CHANGE BELOW
  private static void testAll(int n) {
    if (n < 2000) {
      SieveS b = new SieveS(n) ;
      b.bruteForce() ;
      SieveS s = new SieveS(n) ;
      s.uptoSquareRoot() ;
      assertAnswers(b,s);
      System.out.println("bruteforce and uptoSquareRoot methods produces same answers") ;
    }
    System.out.println("============uptoPrimeNumbers start " + n + " ---------------------") ;
    SieveS p = new SieveS(n) ;
    p.uptoPrimeNumbers() ;
    System.out.println("uptoPrimeNumbers done") ;
    System.out.println("============ SieveOfEratosthene start " + n + " ---------------------") ;
    SieveS e = new SieveS(n) ;
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