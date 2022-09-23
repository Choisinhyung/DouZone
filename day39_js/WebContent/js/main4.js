/** main4.js */

// 함수

// 즉시실행함수
const xy = 7
function double2() { // 함수 정의부
	console.log(xy * 2)
}

double2() // 함수 호출
console.log('==========================')
// 정의와 호출을 한번에 해보쟝
(function square(x) {
	console.log(x * x)
})(2);

console.log('==========================')

(function double2() {
	console.log(xy * 2)
})()


console.log('==========================')
// 화살표 함수
// ( ) => { }  vs function() { } 
/*const double = function(x) {*/
const double = function(x, y) {
	return x * 2
}

console.log('double : ',double(6))

const doubleArrow = (x) => {
	return x * 2
}

/*const doubleArrow = (x) => x * 2*/
/*const doubleArrow = x => x * 2 //매개변수가 2개 이상이면 괄호 생략 불가*/
/*const doubleArrow = (x, y) => x * 2 */

/*console.log('doubleArrow : ',doubleArrow(4))*/

const doubleArrow = x => console.log('doubleArrow : ',doubleArrow(4))

//const doubleArrow = x => [1, 2, 3]
//const doubleArrow = x => ( { name : 'Sinhyung' } )
//console.log('doubleArrow : ', doubleArrow(x.name) )


//public void setNum(int ... x) { }
function mul ( ... theArgs) {
	let total = 0;
	for(const arg of theArgs) { // for each
		total += arg;
	}	
	return total;
}

console.log(mul(1, 2, 3));
// expected output : 6

console.log(mul(1, 2, 3, 4, 5, 6, 7));
// expected output : 28

console.log('==========================')

function sub() {
	console.log(arguments) // 매개변수가 없어도 받아준다~ 예약어
	//return arguments[1]
	return arguments
}

console.log(sub(7, 2))

console.log('==========================')
function plus(x, z) {
	if(x < 2) {
		return 
	} 
	return x + z
}

console.log(plus(7, 3))
console.log(plus(1, 3))

console.log('==========================')
const hap = function(x, z) {
	return x + z
}

console.log(hap(1, 2))

console.log('==========================')
function sum(x, z) { // 함수 정의부
	return x + z
}

sum(1, 5) //함수 호출
const c = sum(5, 2)
const d = sum(4, 10)

console.log(c + d)

console.log(sum(1, 2) + sum(2, 3))

console.log('==========================')
// 형 변환
// 참 : true, {}, [], 1, 'false', -12 , '3.14', 12.34, ...
// 거짓 : false, '', null, undefined, 0, -0, NaN

//if(true) {
//if('false') {
if(!0) {
	console.log(123)
}

const a = 1
const b = '1'

console.log(a === b)

console.log('==========================')

// 변수 유효범위
// var, let, const
// var : 함수레벨(함수 내에서는 모두 사용 가능)
// let, const : 블럭레벨(블럭 내에서만 사용 가능)

function scope() { // 함수정의부
	if(true) {
		//console.log(y)		
		//const y = 123
		//let y = 456
		var y = 789
		//console.log(y)
	}
	console.log(y)
}

scope() // 함수호출
console.log('==========================')