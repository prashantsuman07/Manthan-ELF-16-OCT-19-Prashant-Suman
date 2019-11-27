function first(callback){
    setTimeout(function(){
    console.log("first func exec")
    callback()
    },5000)
    console.log("hello")
}

function second(){
    console.log("second func exec");
}
first(second)

