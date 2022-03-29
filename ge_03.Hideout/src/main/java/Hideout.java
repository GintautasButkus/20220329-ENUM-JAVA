
public class Hideout<T> {

	private T object;

	public Hideout() {
		this.object = null;
	}

	public void putIntoHideout(T toHide) {
		this.object = toHide;
	}

	public T takeFromHideout() {
		T newObject = this.object;
		this.object = null;
		return newObject;
	}

	public boolean isInHideout() {
		if (this.object != null) {
			return true;
		}
		return false;
	}

}
