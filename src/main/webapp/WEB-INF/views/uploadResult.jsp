<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/6/2020
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Upload Result</title>
</head>
<body>
<jsp:include page="menu.jsp"/>
<h3>Uploaded Files:</h3>
Description: ${description}
<br/><br/>
FileDatas upload:<br/><br/>
<c:forEach items="${uploadedFile}" var="file">- ${file}<br/><br/>
</c:forEach>
</body>
</html>
