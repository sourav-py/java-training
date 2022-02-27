export class Employee{
    private empid:number;
    private name:string;
    private salary:number;

    constructor(empid:number,name:string,salary:number){
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    setSalary(salary:number){
        this.salary = salary;
    }

    display(){
        let allowance:number = this.salary * .01;
        console.log("Employee ID: " + this.empid);
        console.log("Name: " + this.name);
        console.log("Salary: " + this.salary);
        console.log("Allowance: " + allowance);
    }
}

let emp:Employee = new Employee(101,"Alexa",5000);
emp.setSalary(1000);
emp.display();