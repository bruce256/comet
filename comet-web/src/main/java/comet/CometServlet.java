package comet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.comet.CometEvent;
import org.apache.catalina.comet.CometProcessor;


public class CometServlet extends HttpServlet implements CometProcessor{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 9155740961046035475L;

	public void event(CometEvent event) throws IOException, ServletException {
		HttpServletRequest request = event.getHttpServletRequest();
		HttpServletResponse response = event.getHttpServletResponse();

		String id = request.getParameter("id");
		
		event.setTimeout(60 * 1000);
		System.out.println(event.getEventType());
		switch (event.getEventType()) {
		case BEGIN:
			ResponseSet.responseSet.add(response);
			break;
		case END:
			break;
		case READ:
			break;
		case ERROR:
			break;
		}
		
	}

}
