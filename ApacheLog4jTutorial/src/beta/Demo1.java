package beta;
import org.apache.logging.log4j.*;

public class Demo1 {
	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());//this is syntax to initiate logger 
	//logManager is API and getlogger is method which need classpath as argument

	public static void main(String[] args) {
		
       log.debug("click the button");
       log.info("button is clicked");
       log.error("button is not displaying");
       log.fatal("button is missing");
	}

}
