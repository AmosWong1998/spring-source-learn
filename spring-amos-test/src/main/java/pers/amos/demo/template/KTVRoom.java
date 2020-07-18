package pers.amos.demo.template;

/**
 * @author amos wong
 * @create 2020-07-15 9:22 上午
 * <p>
 * 展示模板方法的demo
 */

public abstract class KTVRoom {

	public void procedure() {
		openDevice();
		orderSong();
		orderExtra();
		pay();
	}

	/**
	 * 模板自带方法，服务员打开设备
	 */
	private void openDevice() {
		System.out.println("服务员打开设备");
	}

	/**
	 * 抽象方法子类必须实现的
	 */
	protected abstract void orderSong();

	/**
	 * 钩子方法，子类可以实现
	 * 客人可以买点吃的，也可以不买
	 */
	public void orderExtra() {
	}

	/**
	 * 模板自带的方法 唱歌必须买单
	 */
	private void pay() {
		System.out.println("唱完歌 需要买单");
	}
}
