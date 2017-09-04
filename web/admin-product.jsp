<%-- 
    Document   : admin-product
    Created on : Aug 31, 2017, 8:27:52 AM
    Author     : ADMIN
--%>

<jsp:include page="admin-header.jsp"/>
<jsp:include page="admin-nav.jsp"/>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        
        <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Quick Example</h3>
            </div>
            <form role="form">
              <div class="box-body">
                <div class="form-group">
                  <label for="exampleInputEmail1">Email address</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Password</label>
                  <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
                <div class="form-group">
                  <label for="exampleInputFile">File input</label>
                  <input type="file" id="exampleInputFile">

                  <p class="help-block">Example block-level help text here.</p>
                </div>
                <div class="checkbox">
                  <label>
                    <input type="checkbox"> Check me out
                  </label>
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
                  <th>Rendering engine</th>
                  <th>Browser</th>
                  <th>Platform(s)</th>
                  <th>Engine version</th>
                  <th>CSS grade</th>
                </tr>
                </thead>
                <tbody>
                </tbody>
              </table>
            </div>
               </section>
    
<jsp:include page="admin-footer.jsp"/>

            

    <script>
  
             $('#example1').DataTable({
      "paging": true,   <%-- these are features that we choose to include or declude from the webpage--%>
      "lengthChange": true,
      "searching": true,
      "ordering": true,
      "info": true,
      "autoWidth": true
    });
    </script>
