
public class FactoryS {
	public Stack construir(String tipo, AbstractList lista) {
		if (tipo == "array list") {
			MyStackA a = new MyStackA();
			return a;
		}else if (tipo == "vector") {
			MyStackV a = new MyStackV();
			return a;
		
		}else if(tipo == "lista") {
			MyStackL a = new MyStackL(lista);
		}
		return null;
	}

}
