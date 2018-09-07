import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//import com.bmo.olbb.rest.web.test.unittest.user.DeftTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
    
	
}

public class Test {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		//GetAllContractPartyRolesRequest request = 
		//String jsonInString = mapper.writeValueAsString(request);
		//System.out.println(jsonInString); 
		//System.out.println("0120".matches("[0-9]+"));
		/*String amount = null;
		
		System.out.println("Value1---------->"+Optional.ofNullable(amount).isPresent());
		System.out.println("Value2---------->"+Optional.ofNullable(amount).get());*/
		//double d = Double.parseDouble(amount);
		//System.out.println(d);
		//System.out.println(StringUtils.isBlank(""));
		//String s = "12345";
		//System.out.println(s.trim().length() != 5);
		
		/*DateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss.S");
		Date lastEditDate = null;
		
			try {
				lastEditDate = df.parse("2017-11-07-05.47.41.288390");
				System.out.println(lastEditDate);
				DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
				String newDateString = df2.format(lastEditDate);
			    System.out.println(newDateString);
			    
			    //ListCRPaymentBatchRecordWithTotals request = new ListCRPaymentBatchRecordWithTotals();
			    
			    
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
		
		
		
		  
		      /*Result result = JUnitCore.runClasses(DeftTest.class);
		      
		      for (Failure failure : result.getFailures()) {
		         System.out.println(failure.toString());
		      }
		      System.out.println(result.wasSuccessful());*/
		List<Person> persons =
			    Arrays.asList(
			        new Person("Max", 18),
			        new Person("Peter", 23),
			        new Person("Pamela", 23),
			        new Person("David", 12));
		
			Map<Integer,String> map = persons
			    .stream()
			    .collect(Collectors.toMap(
			    		
			       p -> p.age,
			       p -> p.name,
			       (name1, name2) -> name1 + ";" + name2));

				System.out.println("Map is:"+map);
		   }
		
		
		
	

}
