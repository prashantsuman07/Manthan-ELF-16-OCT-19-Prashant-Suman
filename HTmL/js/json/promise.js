// const promise=new Promise(function(res,rej){
//     if(2>10){
//         res("success")
//         // alert('aca cs')
//     }
//     else{
//         rej("error")
//         // alert('asdfwerqw')
//     }
// })
// promise.then(function(data){
//     console.log("data ",data) 
// }).catch(function(error){
//     console.log("error",error)})
// let 

// empdata.then(function(empd){
//     if(empd[1].name === "malini")
// })
function getdata(){
fetch('https://jsonplaceholder.typicode.com/todos/1')
  .then(response => response.json())
  .then(json => console.log(json))
  .catch(err=>console.log(err))}