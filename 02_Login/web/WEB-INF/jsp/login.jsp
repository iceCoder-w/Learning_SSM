<%--
  Created by IntelliJ IDEA.
  User: JASON
  Date: 2021/5/21
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--<script src="桌面/git项目/Learning_SSM/02_Login/src/main/resources/jquery.js"></script>--%>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
<script type="text/javascript">
    function testJson() {
        let username = $("#username").val()
        let password = $("#password").val()
        $.ajax({
            url:"${pageContext.request.contextPath}/user/check",
            data: JSON.stringify({username:username,password:password}),
            contentType:"application/json;charset=UTF-8",//指定发送的数据格式
            type:"post",
            dataType:"json",
            success:function(data){
                alert(data.username)
            }
        })
        <%--$.ajax({--%>
        <%--    url: "${pageContext.request.contextPath}/user/check",--%>
        <%--    type: "post",--%>
        <%--    data: JSON.stringify({username:username,password:password}),--%>
        <%--    contentType: "application/json;charset=UTF-8",--%>
        <%--    dataType: "json",--%>
        <%--    success : function (data) {--%>
        <%--        if (data != null) {--%>
        <%--            alert("登录成功!")--%>
        <%--        }--%>
        <%--    }--%>
        <%--})--%>
    }
</script>
<body>


<h1>登录页面</h1>

<form>
    用户名：<input type="text" name="username" id="username">
    密码：<input type="password" name="password" id="password">
    <input type="button" value="提交" onclick="testJson()">
</form>


</body>
</html>
