let b={
    name:"abcd",
    id:21,
    age:21,
    gender:'m'
}
let c=JSON.stringify(b)
console.log(c)
let d=JSON.parse(c)
console.log(d)