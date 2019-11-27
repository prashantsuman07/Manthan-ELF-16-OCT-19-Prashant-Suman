// let a=document.forms["lform"]["username"].value;
// let b=document.forms["lform"]["password"].value;
function validateform(){
    
    let username=document.forms["lform"]["username"];
    let password=document.forms["lform"]["password"];
    if(username.value.trim().length>5){
        let pp= document.getElementById("pp")
       pp.style.display="none"    
    }
    else{
        let pp= document.getElementById("pp")
        pp.style.display="block"   
    }
    if(password.value.trim().length>5){
        let pp1= document.getElementById("pp1")
        pp1.style.display="none"     
    }
    else{
        let pp1= document.getElementById("pp1")
        pp1.style.display="block"       
    }
    if(username.value.length>5 && password.value.length>5)
    {
        alert('logged in')
      
    }
    else {
     
       alert('not allowed')
      
    }
    
}
function myFunction() {
    var x = document.getElementById("abcd");
    if (x.type === "password") {
      x.type = "text";
    } else {
      x.type = "password";
    }
  }