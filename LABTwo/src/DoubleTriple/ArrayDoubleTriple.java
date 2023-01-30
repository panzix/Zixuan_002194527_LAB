/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleTriple;
import java.util.Arrays;

/**
 *
 * @author Panzi
 */
public class ArrayDoubleTriple {
    public void dtArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] *= 2;
            } else {
                nums[i] *= 3;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ArrayDoubleTriple adt = new ArrayDoubleTriple();
        adt.dtArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
