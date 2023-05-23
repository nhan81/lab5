package lab5;

public class phongthinghiem extends phonghoc {
	private String chuyennganh;
	private int succhua;
	private boolean coborua;
	public phongthinghiem(String maphong, String daynha, double dientich, int sobongden, String chuyennganh,
			int succhua, boolean coborua) {
		super(maphong, daynha, dientich, sobongden);
		this.chuyennganh = chuyennganh;
		this.succhua = succhua;
		this.coborua = coborua;
	}
	public String getChuyennganh() {
		return chuyennganh;
	}
	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	public int getSucchua() {
		return succhua;
	}
	public void setSucchua(int succhua) {
		this.succhua = succhua;
	}
	public boolean isCoborua() {
		return coborua;
	}
	public void setCoborua(boolean coborua) {
		this.coborua = coborua;
	}
	@Override
	public String toString() {
		return "phongthinghiem [chuyennganh=" + chuyennganh + ", succhua=" + succhua + ", coborua=" + coborua + "]";
	}
	

}
