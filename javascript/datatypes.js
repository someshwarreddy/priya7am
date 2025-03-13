// var , let , const this are the variables key words used to declare a variable.

// primative types are string , boolean , null, symbol, number , undefined
// non primative object , array 
var name = 'someshwar reddy';

// here name is a identifier ;

// = is assigment operator;

// 'someshwar reddy' is string litaral


var vari = 'string';
console.log("i am string data type " + typeof (vari));

var vari = 2;
console.log("i am number data type " + typeof (vari));

var vari = true;
console.log("i am boolean data type " + typeof (vari));

var vari = undefined;
console.log("i am undefined type" + typeof (vari));

var vari = {};
console.log("i am object type " + typeof (vari));

var vari = [];
console.log("i am array type" + typeof (vari));

var vari = null;
console.log("i am null type" + typeof (vari));

var vari = Symbol('hi i am symbol')
console.log(typeof (vari), vari);


// undefined means which is not defined data type is undefined

// null means which is a value and data type is object

var obj = { nl: null }
console.log({} == null); // here null and {} are values or litrals
console.log(typeof ({}) == typeof (null)); // this are the type comparision

console.log({} == []);
// console.log({} == []);

console.log(obj.nl == null);

var fn = function () {

}

console.log(typeof (fn));

function abc() {

}
abc();

console.log(typeof (abc))

var a = {};
var b = {};

console.log(a == b) // here reference comparision  (address)

var c = 1;
var d = 1;

console.log(c == d); // here values compared 


console.log(typeof Symbol() === "symbol");
console.log(typeof Symbol("foo") === "symbol");
console.log(typeof Symbol.iterator === "symbol")

const sym1 = Symbol();
const sym2 = Symbol("foo"); // unique 
const sym3 = Symbol("foo"); // unique

console.log(sym2 == sym3)

const uid1 = Symbol.for('hi'); // same refernce 
const uid2 = Symbol.for('hi'); // same reference

console.log(uid1 == uid2);

const obj1 = {
    [Symbol('uid')]: 'uid',
}

// if(obj1.Symbol('uid') == obj1.Symbol('uid')){
//     alert('uid')
// }


console.log(2 + 2); // Number + Number

console.log('2' + 2); //4 or 22 or '2'2

console.log(+"2" + 2); //here keeping + symbol before string which convers the string to Number

console.log('2' == 2); // true because here number 2 which is converted as string 

// which means double equal to compares the values 

console.log('2' === 2); // here ===  is checks the type of the value  string === number so false

var abc = '2';
var bac = 2;
console.log(abc == bac);
console.log(abc === bac);

var abo = [];
var bao = {};

console.log(abo == bao); // by reference 
console.log(abo === bao); // by 

var m = Number("1");
var p = 2;
var mp = m / p;
console.log(typeof (mp), mp); // number 

// NaN 

console.log(Number('kkk') + 2);
console.log('string' / 2);
console.log(undefined + 2);
console.log(null + 2); // null which is a value 


console.log(isNaN(mp));

if(isNaN(mp)) {
    alert('please check the values which are provided')
}


