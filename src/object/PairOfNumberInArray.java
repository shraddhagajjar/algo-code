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
public class PairOfNumberInArray {

    public static void printPairs(int[] array,int toFind){
        System.out.print("Arrays is [ ");
        for(int a : array){
		System.out.print(a+" ");
	}
	System.out.println("]\nNumber is "+toFind);
	System.out.println("Found Pairs are :");
	for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
		if((array[i] + array[j]) == toFind){
                	System.out.print("{"+array[i]+","+array[j]+"} ");
		}
            }
	}
    }
	
	
    public static int arrayFind(int[] array){
        boolean flag=true;
	for(int i=-array.length;i<array.length;i++){
            flag=true;
            for(int j=0;j<array.length;j++){
                if(i == array[j]){
                	flag = false;
                        break;
		}
            }
            if(flag){
		return i;
            }
	}
	return -1;
    }
        
public static void main(String[] args){
    
    System.out.println("\n----------------:Array Search:--------------------");
    int[] A={10,55,90,4567,1986};
    System.out.print("Arrays is [ ");
    for(int i : A){
	System.out.print(i+" ");
    }
    System.out.println("], \nNot presented element is:  "+arrayFind(A));		
    int[] a = {6,4,5,7,9,1,2};
    int x=10;
    System.out.println("---------------:Exhaustive Test:--------------- ");
    printPairs(a,x);
		
    }
}
