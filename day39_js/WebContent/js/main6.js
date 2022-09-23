/** Main6.js */

//object : { }
const person = {
   firstName: '시녕',
   lastName: '최',
   getFullName: function(){
      return `${this.firstName} ${this.lastName}`
   }
}

//console.log(person)
console.log(person.getFullName())

const amy = {
   firstName: 'Amy', //key:'value'
   lastName: 'Clarke',
   getFullName:function(){
      return `${this.fisrtName} ${this.lastName}`
   }
}

//console.log(neo)
//console.log(neo.getFullName)


const neo = {
   firstName: 'Neo', //key:'value'
   lastName: 'Smith',
   getFullName:function(){
      return `${this.fisrtName} ${this.lastName}`
   }
}

console.log(neo)
console.log(neo.getFullName)


function user(first,last){
   this.firstName = first
   this.lastName = last
}

const ps = new user('Happy','Kang')
console.log(ps)


const ps2 = {}
console.log(ps2)

const amy2 = new user('amy','Clarke')
const neo2 = new user('Neo','Smith')

console.log(amy2)
console.log(neo2)

user.prototype.getFullName = function(){
   return `나의 이름은 ${this.fisrtName} ${this.lastName}`
}

console.log(ps.getFullName())
console.log(amy2.getFullName())
console.log(neo2.getFullName())
