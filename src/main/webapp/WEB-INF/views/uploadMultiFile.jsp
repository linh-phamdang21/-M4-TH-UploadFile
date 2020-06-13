<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Upload multi file</title>
</head>
<body>
<jsp:include page="menu.jsp"/>
<h3>Upload one file:</h3>
<form:form modelAttribute="myUploadForm" method="POST" action=""
           enctype="multipart/form-data">
    Description:
    <br>
    <form:input path="description" style="width:300px;"/>
    <br><br>
    File to Upload (1):<form:input path="fileDatas" type="file"/><br/>
    File to Upload (2):<form:input path="fileDatas" type="file"/><br/>
    File to Upload (3):<form:input path="fileDatas" type="file"/><br/>
    File to Upload (4):<form:input path="fileDatas" type="file"/><br/>
    File to Upload (5):<form:input path="fileDatas" type="file"/><br/>
    <input type="submit" value="Upload">
</form:form>
</body>
</html>