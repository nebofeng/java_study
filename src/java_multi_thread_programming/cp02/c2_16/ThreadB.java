
package java-multi_thread_programming.cp02.c2_16;
/**
* @author nebo
* @E-mail:nebofeng@gmail.com
* @version creatTime：2017年2月21日 下午4:56:51
* 类说明
*/
public class ThreadB  extends Thread{
	private MyService myService;
	
	
	public ThreadB(MyService myService) {
		super();
		this.myService=myService;
	}
	
	@Override
	public void run() {
		myService.testMethod();
	}
}
