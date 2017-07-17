import java.awt.Desktop;
import java.net.URI; //Note this is URI, not URL
import java.net.URL;
import java.util.HashMap;


class OpenLink{
    public static void main(String args[]) throws Exception{
    			
    			// Request from Customer with like Checkboxes
	        HashMap<Integer, String> links = new HashMap<Integer, String>();
	        links.put(0, "http://www.google.ch");
	        links.put(1, "http://www.bluewin.ch");
	        links.put(2, "http://www.t3n.de");
	        links.put(3, "http://www.swisscom.ch");
	        
	        
	        
	        // open all Links in this Array in one Tab.
	        for(int i = 0; i < links.size(); i++) {
	        		// System.out.println(links.get(i));
	        	Desktop.getDesktop().browse(new URL(links.get(i)).toURI());
	        	
	        } 
	        
	        // Boom -> Have a nice DAY.
        
        }
    }
