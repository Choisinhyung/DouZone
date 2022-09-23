/** main. js */

import getType from 'common.js'

function getType(data) {
	return Object.prototype.toString.call(data) 
	/*return Object.prototype.toString.call(data).slice(8, -1)*/
}

console.log(getType(123))
console.log(getType(false))
console.log(getType('donzone'))
console.log(getType([1,2,3,4]))
console.log(getType({}))

console.log('------------------------')
console.log(typeof "Hello world!!")
console.log(typeof 123)
console.log(typeof 12.34)
console.log(typeof true)
console.log(typeof undefined) /* 값이 들어가지 않은 상태*/
console.log(typeof null) /* 비워둘거야~~ */
console.log(typeof {}) /* 객체 */
console.log(typeof []) /* 배열 */
console.log('------------------------')


console.log("Hello world!!")
console.log(123)
console.log(12.34)
console.log(true)
console.log(undefined) /* 값이 들어가지 않은 상태*/
console.log(null)
console.log({}) /* 객체 */
console.log([]) /* 배열 */
