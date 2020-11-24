import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class Jadd {
	private String product = "";
	private String amount = "";
	private String des = "";
	private boolean flag = false;
	
    @SuppressWarnings("unchecked")
    
	public Jadd(String product, String amount, String des) {
    	this.product = product;
    	this.amount = amount;
    	this.des = des;
        
    	JSONArray wareList = new JSONArray();
        
        try (FileReader reader = new FileReader("ware.json")) {
        	JSONParser jsonParser = new JSONParser();
        	Object tmp = jsonParser.parse(reader);
        	wareList = (JSONArray) tmp; 
        
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        Iterator<JsonElement> it = jsonArray.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        wareList.forEach( emp -> parseObject( (JSONObject) emp ) );
        
        JSONObject obj = new JSONObject();
        JSONObject addObj = new JSONObject();
        if (!flag) {
        	obj.put("product", product);
        	obj.put("amount", amount);
        	obj.put("description", des);
        	addObj.put("ware", obj);
        	wareList.add(addObj);
        }
        
        try (FileWriter file = new FileWriter("ware.json")) {
            file.write(wareList.toJSONString());
            file.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void parseObject(JSONObject ware) 
    {
    	JSONObject wareGet = (JSONObject) ware.get("ware"); 
    	
    	if (this.product.equals((String) wareGet.get("product"))) {
    		this.flag = true; 
    		
    		int tmp = Integer.parseInt((String) wareGet.get("amount")) + Integer.parseInt(this.amount); 
    		wareGet.put("amount", Integer.toString(tmp));
    	}
    	
        System.out.println((String) wareGet.get("product"));
        System.out.println((String) wareGet.get("amount"));
        System.out.println((String) wareGet.get("description"));
    }
}