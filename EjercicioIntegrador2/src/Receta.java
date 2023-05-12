import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Receta extends Ingrediente implements iCalculos {
	
	String nombre;
	
	int num_ingredientes;
	
	String tipo_comida;
	
	Ingrediente[] ingredientes;
	

	@Override
	public int calorias() {
		// TODO Auto-generated method stub
		return num_ingredientes;
	}

	@Override
	public int tiempoCoccion() {
		// TODO Auto-generated method stub
		return num_ingredientes*3;
	}
	
	public static void main(String[] args) {
		Receta [] recetas;
		String mensaje = "";
		try {
			
			Scanner sc = new Scanner(new File("C:\\Users\\mmartinezal\\git\\cursoJava\\EjercicioIntegrador2\\Receta.txt"));
			int num_recetas=Integer.parseInt(((sc.nextLine()).split(" ",2))[0]);
			recetas = new Receta[num_recetas];
			for(int i=0;i<num_recetas;i++) {
				if(i>0)sc.nextLine();
				recetas[i] = new Receta();
				recetas[i].nombre = ((sc.nextLine()).split(": ",2))[1];
				recetas[i].tipo_comida = ((sc.nextLine()).split(": ",2))[1];
				recetas[i].num_ingredientes = Integer.parseInt(((sc.nextLine()).split(" ",2))[0]);
				recetas[i].ingredientes = new Ingrediente[recetas[i].num_ingredientes];
				
				for(int j=0; j<recetas[i].num_ingredientes;j++)
				{
					String ingrediente1 = sc.nextLine();
					String[] arrayIngredientes = ingrediente1.split("|",3);
					(recetas[i].ingredientes)[j] = new Ingrediente();
					(recetas[i].ingredientes)[j].nombre = arrayIngredientes[0];
					(recetas[i].ingredientes)[j].medida = arrayIngredientes[1];
					(recetas[i].ingredientes)[j].cantidad = arrayIngredientes[2];
					

				}
				mensaje += "Receta "+ (i+1)+"--> nombre: " + recetas[i].nombre 
						+", tipo de comida: "+recetas[i].tipo_comida
						+", numero de ingredientes: "+recetas[i].num_ingredientes
						+", calorias: "+ recetas[i].calorias()
						+" cal y tiempo de coccion: " +recetas[i].tiempoCoccion() +" min\n";
				
			}
			
		sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String contenidoJenkinsFile = 
				"pipeline {\n" +
                        "    agent any\n" +
                        "    stages {\n" +
                        "        stage('Recetas') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    println '"+ mensaje +"'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "    }\n" +
                        "}";
										  	

		try (
			PrintWriter writer = new PrintWriter(new FileWriter("Jenkinsfile")))
		{
			writer.write(contenidoJenkinsFile);
			System.out.println("Se genero el Jenkinsfile");
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//calorias: por cada ingrediente sumamos 3 calorias
		//tiempo de coccion: por cada ingrediente se le suma 1 min de coccion
	}

	

}
