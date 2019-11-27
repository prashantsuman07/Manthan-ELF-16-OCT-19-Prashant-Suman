var person={
    firstname:"abcd",
    lastname:"efgh",
    age:45,
    gender:`m`,
    eat:function(){
        document.writeln("eating biryani");
    },
    getFullName:function(){
        return this.firstname+this.lastname;
    }

}