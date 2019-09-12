  (function($){
//     $('button.submit').click(function (ev) {
//           $.ajax({
//                url:'members/select/testPathVariable',
//                type:'GET',
//                dataType:"JSON",
//                data:{'name':'da'},
//                success:function(data) {
//
//                   console.log(data);
//                   alert(data);
//
//                }
//            });
//
//        });

      var user = function(data){

      };

      $(document.getElementsByTagName("button")).click(function (ev){
           var name = $(document.getElementsByClassName("name")).val();
           var email = $(document.getElementsByClassName("email")).val();
           var pwd = $(document.getElementsByClassName("pwd")).val();
           $.ajax({
                url:'select',
                type:'GET',
                data:{'name': name, 'email': email, 'pwd': pwd},
                success:function(resp) {
                    console.log(resp);
                    location.href=resp;

                },
                error:function(){
                    console.log("fail");
                }
           });
      });

      var render = function(resp){
        var name = document.getElementsByClassName("name");
        var email = document.getElementsByClassName("email");
        var pwd = document.getElementsByClassName("pwd");
        $(name).val(resp.name);
        $(email).val(resp.email);
        $(pwd).val(resp.pwd);
      };
  }($));
