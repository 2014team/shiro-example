<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title></title>
</head>
<body>
     <shiro:hasAnyRoles name="admin">
         <shiro:principal/>拥有角色admin
     </shiro:hasAnyRoles>
</body>
</html>l>