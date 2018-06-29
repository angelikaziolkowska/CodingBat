/*
Angelika Ziolkowska 
June 2018

Task description:

Given an int array, return true if the array contains 2 twice, 
or 3 twice. The array will be length 0, 1, or 2.


double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
*/

public boolean double23(int[] nums) {
  int two=0,three=0;
  if(nums.length>1) {
    for(int i=0;i<nums.length;i++){
      if(nums[i]==2) {
        two++;
      }
      else if(nums[i]==3) {
        three++;
      }
    }
    return (two==2 || three==2);
  }
  return false;
}






