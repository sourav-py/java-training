function getAddFun(){
    return (a,b) => a + b;
}

let add = getAddFun();

console.log(add(10,2));