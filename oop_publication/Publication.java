import java.util.Date;


public class Publication {

	//\\ Так так, смотри. У тебя эта переменная находится в базовом классе. И они общедоступная ( public )
	//\\ Значит, что ею можно пользоваться в классах-наследниках
	public String text;

	public void publish() {
		String text;//\\ Эта перменная тебе не нужна. У тебя уже есть text на уровне объекта
		
		Date data = new Date();
        System.out.println("publish date " + data.toString());
	}

}
