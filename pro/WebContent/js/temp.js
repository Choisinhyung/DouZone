/*
생각해보자...

html -> html 로 넘어갈때, json형태로 storage에 저장한다고 치면..
이때 적용하는 javascript파일은 여러개여야하는건가?

*/

function front_btn_onclick(val){
    append2JSON(val,1);
}
function back_btn_onclick(val){
    append2JSON(val,2);
}
//* brief: 각 선택지를 json형태로 local storage에 저장.
function append2JSON(key,value) {
    /*json을 string type으로 저장 인출 이후에는 json으로 변환*/
    if(localStorage.getItem("selects")==null){
        let tempData = new Object();
        tempData[key]=value;
        let jsonItem = JSON.stringify(tempData);
        localStorage.setItem("selects",jsonItem);
    }else{
        let jsonItem = JSON.parse(localStorage.getItem("selects"));
        jsonItem[key] =value; 
        localStorage.setItem("selects",JSON.stringify(jsonItem));
    }
}
//* json파일을 리턴한다.
function getJSONItem(key){
    if(localStorage.getItem(key)==null){
        //*execption handling
        alert("null!");
        return null;
    }
    return JSON.parse(localStorage.getItem(key));
}

function getName(item){
    let user = JSON.stringify(item)
    if(user.hasOwnProperty('name')){
        return item['name'];
    }
    return "";
}
