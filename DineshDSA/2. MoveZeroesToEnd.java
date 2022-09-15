/******************************************************************************
Move zeroes to end of an array while maintaining relative order of the non-zero
elements.
Note:
  1. You can also move any element rather than 0 by just replacing 0 with element 
      in code
  2. You can also move 0's to left
*******************************************************************************/

const arr =[8,1,0,2,1,0,3];

const moveZeroesToEnd = (arr) =>{
        let j=0;
        for(let i=0;i<arr.length;i++){
            if(arr[i]!==0 && arr[j]===0){
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
            if(arr[j]!==0){
                j++;
            }
        }
        return arr;
}
console.log(moveZeroesToEnd(arr));