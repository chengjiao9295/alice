<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String Path = request.getContextPath() + "/"; %>
<%--<jsp:forward page="/FormServlet"/>--%>
<html>
<head>
    <title>Form表单</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
</head>
<body>
    <div id="stylized" class="myForm">
        <form id="form1" name="form1" method="post" action="">
            <h1>登录</h1>
            <p>请准确填写个人信息......</p>
            <label>Name <span class="small">姓名</span></label>
            <input type="text" name="textField" id="textField"/>
            <label>Email <span class="small">电子邮箱</span></label>
            <input type="text" name="textField" id="textFiled"/>
            <label>Password <span class="small">密码</span></label>
            <input type="text" name="textField" id="textField"/>
            <button class="submit">登录</button>
            <div class="spacer"></div>
        </form>
    </div>
<script>

    var ajax = function () {
        $.ajax({
            url:'members/select',
            type:'GET',
            dataType:"JSON",
            data:{'name':'da'},
            contentType:'application/json',
            success:function(resp) {
                if(resp){
                    console.log(resp);
                }
            }
        });
    };
    $('button.submit').click(function (ev) {
        ajax();
    });
</script>
</body>
</html>