package comet;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

public class ResponseSet implements Runnable {

	public static Set<HttpServletResponse>	responseSet	= new HashSet<HttpServletResponse>();

	public void run() {
		for (HttpServletResponse r : responseSet) {
			try {
				r.getWriter().println("hello comet.");
				r.getWriter().close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
