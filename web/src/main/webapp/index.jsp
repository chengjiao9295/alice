<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String Path = request.getContextPath() + "/"; %>
<%--<jsp:forward page="/FormServlet"/>--%>
<html>
<head>
    <title>Form表单</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
        body{
            font-family: "Lucida Grande", "Lucida Sans Unicode", Verdana, Arial, Helvetica, sans-serif;
            font-size: 12px;
        }
        p,h1,form,button{
            border: 0;
            margin: 0;
            padding: 0;
        }
        .spacer{
            clear: both;
            height: 1px;
        }
        .myForm{
                margin:0 auto;
                width:400px;
                padding:14px;
        }
        #stylized{
            border: 1px solid #b7ddf2;
            background: #ebf4fb;
        }
        #stylized p{
            font-size: 11px;
            color: #666666;
            margin-bottom: 20px;
            padding-bottom: 10px;
            border-bottom: solid 1px #b7ddf2;
        }
        #stylized label{
            display: block;
            width: 140px;
            font-weight: bold;
            text-align: right;
            float: left;
        }
        #stylized .small{
            color: #666666;
            font-size: 11px;
            font-weight: normal;
            text-align: right;
            display: block;
            width: 140px;
        }
        #stylized input{
            float: left;
            font-size: 12px;
            padding: 4px 2px;
            margin:  2px 0 20px 10px;
        }
        #stylized button{
            clear: both;
            margin-left: 150px;
            width:125px;
            height: 31px;
            background: #666666;
            text-align: center;
            line-height: 31px;
            color: #ffffff;
            font-size: 11px;
            font-weight: bold;
        }
        input:focus, button:focus{
            outline: thick solid #b7ddf2;
        }
        input:active, button:active{
            outline: thick solid #aaa;
        }
        input:focus, button:focus{
             outline-offset: 4px;
         }
         input:active, button:active{
             outline-offset: 4px;
         }

    </style>

    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
</head>
<body>
    <div id="stylized" class="myForm">
        <form id="form1" name="form1" method="post" action="">
            <h1>登录</h1>
            <p>请准确填写个人信息......</p>
            <label>Name <span class="small">姓名</span></label>
            <input type="text" databind="name" class="name"/>
            <label>Email <span class="small">电子邮箱</span></label>
            <input type="text" databind="email" class="email"/>
            <label>Password <span class="small">密码</span></label>
            <input type="text" databind="pwd" class="pwd"/>
            <button class="submit">登录</button>
            <div class="spacer"></div>
        </form>
    </div>
<script>

    var ajax = function () {
        $.ajax({
            url:'members/select/testPathVariable',
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