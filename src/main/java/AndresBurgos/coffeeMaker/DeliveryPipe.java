package main.java.AndresBurgos.coffeeMaker;

public class DeliveryPipe extends Component {

	final int PIPE_OPEN = 1;
	final int PIPE_CLOSE = 0;
	private int status;

	public DeliveryPipe(String name) {
		super(name);
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return status;
	}

}
