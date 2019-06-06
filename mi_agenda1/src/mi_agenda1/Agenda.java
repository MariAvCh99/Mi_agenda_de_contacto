package mi_agenda1;

public class Agenda {	
	//Atributos
	Contacto[] registro;	
	
	//Metodos Constructores
	public Agenda(int tamaño_agenda){
		this.registro= new Contacto[tamaño_agenda]; 
	}
	
	public Agenda(){
		this.registro= new Contacto[10]; 
	}	
	
	
	//Met. insertar contactos
	public void setContacto(Contacto c){		
		int indice=buscar_indice_vacio();
		for(int i=0;i<(this.registro).length;i++){
			if(indice<0){
				System.out.println("");
				System.out.println("Advertencia: Agenda llena!");
			}else {
				this.registro[indice]=c;
			}
		}
	}
	
	//Buscar un vacio
	private int buscar_indice_vacio() {		
		int indice=0;		
		while(this.registro[indice]!=null){			
			indice++;
			if(indice > (this.registro).length-1){
				return -1;
			}				
		}		
		return indice;				
	}
	
	//Met. listar contactos
	public void listarContactos(){
		System.out.println("");
		System.out.println("Lista de contactos");
		for(int i=0;i<(this.registro).length;i++){
			if(this.registro[i]!=null){
				System.out.println("");
				System.out.println("Contacto: "+(i+1));
				(this.registro[i]).DatosContacto();
			}
		}			
	}
	 
	//Met. buscar contacto
	public void buscarContactos(String nombre) {
		boolean encontrado=false;
		 for (int i=0;i<registro.length;i++) {
			 if (!encontrado && this.registro[i]!=null && registro[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("");
				System.out.println("Contacto: "+(i+1));
				(this.registro[i]).DatosContacto();
				encontrado=true;
			 }
		 }
		 if (!encontrado) {
			 System.out.println("No se ha encontrado el contacto ingresado");
		 }
	}
	
	//Met. eliminar contacto
	public void eliminarContacto(String nombre) {
		boolean encontrado=false;
		for (int i=0;i<registro.length;i++) {
			if (!encontrado && this.registro[i]!=null && this.registro[i].getNombre().equalsIgnoreCase(nombre)) {
				this.registro[i]=null;
				encontrado=true;
			}
		}
		if (!encontrado) {
			System.out.println("El contacto no existe");
		}
	}
	
	//Met. editar contacto
	public void editarContacto(int indice,Contacto newc) {
		if (indice>0 && indice<=this.registro.length) {
			this.registro[indice-1]=newc;
		}else {
			 System.out.println("El contacto no existe");
			 }
	}
	
}
