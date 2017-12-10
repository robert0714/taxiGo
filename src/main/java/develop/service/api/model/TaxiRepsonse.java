package develop.service.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY) 
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxiRepsonse { 
	
	@JsonProperty("status")
	private TaxiStatus status;
	
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("result")
	private TaxiResult  result;

	public TaxiStatus getStatus() {
		return status;
	}

	public void setStatus(TaxiStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TaxiResult  getResult() {
		return result;
	}

	public void setResult(TaxiResult  result) {
		this.result = result;
	} 
	
}
