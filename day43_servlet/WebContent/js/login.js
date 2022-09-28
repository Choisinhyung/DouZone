/** login js
 * 
 */

function sendData(){
   let f = document.frm;
   
   if(f.id.value=="") {
      window.alert('아이디 입력하세요');
      
      f.id.select();
      return false;
      
      
   }
   if(f.id.value.length<4||f.id.value.length>15){
      window.alert('아이디는 4자 이상 15자 이하로 넣어주세요');
         
      f.id.select();
      return false;
   }
   if(f.pwd.value=="") {
      window.alert('qlqjs 입력하세요');
      
      f.pwd.select();
      return false;
      
      
   }
   if(f.pwd.value.length<4||f.pwd.value.length>8){
      window.alert('비번은 4자 이상 8자 이하로 넣어주세요');
         
      f.pwd.select(); //focus : 이전 데이터 지우고 커서 맞춤. select 이전 데이터 안지우고 커서 맞춤
      return false;
   }
}