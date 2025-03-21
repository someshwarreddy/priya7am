// functions types
// named function 
// unnamed function or function expression
// iife (immediate invoke function)
// arrow function
// pure function
// impure 
// callback
// higher order


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
    alert('one');
}

function two() {
    setTimeout(function c() {
        // asynchronous code
        for (let i = 0; i < 100; i++) {
            // console.log(i);
            alert(i);
        }

    }, 0);

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








