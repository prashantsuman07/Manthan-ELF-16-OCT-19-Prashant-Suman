
// var c=document.getElementById("demo");
// var d=c.textContent="hello brother";
// document.writeln(d)
// var a=document.querySelector("p");
// document.writeln(a.textContent)
// var a=document.getElementsByClassName("demo")
// console.log(a)
// a[0].style.color="red"
// var d=document.createElement("button")
// d.textContent="click me"
// document.body.appendChild(d)
// var c=document.createElement("h1")
// c.textContent="I am a h1 tag"
// document.body.appendChild(c)
// var ele = document.getElementById("j");
// console.log(ele);
// ele.className = "dd1";
// var ul=document.createElement("ul")
// var li1=document.createElement("li")
// var li2=document.createElement("li")
// var li3=document.createElement("li")
// li1.textContent="audi";
// li2.textContent="bmw";
// li3.textContent="porshe";
// ul.appendChild(li1);
// ul.appendChild(li2);
// ul.appendChild(li3);
// document.body.appendChild(ul);
var list=`<ul>
    <li>
        BMW
    </li>
    <li>
        audi
    </li>
    <li>
        porshe
    </li>
</ul>`
var divele=document.getElementById("addhere")
divele.innerHTML=list;