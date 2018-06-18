package ac.itcr.game.sprites;

import org.newdawn.slick.Image;

public class Vida extends Sprite implements Poder {

	public Vida(Image image, Integer position, Boolean activo) {
		super(image, position,activo);
		
	}

	@Override
	public void implementar(Jugador objetivo) {
		objetivo.vidas++;
		
	}

}
