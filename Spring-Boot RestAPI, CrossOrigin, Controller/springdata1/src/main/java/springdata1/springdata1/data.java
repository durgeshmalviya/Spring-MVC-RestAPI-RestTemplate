package springdata1.springdata1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class data {
	@CrossOrigin
	@GetMapping(value="/data")
	public List<Object> getData() {
		String uri ="http://localhost:8080/demo/all";
		RestTemplate rt = new RestTemplate();
		//String a = " Welcome ";
		Object[] k = rt.getForObject(uri,Object[].class);
		return Arrays.asList(k);
		
	}
	
	@GetMapping(value="/sh")
	public ModelAndView data(){
		ModelAndView mv =new ModelAndView();
	mv.addObject(data());
mv.setViewName("index");
return mv;
}
}
	