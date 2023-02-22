﻿<%@page import="model.bean.Categories"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.dao.CatergoriesDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ include file="/GiaoDien/admin/inc/header.jsp" %>
<%@ include file="/GiaoDien/admin/inc/leftbar.jsp" %>
<div id="page-wrapper">
    <div id="page-inner">
        <div class="row">
            <div class="col-md-12">
                <h2>Sửa bài hát</h2>
            </div>
        </div>
        <!-- /. ROW  -->
        <hr />
        <div class="row">
            <div class="col-md-12">
                <!-- Form Elements -->
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-12">
                                <form action="" role="form" method="post" id="form">
                                   		<%
                                   		String error = request.getParameter("error");
    									if("1".equals(error)){
    										out.print("<p style=\"color: red;\">Có lỗi khi sửa.</p>");
    									}
                                        	Categories obj = (Categories)request.getAttribute("objCatEdit");                                       	
                                        %>                                   
                                    <div class="form-group">
                                        <label for="name">Tên thể loại nhạc</label>                                       
                                        <input type="text" id="name" value="<%=obj.getCatName()%>" name="editCatName" class="form-control" />
                                    </div>  
                                                                                                                                    
                                    <button type="submit" name="submit" class="btn btn-success btn-md">Lưu</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- End Form Elements -->
            </div>
        </div>
        <!-- /. ROW  -->
    </div>
    <!-- /. PAGE INNER  -->
</div>
<script>
    document.getElementById("category").classList.add('active-menu');
</script>
<!-- /. PAGE WRAPPER  -->
<%@ include file="/GiaoDien/admin/inc/footer.jsp" %>