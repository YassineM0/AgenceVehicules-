# Vehicle Management for an Agency

## Description

This project aims to assist an agency in managing the list of vehicles it owns. The agency has various types of vehicles, including cars, vans, and minibusses. Each vehicle is identified by its reference, brand, model, and color. Vans have specific characteristics such as the maximum load, while minibusses are characterized by the number of seats.

## Implementation of Classes

Different classes are defined using interfaces, abstract classes, encapsulation, and inheritance to ensure a well-organized and reusable structure.

## Vehicle Collection

A test class is set up to create a collection of vehicles and test various functionalities.

## CRUD Operations

The test class contains methods to perform CRUD operations (Create, Read, Update, Delete) on the list of vehicles.

## Administration Menu

The main method of the test class displays an interactive menu allowing the administrator to manage the agency. The menu includes options such as:

- Display the list of available vehicles.
- Display the list of vehicles of a specific category.
- Display all vehicles of a given color.
- Display all vehicles of a given brand.
- Display all vehicles of a given model.
- Sell a vehicle.
- Add a new vehicle.

## Execution and Testing

Execute and test the test class to ensure the proper functioning of the implemented features.

## Alternative Implementation

Repeat the process by storing cars in a HashSet and vans and minibusses in two TreeSets. Additionally, declare two comparators for each TreeSet to ensure ascending order based on the load for vans and the number of seats for minibusses.

## Technologies

Java - Swing - mySQL
