/** common.js */

function getType(data) {
	/*return Object.prototype.toString.call(data)*/
	return Object.prototype.toString.call(data).slice(8, -1)
}