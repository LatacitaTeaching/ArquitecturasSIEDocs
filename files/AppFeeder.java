package es.carsharing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import es.carsharing.domainModel.Conductor;
import es.carsharing.domainModel.Localizacion;
import es.carsharing.domainModel.PuntoConocido;
import es.carsharing.domainModel.Usuario;
import es.carsharing.domainModel.Viaje;
import es.carsharing.repositories.ConductorRepository;
import es.carsharing.repositories.UsuarioRepository;
import es.carsharing.repositories.ViajeRepository;

@Component
public class AppFeeder implements CommandLineRunner {
	
	@Autowired
	protected UsuarioRepository ur;
	@Autowired
	protected ViajeRepository vr;
	@Autowired
	protected ConductorRepository cr;

	
	@Override
	public void run(String... args) throws Exception {
		feedUsuarios();
		feedConductores();
		feedViajes();
		
		testViajeRepository();
		
		System.out.println("Application feeded");
	}

	private void feedUsuarios() {
		Usuario u1 = new Usuario("Paco","paco@carSharing.es");
		Usuario u2 = new Usuario("Lola","lola@carSharing.es");
		ur.save(u1);
		ur.save(u2);
	}
	
	private void feedConductores() {
		Conductor c = new Conductor("Travis","travisBickle@carsharing.es",17);
		ur.save(c);
	}

	private void feedViajes() {
		
		Conductor c = cr.findById("Travis").get();
		
		Localizacion l11 = new PuntoConocido("Santander","Facultad de Ciencias"); 
		Localizacion l12 = new PuntoConocido("Cadiz", "Playa de la Caleta");
		Localizacion l21 = new PuntoConocido("Cadiz", "Playa de la Caleta"); 
		Localizacion l22 = new PuntoConocido("Santander","Facultad de Ciencias");
		
		
		SimpleDateFormat dateParser = new SimpleDateFormat("dd-MM-yyyy");
		Date ida = null;
		Date vuelta = null;
		try {
			ida = dateParser.parse("01-04-2019");
			vuelta = dateParser.parse("07-04-2019");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Viaje v1 = new Viaje(l11,l12,c,ida,6000,8000,3);
		Viaje v2 = new Viaje(l21,l22,c,vuelta,6000,8000,3);
		
		vr.save(v1);
		vr.save(v2);
	}
	
	private void testViajeRepository() {
		
		SimpleDateFormat dateParser = new SimpleDateFormat("dd-MM-yyyy");
		Date sample = null;
		try {
			sample = dateParser.parse("01-01-2020");
		} catch (ParseException e) {
			System.out.println("Crujo parseando fecha");
			e.printStackTrace();
		}
		
		// Set<Viaje> viajes = vr.findByOrigenCiudadAndDestinoCiudad("Santander","Cadiz");
		Set<Viaje> viajes = vr.findByOrigenAndDestino("Santander","Cadiz");
		
		System.out.println("Viajes recuperados = " + viajes.size());
	
		for(Viaje v : viajes) {
			System.out.println("Viaje in " + v.getFecha());
		}
		
		viajes = vr.findByOrigen_CiudadAndFechaBeforeOrderByPrecio("Santander", sample);

		System.out.println("================================");
		
		System.out.println("Viajes recuperados = " + viajes.size());
		
		
//		Usuario paco = ur.findByEmail("paco@carSharing.es"); 
//		
//		System.out.println("Paco = " + paco.getNombre() + ":" + paco.getEmail());
//		
//		Set<Usuario> usuarios = ur.findByFechaAltaAfter(sample);
//		for(Usuario u : usuarios) {
//			System.out.println("Usuario " + u.getNombre() + ":" + u.getEmail());
//		}
		
	}

}
