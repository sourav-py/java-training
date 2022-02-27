class Employee{

    constructor(empId,name,salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    showDetails(){
        console.log("Employee ID: " + this.empId);
        console.log("Name: " + this.name);
        console.log("Salary: " + this.salary);
        console.log("Allowance: " + this.getAllowance());
    }

    //Getters

    getEmpId(){
        return this.empId; 
    }

    getName(){
        return this.name;
    }

    getSalary(){
        return this.salary;
    }


    getAllowance(){
        return (.1 * this.salary);
    }

    //Setters

    setEmpId(empId){
        this.empId = empId;
    }

    setName(name){
        this.name = name;
    }

    setSalary(salary){
        this.salary = salary;
    }


}

let name = "Sourav";
let add = (a,b) => a + b;

let operate = (a,b) => a + b;

//export default (a,b) => a + b; //this also works

export {Employee,name,add} //named export

export default operate; //default export (only one default export is allowed)
