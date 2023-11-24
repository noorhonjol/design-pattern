package Observers;

import Subjects.Component.WeatherDataSubject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StatisticsDisplay implements WeatherDataObserver {

    private final HashMap<String, ArrayList<String>> statisticsData;
    public StatisticsDisplay(WeatherDataSubject subject) {

        subject.getEventManger().addObserver(this);
        statisticsData = new HashMap<>();

    }
    @Override
    public void update(String val, String type) {
        statisticsData.computeIfAbsent(type, k -> new ArrayList<>()).add(val);
        displayStatistics();
    }

    private String handleNonNumericalValue(ArrayList<String> values ) {

        HashMap<String, Integer> occurrences = new HashMap<>();
        for (String value : values) {
            occurrences.put(value, occurrences.getOrDefault(value, 0) + 1);
        }
        String mostRepeatedValue = "";
        int maxOccurrences = 0;

        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > maxOccurrences) {
                mostRepeatedValue = entry.getKey();
                maxOccurrences = entry.getValue();
            }
        }
        return mostRepeatedValue;
    }

    private boolean isNumerical(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private void displayStatistics() {

        System.out.println("Weather Statistics:");

        for (String type : statisticsData.keySet()) {

            ArrayList<String> values = statisticsData.get(type);

            if(isNumerical(values.get(0))){
                System.out.println("the avg of "+type + calculateAvg(values));

            }else{
                System.out.println("the mode of "+type +  handleNonNumericalValue(values));
            }
        }
        System.out.println();
    }
    private double calculateAvg(ArrayList<String> values) {
        if (values.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (String val : values) {
            sum += Double.parseDouble(val);
        }
        return sum / values.size();
    }
}
