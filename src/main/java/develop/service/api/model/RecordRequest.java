package develop.service.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty; 

/**
 * The Class RecordRequest.
 */ 
@JsonInclude(JsonInclude.Include.NON_EMPTY) 
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecordRequest {

	/** The passenger id.乘客識別碼 */
	@JsonProperty("passenger_id")
	private String passengerId;
	
	/** The boarding date. 搭乘日期,格式為：2014-06-25 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonProperty("boarding_date")
	private Date boardingDate;
	
	/** The get on area. 上車地區*/
	@JsonProperty("get_on_area")
	private String getOnArea;
	
	/** The get off area.下車地區 */
	@JsonProperty("get_off_area")
	private String getOffArea;
	
	/** The fare.車資 */
	@JsonProperty("fare")
	private String fare;
	
	/** The fleet. 車隊/車行 */
	@JsonProperty("fleet")
	private String fleet;
	
	/** The driver phone.駕駛電話 */
	@JsonProperty("driver_phone")
	private String driverPhone;
	
	/** The car number. 車號*/
	@JsonProperty("car_number")
	private String carNumber;
	
	/** The driver number. 司機姓名 */
	@JsonProperty("driver_number")
	private String driverNumber;

	public String getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}

	public Date getBoardingDate() {
		return boardingDate;
	}

	public void setBoardingDate(Date boardingDate) {
		this.boardingDate = boardingDate;
	}

	public String getGetOnArea() {
		return getOnArea;
	}

	public void setGetOnArea(String getOnArea) {
		this.getOnArea = getOnArea;
	}

	public String getGetOffArea() {
		return getOffArea;
	}

	public void setGetOffArea(String getOffArea) {
		this.getOffArea = getOffArea;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public String getFleet() {
		return fleet;
	}

	public void setFleet(String fleet) {
		this.fleet = fleet;
	}

	public String getDriverPhone() {
		return driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getDriverNumber() {
		return driverNumber;
	}

	public void setDriverNumber(String driverNumber) {
		this.driverNumber = driverNumber;
	}
	
	
}
