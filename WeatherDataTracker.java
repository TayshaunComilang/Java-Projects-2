//Comilang, Tayshaun M.
//CITCS 1N-A

package com.mycompany.weatherdatatracker;
public class WeatherDataTracker {

    public static void main(String[] args) {
        
        double averageTemperature;
        int highestTemperature;
        
        //Initialize the temperature in 3 cities for 7 days
        int[][] temperatureData = {
                                  {25, 27, 22, 28, 30, 26, 24}, //City 1 temperatures
                                  {18, 20, 21, 19, 23, 22, 20}, //City 2 temperatures
                                  {30, 32, 31, 35, 34, 33, 36}  //City 3 temperatures
        };
        
        // Process each city's data and print result
        for (int i = 0; i < temperatureData.length; i++) {
            String cityName = "City " + (i + 1);
            averageTemperature = calculateAverage(temperatureData[i]);
            highestTemperature = findHighest(temperatureData[i]);
            
            //Display the results
            System.out.println(cityName + ": ");
            System.out.printf(" Average Temperature: %.2f°C\n", averageTemperature);
            System.out.println(" Highest Temperature: " + highestTemperature + "°C");
            System.out.println("-".repeat(30));
        }  
    }
    
    //Calculate the avergae temperature for a city
    public static double calculateAverage(int[]temps) {
        int sum = 0;
        for (int temp : temps) {
            sum += temp;
        }
        return (double) sum / temps.length;
    }
    
    //Find the highest temperature recorded for a city
    public static int findHighest(int[] temps) {
        int highest = temps[0];
        for (int temp : temps) {
            if (temp > highest) {
                highest = temp;
            }
        }
        return highest;
    }
}
