
//Global Cookies Array
var myCookies={};

//function to save cookies
function saveCookies(){
    myCookies["_user"] = document.getElementById("").value;  
    
    document.cookie = "";
    var expriesAtt = new Date(Date.now()+60*1000).toString();
    var cookieString = "";
    
    for (var key in myCookies){
        cookieString = key+"="+myCookies[key]+";"+expriesAtt+";";
        document.cookie = cookieString;
    }
}


