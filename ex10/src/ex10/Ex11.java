package ex10;

public class Ex11 {

	class Data {
		int x = 10;
		int y = 20;

		void changePri(int x) {
			x = 200;
		}

		void changeRef(Data d1) {
			d1.x = 200;

		}
	}

	Ex11() {
		Data d1 = new Data();
		d1.x = 100;

		System.out.println(d1.x);
		
		d1.changePri(d1.x);
		System.out.println(d1.x);
		
		d1.changeRef(d1);
		System.out.println(d1.x);
	}

	public static void main(String[] args) {
		new Ex11();
	}
}
