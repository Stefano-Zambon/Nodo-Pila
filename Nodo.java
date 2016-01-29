
public class Nodo {
	
private int  info;
	
private	Nodo next;

	public Nodo() 
		{
	
			info  = 0;
			next = null;
		}
// Metodo costruttore serve  per far funzionare la classe nodo
	public Nodo (int info)
		{
		
			this.info = info;
			next = null ;
		}
// Serve per modificare inserire un' informazione
	public int getInfo ()
		{
			return info;
		}
// Serve a restituire  l'informazione privata 
	
	public void setInfo (int n)
		{
			info = n ;
		}
// Serve a modificare l' informazione privata 
	
	public  Nodo getnext ()
		{
			return next;
			
		}
// Ci restituisce il nostro  next uso il void perchè non mi restituisce nulla 
	
	public void  setnext (Nodo next)
		{
			this.next = next ;
		}
// Serve per modificare  il next uso il void perchè non mi restitusce nulla 
}
