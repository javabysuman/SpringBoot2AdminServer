package in.nit.suman.runner;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;



public class MessageRunner implements CommandLineRunner {

	private static Logger log=LoggerFactory.getLogger(MessageRunner.class); 
	
	@Override
	public void run(String... args) throws Exception {

		try {
			log.info("Started");
		} catch (Exception e) {
         e.printStackTrace();
		}
		log.info("END");
		int a=10;
		System.out.println("Hello From runner"+a);
	}

}
