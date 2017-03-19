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
public class swapByArray {
    public static void main(String[] args) {
        int a[] = new int[2];
        a[0] = 10;
        a[1] = 20;
        int t = a[0];
        a[0] = a[1];
        a[1] = t;
        System.out.println(a[0] +"--"+ a[1]);
    }
}
