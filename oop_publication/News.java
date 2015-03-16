
public class News extends Publication {

	 public void publish() {

		 String text="Attention!!! Breaking news!!!";
		 //\\ А вот тут ты сразу могла писать
		 //\\ text="Attention!!! Breaking news!!!";
		 //\\ и super.text = text; можно было бы убрать. Ведь таким образом ты сразу записываешь значение в переменную text базового класса
				 
	        System.out.println("---NEWS---" + text );
		 //\\ Упс. А зачем же ты в text базового класса записываешь что-то, если в самом базовом классе это не испольуешь.
		    super.text = text;
	        super.publish();
}
}