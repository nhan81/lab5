package lab5;

public abstract class phonghoc {
	String maphong;
	String daynha;
	double dientich;
	int sobongden;
	public phonghoc(String maphong, String daynha, double dientich, int sobongden) {
		this.maphong = maphong;
		this.daynha = daynha;
		this.dientich = dientich;
		this.sobongden = sobongden;
	}
	public String getMaphong() {
		return maphong;
	}
	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}
	public String getDaynha() {
		return daynha;
	}
	public void setDaynha(String daynha) {
		this.daynha = daynha;
	}
	public double getDientich() {
		return dientich;
	}
	public void setDientich(double dientich) {
		this.dientich = dientich;
	}
	public int getSobongden() {
		return sobongden;
	}
	public void setSobongden(int sobongden) {
		this.sobongden = sobongden;
	}
	@Override
	public String toString() {
		return "phonghoc [maphong=" + maphong + ", daynha=" + daynha + ", dientich=" + dientich + ", sobongden="
				+ sobongden + "]";
	}


}
