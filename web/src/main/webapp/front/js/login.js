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

      var user = function(){
             $.ajax({
                 url:'userInfo/select',
                 type:'GET',
                 success:function(resp) {
                     console.log(resp);
                     render(resp);
                     },
                 error:function(){
                    console.log("fail");
                    }
             });
      };

      $(document.getElementsByTagName("button")).click(function (ev){
           user();
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
