# Job Seeker Management System

The Job Seeker Management System is a Java Spring Boot application designed to manage information related to job seekers. It allows users to register new job seekers and retrieve details of existing job seekers by their unique identifiers.

## Features

- **Registration of Job Seekers**: Users can register new job seekers by providing their details such as name, city, image, and text file.
- **Retrieval of Job Seeker Details**: Users can retrieve details of registered job seekers by providing their unique identifiers (IDs).
- **Persistence**: Job seeker data is persisted in a database, allowing for long-term storage and retrieval of information.

## Components

- **JobSeekerAppApplication**: Main class responsible for initializing the Spring Boot application and starting the application context.
- **JobSeekerInfo**: Entity class representing the attributes and behavior of a job seeker.
- **IJobSeekerDao**: Data access interface defining CRUD operations for job seekers.
- **JobSeekerImpl**: Service class providing business logic for registering and retrieving job seekers.
- **IJobSeekerService**: Service interface defining methods for registering and retrieving job seekers.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (in-memory database for development purposes)
- Maven

## Getting Started

1. Clone the repository to your local machine.
2. Ensure you have Java and Maven installed.
3. Configure your IDE (e.g., IntelliJ IDEA, Eclipse) to recognize the project as a Maven project.
4. Run the `JobSeekerAppApplication` class to start the Spring Boot application.
5. Access the application through the provided endpoints for registration and retrieval of job seeker details.

## Contributors

- [Naveen Kumar]
