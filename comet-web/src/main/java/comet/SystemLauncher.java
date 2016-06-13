package comet;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class SystemLauncher implements ServletContextListener{

	ScheduledExecutorService se = Executors.newScheduledThreadPool(1);
	
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ResponseSet rs = new ResponseSet();
		se.scheduleAtFixedRate(rs, 0, 2, TimeUnit.SECONDS);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
