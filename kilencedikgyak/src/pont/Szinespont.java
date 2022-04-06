package pont;

import java.awt.Color;

import szinezheto.ISzinezheto;

public class Szinespont extends Pont implements ISzinezheto {

	private Color szin;
	
	public Szinespont() {
		super(0, 0);
		this.szin = ISzinezheto.alapertelmezettszin;
	}

	public Szinespont(int x, int y) {
		super(x, y);
	}

	@Override
	public Color getColor() {
		return szin;
	}

	@Override
	public void setColor(Color szin) {
		this.szin = szin;
	}
	

	
	
}
