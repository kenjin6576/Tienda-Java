import control.Buscar;
import control.TiendaFecher;
import views.Dashboard;
public class Main {
public static void main(String[] args) {
try {
String urlApi = "https://jsonplaceholder.typicode.com/posts/99"; // un solo objeto
String respuesta = TiendaFecher.obtenerProductos(urlApi);
System.out.println("Respuesta de la API:");
System.out.println(respuesta);
String objetoCompleto = respuesta;
int id = new Buscar().getId(objetoCompleto);

} catch (Exception e) {
e.printStackTrace();
}
}
}