package kr.ac.kopo.ctc.kopo01.domain;

public class WifiItem {

	private String id;// 번호
	private String installationLocationName;// 설치장소명
	private String installationLocationDetails; // 설치장소상세
	private String installationCityName; // 설치시도명
	private String installationDistrictName; // 설치시군구명
	private String installationFacilityType; // 설치시설구분
	private String serviceProvideName;// 서비스제공사명
	private String wifiSSID;// 와이파이SSID
	private String dateOfInstallation; // 설치연월
	private String roadNameAddress; // 소재지도로명주소
	private String lotNumberAddress;// 소재지지번주소
	private String managementAgencyName; // 관리기관명
	private String managementAgencyPhoneNumber; // 관리기관전화번호
	private String latitude; // 위도
	private String longitude; // 경도
	private String created; // 데이터기준일자

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the installationLocationName
	 */
	public String getInstallationLocationName() {
		return installationLocationName;
	}

	/**
	 * @param installationLocationName the installationLocationName to set
	 */
	public void setInstallationLocationName(String installationLocationName) {
		this.installationLocationName = installationLocationName;
	}

	/**
	 * @return the installationLocationDetails
	 */
	public String getInstallationLocationDetails() {
		return installationLocationDetails;
	}

	/**
	 * @param installationLocationDetails the installationLocationDetails to set
	 */
	public void setInstallationLocationDetails(String installationLocationDetails) {
		this.installationLocationDetails = installationLocationDetails;
	}

	/**
	 * @return the installationCityName
	 */
	public String getInstallationCityName() {
		return installationCityName;
	}

	/**
	 * @param installationCityName the installationCityName to set
	 */
	public void setInstallationCityName(String installationCityName) {
		this.installationCityName = installationCityName;
	}

	/**
	 * @return the installationDistrictName
	 */
	public String getInstallationDistrictName() {
		return installationDistrictName;
	}

	/**
	 * @param installationDistrictName the installationDistrictName to set
	 */
	public void setInstallationDistrictName(String installationDistrictName) {
		this.installationDistrictName = installationDistrictName;
	}

	/**
	 * @return the installationFacilityType
	 */
	public String getInstallationFacilityType() {
		return installationFacilityType;
	}

	/**
	 * @param installationFacilityType the installationFacilityType to set
	 */
	public void setInstallationFacilityType(String installationFacilityType) {
		this.installationFacilityType = installationFacilityType;
	}

	/**
	 * @return the serviceProvideName
	 */
	public String getServiceProvideName() {
		return serviceProvideName;
	}

	/**
	 * @param serviceProvideName the serviceProvideName to set
	 */
	public void setServiceProvideName(String serviceProvideName) {
		this.serviceProvideName = serviceProvideName;
	}

	/**
	 * @return the wifiSSID
	 */
	public String getWifiSSID() {
		return wifiSSID;
	}

	/**
	 * @param wifiSSID the wifiSSID to set
	 */
	public void setWifiSSID(String wifiSSID) {
		this.wifiSSID = wifiSSID;
	}

	/**
	 * @return the dateOfInstallation
	 */
	public String getDateOfInstallation() {
		return dateOfInstallation;
	}

	/**
	 * @param dateOfInstallation the dateOfInstallation to set
	 */
	public void setDateOfInstallation(String dateOfInstallation) {
		this.dateOfInstallation = dateOfInstallation;
	}

	/**
	 * @return the roadNameAddress
	 */
	public String getRoadNameAddress() {
		return roadNameAddress;
	}

	/**
	 * @param roadNameAddress the roadNameAddress to set
	 */
	public void setRoadNameAddress(String roadNameAddress) {
		this.roadNameAddress = roadNameAddress;
	}

	/**
	 * @return the lotNumberAddress
	 */
	public String getLotNumberAddress() {
		return lotNumberAddress;
	}

	/**
	 * @param lotNumberAddress the lotNumberAddress to set
	 */
	public void setLotNumberAddress(String lotNumberAddress) {
		this.lotNumberAddress = lotNumberAddress;
	}

	/**
	 * @return the managementAgencyName
	 */
	public String getManagementAgencyName() {
		return managementAgencyName;
	}

	/**
	 * @param managementAgencyName the managementAgencyName to set
	 */
	public void setManagementAgencyName(String managementAgencyName) {
		this.managementAgencyName = managementAgencyName;
	}

	/**
	 * @return the managementAgencyPhoneNumber
	 */
	public String getManagementAgencyPhoneNumber() {
		return managementAgencyPhoneNumber;
	}

	/**
	 * @param managementAgencyPhoneNumber the managementAgencyPhoneNumber to set
	 */
	public void setManagementAgencyPhoneNumber(String managementAgencyPhoneNumber) {
		this.managementAgencyPhoneNumber = managementAgencyPhoneNumber;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}

}