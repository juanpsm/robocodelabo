package laboratorio;

public abstract class AbstractStrategy implements Strategy {
	
	Labo17Robot robot;
	
	public AbstractStrategy(Labo17Robot labo17Robot) {
		robot = labo17Robot;
	}
}
