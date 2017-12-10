package develop.service.api.endpoint;
 

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import develop.service.api.model.RecordRequest;
import io.swagger.annotations.ApiOperation; 

@RestController
@RequestMapping(value = "/record")
public class RecordEndpoint {

	@ApiOperation(value = "紀錄乘客搭車資訊", notes = "")
	@RequestMapping(value = { "" }, method = RequestMethod.POST)
	public void record(@RequestBody RecordRequest request ) {
		

	}
}
