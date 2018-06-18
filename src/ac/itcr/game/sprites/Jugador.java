package ac.itcr.game.sprites;

import org.newdawn.slick.Image;

public class Jugador extends Sprite {
	
	public Jugador(Image image, Integer position, Boolean activo) {
		super(image, position, activo);
		// TODO Auto-generated constructor stub
	}

	public Float aceleracion=1f;
	public static final Integer VELOCIDAD =200;
	public Integer vidas=3;
	public Float scale=2f;
	
	public int getSpeed() {
		// TODO Auto-generated method stub
		return (int) (VELOCIDAD*aceleracion);
	}
	
	public void collided(Jugador jugador) {
		if(checkCollision(jugador)) {
			aceleracion=jugador.aceleracion=0f;
			System.out.println("colision");
			
		}
	}



}
