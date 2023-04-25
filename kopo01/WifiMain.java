package kr.ac.kopo.ctc.kopo01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo01.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo01.domain.WifiItem;
import kr.ac.kopo.ctc.kopo01.service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) throws IOException {

		// 만들어진 패키지와 클래스를 쓰면된다.
		WifiItemDao wifiItemDao = new WifiItemDao();
		List<WifiItem> wifiItems = wifiItemDao.selectAll();
		WifiItem wifiItem = new WifiItem();

		WifiItemService wifiItemService = new WifiItemService();

		// 융기원 위도 경도
		WifiItem me = new WifiItem();
		me.setLatitude("37.385808");
		me.setLongitude("127.121244");

		List<Double> distanceList = new ArrayList<Double>();

		int kopo1_LineCnt = 0; // kopo1_LineCnt 초기화

		// double kopo1_maxDist = Double.MIN_VALUE; // 최장거리변수설정
		String kopo1_maxName = ""; // 최장거리 이름 저장
		String kopo1_maxAddress = ""; // 최장거리의 주소 저장
		double kopo1_maxLatitude = 0;// 최장거리의 위도 저장
		double kopo1_maxLongitude = 0;// 최장거리의 경도 저장
		// double kopo1_minDist = Double.MAX_VALUE; // 최단거리 변수 설정
		String kopo1_minName = ""; // 최단거리 이름 저장
		String kopo1_minAddress = ""; // 최단거리 주소 저장
		double kopo1_minLatitude = 0;// 최단거리 위도 저장
		double kopo1_minLongitude = 0;// 최단거리의 경도 저장

		for (WifiItem target : wifiItems) {
			double kopo1_dist = wifiItemService.getDistance(me, target);
			distanceList.add(kopo1_dist);
		}

		double kopo1_maxDist = Double.MIN_VALUE;
		double kopo1_minDist = Double.MAX_VALUE;
		int index = 0;
		int max = 0;
		int min = 0;
		for (double db : distanceList) {
			if (db >= kopo1_maxDist) {
				kopo1_maxDist = db;
				max = index;
			}
			if (db < kopo1_minDist) {
				kopo1_minDist = db;
				min = index;
			}
			index++;
		}

		System.out.println(wifiItems.get(max).getInstallationLocationName());

		System.out.println("-----------------------------------------------------------------------"); // 구분선
		System.out.printf("현재 지점에서 가장 가까운 장소 : %s\n", wifiItems.get(min).getInstallationLocationName()); // 장소이름s
		System.out.printf("현재 지점에서 떨어진 거리 : %f\n", kopo1_minDist); // 거리f
		System.out.printf("주소 : %s\n", wifiItems.get(min).getRoadNameAddress()); // 주소s
		System.out.printf("위도 : %s\n", wifiItems.get(min).getLatitude()); // 위도s
		System.out.printf("경도 : %s\n", wifiItems.get(min).getLongitude()); // 경도s

		System.out.println("-----------------------------------------------------------------------"); // 구분선
		System.out.printf("현재 지점에서 가장 먼 장소 : %s\n", wifiItems.get(max).getInstallationLocationName()); // 장소이름s
		System.out.printf("현재 지점에서 떨어진 거리 : %f\n", kopo1_maxDist); // 거리f
		System.out.printf("주소 : %s\n", wifiItems.get(max).getRoadNameAddress()); // 주소s
		System.out.printf("위도 : %s\n", wifiItems.get(max).getLatitude()); // 위도s
		System.out.printf("경도 : %s\n", wifiItems.get(max).getLongitude()); // 경도s

	}

}
