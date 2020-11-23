import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class Jadd {
    @SuppressWarnings("unchecked")
    
	public Jadd(String product, int amount, String des) {

    	JSONObject ware = new JSONObject();
    	ware.put("product", product);
    	ware.put("amount", amount);
    	ware.put("description", des);
        
    	JSONArray list = null;
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("ware.json")) {
        	
        	Object obj = jsonParser.parse(reader);
        	list = (JSONArray) obj; 
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        list.forEach( emp -> parseObject( (JSONObject) emp ) );
        
        
        try (FileWriter file = new FileWriter("ware.json")) {
        	
            file.write(ware.toJSONString());
            file.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void parseObject(JSONObject ware) 
    {
        System.out.println((String) ware.get("product"));
        System.out.println(Integer.parseInt((String) ware.get("amount")));
        System.out.println((String) ware.get("description"));
    }
}