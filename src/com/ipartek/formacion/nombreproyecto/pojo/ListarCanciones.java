package com.ipartek.formacion.nombreproyecto.pojo;

public class ListarCanciones {

	public static void main(String[] args) {
		
		Cancion direStraitLocalHero = new Cancion ( "Local Hero", "Dire Strait" );
		direStraitLocalHero.setAlbum("Local Hero");
		direStraitLocalHero.setGenero("Rock");
		direStraitLocalHero.setDuracion("3:24");
		direStraitLocalHero.setAnio(1985);
		System.out.println(direStraitLocalHero);
		
		
		Cancion direStraitSultanOfSwing = new Cancion ( "Sultans of Swing", "Dire Strait" );
		direStraitSultanOfSwing.setAlbum("Dire Straits");
		direStraitSultanOfSwing.setGenero("Rock");
		direStraitSultanOfSwing.setDuracion("4:04");
		direStraitSultanOfSwing.setAnio(1978);
		System.out.println(direStraitSultanOfSwing);
		
 
	}

}
