
let divide = (a,b) => {

    return new Promise((resolve,reject) => {
        for(var i=0;i<10000000000;i++){}

        if(b == 0){
            reject("Invalid divide!");
        }
        else{
            resolve(a/b);
        }
    })

}

let p = divide(10,0);

p.then(
    (result) => console.log(result),
    (error) => console.log(error)
)

console.log("Are we done with division??")