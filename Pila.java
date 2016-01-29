
public class Pila {
	
	private Nodo testa ;
	
	public Pila (){
		testa = null ;
	}
// Ho creato la pila  con la testa vuota 
 public void Push (int info)
 	{
	 
	 Nodo n = new Nodo(info) ;
	 n.setnext(testa) ;
	 testa = n ;
	 
 	}
 

 
 // Con questo metodo aggiungo un nodo dentro la pila e automaticamente prenderà la testa 
 public Nodo  pop ()
 	{
	 	if (testa != null) 
	 	{
	 		Nodo box = testa;
	 		testa = testa.getnext();
	 		return box; 
	 	}
	 	else
	 		return null; 
	 	}
 //Con questo metodo se c'è un nodo presente sulla pila andrà in box e la testa punterà il nodo precedente 
 public int top () 
 	{
	 	if (testa !=null)
	 	{
	 		return testa.getInfo();
	 	}
	 	else
	 		return 0000;
 }
 // Con questo metodo se c'è un nodo mi restituirà le informazioni che sono in testa 
 public int size ()
 	{	
	 int ris =0;
	 	while (testa != null)
	 	{
	 		int box = testa.getInfo();
	 		 ris = ris + box;
	 		testa = testa.getnext();
	 		
	 	}
	 	return ris ;
	 
 	}
 
}
