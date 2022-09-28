package edu.kosa.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   public String user = "sinhyung";
   public String passwd = "1234";

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      String id = request.getParameter("id");
      String pwd = request.getParameter("pwd");

      response.setCharacterEncoding("euc-kr");
      PrintWriter out = response.getWriter();
      out.write("<html><head><title>Login Result</title></head><body><b><br>");

      if (user.equals(id) && !user.equals(pwd)) {
         out.println("비번이 잘못되었습니다");
         out.println("<a href='html/loginForm.html'>Login</a>");
      } else if (user.equals(id) && passwd.equals(pwd)) {
         out.println("성공<br/>");
         out.println("너의 아이디는" + id + "이군요<br/>");
         out.println("너의패스워드는" + pwd + "이군요<br/>");
      } else {
         out.println("등록되지 않음");
         out.println("<a href='html/loginForm.html'>Login</a>");
      }
      out.println("</b></body></html>");
      out.close();

   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      doGet(request, response);
   }

}