
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Upload One File</title>
</head>
<body>
<jsp:include page="menu.jsp"/>
<h3>Upload One File:</h3>
<form:form modelAttribute="myUploadForm" method="POST" action="uploadOneFile"
           enctype="multipart/form-data">
    Description:
    <br>
    <form:input path="description" style="width:300px;"/>
    <br/><br/>
    File to upload : <form:input path="fileDatas" name="fileDatas" type="file"/><br/>
    <input type="submit" value="Upload">

</form:form>
</body>
</html>
