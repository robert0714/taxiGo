package develop.service.api.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
 
 
import develop.service.api.model.RecordRequest;
import develop.service.api.repository.model.RecordData; 

@RepositoryRestResource(collectionResourceRel = "recordData", path = "recordData")
public interface RecordDataRepository  extends MongoRepository<RecordData, String> {
	
	     
}
