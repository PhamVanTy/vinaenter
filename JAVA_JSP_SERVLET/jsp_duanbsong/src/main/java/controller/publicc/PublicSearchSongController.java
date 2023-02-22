package controller.publicc;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bean.Songs;
import model.dao.SongsDAO;

public class PublicSearchSongController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SongsDAO dao;
    public PublicSearchSongController() {
        super();
        dao = new SongsDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String nameSearch = request.getParameter("editbox_search");
		ArrayList<Songs> listSong = dao.searchByName(nameSearch);
		if(listSong.size() > 0) {
			request.setAttribute("listSong", listSong);
			RequestDispatcher rd = request.getRequestDispatcher("/GiaoDien/public/indexSearch.jsp");
			rd.forward(request, response);
			return;
		}else {
			response.sendRedirect(request.getContextPath() + "/public/search?error=1");
			return;
		}		
	}

}
