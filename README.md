# design-pattern

-  WeatherDataSubject : as required its a main component from decorater desgin pattern that holds main data of weather and IEventManger interface that responsible for observervation and update.
- IEventManager interface  encapsulates the functionality of the Observer pattern and allows for the management of observers in a decoupled manner, adhering to the Single Responsibility Principle.
  
-  TemperatureUnitsDecorator: in this class i assume that the main unit is celsius and i bulid small logic for converting temp unit, where i put type of temp unit in enum to improve readability and create a class for each conversion process(c and f) that take a temp and what unit to convert to and return it (this whole logic to applied multiple principles single responsiblity,high cohesion ,premitivince and simplitcty for TemperatureUnitsDecorator) and this logic is supported with factory pattern to Decouple the TemperatureUnitsDecorator from creating objects and conversion logic.

-  in statiscs observer i decided to make a map from string (key) that refers to type of update and list that saves every update as value of key ,then have function to check if the values are numerical then it gets the avg and if its catagorical it gets the mode (most repeted value).

- another is functionality is as required in assigment .

![Alt Text](https://drive.google.com/file/d/1wfSqlk_YUhZfajDOrTj54P8N7JvLe7kN/preview)
