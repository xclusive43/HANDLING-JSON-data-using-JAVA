package jsonproject.jsonproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 

public class jsonparsing {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
             // System.out.print("hgh");
              JSONParser jsonp = new JSONParser();
              FileReader data = new FileReader(".\\data\\data.json");
              JSONArray item ,trackinfo;
              JSONObject aa,aa1,aa2 = null;
             Object obj = jsonp.parse(data);
             JSONObject ob = (JSONObject)obj;
             
              
             ////String a=(String)ob.get("data").toString();
             JSONObject ob1 = (JSONObject)ob.get("data");
             item = new JSONArray();
             item = (JSONArray) ob1.get("items");//array
             
             for(int j=0;j<item.size();j++) {
            	 aa1 =(JSONObject) item.get(0);//object
            	 //System.out.print(aa1.get("tracking_number"));
                aa2 =(JSONObject)aa1.get("origin_info");
                //System.out.print(aa1.get("origin_info"));
                 
             }
             trackinfo = new JSONArray();
             //System.out.print( aa2.get("ItemReceived"));
             System.out.print(aa2.get("trackinfo"));
             trackinfo = (JSONArray)aa2.get("trackinfo");
             
             
             for(int l=0;l<trackinfo.size();l++) {
            	 JSONObject dd = (JSONObject) trackinfo.get(l);
            	 dd.get("StatusDescription");
            	 System.out.print( dd.get("StatusDescription")+"\n");
             }
	}
             
             
             
     
     
   
    
    
	 

}
