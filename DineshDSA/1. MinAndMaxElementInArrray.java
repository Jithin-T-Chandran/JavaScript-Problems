/******************************************************************************

Program to find minimum and maximum element present in an array

*******************************************************************************/

//Method 1 using map()

const arr = [2,4,56,23,67,34,9,90];
let max  = Number.MIN_VALUE;
let min = Number.MAX_VALUE;
arr.map((element,index)=>{
    if (max < element){
        max = element;
    }
    if (min > element){
        min = element;
    }
})
console.log("Maximum",max);
console.log("Minimum",min);


//Method 2 using for loop
const arr = [2, 4, 56, 23, 67, 34, 9, 90];
let max = Number.MIN_VALUE;
let min = Number.MAX_VALUE;

for (let i = 0; i < arr.length; i++) {
  if (max < arr[i]) {
    max = arr[i];
  }
  if (min > arr[i]) {
    min = arr[i];
  }
}
console.log("Maximum", max);
console.log("Minimum", min);




//Method 3 using for method

const arr = [2, 4, 56, 23, 67, 34, 9, 90];


const maxFunction = (arr) => {
  let max = Number.MIN_VALUE;
  for (let i = 0; i < arr.length; i++) {
    if (max < arr[i]) {
      max = arr[i];
    }
  }
  return max;
};

const minFunction = (arr) => {
  let min = Number.MAX_VALUE;
  for (let i = 0; i < arr.length; i++) {
    if (min > arr[i]) {
      min = arr[i];
    }
  }
  return min;
};

console.log("Maximum", maxFunction(arr));
console.log("Minimum", minFunction(arr));