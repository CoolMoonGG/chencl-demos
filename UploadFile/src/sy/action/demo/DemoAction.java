package UploadFile.src.sy.action.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DemoAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String msg = "您上传了：<br/>";
		String[] fileUrls = request.getParameterValues("fileUrl");
		String[] fileNames = request.getParameterValues("fileName");
		for (int i = 0; i < fileUrls.length; i++) {
			msg += "文件路径：" + fileUrls[i] + " 文件名称：" + fileNames[i] + "<br/>";
			// System.out.println(fileUrls[i] + " " + fileNames[i]);
		}
		String name = request.getParameter("name");
		msg += "用户名：" + name + "<br/>";
		String pwd = request.getParameter("pwd");
		msg += "密码：" + pwd + "<br/>";
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("/success.jsp").forward(request, response);
	}

}
