import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;



import org.json.*;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pokemon;
		System.out.println("Elige un pokemon: ");
		pokemon=sc.next();
		sc.close();

		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://pokeapi.co/api/v2/pokemon/"+pokemon);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect(); //Establece la conexion.
			int tiempoDeRespuesta = con.getResponseCode();
			if (tiempoDeRespuesta != 200)
			{
				throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);			
			}
			else
			{
				StringBuilder informacion = new StringBuilder();
				Scanner sc2 = new Scanner(url.openStream());
				while (sc2.hasNext())
				{
					informacion.append(sc2.nextLine());
				}
				sc2.close();
				
				
				String json = informacion.toString();
				//split
				String separados = (json.split("\"species\":",2))[1];
				String species = (separados.split(",\"sprites\":",2))[0];
				JSONObject species_json = new JSONObject(species);
				String name_specie = species_json.getString("name");
				
				String separados_2 = (json.split("\"type\":",2))[1];
				String tipo = (separados_2.split("}],\"weight\":",2))[0];
				JSONObject tipo_json = new JSONObject(tipo);
				String name_type = tipo_json.getString("name");
				
				String weight_llave = (json.split("}],\"weight\":",2))[1];
				String weight = weight_llave.substring(0,weight_llave.length()-1);
				
				String salida="Pokemon elegido: "+ pokemon +", name_species: "+  name_specie + ", name_type: "+ name_type + ", weight: "+weight;
				System.out.println(salida);
				try (
						PrintWriter writer = new PrintWriter(new FileWriter("datos_pokemon.txt")))
					{
						writer.write(salida);
						System.out.println("Se genero el fichero con datos del pokemon "+pokemon);
					} 
					
					catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}	
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
	}

}
//JSONObject data = new JSONObject(json);
				//System.out.println(data);
					/*
				String species_llaves = data.get("species");
				System.out.println(species_llaves);
			
				JSONObject species = new JSONObject(species_llaves);
				String name_specie = species.get("name");
				
				
				String types_corchetes = data.get("types");
				String types_llaves = types_corchetes.substring(1,types_corchetes.length()-1);
				JSONObject types = new JSONObject(types_llaves);
				String type = types.get("type");
				JSONObject type_json = new JSONObject(type);
				String name_type = type_json.get("name");
				
				String weight = data.getString("weight");
				*/