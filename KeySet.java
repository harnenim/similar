package harne.similar;

public class KeySet {
	private Key[] k;
	private int index = -1;
	
	public KeySet(Key[] k) {
		this.k = k;
	}
	public boolean next() { return next(1); }
	public boolean next(int n) {
		index += n;
		if(index < k.length-2)
			return true;
		return false;
	}
	public void beforeFirst() {
		index = -1;
	}
	public int length() {
		return k.length;
	}
	public int findHand(int hand) {
		for(int i=index+1; i<k.length; i++)
			if(k[i].h() == hand)
				return i-index;
		return -1;
	}
	public Key get(int i) {
		if(i<k.length)
			return k[i];
		else
			return null;
	}
	public Key get() { return getNext(0); }
	public Key getNext(int n) {
		int tempIndex = index + n;
		if(tempIndex < 0)
			return new Key();
		else if(tempIndex < k.length)
			return k[tempIndex];
		else
			return null;
	}
	public Key getNext() {
		return getNext(1);
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int i) {
		index = i;
	}
	public String toString() {
		return get().toString();
	}
	public int getPos() {
		if(get()==null) {
			if(get(-1)==null)
				return 0;
			else
				return get(-1).i()+1;
		}
		return get().i();
	}
}
