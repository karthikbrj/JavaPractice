const array=["Mango","Lemon","Grapes","Dragon"];
let currentIndex=0;
const createRotatingArrayIterator = () => {
    document.getElementById("output").innerHTML=array[currentIndex]
    // console.log("welcome");
    console.log(array[currentIndex]);
    currentIndex =(currentIndex+1)%array.length;
    
}

// const rotate=(array)=>{
//     array.forEach(element => {
//         console.log(element);
//     });
// }