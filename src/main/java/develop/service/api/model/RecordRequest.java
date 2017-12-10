package develop.service.api.model;

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
	
	/** The boarding date. 搭乘日期*/
	@JsonProperty("boarding_date")
	private String boardingDate;
	
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
	
	
}
