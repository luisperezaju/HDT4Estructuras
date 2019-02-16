
public class FactoryL {
	
	public AbstractList construir(String tipo) {
		if (tipo == "simplemente encadenada") {
			SingleLink<String> a = new SingleLink<String>();
			return a;
		}else if (tipo == "doblemente encadenada") {
			DoublyLinkedList a = new DoublyLinkedList();
			return a;
		} else if(tipo== "circular") {
			CircularList a = new CircularList();
			return a;
		}
		return null;
	}
}