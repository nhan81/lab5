package lab5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class quanlyphonghoc {
	private List<phonghoc>danhsachphonghoc;
public quanlyphonghoc() 
{
	danhsachphonghoc = new ArrayList<>();
}
public boolean themphonghoc(phonghoc phonghoc) {
	if(!KiemTraTonTai(phonghoc.getMaphong())) {
		danhsachphonghoc.add(phonghoc);
	}
	return true;
}
private boolean KiemTraTonTai(String maphong) {
	return false;
}
public phonghoc timphonghoctheoma(String maphong) {
for(phonghoc phonghoc: danhsachphonghoc) {
	if(phonghoc.getMaphong().equals(maphong)) {
		return phonghoc;
	}
}
return null;
}
public void intoanbodanhsachphonghoc() {
	for(phonghoc phonghoc :danhsachphonghoc) {
		System.out.println(phonghoc);
	}
}
public void indanhsachphonghocdatchuan() {
	for(phonghoc phonghoc :danhsachphonghoc) {
		if(phonghoc instanceof phonglythuyet) {
			phonglythuyet phonglythuyet = (phonglythuyet)phonghoc;
			if(phonglythuyet.isComaychieu()&&phonghoc.getSobongden()>=phonghoc.getDientich()/10)
			{
				System.out.println(phonghoc);
				}
			}else if (phonghoc instanceof phongmaytinh) {
				phongmaytinh phongmaytinh = (phongmaytinh)phonghoc;
				if(phongmaytinh.getSomaytinh()>=phonghoc.getDientich()/1.5 &&phonghoc.getSobongden()>=phonghoc.getDientich()/10) {
					System.out.println(phonghoc);
				}
				}else if (phonghoc instanceof phongthinghiem) {
					phongthinghiem phongthinghiem = (phongthinghiem)phonghoc;
					if(phongthinghiem.isCoborua()&&phonghoc.getSobongden()>=phonghoc.getDientich()/10)
					{
						System.out.println(phonghoc);
					}
			}
		}
}

public void sapxeptheodaynhatangdan() {
	danhsachphonghoc.sort(Comparator.comparing(phonghoc::getDaynha));
}
public void sapxeptheodientichgiamdan() {
	danhsachphonghoc.sort(Comparator.comparing(phonghoc::getDientich).reversed());
}
public void sapxeptheosobongdentangdan() {
	danhsachphonghoc.sort(Comparator.comparing(phonghoc::getSobongden));
}
public void capnhatsomaytinh(String maphong,int somaytinhmoi) {
	for(phonghoc phonghoc:danhsachphonghoc) {
		if(phonghoc instanceof phongmaytinh && phonghoc.getMaphong().equals(maphong)) {
			phongmaytinh phongmaytinh = (phongmaytinh)phonghoc;
			phongmaytinh.setSomaytinh(somaytinhmoi);
			break;
		}
	}
}
public boolean xoaphonghoc(String maphong) {
	for(phonghoc phonghoc:danhsachphonghoc) {
		if(phonghoc.getMaphong().equals(maphong)) {
			danhsachphonghoc.remove(phonghoc);
			return true;
		}
	}
	return false;
}
public void intongsophonghoc() {
	System.out.println("Tong so phong hoc:"+danhsachphonghoc.size());
}
public void indanhsachphongmaycosomaytinh(int somaytinh) {
	for(phonghoc phonghoc:danhsachphonghoc) {
		if(phonghoc instanceof phongmaytinh) {
			phongmaytinh phongmaytinh = (phongmaytinh)phonghoc;
			if(phongmaytinh.getSomaytinh()==somaytinh)
			{
				System.out.println(phonghoc);
				}
			}
		}
	}
private boolean kiemtratontai(String maphong) {
	for(phonghoc phonghoc:danhsachphonghoc) {
		if(phonghoc.getMaphong().equals(maphong)) {
	return true;
		}
}
	return false;
}
}
	