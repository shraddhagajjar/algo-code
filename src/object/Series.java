/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.math.BigInteger;

/**
 *
 * @author shraddha
 */
public class Series {
    public static void testLog()
    {
        int i;
        for(i=1;i<=10000;)
        {
            System.out.println("n\t base10 \t\t base2 \t\t basee");
            System.out.println(i+"\t"+Math.log10(i)+"\t"+ Math.log(i)/Math.log(2)+ "\t"+Math.log(i));
            if(i<10)
            {
                i++;
            }
            else if(i>=10 && i<=99)
            {
                i += 10;
            }
            else if(i>=100 && i<=999)
            {
                i+= 100;
            }
            else if(i>=1000 && i<=10000)
            {
                i+=1000;
            }
        }
    }
    public static void seriesCovergesAbsolutely()
    {
        double sum=1;
        for(int i =1;i<100;i++)
        {
            sum += (double)  1/Math.pow(2, i);
        }
        System.out.println("1 + 1/2 + 1/4 ..upto 100 that is 2 = "+sum);
    }
    public  static void harmonicSeries()
    {
        int i;
         double sum = 0;
         for(i = 1 ;i<=100;i++)
         {
             sum =(double) 1/i + sum;
         }
         System.out.println(Math.log(100) + 0.57721566);
         System.out.println(sum);
    }
    public static void chess()
    {
        long number =0;
        BigInteger sum;
        sum = BigInteger.valueOf(number);
        for(int i = 0; i<64;i++)
        {
            number = (long)Math.pow(2, i);
            System.out.println("On square " +i+ "=" +BigInteger.valueOf(number) );
            sum = sum.add(BigInteger.valueOf(number));
        }
        System.out.println("Total numbe of rice " +sum);
    }
    public static void testbad()
    {
        System.out.println("Test Log");
        testLog();
        System.out.println("Series Coverges Absolutely calling");
        seriesCovergesAbsolutely();
        System.out.println("Harmonic Seriess Calling");
        harmonicSeries();
        System.out.println("chess Calling");
        chess();
    }
    public static void main(String[] args) {
        System.out.println("Series.Java");
        testbad();
        System.out.println("done");
        
    }
}
