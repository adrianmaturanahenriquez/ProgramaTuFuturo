package cl.curso.java.singleton_app.patronesdediseño;

public class MacOSXWIDgetFactory implements AbstractWidgetFactory{

	public Window createWindow() {
		// TODO Auto-generated method stub
		return new MacOSXWindow();
	}

}
