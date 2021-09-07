package laboratorio;

public abstract class StrategyClass implements Strategy {
	
	Labo17Robot robot;
	
	public StrategyClass(Labo17Robot labo17Robot) {
		robot = labo17Robot;
	}
}
