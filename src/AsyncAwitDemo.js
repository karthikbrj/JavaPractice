// console.log("welcome");

// let listOfMovies=fetch("url.com/movies")
// console.log(listOfMovies);

// const event=new Promise((res,rej)=>{
//     name="karthi"
//     if(name==="karthik"){
//         // console.log("resolve");
//         res(name)
//     }else{
//         // console.log("reject")
//         rej("name was not karthik, name was "+name);
//     }
// })
// event.then((name)=>{
//    console.log(name);
// }).catch((err)=>{
//     console.log(err);
// })
// console.log(event);


const axios=require("axios");
// const data=axios.get("https://cat-fact.herokuapp.com/facts");
// data.then((res)=>{
//     console.log(res);
// }).catch((err)=>{
// console.log(err);
// })

const fetchData=async()=>{
    try{
        const data=await axios.get("https://cat-fact.herokuapp.com/facts");
        console.log(data);
    }catch(err){
        console.log(err);
    }
}
fetchData();
