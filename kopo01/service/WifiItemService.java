package kr.ac.kopo.ctc.kopo01.service;

import java.io.IOException;

import kr.ac.kopo.ctc.kopo01.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo01.domain.WifiItem;

public class WifiItemService {

	public double getDistance(WifiItem wifiItem1, WifiItem wifiItem2) throws IOException {

		WifiItem me = new WifiItem();
		WifiItem wifiItem = new WifiItem();
		WifiItemDao wifiItemDao = new WifiItemDao();

		// 피타고라스 정리로 구현
		double kopo1_dist = 0;
		kopo1_dist = Math.sqrt(Math
				.pow(Double.parseDouble(wifiItem1.getLatitude()) - Double.parseDouble(wifiItem2.getLatitude()), 2)
				+ Math.pow(Double.parseDouble(wifiItem1.getLongitude()) - Double.parseDouble(wifiItem2.getLongitude()),
						2));

		return kopo1_dist;
	}
}