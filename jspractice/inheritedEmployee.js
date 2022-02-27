
class Person{
    constructor(name,age){
        this.name = name;
        this.age = age;
    }


    show(){
        console.log("Name: " + this.name);
        console.log("Age: " + this.age);
    }
}

class Employee extends Person{
    
    constructor(name,age,salary){
        super(name,age);
        this.salary = salary;
    }

    show(){
        super.show();
        console.log("Salary: " + this.salary);
    }


}


let emp = new Employee("Raman",23,40000);
emp.show();