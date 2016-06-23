<html>
<head>
<#setting url_escaping_charset='utf-8'>
<title>Insert title here</title>
</head>
<body>
	<form action="#" method="post">
		<input type="text" name="userName">
		<input type="text" name="password">
		<button>提交</button>
	</form>
	<h3>用户名：${user.userName!}</h3>
	<h3>密码：${user.password!}</h3>
	<br>
	<#if (2>3)>
                          二比三大
    <#else>
                          三比二大
    </#if>
    <br>
    <#list ["dd", "sd"] as l>
    	${l}
    </#list>
    <br>
    ${message[0].userName!}
</body>
</html>