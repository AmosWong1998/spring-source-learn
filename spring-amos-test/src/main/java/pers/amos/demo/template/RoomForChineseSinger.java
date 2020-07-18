package pers.amos.demo.template;

/**
 * @author amos wong
 * @create 2020-07-15 9:27 上午
 */

public class RoomForChineseSinger extends KTVRoom {

	@Override
	protected void orderSong() {
		System.out.println("唱歌啦，兄弟们来首中文歌");
	}

	@Override
	public void orderExtra() {
		System.out.println("唱饿了，点点东西吃");
	}
}
