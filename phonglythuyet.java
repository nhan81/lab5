package lab5;

public class phonglythuyet extends phonghoc 
{
	private boolean comaychieu;
	public phonglythuyet(String maphong, String daynha, double dientich, int sobongden,boolean comaychieu) {
		super(maphong, daynha, dientich, sobongden);
		this.comaychieu = comaychieu;
	}
	

public boolean isComaychieu() {
		return comaychieu;
	}


	public void setComaychieu(boolean comaychieu) {
		this.comaychieu = comaychieu;
	}


@Override
public String toString() {
	return "phonglythuyet [comaychieu=" + comaychieu + "]";
}

}
