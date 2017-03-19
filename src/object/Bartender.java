/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs501_hw3;

import java.util.Random;
/**
 *
 * @author N I K U N J
 */
public class Bartender {
    static public int getRandomInt(Random rand, int maximum) {
        int return_x = rand.nextInt(maximum);
        return return_x;
    }
    
    public void minvalue()
    {
        Random rand = new Random();
        int last_value = 1000;
        int first_value = 1;
        int select_value = getRandomInt(rand, 1000);
        System.out.println("Selected random value is:  " + select_value);
        int temp = select_value;
        outerloop:
        if (select_value != 1) {
            if (select_value != 1000) {
                for (int i = 1; i <= 20; i++) {
                    int middle_value = (first_value + last_value) / 2;
                    if (middle_value != select_value) {
                        if (select_value < middle_value) {
                            last_value = middle_value - 1;
                            System.out.println("Step: " + i + " Your random value " + first_value + "  between " + last_value + " And Middle_Value: " + (first_value+last_value)/2);
                        } else {
                            first_value = middle_value + 1;
                            System.out.println("Step: " + i + " Your random value " + first_value + " between " + last_value + " And Middle_Value: " + (first_value+last_value)/2);
                        }
                    } else {
                        System.out.println("Your random value is: " + middle_value);
                        break outerloop;
                    }
                    if (first_value == select_value) {
                        System.out.println("Your Random value is: " + first_value);
                        break outerloop;
                    }
                    if (last_value == select_value) {
                        System.out.println("Your Random value is: " + last_value);
                        break outerloop;
                    }
                }
            } else {
                System.out.println("Your random value is: 1000000");
            }
        } else {
            System.out.println("Your random value is: 1");
        }
    }
    
    public void maxvalue()
    {
        System.out.println("\n\n");
        Random rand = new Random();
        int last_value = 1000000;
        int first_value = 1;
        int select_value = getRandomInt(rand, 1000000);
        System.out.println("Selected random value is  " + select_value);
        int temp = select_value;
        outerloop:
        if (select_value != 1) {
            if (select_value != 1000000) {
                for (int i = 1; i <= 20; i++) {
                    int middle_value = (first_value + last_value) / 2;
                    if (middle_value != select_value) {
                        if (select_value < middle_value) {
                            last_value = middle_value - 1;
                            System.out.println("Step: " + i + " Your random value " + first_value + "  between " + last_value + " And Middle_Value: " + (first_value+last_value)/2);
                        } else {
                            first_value = middle_value + 1;
                            System.out.println("Step: " + i + " Your random value " + first_value + " between " + last_value + " And Middle_Value: " + (first_value+last_value)/2);
                        }
                    } else {
                        System.out.println("Your random value is: " + middle_value);
                        break outerloop;
                    }
                    if (first_value == select_value) {
                        System.out.println("Your random value is: " + first_value);
                        break outerloop;
                    }
                    if (last_value == select_value) {
                        System.out.println("Your random value is: " + last_value);
                        break outerloop;
                    }
                }
            } else {
                System.out.println("Your random value is: 1000000");
            }
        } else {
            System.out.println("Your random value is: 1");
        }
    }

    public static void main(String[] args) {
    Bartender bartender=new Bartender();
    bartender.minvalue();
    bartender.maxvalue();
    }
}