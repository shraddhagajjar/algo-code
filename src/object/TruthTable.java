/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author shraddha 15992
 */
public class TruthTable {
    public static void FindTruthTable(int t)
    {
        System.out.println("truth table " +t);
        int i =0;
        int[][] a = new int[(int)Math.pow(2, t)][t];
        
        System.out.println("Total number of columns "+a[0].length);
        System.out.println("Total number of rows " +a.length);
        int k = t;
        for(i=0;i<(int)Math.pow(2, t);i++)
        {
            for(int j=t-1;j>=0;j--)
            {
                System.out.print( (i/(int)Math.pow(2, j))%2);
                  
           }
            System.out.println("");
        }
        
    }
    public static void FindTotalNumberOfRows(int t)
    {
        System.out.println("Total number of columns "+t);
        System.out.println("Total number of rows " +(int)Math.pow(2, t));
        
    }
    public static void main(String[] args) {
        System.out.println("Truth Table.java");
          
        for(int i=1;i<=4;i++)
        {
            FindTruthTable(i);
        }
        for(int i=1;i<=10;i++)
        {
            FindTotalNumberOfRows(i);
        }
        
        for(int i=25;i<=41;i++)
        {
            FindTotalNumberOfRows(i);
        }
        
    }
}

