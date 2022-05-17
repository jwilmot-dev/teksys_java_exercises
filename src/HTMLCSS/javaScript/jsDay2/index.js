// let name = "Bob";
// let isWorking = true;
// let age = 22;

// let person={
//     first_name: "Amy",
//     last_name: "Jones",
//     isWorking: false,
//     hasJob: true, 
//     jobTitle:"Software Developer" ,
//     fullName: function(){
//         return this.first_name + " " + this.last_name;
//     }
// }

// console.log(person);
// console.log(person.first_name);
// console.log(person.fullName());

// // JS array - datatype mix
// let names = ["Joe", "Max", 24, true, 9.5, "Ina"];
// console.log(names);

// empty object
// let obj = {}


// //attached to one class
// var obj2 = new Object();
// var str = new String();
// var num = new Number();
// var bool = new Boolean();
// var arr = new Array();
// var dt = new Date();

// //math objects are global
// Math.random();
// Math.floor();

// function Person(firstName, lastName, age, hasHair){
// this.firstName = firstName;
// this.lastName= lastName;
// this.age = age;
// this.hasHair = hasHair;

//     this.changeLastName = function(lastName){
//         this.lastName = lastName
//     }
// }

// var newperson = new Person("Fred", "Rogers", 31, true);
// console.log(newperson);
// newperson.changeLastName("Johnson");
// console.log(newperson);

// Person.prototype.count = 55;
// console.log(newperson.count);



// JSON object
// let arr = [
//     {firstName: "mefirst"}, 
//     {lastName: "melast"}, 
//     {age: 22}
// ]

// let names2 = ["Joe", "Max", 24, true, 9.5, "Ina"];
// console.log(names2);

// //pop removes last element of array
// let lastItem = names2.pop();
// console.log(lastItem);
// console.log(names2);

// //shift removes first element of array
// let firstItem = names2.shift();
// console.log(firstItem);
// console.log(names2);

// //push adds new element to end of array
// names2.push("Hello");
// console.log(names2);

// //unshift adds new element to start of array
// names2.unshift("Start");
// console.log(names2);

// function revWord(word){
//     return word.split('').reverse().join('');
// }
// console.log(revWord("Hello"))

//slice
// let newword = "Mountainous";
// console.log(newword.slice(0, 2));
// console.log(newword);

//splice
// let names3 = ["Joe", "Max", 24, true, 9.5, "Ina"];
// console.log(names3);
// console.log(names3.splice(4));
// console.log(names3);
// console.log(names3.splice(1, 2, "a" ,"b"));
// console.log(names3);

//

//class
// class Person{
//     constructor(firstName, lastName, age, hasHair){
//     this.firstName = firstName;
//     this.lastName= lastName;
//     this.age = age;
//     this.hasHair = hasHair;

//         this.changeLastName = function(lastName){
//             this.lastName = lastName
//         }
//     }
// }

// let newp2 = new Person("Ted", "Chen", 40, true);
// console.log(newp2);

// let arr2 = [22,11,667,30,33];

// let newArr = [];

// for(let i = 0; i<arr2.length; i++){
//     console.log(arr2[i]);
// }
// for(i in arr2){
//     console.log(arr2[i]);
//     newArr.push(arr2[i]*2);
// }
// console.log(newArr);



//arrow functions
// const addOne = (a)=>{
//     return a+1;
// }

//alt format
// const addOne = a=>{
//     return a+1;
// }

//alt format
// const addOne = a => a+1;

// console.log(addOne(2));

// let arr3 = [22,11,667,30,33];
// let newLoop=[]
// arr3.forEach((n)=> newLoop.push(n))
// console.log(newLoop)

//slide 56 of 5/17 slides
let input = C

let range = [1,9,3,4,5,]
let userGuess = prompt(`Guess a number between ${range[0]} and ${range[1]}`);


