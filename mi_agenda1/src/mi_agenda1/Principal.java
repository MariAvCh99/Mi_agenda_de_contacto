package mi_agenda1;

import java.util.Scanner;

public class Principal {
	private static Scanner reader;
	public static void main(String[] arg){		
		reader = new Scanner(System.in);
		int opcion, tamaño;
		Contacto mi_contacto, new_contacto;
		String nombre, telefono, email, newnombre, newtelefono, newemail;
		int numero;
		boolean band=true;	
			
		System.out.print("Tamaño de la agenda: ");
		tamaño=reader.nextInt();
		Agenda mi_agenda=new Agenda(tamaño);		
					
		while(band==true){	
			menu();			
			System.out.print("Elegir opcion: ");
			opcion=reader.nextInt();
			switch(opcion){
				case 1: //insertar contacto
					System.out.print("Ingresar nombre: ");
					nombre=reader.next();
					System.out.print("Ingresar telefono: ");
					telefono=reader.next();
					System.out.print("Ingresar email: ");
					email=reader.next();
						
					mi_contacto=new Contacto(nombre,telefono,email);
					mi_agenda.setContacto(mi_contacto);
					break;
				case 2://Editar contacto
					
					System.out.print("Ingrese el contacto a editar: ");
					numero=reader.nextInt(); 
					
					System.out.print("Editar nombre: ");
					newnombre=reader.next();
					System.out.print("Editar telefono : ");
					newtelefono=reader.next();
					System.out.print("Editar email : ");
					newemail=reader.next();
					new_contacto= new Contacto(newnombre,newtelefono,newemail);
					
					mi_agenda.editarContacto(numero,new_contacto);
					
					break;
				case 3://Buscar contacto
					System.out.print("Ingresar nombre del contacto: ");
					nombre=reader.next();
					mi_agenda.buscarContactos(nombre);
					break;
				case 4://Eliminar contacto
					System.out.print("Ingresar nombre de contacto: ");
					nombre=reader.next();
					
					mi_agenda.eliminarContacto(nombre);
					break;
				case 5://Listar Contactos
					mi_agenda.listarContactos();
					break;
				case 0://Finalizar programa
					band=false;
					break;
				default:				
					break;					
				}				
			}		
		}
		
		
		public static void menu(){
			System.out.println("");
			System.out.println("-------- Menu Telefonico --------");
			System.out.println("[1] Añadir Contacto");
			System.out.println("[2] Editar Contacto");
			System.out.println("[3] Buscar Contacto");
			System.out.println("[4] Eliminar Contacto"); // por su nombre
			System.out.println("[5] Listar Contacto");
			System.out.println("[0] Finalizar Programa");
		}
		


}
