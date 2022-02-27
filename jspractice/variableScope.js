function testLetKeyword(){
    let a = 10;
    if(true){
        let a = 30;
        console.log(a);
    }
    console.log(a);
}

function testVarKeyword(){
    var a = 10;
    if(true){
        var a = 30;
        console.log(a);
    }
    console.log(a);
}


console.log("Using let keyword!");
testLetKeyword();

console.log("Using var keyword!!");
testVarKeyword();