import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.time.LocalDate;
import java.io.IOException;


public class Empleado extends Persona implements iSalario{
	
	private double salario;
	private String posicion;
	private LocalDate fecha_ingreso;
	
	
	public Double salarioNeto() {
		double salarioNeto = salario * 0.8;
		return salarioNeto;
	}
	
	public static void main(String[] args) {
		
		Empleado juan = new Empleado();
		juan.nombre = "Juan";
		juan.apellido = "García";
		juan.ciudad = "Jaén";
		juan.edad = 37;
		
		Empleado pablo = new Empleado();
		pablo.nombre = "Pablo";
		pablo.apellido = "Soto";
		pablo.ciudad = "Murcia";
		pablo.edad = 50;
		
		Empleado manuel = new Empleado();
		manuel.nombre = "Manuel";
		manuel.apellido = "Fernández";
		manuel.ciudad = "Málaga";
		manuel.edad = 40;
		
		Empleado [] empleados= {juan, pablo, manuel};
		
		
		try {
			
		String ruta = "C:\\Users\\mmartinezal\\Documents\\JAVA\\"; 
		
		LocalDate fecha_actual = LocalDate.now();
		String fechaDeHoy = ""+fecha_actual;
		String nombreArchivo = "informacion_empleados_" + fechaDeHoy+".txt";
		String ruta_nombreArchivo = ruta + nombreArchivo;
		
		File archivo = new File(ruta_nombreArchivo);
		if(! archivo.exists()) {
				archivo.createNewFile();
		}
		FileWriter fw = new FileWriter(archivo);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(fechaDeHoy + "\n");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i< empleados.length;i++) {
		
			
			System.out.println("Ingrese posición de empleado " + empleados[i].nombre + " " + empleados[i].apellido 
					+ ", edad: " + empleados[i].edad + " y ciudad: " + empleados[i].ciudad);
			empleados[i].posicion = sc.nextLine();
			System.out.println("Ingrese salario bruto de empleado " + empleados[i].nombre + " " + empleados[i].apellido 
					+ ", edad: "+ empleados[i].edad + " y ciudad: " + empleados[i].ciudad);
			empleados[i].salario = Double.parseDouble(sc.nextLine());
			System.out.println("Ingrese fecha de ingreso (dd-MM-YYYY) de empleado  " + empleados[i].nombre + " " 
					+ empleados[i].apellido + ", edad: "+ empleados[i].edad + " y ciudad: " + empleados[i].ciudad);
			String fecha = sc.nextLine();
			
			String [] fecha_array =  fecha.split("-",3);
			int dia = Integer.parseInt(fecha_array[0]);
			int mes = Integer.parseInt(fecha_array[1]);
			int ano = Integer.parseInt(fecha_array[2]);
			
			empleados[i].fecha_ingreso = LocalDate.of(ano,mes,dia);
			
			double salario_neto = empleados[i].salarioNeto();
			
			String info_empleado = "El empleado " + empleados[i].nombre + " " + empleados[i].apellido 
					+ " de " +  empleados[i].ciudad + " y edad " +  empleados[i].edad + " años, que ocupa el cargo de " 
					+  empleados[i].posicion + " desde su fecha de ingreso ("+ empleados[i].fecha_ingreso 
					+ "), recibe un salario bruto de " +  empleados[i].salario + " €, siendo su salario neto de " 
					+  salario_neto + " €. \n" ;
					
			bw.write(info_empleado);
		}
		
		
		bw.close();	
		sc.close();
		
	} catch(IOException e) {
		e.printStackTrace();
	}
	}
}
