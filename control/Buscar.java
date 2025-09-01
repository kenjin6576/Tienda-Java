package control;
public class Buscar {
public String objeto(String datos) {
String objeto = "";
boolean dentroObjeto = false;
int llaves = 0;

for (int i = 0; i < datos.length(); i++) {
char cadaLetra = datos.charAt(i);
if (cadaLetra == '{') {
dentroObjeto = true;
llaves++;
}
if (dentroObjeto) {
objeto += cadaLetra;
}
if (cadaLetra == '}') {
llaves --;
if (llaves == 0) {
//termino del primer objeto
break;
}
}
}
return objeto;
}
public int getId(String objetoCompleto){
return 99;
}
}