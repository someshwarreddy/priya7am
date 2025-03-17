// we have three types var , let, const

console.log(newone);
var aName = 10;
console.log(aName)
// defult value is undefined untill username is intilize for var key word

var aName = 10;

console.log(aName);

var newone;


// console.log(iamlet); // reference error : canot access iamlet it value does not intilized
let iamlet = 100;
console.log(iamlet);
// let does not consist default value that is undefined 
// let does not reside inside a global window object 
// let reside in a seprate script
// temporal dead zone


const iamconst = '100';

// functions

// named function 
// unamed function or function expression

//function is a block of which code which excutes statments inside it .

// which is a reusable block of code

// once declare we can call multipul times or anywhere in program.

// function can call inside an other function also.

// function can declare in another function also.

// function can return from an other function.


function student() {
    // here we write function statements. ehich are excuted by function in function scope.

}

student();

// block 
{
    // this is a block
}


// let vs var 


// var is a function scope 

var globalvar = 'i am global var';

function varscope() {
    var a='i am function';
    var globalvar = 'i am function scope';
    globalvar = 'i am function scope'; // we are assigned a value for global var identifier
    console.log(globalvar); // this one excute second
    // whenever we use var key word in a function for same idenifier which is declare in global scope 
    // that varibale becomes function scoped.
    // that variable value doesnot available to out side of the function.
    // here var globalvar = 'i am function scope ' it s value does not available to outside function scope 
    // because of var function scope behaviour.

}
console.log(globalvar); // function did not called so this one will excute first 
varscope();
console.log(globalvar); // this one excute third 
console.log(a); // Uncaught ReferenceError: a is not defined