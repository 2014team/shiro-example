<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@taglib prefix="zhang" tagdir="/WEB-INF/tags" %>
<html>
<body>
<!-- 用户没有身份验证时显示相应信息，即游客访问信息。 -->
<shiro:guest>
    欢迎游客访问，<a href="${pageContext.request.contextPath}/login.jsp">点击登录</a><br/>
</shiro:guest>

<!-- 用户已经身份验证/记住我登录后显示相应的信息。 -->
<shiro:user>
    欢迎[<shiro:principal/>]登录，<a href="${pageContext.request.contextPath}/logout">点击退出</a><br/>
</shiro:user>
<!-- 用户已经身份验证通过，即Subject.login登录成功，不是记住我登录的。  -->
<shiro:authenticated>
    用户[<shiro:principal/>]已身份验证通过<br/>
</shiro:authenticated>

<!-- 用户已经身份验证通过，即没有调用Subject.login进行登录，包括记住我自动登录的也属于未进行身份验证。 -->
<shiro:notAuthenticated>
    未身份验证（包括记住我）<br/>
</shiro:notAuthenticated>

<!-- 如果当前Subject有角色将显示body体内容。 -->
<shiro:hasRole name="admin">
    用户[<shiro:principal/>]拥有角色admin<br/>
</shiro:hasRole>

<!-- 如果当前Subject有任意一个角色（或的关系）将显示body体内容 -->
<shiro:hasAnyRoles name="admin,user">
    用户[<shiro:principal/>]拥有角色admin或user<br/>
</shiro:hasAnyRoles>

<!-- 如果当前Subject没有角色将显示body体内容。  -->
<shiro:lacksRole name="abc">
    用户[<shiro:principal/>]没有角色abc<br/>
</shiro:lacksRole>

<!-- 如果当前Subject没有权限将显示body体内容。 -->
<shiro:hasPermission name="user:create">
    用户[<shiro:principal/>]拥有权限user:create<br/>
</shiro:hasPermission>

<shiro:lacksPermission name="org:create">
    用户[<shiro:principal/>]没有权限org:create<br/>
</shiro:lacksPermission>

<zhang:hasAllRoles name="admin,user">
    用户[<shiro:principal/>]拥有角色admin和user<br/>
</zhang:hasAllRoles>

<zhang:hasAllPermissions name="user:create,user:update">
    用户[<shiro:principal/>]拥有权限user:create和user:update<br/>
</zhang:hasAllPermissions>

<zhang:hasAnyPermissions name="user:create,abc:update">
    用户[<shiro:principal/>]拥有权限user:create或abc:update<br/>
</zhang:hasAnyPermissions>

</body>
</html>