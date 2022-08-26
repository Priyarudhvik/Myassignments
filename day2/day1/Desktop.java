package week3.day1;

public class Desktop extends Computer {
	public void desktopsize() {
		System.out.println("the size is 22 inces");
	}
public static void main(String[] args) {
	Desktop des=new Desktop();
	des.ComputerModel();
	des.desktopsize();
}
}
