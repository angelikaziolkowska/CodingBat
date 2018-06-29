/*
Angelika Ziolkowska 
June 2018

Task description:

Given an array of ints of odd length, look at the first, last, 
and middle values in the array and return the largest. The array 
length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
*/

public int maxTriple(int[] nums) {
  int big;
  if(nums[0]>=nums[nums.length/2]) {
    big=nums[0];
  }
  else big=nums[nums.length/2];
  if (big<nums[nums.length-1]) {
    big=nums[nums.length-1];
  }
  return big;
}






