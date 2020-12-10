<%@include file="/WEB-INF/view/template/header.jsp"%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
        </div>
</div>

<div class="container-wrapper">
    <div class="container">
            <h1>Administrator page</h1>

            <p class="lead">This is the administrator page!</p>
        

        <h3>
            <a href="<c:url value="/admin/productInventory" />" >Product Inventory</a>
        </h3>

        <p>Here you can view, check and modify the product inventory!</p>
</div>
</div>

        <%@include file="/WEB-INF/view/template/footer.jsp" %>

