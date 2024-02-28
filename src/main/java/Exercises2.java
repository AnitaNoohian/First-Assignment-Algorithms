import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.String;
import java.util.Collections;

public class Exercises2 {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    */

    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] answer = new int[2];
        loop:
        for (int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
                if (nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                    break loop;
                }
            }
        }

        return answer;
    }

    /*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    For example, 2 is written as II in Roman numeral, just two ones added together.
    12 is written as XII, which is simply X + II.
    The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right.
    However, the numeral for four is not IIII.
    Instead, the number four is written as IV.
    Because the one is before the five we subtract it making four.
    The same principle applies to the number nine, which is written as IX.
    There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

    Given a roman numeral, convert it to an integer.
    */

    public int romanToInt(String s) {
        int result = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (i == size - 1){
                if (s.charAt(i) == 'I'){
                    result++;
                }
                if (s.charAt(i) == 'V'){
                    result += 5;
                }
                if (s.charAt(i) == 'X'){
                    result += 10;
                }
                if (s.charAt(i) == 'C'){
                    result += 100;
                }
                if (s.charAt(i) == 'L'){
                    result += 50;
                }
                if (s.charAt(i) == 'D'){
                    result += 500;
                }
                if (s.charAt(i) == 'M'){
                    result += 1000;
                }
            }
            else {
                if (s.charAt(i) == 'I') {
                    if (s.charAt(i + 1) == 'V') {
                        result += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        result += 9;
                        i++;
                    } else if (s.charAt(i + 1) != 'I') {
                        result++;
                    } else {
                        int j = i;
                        int num = 0;
                        while (s.charAt(j) == 'I') {
                            num++;
                            j++;
                            if (j == size){
                                break;
                            }
                        }
                        result += num;
                        i = j - 1;
                    }
                } else if (s.charAt(i) == 'V') {
                    result += 5;
                } else if (s.charAt(i) == 'X') {
                    if (s.charAt(i + 1) == 'L') {
                        result += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        result += 90;
                        i++;
                    } else if (s.charAt(i + 1) != 'X') {
                        result += 10;
                    } else {
                        int j = i;
                        int num = 0;
                        while (s.charAt(j) == 'X') {
                            num += 10;
                            j++;
                            if (j == size){
                                break;
                            }
                        }
                        result += num;
                        i = j - 1;
                    }
                } else if (s.charAt(i) == 'L') {
                    result += 50;
                } else if (s.charAt(i) == 'C') {
                    if (s.charAt(i + 1) == 'D') {
                        result += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        result += 900;
                        i++;
                    } else if (s.charAt(i + 1) != 'C') {
                        result += 100;
                    } else {
                        int j = i;
                        int num = 0;
                        while (s.charAt(j) == 'C') {
                            num += 100;
                            j++;
                            if (j == size){
                                break;
                            }
                        }
                        result += num;
                        i = j - 1;
                    }
                } else if (s.charAt(i) == 'D') {
                    result += 500;
                } else if (s.charAt(i) == 'M') {
                    result += 1000;
                }
            }
        }

        return result;
    }

    /*
    Given an array nums of distinct integers, return all the possible permutations.
    You can return the answer in any order.
    */


   /* public List<List<Integer>> recursive(List<List> list, List per, int[] nums, int count, int i){
        int size = nums.length;
        while (i < size){
            per.add(nums[i]);
            count--;
            i++;
            if (count == 2) {
                if(i == size){
                    i = 0;
                }
                per.add(nums[i]);
                if(i+1 == size){
                    per.add(nums[0]);
                }
                else{
                    per.add(nums[i+1]);
                }
                list.add(per);
                Collections.swap(per,size-2,size-1);
                list.add(per);
                per.clear();
                count = size;
                return  recursive(list,per,nums,count,i);
            }
            else {
                int[] help = new int[size-1];
                for (int k = 0; k < size-2; k++){
                    help[k] = nums[k+1];
                }
                i = 0;
                //count = help.length;
                return  recursive(list,per,help,count,i);
            }
        }
    }*/
    public List<List<Integer>> permute(int[] nums) {
        int size = nums.length;
        int count = size;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> permutation = new ArrayList<Integer>();

        return null;
    }

    public static void main(String[] args) {
        // test your code here!
    }
}