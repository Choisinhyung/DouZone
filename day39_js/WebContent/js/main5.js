/** main5.js ** */
// class

// 타이머 함수
/* setTimeout(함수, 시간) : 일정 시간 후 함수 실행
setInterval(함수, 시간) : 시간 간격마다 함수 실행
clearTimeout() : 설정된 timeout 함수를 종료
clearInterval() : 설정된 interval 함수를 종료 */

function timeout(callback) {
	setTimeout(() => {
		console.log('Douzone!!')
		callback()
	}, 3000)
}

timeout(() => {
	console.log('Done!!')
})

console.log('Done')
/*setTimeout(function() {
	console.log('Douzone!!')
}, 3000)
*/

/*setTimeout( function() {
	console.log('Douzone222!!!')
}, 3000)*/

//const timer = setTimeout(() => {
const timer = setInterval(() => {
	console.log('Douzone333!!!')
}, 1000)

const h3El = document.querySelector('h3')
h3El.addEventListener('click', () => {
//	clearTimeout(timer)	
	clearInterval(timer)
	console.log('타이머 종료')
})

// 호이스팅(hoisting)
// 함수 선언부가 유효범위 최상단으로 끌어오려지는 현상

const a = 7

//double() // 함수 호출

const double =  function() { // 함수 정의부
	console.log(a * 2)
}

double() // 함수 호출