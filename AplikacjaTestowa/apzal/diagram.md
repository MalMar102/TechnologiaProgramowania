```mermaid
classDiagram
    class Car {
        -String registrationNumber
        -String brand
        +Car(registrationNumber, brand)
        +String getInfo()
    }
    
    class Rental {
        -List~Car~ cars
        -int ZlaZmienna
        +addCar(Car car)
        +List~Car~ getCars()
    }
    
    class App {
        +start(Stage stage)
        +main(String[] args)
    }
    
    Rental "1" *-- "many" Car : contains
    App ..> Rental : uses