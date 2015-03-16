
public class main {

	public static void main(String[] args) {
		Bookshelf book1 = new Bookshelf(1,2);
		Bookshelf book2 = new Bookshelf(1,2);
		Bookshelf book3 = book1;
		Bookshelf book4 = new Bookshelf(4,5);
		
		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));
		
		System.out.println(book1 == book3);
		System.out.println(book1.equals(book3));
		
		
        System.out.println(book2.equals(book4)); //сравниваю два разных экземпляра класса Bookshelf
        
		System.out.println(book1.hashCode() == book2.hashCode());
		System.out.println(book2.hashCode() == book4.hashCode()); //сравниваю разные
	}
}
