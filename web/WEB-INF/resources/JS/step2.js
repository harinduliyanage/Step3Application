$(document).ready(function (){
    $('#user').text($.cookie("userName")); 
});

$('#skip-btn').on("click",function (){
    $.cookie("step","3");
    window.location="/Step3Application2/3rdStep";
});

$('#next2-btn').on('click',function (){
            $.ajax({
                type: 'POST',
                url : "/Step3Application2/3rdStep",
                data: ({
                    age :$('#age-txt').val() , 
                    phone : $('#phone-txt').val(),
                    user:$('#user').text()
                }),
                success:function(data){
                    $.cookie("step","3");
                    window.location="/Step3Application2/3rdStep";
                  
                },
                error: function (error) {
                  alert('Error is :'+error.toString());
                }
             }); 
});


