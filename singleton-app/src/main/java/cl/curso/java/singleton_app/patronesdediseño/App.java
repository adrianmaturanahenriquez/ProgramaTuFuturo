package cl.curso.java.singleton_app.patronesdediseño;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	String platform = System.getProperty("os.name").toLowerCase();
    	
    	System.out.println(platform);
    	GUIBuilder builder = new GUIBuilder();
    	
    	if( platform.startsWith("win") ){
    		builder.buildWindow( new MacOSXWIDgetFactory());
    	}else {
    		builder.buildWindow( new MacOSXWIDgetFactory());
		}
    	
    }
}
