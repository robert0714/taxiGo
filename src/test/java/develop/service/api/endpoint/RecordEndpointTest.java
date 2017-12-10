package develop.service.api.endpoint;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import develop.service.api.Application;
import develop.service.api.model.RecordRequest; 
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT ,classes=Application.class)
//@DirtiesContext
public class RecordEndpointTest {
	/** The rest template. */
	@Autowired
	private TestRestTemplate restTemplate;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testRecord() throws Exception {
		RecordRequest request =new RecordRequest();
		assert200Ok(request, "/record");

	}
	/**
	 * Test common.
	 *
	 * @param body the body
	 * @param uri the uri
	 * @throws Exception the exception
	 */
	protected void assert200Ok(RecordRequest body ,String uri) throws Exception{	 
		ResponseEntity<String> response =testCommon(body, uri);	
		if(response.hasBody()) {
			System.out.println(response.getBody());;
			
		}
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
	/**
	 * Test assert417.
	 *
	 * @param body the body
	 * @param uri the uri
	 * @throws Exception the exception
	 */
	protected void assert417(RecordRequest body ,String uri) throws Exception{	 
		ResponseEntity<String> response =testCommon(body, uri);	
		if(response.hasBody()) {
			System.out.println(response.getBody());;
			
		}
		
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.EXPECTATION_FAILED);
	}
	 
	/**
	 * Test common.
	 *
	 * @param body the body
	 * @param uri the uri
	 * @throws Exception the exception
	 */
	protected ResponseEntity<String> testCommon(RecordRequest body ,String uri) throws Exception{				
		RequestEntity<RecordRequest> request = RequestEntity.post(new URI(uri)).accept(MediaType.APPLICATION_JSON_UTF8).body(body);
		ResponseEntity<String> response = this.restTemplate.exchange(request, String.class);		
		return response;
	}
}
