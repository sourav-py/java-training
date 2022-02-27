class Student{
    marks = 78
    constructor(name,age){
        this.name = name;
        this.age = age;
        //this.marks = 78;
    }

    show(){
        console.log("Student Name: " + this.name);
        console.log("Student age: " + this.age);
        console.log("Student marks: " + this.marks);
    }
}


let s = new Student("Rick",23);
s.show();