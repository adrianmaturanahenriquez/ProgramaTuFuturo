package cl.curso.java.singleton_app.patronesdediseño;



public class GUIBuilder {

	public Window buildWindow(AbstractWidgetFactory factory){
		
		return factory.createWindow();
	}
	
}
