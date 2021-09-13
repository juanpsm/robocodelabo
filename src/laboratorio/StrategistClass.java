package laboratorio;

public abstract class StrategistClass implements Strategist{
    protected static StrategistClass instance;
    public Labo17Robot robot;
    
    public StrategistClass() {}
    
    public StrategistClass(Labo17Robot robot) {
        this.robot = robot;
    }

//    public static StrategistClass getInstance(Labo17Robot robot) {
//        if (instance == null) {
//            instance = new StrategistClass(robot);
//        }
//        return instance;
//    }

	@Override
	public void calculateStrategy() {}
    
}
