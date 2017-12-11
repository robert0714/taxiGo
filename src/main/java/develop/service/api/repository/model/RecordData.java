package develop.service.api.repository.model;



import org.springframework.data.annotation.Id;
  
import org.springframework.data.mongodb.core.mapping.Document;

import develop.service.api.model.RecordRequest;

@Document(collection = "taxigo")
public class RecordData {
	@Id
	private String id;
	
	private RecordRequest data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RecordRequest getData() {
		return data;
	}

	public void setData(RecordRequest data) {
		this.data = data;
	}
	
}
