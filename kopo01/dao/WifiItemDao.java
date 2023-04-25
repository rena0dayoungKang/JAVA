package kr.ac.kopo.ctc.kopo01.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo01.domain.WifiItem;

public class WifiItemDao {
	// 와이파이 아이템에 대한 CRUD

	// create
//		public WifiItem create(WifiItem wifiItem) {
//			
//			return null;
//		}

	// read
//		public WifiItem selectOne(int id) {
//			
//			return null;
//		}

	public List<WifiItem> selectAll() throws IOException {

		List<WifiItem> wifiItemList = new ArrayList<>();

		File kopo1_f = new File("C:\\Users\\kopo1\\Desktop\\PublicWifi.txt");
		BufferedReader kopo1_br = new BufferedReader(new FileReader(kopo1_f));
		String kopo1_readtxt;

		if ((kopo1_readtxt = kopo1_br.readLine()) == null) {
			System.out.printf("빈 파일입니다\n");
			return wifiItemList;
		}

		while ((kopo1_readtxt = kopo1_br.readLine()) != null) { // 파일을읽고, 한 줄을 문자열에 대입한것이 공백이 아니라면
			WifiItem wifiItem = new WifiItem();
			String[] kopo1_field = kopo1_readtxt.split("\t");
			wifiItem.setId(kopo1_field[0]);
			wifiItem.setInstallationLocationName(kopo1_field[1]);
			wifiItem.setInstallationLocationDetails(kopo1_field[2]);
			wifiItem.setInstallationCityName(kopo1_field[3]);
			wifiItem.setInstallationDistrictName(kopo1_field[4]);
			wifiItem.setInstallationFacilityType(kopo1_field[5]);
			wifiItem.setServiceProvideName(kopo1_field[6]);
			wifiItem.setWifiSSID(kopo1_field[7]);
			wifiItem.setDateOfInstallation(kopo1_field[8]);
			wifiItem.setRoadNameAddress(kopo1_field[9]);
			wifiItem.setLotNumberAddress(kopo1_field[10]);
			wifiItem.setManagementAgencyName(kopo1_field[11]);
			wifiItem.setManagementAgencyPhoneNumber(kopo1_field[12]);
			wifiItem.setLatitude(kopo1_field[13]);
			wifiItem.setLongitude(kopo1_field[14]);
			wifiItem.setCreated(kopo1_field[15]);

			wifiItemList.add(wifiItem);
		}

		return wifiItemList;

	}

	// update
//		public WifiItem update(WifiItem wifiItem, int id) {
//			
//			return null;
//		}

	// delete
//		public WifiItem delete(int id) {
//			
//			return null;
//		}
}
