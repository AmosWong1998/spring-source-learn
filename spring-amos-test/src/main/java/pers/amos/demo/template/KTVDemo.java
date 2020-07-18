package pers.amos.demo.template;

/**
 * @author amos wong
 * @create 2020-07-15 9:29 上午
 */

public class KTVDemo {
	public static void main(String[] args) {
		RoomForChineseSinger chineseSinger = new RoomForChineseSinger();
		RoomForAmericanSinger americanSinger = new RoomForAmericanSinger();
		chineseSinger.procedure();
		americanSinger.procedure();
	}
}
