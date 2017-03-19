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
public class PassByObject {
    public static void main(String[] args) {
            
        swap a = new swap(10);
        swap b = new swap(20);
        System.out.println(a.getX());
        System.out.println(b.getX());
       /* swap cc = new swap(a.getX());
        a.setX(b.getX());
        b.setX(cc.getX());
        System.out.println(a.getX());
        System.out.println(b.getX());
        
        swap c = a;
        a.setX(b.getX());
        b.setX(c.getX());
        System.out.println(a.getX());
        System.out.println(b.getX());
        */
        a.swap2(b);
        System.out.println(a.getX());
        System.out.println(b.getX());
        
    }
}
