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
public class swap {
        private int x;
    public swap(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void swap2(swap o)
    {
        int t = this.x;
        this.x = o.x;
        o.x = t;
    }
}
