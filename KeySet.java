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
		if(index < k.length)
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
		if(i<0)
			return null;
		if(i<k.length)
			return k[i];
		return null;
	}
	public Key get()          { return get(index); }
	public Key getNext(int n) { return get(index + n); }
	public Key getNext()      { return getNext(1); }
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
		if(index>=0 && getNext()==null) {
			while(get()==null)
				index--;
			return get().i()+1;
		}
		if(index<0)
			return -1;
		return getNext().i()-1;
	}
}
