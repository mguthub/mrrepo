import com.bmo.olbb.rest.web.deft.dto.ViewCreateTemplateDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test1 {

	public static void main(String[] args) throws JsonProcessingException { 
		ObjectMapper mapper = new ObjectMapper();
		ViewCreateTemplateDTO dto = new ViewCreateTemplateDTO();
		String jsonInString;
		
			jsonInString = mapper.writeValueAsString(dto);
			System.out.println(jsonInString); 
		
			// TODO Auto-generated catch block
			
		

	}

}
