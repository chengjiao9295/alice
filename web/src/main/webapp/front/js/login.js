  (function($){
     $('button.submit').click(function (ev) {
           $.ajax({
                url:'members/select/testPathVariable',
                type:'GET',
                dataType:"JSON",
                data:{'name':'da'},
                success:function(data) {

                   console.log(data);
                   alert(data);

                }
            });

        });

          var user = function(){
                 $.ajax({
                     url:'userInfo/select',
                     type:'GET',
                     success:function(resp) {
                     console.log(resp);
                     alert(resp);
                         if(resp){
                             console.log(resp);
                         }
                     },
                     error:function(){
                        console.log("fail");
                     }
                 });
            }

            $(document.getElementsByTagName("button")).click(function (ev){
               user();
            });
  }($));
