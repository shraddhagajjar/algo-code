/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;
import object.*;
import java.util.*;
/**
 *
 * @author shraddha
 */
public class GivenAnArrayFindIfArrayHasSumOfK {
    public static boolean solution(int[] arr, int sum){
        
        Arrays.sort(arr);
        int l=0;
        int r= arr.length-1;
        for(int i=0;i<arr.length;i++){
            while(l<r){
                if(arr[l] +arr[r] == sum){
                    return true;
                }
                else if(arr[l] + arr[r] < sum){
                        l++;
                }
                    
                else{
                    r--;
                }
            }
        }
        return false;
        
    }
    
    public static void main(String[]args){
         int[] arr = {3, 4, 45, 6, 10, 8};
        System.out.println(solution(arr,2));
        
        
    }

}
