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
public class barattenderclass {
     static public int getRandomInt(Random rand, int maximum) {
        int r = rand.nextInt(maximum);
        return r;
    }
    
    public static void minvalue()
    {
        Random rand = new Random();
        int last = 1000;
        int first = 1;
        int select = getRandomInt(rand, 1000);
        System.out.println("Selected random number is:  " + select);
        int temp = select;
        outerloop:
        if (select != 1) {
            if (select != 1000) {
                for (int i = 1; i <= 20; i++) {
                    int middle = (first + last) / 2;
                    if (middle != select) {
                        if (select < middle) {
                            last = middle - 1;
                            System.out.println("Compare : " + i + " Random Number " + first + "  between " + last + " and middle number " + (first+last)/2);
                        } else {
                            first = middle + 1;
                            System.out.println("Compare : " + i + " Random Number " + first + " between " + last + " and middle number : " + (first+last)/2);
                        }
                    } else {
                        System.out.println("Random number is : " + middle);
                        break outerloop;
                    }
                    if (first == select) {
                        System.out.println("Random number is :" + first);
                        break outerloop;
                    }
                    if (last == select) {
                        System.out.println("Random number is : " + last);
                        break outerloop;
                    }
                }
            } else {
                System.out.println("Random number is: 1000000");
            }
        } else {
            System.out.println("Random number is: 1");
        }
    }
    
    public static void maxvalue()
    {
        System.out.println("\n\n");
        Random rand = new Random();
        int last = 1000000;
        int first = 1;
        int select = getRandomInt(rand, 1000000);
        System.out.println("Random number is  " + select);
        int temp = select;
        outerloop:
        if (select != 1) {
            if (select != 1000000) {
                for (int i = 1; i <= 20; i++) {
                    int middle = (first+ last) / 2;
                    if (middle != select) {
                        if (select < middle) {
                            last = middle - 1;
                            System.out.println("Compare : " + i + " Random number is : " + first + "  between " + last + " and middle number: " + (first+last)/2);
                        } else {
                            first = middle + 1;
                            System.out.println("Compare : " + i + " Random number is " + first + " between " + last + " and middle number: " + (first+last)/2);
                        }
                    } else {
                        System.out.println("Random number: " + middle);
                        break outerloop;
                    }
                    if (first == select) {
                        System.out.println("Random number is " + first);
                        break outerloop;
                    }
                    if (last == select) {
                        System.out.println("Random number is: " + last);
                        break outerloop;
                    }
                }
            } else {
                System.out.println("Random number is: 1000000");
            }
        } else {
            System.out.println("Random number is: 1");
        }
    }

    public static void testBench()
    {
        minvalue();
        maxvalue();
    }
    public static void main(String[] args) {
        System.out.println("BarAttender.java");
        testBench();
        System.out.println("DONE");
    }
}  
