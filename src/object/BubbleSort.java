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
public class BubbleSort extends ArraySort{
 	protected void sort(boolean ascend) {

		if(display) ArraySort.u.pLn(a.length);
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable
		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
                        if(display) ArraySort.u.pLn(a);
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) // change to > for ascending sort
				{
					temp = a[j]; // swap elements
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = true; // shows a swap occurred
					numSwap++;
				}				
				numCompare++;
				
			}
			
		}
	}

	public static void main(String[] args) {
		System.out.println("ArraySort.java");
		BubbleSort a = new BubbleSort();
		a.testBench();
	}
}

