package controller.admin;

import java.io.File;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bean.Songs;
import model.dao.SongsDAO;

public class AdminDeleteSongController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SongsDAO dao;
    public AdminDeleteSongController() {
        super();
        dao = new SongsDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int dsid = 0;
		try {
			dsid = Integer.parseInt(request.getParameter("dsid"));
		} catch (NumberFormatException e) {
			response.sendRedirect(request.getContextPath() + "/admin/song?error=1");
			return;
		}
		Songs song = dao.getSongByID(dsid);
		if(song == null) {
			response.sendRedirect(request.getContextPath() + "/admin/songs?error=1");
			return;
		}
		
		if(dao.deleteSong(dsid) > 0) {
			final String dirPathName = request.getServletContext().getRealPath("/GiaoDien/admin/assets/img");
			String picture = song.getPicture();
			if(!picture.isEmpty()) {
				String filePathName = dirPathName + File.separator + picture;
				File file = new File(filePathName);
				if(file.exists()) {
					file.delete();
				}
			}		
			response.sendRedirect(request.getContextPath() + "/admin/songs?mes=3");
			return;
		} else {
			response.sendRedirect(request.getContextPath() + "/admin/songs?error=2");
			return;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
