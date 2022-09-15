const arr = [23,54,7,8,34,6,5]

const reverseArray = (arr,Arrlength) =>{
    let i = 0;
    let j = Arrlength - 1;
    while(i < j){
        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    return arr;
}
console.log(reverseArray(arr,arr.length));