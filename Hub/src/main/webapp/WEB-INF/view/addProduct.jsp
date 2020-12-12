<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>

   <form:form action="${pageContext.request.contextPath}/admin/productInventory/addProduct" method="post"
                   modelAttribute="product" >
                    <table>
        <tr>
            <td>First Name:</td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td>Category:</td>
            <td><form:input path="category" /></td>
        </tr>
        <tr>
          <tr>
            <td>Status</td>
            <td><form:input path="status" /></td>
        </tr>
        <tr>
          <tr>
            <td>Price</td>
            <td><form:input path="price" /></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Save Changes" />
            </td>
        </tr>
    </table>
                   
                   </form:form>

</body>
</html>

        <%@include file="/WEB-INF/view/template/footer.jsp" %>
