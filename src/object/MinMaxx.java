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
public class MinMaxx {
	private int[] a;
	private int n;
	private int min;
	private int max;
	private int numCompare;
	private int minr;
	private int maxr;
	private int numComparer;
	private int numRecursionr;
	private static final IntUtil u = new IntUtil();

	MinMaxx(int s) {
		numCompare = 0;
		numComparer = 0;
		numRecursionr = 0;
		System.out.println("--------------------------------");
		System.out.println("--------Simple----------");
		a = u.generateRandomNumber(s, false);
		minMaxSimple();
		System.out.println("Min= " + min + " Max= " + max);
		n = a.length;
		u.printStatistics(n, numCompare, 0, 0);
		System.out.println("---------Recursive--------------");
		minMaxRecursive(0, n - 1);
		System.out.println("Minr= " + minr + " Maxr= " + maxr);
		u.myassert(min == minr);
		u.myassert(max == maxr);
		u.printStatistics(n, numComparer, 0, numRecursionr);
		System.out.println("--------------------------------");
	}

	private static void testBench() {
		MinMaxx t = new MinMaxx(5000);
		MinMaxx t1 = new MinMaxx(50001);
	}

	public static void main(String[] args) {
		System.out.println("MinMax.java");
		testBench();

	}

	private void minMaxSimple() {
		max = a[0];
		min = a[0];
		int i = 0;
		for (; i < a.length / 2; i++) {
			int num1 = a[i * 2];
			int num2 = a[i * 2 + 1];
			if (a[i * 2] >= a[i * 2 + 1]) {
				if (num1 > max) {
					max = num1;
				}
				if (num2 < min) {
					min = num2;
				}
			} else {
				if (num2 > max) {
					max = num2;
				}
				if (num1 < min) {
					min = num1;
				}
			}
		}
		if (i * 2 < a.length) {
			int num = a[i * 2];
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
	}

	private void minMaxRecursive(int i, int j) {
		numRecursionr++;
		int max1, min1, mid;
		if (i == j) {
			maxr = minr = a[i];
		} else if (i == j - 1) {
			if (a[i] < a[j]) {
				maxr = a[j];
				minr = a[i];
			} else {
				maxr = a[i];
				minr = a[j];
			}
		} else {
			mid = (i + j) / 2;
			minMaxRecursive(i, mid);
			max1 = maxr;
			min1 = minr;
			minMaxRecursive(mid + 1, j);
			if (maxr < max1) {
				maxr = max1;
			}
			if (minr > min1) {
				minr = min1;

			}
		}
	}
}
