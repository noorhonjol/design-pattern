
import Observers.CurrentConditionsDisplay;
import Observers.StatisticsDisplay;
import Subjects.Concrete.NormalWeatherData;
import Subjects.ConcreteDecorator.Converters.TemperatureUnit;
import Subjects.ConcreteDecorator.PrecipitationDecorator;
import Subjects.ConcreteDecorator.TemperatureUnitsDecorator;
import Subjects.ConcreteDecorator.WindSpeedDecorator;
import Subjects.EventManger.EventManger;

public class Main {
    public static void main(String[] args) {

        TemperatureUnitsDecorator t=new TemperatureUnitsDecorator(new NormalWeatherData(10.0, 10.2,new EventManger()));

        new CurrentConditionsDisplay(t);

        t.setUnitType(TemperatureUnit.FAHRENHEIT);

        t.setUnitType(TemperatureUnit.CELSIUS);


        PrecipitationDecorator pD=new PrecipitationDecorator(new NormalWeatherData(10.0, 10.2,new EventManger()),"rainy");

        new CurrentConditionsDisplay(pD);
        new StatisticsDisplay(pD);
        pD.setHumidity(1111.2);
        pD.setTemperature(30.3);

        pD.setTemperature(15.3);



        //System.out.println(t.getWindSpeed());



    }
}