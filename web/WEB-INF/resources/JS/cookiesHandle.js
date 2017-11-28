$(document).ready(function (){
    var step=$.cookie("step");
    if (step ==2){
        window.location = "/Step3Application2/SecondStep";
    }
    if (step ==3){
        window.location = "/Step3Application2/3rdStep";
    }
});


$('#userName-form').submit(function (event){
   event.stopPropagation();
   event.preventDefault(); 
   $.ajax({
      type: 'POST',
      url : "/Step3Application2/SecondStep",
      data: {userName:$('#userName-txt').val()},
      success:function(data){
          if(data=== true){
              $.cookie("step", "2");
              $.cookie("userName", $('#userName-txt').val());
              window.location = "/Step3Application2/SecondStep";
          }
          if(data === false){
                alert("User Already Exits.. ");
          }
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
});
