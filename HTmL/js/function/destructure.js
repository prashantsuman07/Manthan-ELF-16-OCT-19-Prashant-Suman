let person={
    name:"shalini",
    age:20,
    hobbies:["singing","dancing"]

}
let ab={name:'abcd' 

}
let address={
    city:"bangalore",
    pincode:560032

}
var padress={
    ...person,
    ...ab,
    ...address
}
// let{name,hobbies}=person;
// console.log("hobbies ",hobbies)

// function displayname({name,hobbies}){
//     console.log(name)
//     console.log(hobbies)
// }
// displayname(person)

// let hobby=["breathing","living","blinking"]
// let[h1,h2]=hobby;
console.log(padress.city)
console.log(padress.name)

console.log("=======================================================")
function sum(...args){
    let value=0
    for(let i=0;i<args.length;i++){
        value*=args[i]
    }
    console.log(value)
}
sum(2,3,4,5,6,7,8,9,0,85676579,568)
