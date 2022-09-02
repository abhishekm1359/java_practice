

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo2
 */
@WebServlet("/Demo2")
public class Demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException  {
try {
	// TODO Auto-generated method stub
			response.setContentType("text/html");
			response.setIntHeader("Refresh", 2);
			//DateFormat dateFormat = SpecialDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			PrintWriter out = response.getWriter();
			String title = "Auto Page refresh";
			out.println("Hii there");
			out.println("<html>\n"+"<body>\n"+"<h1 align=\"center\">"+title+"</h1>"+
			"<p align=\"center\"> Current time is : "+date+"</p>"+
					"<p align=\"center\">"+date.getTime()+"</p>");
}catch(IOException e) {
	e.printStackTrace();
}catch(Exception e) {
	e.printStackTrace();
}
		
	}

}
