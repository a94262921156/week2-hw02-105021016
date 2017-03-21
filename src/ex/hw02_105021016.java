package ex;
import java.util.Scanner;
public class hw02_105021016 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("how many books need to new?");
		int a = scn.nextInt();
		Book book[] = new Book[a];
		Book book1 = new Book("book name","Author","isbn","category",99);
		book[0] = book1;
		for(int i=1; i<a; i++){
			System.out.println("Please input book's name,isbn,category,pages");
			book[i] = new Book(scn.next(),scn.next(),scn.next(),scn.next(),scn.nextInt());
		}
		while(true){
			System.out.println("search?(yes/no)");
			String b = scn.next();
			if(b.equals("yes")){
				System.out.println("Which project you use?(name,isbn,category)");
				String c = scn.next();
				if(c.equals("name")){
					System.out.println("Which book want to find?");
					String d = scn.next();
					for(int i=0; i<a; i++){
						if(book[i].getName().equals(d)){
							book[i].showAll();
						}
					}
				}else if(c.equals("isbn")){
					System.out.println("Which book want to find?");
					String d = scn.next();
					for(int i=0; i<a; i++){
						if(book[i].getISBN().equals(d)){
							book[i].showAll();
						}
					}
				}else{
					System.out.println("Which book want to find?");
					String d = scn.next();
					for(int i=0; i<a; i++){
						if(book[i].getCategory().equals(d)){
							book[i].showAuthor();
						}
					}
				}
			}else{
				System.out.println("Thanks for used");
				break;
			}
		}
	}

}