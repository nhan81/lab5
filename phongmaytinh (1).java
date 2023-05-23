package lab5;

public class phongmaytinh extends phonghoc {
	public phongmaytinh(String maphong, String daynha, double dientich, int sobongden,int somaytinh) {
		super(maphong, daynha, dientich, sobongden);
		this.somaytinh = somaytinh;
	}

	private int somaytinh;

	public int getSomaytinh() {
		return somaytinh;
	}

	public void setSomaytinh(int somaytinh) {
		this.somaytinh = somaytinh;
	}

	@Override
	public String toString() {
		return "phongmaytinh [somaytinh=" + somaytinh + "]";
	}
	

}
