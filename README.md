# WatchService API

## Overview

<div>
     <p>
        Watch is a microservice built to handle watches for movies. 
        It allows users to add a movie to their watch list, retrieve, and manage watchlist for movies. 
        The API is containerized using Docker, 
        and PostgreSQL is used as the database.
    </p>
</div>

## Prerequisites

Before you can run and test this service, make sure you have the following installed on your machine:

- [Docker desktop](https://www.docker.com/products/docker-desktop/)
- Basic knowledge of docker commands

## Instructions to Set Up and Run the Project

### 1. Clone the Repository

<p>First, clone this repository to your local machine:</p>

<p>
    <img src="./step1.png" alt="step1"/>
</p>

### 2. Run the Service Using Docker

<p>
    Once inside the project directory, 
    start the Docker container that runs the service by using the following command:<br>
    <img src="./step2.png" alt="step2"/>
</p>

<p>
    This command will:
</p>

- Build the Docker image for the API
- Set up the PostgreSQL database in a separate container
- Run Flyway migrations to create necessary tables (e.g., the review table)

### 3. Access the API via its documentation

<p>
    Detailed API documentation is available via Swagger once the service is up. 
    Navigate to the following Link to view the API docs:
    <a href="http://127.0.0.1:8082/swagger-ui/index.html">Api documentation</a>
</p>

### 4. Stop the containers

<p>
    To stop the running Docker containers, 
    run the following command:
    <img src="./img.png" alt="command">
</p>

### 5. View Logs

<p>To view logs from the running containers:
    <img src="./img_1.png" alt="log">
</p>
