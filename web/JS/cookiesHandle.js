
//Global Cookies Array
var myCookies={};

//function to save cookies
function saveCookies(){
    myCookies["_user"] = document.getElementById("user").value;  
    myCookies["_age"] = document.getElementById("age").value;  
    
    document.cookie = "";
    var expriesAtt = new Date(Date.now()+60*1000).toString();
    var cookieString = "";
    
    for (var key in myCookies){
        cookieString = key+"="+myCookies[key]+";"+expriesAtt+";";
        document.cookie = cookieString;
    }
    document.getElementById("out").innerHTML = document.cookie;
}

//function to load cookies
function loadCookies(){
    myCookies ={};
    
    var keyValue = document.cookie.split(";");
    alert(keyValue.toString());
    var i=0;
    for(var id in keyValue){
        var cookie = keyValue[id].split("=");
        myCookies[cookie[0].trim()]=cookie[1];
        document.getElementById("out").innerHTML=myCookies["_user"];
    }
    
    document.getElementById("user").value=myCookies["_user"];  
    document.getElementById("age").value=myCookies["_age"];  
    
}
