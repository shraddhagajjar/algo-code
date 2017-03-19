/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package object;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import object.*;
/**
 *
 * @author shraddha
 */
class Cstring {
  private CharArray d; //Infinte array of char
  static IntUtil u = new IntUtil();
  private char test;
  private String s;
  //Cannot add any more data fields
  
  //WRITE ALL FUNCTIONS SO THAT ALL TESTS WILL PASS
  
  //CANNOT CHANGE ANYTHING BELOW 
  
  public Cstring(char a ) {
      this.test = a;
  }

    public Cstring(String ss) {
        this.s = ss;
    }

  
    private static void testBasic() {
        Cstring a = new Cstring('b') ;
        a.pLn("a = ") ;
        Cstring b = new Cstring('7') ;
        b.pLn("b = ") ;
        Cstring c = new Cstring("123456789012345678901234567890123456789012345678901234567890") ;
        c.pLn("c = ") ;
        Cstring d = null ;
      try {
          d = (Cstring) c.clone();
      } catch (CloneNotSupportedException ex) {
          Logger.getLogger(Cstring.class.getName()).log(Level.SEVERE, null, ex);
      }
        d.pLn("d = ") ;
        Cstring e = new Cstring("A quick brown fox junped over a lazy dog") ;
        e.pLn("e = ") ;
        Cstring f = new Cstring("Gateman sees name garageman sees nametag") ;
        f.pLn("f =  ") ;
        f.reverse() ;
        f.pLn("f' = ") ;
    }
  
  private static void testAdd() {
    Cstring a = new Cstring("UCSC") ;
    Cstring b = new Cstring("Extension") ;
    Cstring c = a.add(b) ;
    a.pLn("a = ") ;
    b.pLn("b = ") ;
    c.pLn("c = ") ;
    Cstring d = c.add("USA") ;
    d.pLn("d = ") ;
    a.append(b) ;
    a.pLn("a+b = ") ;
    a.append("World") ;
    a.pLn("a+b+World = ") ;
  }
  
  private static void testEqual() {
    Cstring a = new Cstring("123456789012345678901234567890123456789012345678901234567890") ;
    a.pLn("a = ") ;
    Cstring b = new Cstring("123456789012345678901234567890123456789012345678901234567890") ;
    b.pLn("b = ") ;
    u.myassert(a.isEqual(b)) ;
    Cstring c = new Cstring("12345678901234567890123456789012345678901234567890123456789") ;
    c.pLn("c = ") ;
    u.myassert(a.isEqual(c) == false) ;
  }
  
  public void pLn(String s){
      System.out.println(s);
  }
  
  private static void testBench() {
    System.out.println("-----------Basic----------------");
    testBasic() ;
    System.out.println("-----------Addition----------------");
    testAdd() ;
    System.out.println("-----------Equal----------------");
    testEqual() ;
  }
  
  public static void main(String[] args) {
    System.out.println("Cstring.java");
    testBench();
    System.out.println("Done");
  }

    private boolean isEqual(Cstring c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void reverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Cstring add(Cstring b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void append(Cstring b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void append(String world) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Cstring add(String usa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
