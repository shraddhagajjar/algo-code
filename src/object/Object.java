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
public class Object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for(int i=1;i<10000;)
        {
            System.out.println("n\t Base 10 \tBase2 \t Base e");
            System.out.println( i+"\t"+  Math.log10(i) +"\t" +Math.log(i) / Math.log(2)+"\t"+ Math.log(i));
            
            if(i>=10)
            {
                i += 10;
            }
            else if(i>=100)
            {
                i+=100;
            }
            else if(i>=1000)
            {
                i+=1000;
            }
            else
            {
                i++;
            }
        }
    }
    
}
