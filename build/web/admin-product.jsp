<%-- 
    Document   : admin-product
    Created on : Aug 31, 2017, 8:27:52 AM
    Author     : ADMIN
--%>

<jsp:include page="admin-header.jsp"/>
<jsp:include page="admin-nav.jsp"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">

        <div class="box box-primary">
            <div class="box-header with-border">
                <h3 class="box-title">Product Information</h3>
            </div>
            <form role="form" action="${pageContext.request.contextPath}/admin/product/add" method="POST" enctype="multipart/form-data">
                <div class="box-body">
                    <div class="form-group">
                        <label for="exampleInputEmail1">Product name</label>
                        <input type="text" name="pname" class="form-control" id="exampleInputEmail1" placeholder="Enter Product Name">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Product Price</label>
                        <input type="text" name="pprice" class="form-control" id="exampleInputEmail1" placeholder="Enter Product Price">
                    </div>

                    <div class="form-group">
                        <label for="exampleInputPassword1">Product Discount</label>
                        <input type="text" name="pdiscount" class="form-control" id="exampleInputPassword1" placeholder="Enter Product Discount">
                    </div>
                    <div class="form-group">
                        <label>Product Tags</label>
                        <select name="ptags" class="form-control select2" multiple="multiple" data-placeholder="Type a new tag" style="width: 100%;" tabindex="-1" aria-hidden="true">
                            <option>Food</option>
                            <option>LifeStyle</option>
                            <option>Sports</option>
                            <option>Electronics</option>
                            <option>Health</option>
                            <option>Accessories</option>
                            <option>Computer and IT gadgets</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputFile">Upload Product Image</label>
                        <input type="file" name="files" id="exampleInputFile">
                    </div>
                </div>
                <div class="box-footer">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>
        </div>



        <h1>
            Product
            <small>Product Tables</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Product</a></li>
            <li class="active">Product Tables</li>
        </ol>
        <div class="box">
            <div class="box-header">
                <h3 class="box-title">Product Table With Full Features</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
                <table id="example1" class="table table-bordered table-striped">
                    <thead>
                        <tr>
                            <th> Product ID </th>
                            <th>Product Name</th>
                            <th>Product Price</th>
                            <th>Product Discount</th>
                            <th>Product Tags</th>
                            <th>Product Image</th>
                            <th>Edit</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${productvalue}" var="product">
                            <tr>
                                <td>${product.product_id}</td>
                                <td>${product.product_name}</td>
                                <td>${product.product_price}</td>
                                <td>${product.product_discount}</td>
                                <td>${product.product_tag}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/files/${product.product_image}" target="blank">
                                    <img height="30" width="30" src="${pageContext.request.contextPath}files/${product.product_image} alt="${product.product_image}>
                                    </a>
                                    </td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/admin/product/edit/?id=${product.product_id}">
                                        <span class="glyphicon glyphicon-edit"></span>
                                </td>

                                <td>
                                    <a href="${pageContext.request.contextPath}/admin/product/delete/?id=${product.product_id}&file=${product.product_image}">
                                        <span class="glyphicon glyphicon-remove"></span>
                                </td>

                                <!--                            sql injection prevention-->
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
    </section>

    <jsp:include page="admin-footer.jsp"/>



    <script>

        $('#example1').DataTable({
            "paging": true, <%-- these are features that we choose to include or declude from the webpage--%>
            "lengthChange": true,
                    "searching": true,
                    "ordering": true,
                    "info": true,
                    "autoWidth": true
        });
    </script>
