package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jums.JumsHelper;
import javax.servlet.http.HttpSession;
import jums.UserDataBeans;

public final class insertconfirm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--課題１-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

  //HttpSessionインスタンスの取得  
    HttpSession hs = request.getSession();

  //HttpSessionから、"beans"という名前で登録されているオブジェクトを取り出す
    UserDataBeans beans = (UserDataBeans)hs.getAttribute("beans");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JUMS登録確認画面</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
 //課題４
        if(beans.getName().equals("") == false &&  //以下省略形
          !beans.getYear().equals("") && 
          !beans.getMonth().equals("") && 
          !beans.getDay().equals("") &&
          !beans.getTell().equals("") && 
          !beans.getComment().equals("")){
    
      out.write("\n");
      out.write("        <h1>登録確認</h1>\n");
      out.write("        名前:   ");
      out.print( beans.getName());
      out.write("<br>\n");
      out.write("        生年月日:");
      out.print( beans.getYear()+"年"+beans.getMonth()+"月"+beans.getDay()+"日");
      out.write("<br>\n");
      out.write("        種別:   ");
      out.print( beans.getType());
      out.write("<br>\n");
      out.write("        電話番号:");
      out.print( beans.getTell());
      out.write("<br>\n");
      out.write("        自己紹介:");
      out.print( beans.getComment());
      out.write("<br>\n");
      out.write("        上記の内容で登録します。よろしいですか？\n");
      out.write("        <form action=\"insertresult\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" name=\"yes\" value=\"はい\">\n");
      out.write("            <input type=\"hidden\" name=\"ac\" value=\"");
      out.print( hs.getAttribute("ac") );
      out.write("\">\n");
      out.write("        </form>\n");
      out.write("    ");
 }else{ 
      out.write("\n");
      out.write("        <h1>入力が不完全です</h1>\n");
      out.write("        <p>以下の内容が未入力です</p>\n");
      out.write("    ");
//課題４
        if(beans.getName().equals("")){
            out.print("名前<br>");
        }
        if(beans.getYear().equals("") || beans.getMonth().equals("") || beans.getDay().equals("")){
            out.print("生年月日<br>");
        }
        if(beans.getType() == null){
            out.print("種別<br>");
        }
        if(beans.getTell().equals("")){
            out.print("電話番号<br>");
        }
        if(beans.getComment().equals("")){
            out.print("自己紹介<br>");
        }
    
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("        <form action=\"insert\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" name=\"no\" value=\"登録画面に戻る\">\n");
      out.write("            <input type=\"hidden\" name=\"ac\" value=\"");
      out.print( hs.getAttribute("ac") );
      out.write("\">\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        ");
      out.print(JumsHelper.getInstance().home());
      out.write("<!--課題１-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
