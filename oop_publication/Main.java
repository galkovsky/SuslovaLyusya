
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Publication [] someAtcls = {new News(),new Article(),new Announcement()};
		for(int i = 0; i < someAtcls.length; i++) {
			someAtcls[i].publish () ;

	}
}
}
