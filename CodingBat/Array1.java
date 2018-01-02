/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author lvzhaozhou
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

public boolean firstLast6(int[] nums) {
  if(nums[0]==6||nums[nums.length-1]==6){
    return true;
  }
  return false;
}


sameFirstLast

public boolean sameFirstLast(int[] nums) {
  if(nums.length>=1&&nums[0]==nums[nums.length-1])
  return true;
  else
  return false;
  
}



makePi

public int[] makePi() {
 int[] makePi={3,1,4};
 return makePi;
}



CommonEnd

public boolean commonEnd(int[] a, int[] b) {
  if(a[0]==b[0]||a[a.length-1]==b[b.length-1]&&a.length>=1&&b.length>=1)
  return true;
  else
  return false;
}

sum3

public int sum3(int[] nums) {
  int a=nums[0]+nums[1]+nums[2];
  return a;
}



RotatedLeft3

public int[] rotateLeft3(int[] nums) {
  int[] rotated={nums[1],nums[2],nums[0]};
  return rotated;
  
}



reverse3

public int[] reverse3(int[] nums) {
  int[] reverse={nums[2],nums[1],nums[0]};
  return reverse;
}



maxEnd3

public int[] maxEnd3(int[] nums) {
  if(nums[0]>nums[2]){
    int[] num1={nums[0],nums[0],nums[0]};
      return num1;
    }
  
  else if(nums[2]>=nums[0]){
    int[] num2={nums[2],nums[2],nums[2]};
      return num2;
    }
  
  else
  return nums;
  
}



sum2

public int sum2(int[] nums) {
  if(nums.length==0)
  return 0;
  else if(nums.length==1)
  return nums[0];
  else
  return nums[0]+nums[1];
}


middleWay

public int[] middleWay(int[] a, int[] b) {
  int[] c={a[1],b[1]};
  return c;
}



makeEnds

public int[] makeEnds(int[] nums) {
  int[] me={nums[0],nums[nums.length-1]};
  return me;
}



has23

public boolean has23(int[] nums) {
  if(nums[0]==2||nums[1]==2){
    return true;
  
  }
  else if(nums[0]==3||nums[1]==3){
    return true;
  }
  else
  return false;
}

no23

public boolean no23(int[] nums) {
   if(nums[0]==2||nums[1]==2){
    return false;
  
  }
  else if(nums[0]==3||nums[1]==3){
    return false;
  }
  else
  return true;

}



makeLast

public int[] makeLast(int[] nums) {
  int[] a=new int[2*nums.length];
  a[2*nums.length-1]=nums[nums.length-1];
  return a;
}



double23

public boolean double23(int[] nums) {
  if(nums.length==2){if(nums[0]==2&&nums[1]==2)
  return true;
  else if(nums[0]==3&&nums[1]==3)
  return true;
  else 
  return false;}
  else
  return false;
}


fix23

public int[] fix23(int[] nums) {
  for(int i=0;i<nums.length-1;i++){
    if (nums[i]==2&&nums[i+1]==3){
      nums[i+1]=0;
    }
    
  }
  return nums;
}



start1

public int start1(int[] a, int[] b) {
 int c=0;
 if(a.length>0&&b.length>0){
 if(a[0]==1&&b[0]==1){
   c+=2;
   return c;
 }
 else if(a[0]==1||b[0]==1){
   c++;
   return c;
 }
 else{
 return c;}}
 else if(a.length>0&&b.length==0){
   if(a[0]==1)
   c++;
   return c;
 }
 else if(b.length>0&&a.length==0){
   if(b[0]==1)
   c++;
   return c;
 }
 return c;
}


biggerTwo

public int[] biggerTwo(int[] a, int[] b) {
  if(a[0]+a[1]>=b[0]+b[1]){
    return a;
  }
  else
  return b;
}



makeMiddle

public int[] makeMiddle(int[] nums) {
  int[] middle={nums[nums.length/2-1],nums[nums.length/2]};
  return middle;
}



plusTwo

public int[] plusTwo(int[] a, int[] b) {
  int[] two={a[0],a[1],b[0],b[1]};
  return two;
}



swapEnds

public int[] swapEnds(int[] nums) {
  int a=nums[nums.length-1];
  int b=nums[0];
  nums[0]=a;
  nums[nums.length-1]=b;
  return nums;
}



midThree

public int[] midThree(int[] nums) {
  int[] mids={nums[nums.length/2-1],nums[nums.length/2],nums[nums.length/2+1]};
  return mids;
}



maxTriple

public int maxTriple(int[] nums) {
  if(nums[0]>nums[nums.length-1]&&nums[0]>nums[nums.length/2])
  return nums[0];
  else if(nums[nums.length-1]>nums[0]&&nums[nums.length-1]>nums[nums.length/2])
  return nums[nums.length-1];
  else
  return nums[nums.length/2];
  
}


frontPiece

public int[] frontPiece(int[] nums) {
  if(nums.length==0)
  return nums;
  else if(nums.length==1)
  return nums;
  int[] front={nums[0],nums[1]};
  

  return front;
}



unlucky1

public boolean unlucky1(int[] nums) {
 
  if(nums.length>1){if(nums[0]==1&&nums[1]==3)
  return true;
  else if(nums[nums.length-2]==1&&nums[nums.length-1]==3)
  return true;
  else if(nums[1]==1&&nums[2]==3
  )
  return true;
  
 
    else return false;
  }
  else
  return false;
  
  
}


make2

public int[] make2(int[] a, int[] b) {
  if(a.length>=2){
    int[] make1={a[0],a[1]};
    return make1;
    
  }
  else if(a.length==1){
    int[] make2={a[0],b[0]};
    return make2;
    
  }
  else if(a.length==0){
    int[] make3={b[0],b[1]};
    return make3;
  }
  else return a;
}



front11

public int[] front11(int[] a, int[] b) {
  
  if(a.length!=0&&b.length!=0){
    int[] front111={a[0],b[0]};
    return front111;
  }
  else if(a.length==0&&b.length!=0){
    int[] front112={b[0]};
    return front112;
  }
  else if(a.length!=0&&b.length==0){
    int[] front113={a[0]};
    return front113;
  }
  else
  return a;
}










    }
    
}
