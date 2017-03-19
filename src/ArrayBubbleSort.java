/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shraddha
 */
public class ArrayBubbleSort {
    public static void main(String[] args) {
    int[] num = new int[] {10,9,5,4,2,1};    
    //int[] num = new int[] {69,89};    
    // int[] num = new int[] {1,1,1,1,1,1,1};    
   
    int j,countflag=0,countcompare =0;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable
int k=0;
     while ( flag )
     {  
             System.out.println("");
             System.out.println("pass number " +k);
                
             for(int i=0;i<num.length;i++)
             {
                 
                 System.out.print(num[i] +"\t" );
             }
             
            System.out.println("");
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                    countcompare++;
                   if ( num[ j ] > num[j+1] )   // change to > for ascending sort
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred  
                          countflag++;
                  }
            } 
            k++;
      } 
     int totalcount = countcompare+countflag;
     float total = num.length * num.length;
        System.out.println("Number of n :" +num.length);
        System.out.println("Total number of swap occured (S) :"+countflag );
        System.out.println("Total number of compare occured (C) :"+countcompare );
        System.out.println(" C + S :"+(countcompare+countflag) );
        System.out.println(" N * N :"+(num.length*num.length) );
        System.out.println("T(n) = (C+S) / N*N  :" + (totalcount/total));
        
} 
    }
   

