let str = `
    This is first line
    This is second line
    This is third line
    ....
    ....
    ....
    This is nth line
`

//console.log(str);

let port = 8080
let empid = 100

let url = `http://localhost:${port}/employees/${empid}/`

console.log(url);