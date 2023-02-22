<%@page import="model.bean.Songs"%>
<%@page import="model.dao.SongsDAO"%>
<%@page import="model.bean.Categories"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.dao.CatergoriesDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<div class="searchform">
  <form id="formsearch" name="formsearch" method="post" action="<%=request.getContextPath()%>/public/search">
    <span>
   <%
   	String nameSearch = request.getParameter("editbox_search");
   
   %>
    <input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" value="<%if(nameSearch != null) out.print(nameSearch); %>" type="text" placeholder="Tìm kiếm bài hát" />
    </span>
    <input name="button_search" src="<%=request.getContextPath()%>/GiaoDien/public/images/search.jpg" class="button_search" type="image" />
  </form>
</div>
<div class="clr"></div>
<div class="gadget">
  <h2 class="star">Danh mục thể loại nhạc</h2>
  <div class="clr"></div>
  <ul class="sb_menu">
  <%
  	CatergoriesDAO dao = new CatergoriesDAO();
	  ArrayList<Categories> listCat = dao.getItems();
	int temp = 0;	
	if(request.getParameter("plcid") != null){
		temp = Integer.parseInt(request.getParameter("plcid"));
	}
	  for(Categories objCat : listCat){		  
  %>
    <li class="<%=temp==objCat.getIdCat() ? "active":""%>"><a href="<%=request.getContextPath()%>/public/cats?plcid=<%=objCat.getIdCat()%>"><%=objCat.getCatName()%></a></li>
    <%} %>
  </ul>
</div>

<div class="gadget">
  <h2 class="star"><span>Bài hát mới</span></h2>
  <div class="clr"></div>
  <ul class="ex_menu">
  <%
  	SongsDAO listNewSongDao = new SongsDAO();
  	ArrayList<Songs> listNewSong = listNewSongDao.getNewItems();
  	for(Songs objNewSong : listNewSong){
  %>
    <li><a href="<%=request.getContextPath()%>/public/detail?dtid=<%=objNewSong.getIdSong()%>"><%=objNewSong.getSongName()%></a><br />
      <%if(objNewSong.getPreview_text().length() > 50) out.print(objNewSong.getPreview_text().substring(0, 50) + "..."); else out.print(objNewSong.getPreview_text());%></li>
    <%} %>
  </ul>
</div>