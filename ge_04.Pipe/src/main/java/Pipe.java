import java.util.LinkedList;
import java.util.Queue;

public class Pipe<T> {

	Queue<T> pipe;

	public Pipe() {
		this.pipe = new LinkedList<T>();
	}

	public void putIntoPipe(T value) {
		this.pipe.offer(value);
	}

	public T takeFromPipe() {
		return pipe.poll();
	}

	public boolean isInPipe() {
		if (pipe.isEmpty()) {
			return false;
		}
		return true;
	}
}
