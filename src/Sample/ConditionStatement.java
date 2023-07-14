package Sample;

import java.util.Random;

public class ConditionStatement {

	public static int getRandomNumber(int number) throws Exception {
		try {
			Random random = new Random();
			return random.nextInt(number);
		} catch (Exception e) {
			throw new Exception("Error Message:" + e.getMessage());
		}
	}

	public static String randomString() {
		String c = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			sb.append(c.charAt(r.nextInt(c.length())));
		}
		return sb.toString();

	}

	public static void superHero() {

		String hero = "Hulk";
		switch (hero) {
		case "Captain America":
			System.out.println("Captain America is my superHero");
			break;
		case "Iron Man":
			System.out.println("Iron Man is my superHero");
			break;
		case "Spider Man":
			System.out.println("Spider Man is my superHero");
			break;
		case "Hulk":
			System.out.println("Hulk is my super Hero");
			break;
		default:
			System.out.println(hero + ": Super Hero not found");
		}
	}

	public static void main(String[] args) throws Exception {

		System.out.println(getRandomNumber(999) + "\n" + randomString());

		String c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(c.replaceAll("[A-Z]", ""));

		superHero();
		
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		for (int i = 1; i <=10; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		for (int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
		
		
		
		
	}
}
