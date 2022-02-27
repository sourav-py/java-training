
var nums = [1,2,3,4,5,6];

/*
for(var i=0;i<nums.length;i++){
    console.log(nums[i]);
}
*/


//for with of
//used for arrays only

/*
for(num of nums){
    console.log(num);
}
*/

//for with in
//used for objects only --> returns properties

let student = {id: 101,name: "sourav", marks: 55};

for(x in student){
    console.log(`Student ${x} is ${student[x]}`);
}