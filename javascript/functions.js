// functions types
// named function 
// unnamed function or function expression
// iife (immediate invoke function)
// arrow function
// pure function
// impure 
// callback
// higher order

(function () {
    // alert(' i am d');
    var iif = 'sdfsff'
})(); // iife (immediate invoke function)

// iife (immediate invoke function) is a function which is called immediately after it is declared.
//() declaration of function 
//() calls the function immediately after it is declared.


function learn() {
    // this function excutes the statemnts inside the function scope; 
}
learn();

// callstack excution deatils
// function is a block of which code which excutes statments inside it .
// which is a reusable block of code
// once declare we can call multipul times or anywhere in program.
// function can call inside an other function also.
// function can declare in another function also.
// function can return from an other function.  
// function can be passed as an argument to another function.

// call stack excution depends on the how we call the function. 
// if we call the function in a normal way then it will be added to call stack and excuted.
// if we call the function in a async way then it will be added to call stack and excuted.
// if we call the function in a sync way then it will be added to call stack and excuted.
// if we call the function in a promise way then it will be added to call stack and excuted.
// if we call the function in a callback way then it will be added to call stack and excuted.


// example of call stack excution

function one() {
    // console.log('one');
    // alert('one');
}

function two() {
    // setTimeout(function c() {
    //     // asynchronous code
    //     for (let i = 0; i < 100; i++) {
    //         // console.log(i);
    //         alert(i);
    //     }

    // }, 0);

    // synchronous code
    // for (let i = 0; i < 100; i++) {
    //     // console.log(i);
    //     alert(i);

    // } 

    // alert('two');
}

two(); // two will excute first because of call stack excution.

one(); // one will excute second because of call stack excution.



// example of call stack excution


setTimeout(function a() {
    console.log(' i am a');

}, 1000);

setTimeout(function b() {
    console.log(' i am b');
}, 500);

setTimeout(function c() {
    console.log(' i am c');
}, 5000);

function d() {

    console.log(' i am d');
    setTimeout(function e() {
        console.log(' i am e');
    }, 0);
    setTimeout(function f() {
        console.log(' i am f');
    }, 1000);
    setTimeout(function g() {
        console.log(' i am g');
    }, 2000);
}

d();

function studentnew() {
    return 'priya student new';
}

// unanamed function or function expression
// function expression is a function which is not declared with a name.
// it is an anonymous function.
// it is a function which is not declared with a name.

// it is a function which is not declared with a name and it is not called by a name.

//priyastudent(); // it will call the function and excute the code inside the function.

var student = function () {
    return 'priya student';
}


//priyastudent1(); // it will call the function and excute the code inside the function.
var snewname = studentnew();

let studentname = function () {
    console.log(snewname);
}

studentname(); // it will call the function and excute the code inside the function.



function a() {
    console.log(' i am a');
}


var b = function () {
    console.log(' i am b');
}

let c = function () {
    console.log(' i am c');
}

for (var i = 0; i < 10; i++) {
    // console.log(i);
    
    setTimeout(() => {
        console.log(i);
    }, 500);
}

for (let i = 0; i < 10; i++) {
    console.log(i);
    setTimeout(() => {
        console.log(i);
    }, 500);
}


function abc () {
    var bvc = 10;
    for (var i = 0; i < 10; i++) {
        console.log(i);
        setTimeout(() => {
            console.log(i);
        }, 500);
    }
}
