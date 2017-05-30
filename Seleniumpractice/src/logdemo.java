import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logdemo {	
private static final Logger log = LogManager.getLogger(logdemo.class.getName());
public static void main(String[] args) {
	
	log.error("this is error");
	log.fatal("this is fatal");
	
}
}
