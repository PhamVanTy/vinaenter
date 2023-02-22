<%@page import="util.DefineUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ include file="/GiaoDien/public/inc/header.jsp"%>
<div class="content_resize">
	<div class="mainbar">
		<%
		SongsDAO songDao = new SongsDAO();
		ArrayList<Songs> listSong = (ArrayList) request.getAttribute("list");
		if(listSong != null && listSong.size() > 0){
			int j = 0;
			for (Songs objSong : listSong) {
				j++;
		%>
		<div class="article">
			<h2>
				<a
					href="<%=request.getContextPath()%>/public/detail?dtid=<%=objSong.getIdSong()%>"
					title="<%=objSong.getSongName()%>"><%=objSong.getSongName()%></a>
			</h2>
			<p class="infopost">Ngày đăng: <%=objSong.getDate_create()%>. Lượt xem: <%=objSong.getCounter()%><a href="<%=request.getContextPath()%>/public/detail?dtid=<%=objSong.getIdSong()%>" class="com"><span><%=j%></span></a></p>
			<div class="clr"></div>
			<div class="img">
				<img src="<%=request.getContextPath()%>/GiaoDien/admin/assets/img/<%=objSong.getPicture()%>" width="177" height="213" alt="<%=objSong.getSongName()%>" class="fl" />
			</div>
			<div class="post_content">
				<p><%=objSong.getPreview_text()%></p>
				<p class="spec"><a href="<%=request.getContextPath()%>/public/detail?dtid=<%=objSong.getIdSong()%>" class="rm">Chi tiết &raquo;</a></p>
			</div>
			<div class="clr"></div>
		</div>
		<%
		}}
		%>
		<%
			int endPage = (Integer) request.getAttribute("endPage");
			int index = (Integer) request.getAttribute("index");
			int total = (Integer) request.getAttribute("total");
			int num = 0;
			if (index < endPage) {
				num = (index - 1) * DefineUtil.NUMBER_PER_PAGE + DefineUtil.NUMBER_PER_PAGE;
			} else {
				num = total;
			}
			
			%>
		<p class="pages">
			<small>Trang <%=index%> của <%=endPage%></small>		
			<%	
             	for(int i = 1; i <= endPage; i++){           	
             %>
			<a class="<%=index==i?"active":""%>" href="<%=request.getContextPath()%>/public/trang-chu?index=<%=i%>"><%=i%></a> 
			<%}%>
			
			<a href="<%=request.getContextPath()%>/public/trang-chu?index=<%=index < endPage ? (index+1) : endPage%>">&raquo;</a>
			
		</p>
	</div>
	<div class="sidebar">
		<%@ include file="/GiaoDien/public/inc/leftbar.jsp"%>
	</div>
	<div class="clr"></div>
</div>
<%@ include file="/GiaoDien/public/inc/footer.jsp"%>
