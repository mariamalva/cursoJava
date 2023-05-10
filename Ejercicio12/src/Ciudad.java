import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ciudad implements iCalculoPoblacion{
		
	String nombre = "";
	double poblacionParcial = 0;
	
	public Ciudad(String nombre, double poblacionParcial) {
		this.nombre = nombre;
		this.poblacionParcial = poblacionParcial;
	}
	
	public double poblacionFinal(double poblacionParcial) {
		return poblacionParcial*0.8;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ciudad bcn = new Ciudad("Barcelona", 100000);
		Ciudad mad = new Ciudad("Madrid",  1000000);
		Ciudad mlg = new Ciudad("Malaga", 50000);	
		Ciudad sev = new Ciudad("Sevilla",  80000);
				
		String contenidoJenkinsFile = 
				"pipeline {\n" +
                        "    agent any\n" +
                        "    stages {\n" +
                        "        stage('"+bcn.nombre+"') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    println 'La ciudad de "+ bcn.nombre +" tiene una poblacion final de "+bcn.poblacionFinal(bcn.poblacionParcial)+" habitantes'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "        stage('"+mad.nombre+"') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    println 'La ciudad de "+ mad.nombre +" tiene una poblacion final de "+mad.poblacionFinal(mad.poblacionParcial)+" habitantes'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "        stage('"+mlg.nombre+"') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    println 'La ciudad de "+ mlg.nombre +" tiene una poblacion final de "+mlg.poblacionFinal(mlg.poblacionParcial)+" habitantes'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "        stage('"+sev.nombre+"') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    println 'La ciudad de "+ sev.nombre +" tiene una poblacion final de "+sev.poblacionFinal(sev.poblacionParcial)+" habitantes'\n" +
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
		
		
	}

}
