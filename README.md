# IMAD5112_Practicum

Comprehensive Report: Weather app
1. Introduction
Purpose of the App

The Weather app is designed to help the organisation manage, monitor and optimize weekly weather conditions. By providing detailed results for each day, the app calculates the avarage temperature then shows the weather conditions (eg: Sunny, Raining or Cold). 

Pseudocode:

Splash screen

START
  DISPLAY logo
  DISPLAY app name
  DISPLAY your name
  DISPLAY student number
  DISPLAY "Go to Main Screen" button
  DISPLAY "Exit" button

  IF "Go to Main Screen" button is clicked THEN
    NAVIGATE to Main Screen
  ENDIF

  IF "Exit" button is clicked THEN
    EXIT app
  ENDIF
Stop

Main screen

START
  DECLARE array temperatures[7]
  DECLARE array conditions[7]
  INITIALIZE temperatures with sample data
  INITIALIZE conditions with sample data

  DISPLAY "Average Temperature: " + calculateAverageTemp() + "°C"
  DISPLAY "View Details" button
  DISPLAY "Exit" button

  IF "View Details" button is clicked THEN
    NAVIGATE to Detailed View Screen
  ENDIF

  IF "Exit" button is clicked THEN
    EXIT app
  ENDIF

  FUNCTION calculateAverageTemp()
    DECLARE sum = 0
    DECLARE count = 0
    FOR EACH temperature IN temperatures
      IF temperature != 0 THEN
        sum = sum + temperature
        count = count + 1
      ENDIF
    ENDFOR
    RETURN sum / count
  ENDFUNCTION
Stop

Detailed view

START
  DECLARE array temperatures[7]
  DECLARE array conditions[7]
  INITIALIZE temperatures with sample data
  INITIALIZE conditions with sample data

  DISPLAY getDayDetails()
  DISPLAY "Back to Main Screen" button

  IF "Back to Main Screen" button is clicked THEN
    NAVIGATE to Main Screen
  ENDIF

  FUNCTION getDayDetails()
    DECLARE array days[7] = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    DECLARE details = ""
    FOR i = 0 TO 6
      details = details + days[i] + ": Min " + temperatures[i] + "°C, Max " + temperatures[i] + "°C, Condition: " + conditions[i] + "\n"
    ENDFOR
    RETURN details
  ENDFUNCTION
Stop


