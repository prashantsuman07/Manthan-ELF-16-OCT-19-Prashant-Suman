class Person{
    constructor(name,age){
        this.name=name
        this.age=age
    }
    getname(){
        return this.name
    }
}
class Teacher extends Person{
    constructor(name,age,subjects){
        super(name,age)
        this.subjects=subjects
    }
    getsub(){
        return this.subjects
    }
}
let p=new Person("baby");
console.log(p.getname())
let p1=new Teacher("abc",12,"english");
console.log(p1.getsub())