function add(a,b){
    return a + b;
}


function operate(fn,a,b){
    return fn(a,b);
}

var x = (a,b) => a + b;

console.log(operate(x,10,20));

var noargs = () => "Hello world";
var onearg = (x) => x * x;
//var onearg = x => x * x;

console.log(noargs());
console.log(onearg(7));
