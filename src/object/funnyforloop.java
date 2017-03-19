/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;
import java.util.*;
/**
 *
 * @author shraddha
 */
public class funnyforloop {
    public static void pattern(int n)
    {
        if(n<=0)
        {
            System.out.println();
        }
        else
        {
            System.out.print("*");
            pattern(n-1);
        }
        
    }
    public static void funnyfor(int n)
    {
        if(n<=0)
        {
            System.out.println("");
        }
        else
        {
            pattern(n);
            funnyfor(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number for pattern");
        int n = in.nextInt();
        funnyfor(n);
    }
}
