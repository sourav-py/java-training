import { Employee,name,add } from "./employee.js"
import concat from './employee.js' //Changed 'operate' to 'concat'. We can do this as this is a default export

let e = new Employee(101,"Alex",5000);

console.log(concat("Hello"," world"));


