// function demo(){

// }
// console.log(typeof(demo));

// class MyName{

// }

// console.log(typeof MyName);

// const mypromise=new Promise((res,rej)=>{
//     document.getElementById("button").addEventListener("click",()=>{
//         res("promise");
//     })
//     document.getElementById("button2").addEventListener("click",()=>{
//         rej("some reason");
//     })
// })
// mypromise.then((res)=>console.log(res)).catch(err=>console.log(err))

// console.log(mypromise);

async function myfunction(){
    return "karthik";
}

const response= await myfunction();
console.log(response);
