package springdata.springdata;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class spdata {
	
@CrossOrigin
@RequestMapping("/india")
	public String getData() {
	

	String uri ="https://jsonplaceholder.typicode.com/users";
	RestTemplate rt = new RestTemplate();
	String k= rt.getForObject(uri,String.class);
	return k;
	}
}
