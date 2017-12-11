package develop.service.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import develop.service.api.repository.RecordDataRepository;
import develop.service.api.repository.model.RecordData;

@Component
public class TaxiService {

	@Autowired
	private RecordDataRepository respository ;
	
	public boolean saveData(RecordData data) {
		respository.save(data);
		
		return true ;
	}
}
