/**
 * 
 */

// main7.js

// this
function User(name) {
	this.name = name
}

User.prototype.arrow = () => {
		console.log(this.name)	
}


const sinhyung = {
	name : 'sinhyung',
	normal : function() {
		console.log(this.name)
	},
	
	arrow : () => {
		console.log(this.name)
	}
}

const sinhyung2 = new User('Sinhyung')

sinhyung.normal()
sinhyung.arrow()

/*const sinhyung = {
	name : 'sinhyung',
	normal : function() {
		console.log(this.name)
	},
	
	arrow : () => {
		console.log(this.name)
	}
}

sinhyung.normal()
sinhyung.arrow()*/

