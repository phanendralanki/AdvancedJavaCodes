package tag;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class TagHandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		
		try {
			
			//task... :tag
			JspWriter out = pageContext.getOut();
			out.println("<h1>This is my custom tag from Tag Handler</h1>");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
	
	
}
