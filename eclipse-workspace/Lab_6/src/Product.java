import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Product {	
	public static JSONArray readJSON() {
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
        
        return wareList;
	}
	
	public static void writeJSON(JSONArray wareList) {
        try (FileWriter file = new FileWriter("ware.json")) {
            file.write(wareList.toJSONString());
            file.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static int searching(JSONArray wareList, String x) {
		int i = 0;
		Iterator<JSONObject> it = wareList.iterator();
		while (it.hasNext()) {
			JSONObject tmp = (JSONObject) (it.next()).get("ware");
			if (x.equals((String) tmp.get("product"))) {
				return i;
			}
			++i;
		}
		return -1;
	}
	
	public static void addWare(String product, String amount, String des) {
		JSONArray tmpList = readJSON();
		int ite = searching(tmpList, product);
		
		if (ite != -1) {
			int i = 0;
			JSONObject obj = new JSONObject();
			Iterator<JSONObject> it = tmpList.iterator();
			
			while (ite >= i++) {
				obj = (JSONObject) (it.next()).get("ware");
			}
			
    		int num = Integer.parseInt((String) obj.get("amount")) + Integer.parseInt(amount); 
    		obj.put("amount", Integer.toString(num));
    		obj.put("description", (String) obj.get("description") + '\n' + des);
		}
		else {
			JSONObject newObj = new JSONObject();
			JSONObject addObj = new JSONObject();
			
			newObj.put("product", product);
			newObj.put("amount", amount);
			newObj.put("description", des == null ? "" : des);
        	addObj.put("ware", newObj);
        	tmpList.add(addObj);
        }
		
		writeJSON(tmpList);
	}
	
	public static void removeWare(String product) {
		JSONArray tmpList = readJSON();
		int ite = searching(tmpList, product);
		
		if (ite != -1) {
			int i = 0;
			JSONObject obj = new JSONObject();
			Iterator<JSONObject> it = tmpList.iterator();
			
			while (ite >= i++) {
				obj = (JSONObject) (it.next()).get("ware");
			}
			
    		obj.put("amount", Integer.toString(Integer.parseInt((String) obj.get("amount")) - 1));
    		
    		if ("0".equals((String) obj.get("amount"))) tmpList.remove(ite);
		}
		
		writeJSON(tmpList);
	}
	
	public static void searchWare(String product, StringBuilder amount, StringBuilder des) {
		JSONArray tmpList = readJSON();
		int ite = searching(tmpList, product);
		
		if (ite != -1) {
			int i = 0;
			JSONObject obj = new JSONObject();
			Iterator<JSONObject> it = tmpList.iterator();
			
			while (ite >= i++) {
				obj = (JSONObject) (it.next()).get("ware");
			}
			
    		amount.append(Integer.toString(Integer.parseInt((String) obj.get("amount"))));
    		des.append(obj.get("description") == null ? " " : obj.get("description"));
		}
		
		writeJSON(tmpList);
	}
	
	public static String update() {
		JSONArray tmpList = readJSON();
		
		int i = 1;
		String re = "";
		Iterator<JSONObject> it = tmpList.iterator();
		while (it.hasNext()) {
			JSONObject obj = new JSONObject();
			obj = (JSONObject) (it.next()).get("ware");
			
			re += Integer.toString(i) + ". " + (String) obj.get("product") + "\t" + (String) obj.get("amount") + "\n"; 
			++i;
		}
		
		return re;
	}
}
