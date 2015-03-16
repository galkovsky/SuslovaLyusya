
public class Article extends Publication {

	 public void publish() {

		 String text="U r reading really interesting article...";
	        System.out.println("---ARTICLE---"+ text);
	        super.text=text;
	        super.publish();
}
}