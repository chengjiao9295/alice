<jsp:forward page="/index"/>
<%--这里要区别page=index.jsp，带有jsp页面说明最终跳转到index.jsp页面中，当然这里会陷入死循环
而不带index的表示会向后台发送一个请求，，里面有重定向了login.html页面，所以最终运行后跳转到login.html界面，
--%>
<!--<jsp:forward page="/front/html/login.html"/>-->
<!--直接使用跳转，当第一次刷新页面时，会报412错误，第二次刷新时，则页面加载成功，第三次刷新时，又会出错，第四次又好了，依次重复这种现象-->
<!--原因可能时，它不能改变浏览器地址，刷新的话会导致重复提交-->

