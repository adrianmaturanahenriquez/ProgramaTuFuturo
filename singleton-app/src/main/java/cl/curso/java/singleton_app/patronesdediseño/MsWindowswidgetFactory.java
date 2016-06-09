package cl.curso.java.singleton_app.patronesdediseño;

public class MsWindowswidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {
		
		return new MsWindow();
	}

}
