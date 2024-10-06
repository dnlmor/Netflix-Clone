# Netflix-Clone

## Project Overview

This is a full-stack **Netflix Clone** application, where users can browse, search, and view details of movies fetched from a free movie API. The project is built using:
- **Java Spring Boot** for the backend, which handles API requests and communicates with an external movie database.
- **React.js** for the frontend, which provides a user-friendly interface for browsing and viewing movies.
- **Material UI** for styling the frontend.

**GitHub Flow** 
for managing collaborative development through git branches and pull requests.


### Purpose of the Project

The purpose of this project is twofold:
1. **To build a functional Netflix-like app**
    by integrating a backend that interacts with external movie APIs and a frontend that provides a responsive, well-styled user interface.
2. **To demonstrate the use of GitHub Flow**
    a streamlined branching strategy for feature development and collaboration. The application is built with two separate branches for the backend (`server`) and frontend (`client`), which will be merged into the `main` branch via pull requests.

The `main` branch starts off empty (except for this README file) and will be populated by merging the completed code from the `server` and `client` branches.


## Technologies Used

- **Backend (Server Branch)**: 
  - **Java Spring Boot**:
    A powerful framework for building the backend API that handles movie data requests.
  - **Maven**:
    For dependency management and building the Java project.
  - **OMDb API / The Movie Database API (TMDB)**:
    Free APIs used for retrieving movie information.

- **Frontend (Client Branch)**: 
  - **React.js**:
    A popular JavaScript library for building user interfaces.
  - **Material UI**:
    A React component library used to implement modern, responsive styling.
  - **Axios** (or **Fetch API**):
    For making HTTP requests from the frontend to the backend.

- **Version Control**: 
  - **Git**:
    For managing code versions and branch workflows.
  - **GitHub Flow**:
    A lightweight, branch-based workflow for feature development and collaboration, centered on creating feature branches, submitting pull requests, and continuous integration.


## Project Setup and Installation

Before setting up the project, ensure you have the following installed on your machine:

- **Java 11 or higher**: Required to run the backend (Spring Boot).
- **Node.js and npm**: Required for running the frontend (React.js).
- **Git**: For version control and branch management.

### Backend (Server Branch)


1. **Clone the repository** and switch to the `server` branch:

   git clone <repo-url>
   cd <repo-name>
   git checkout server

2. **Set up Maven dependencies**:

    - Open the project in your IDE and let Maven download all necessary dependencies (defined in the pom.xml file).
    - Add your API Key:
        Sign up for a free movie API key from OMDb API or The Movie Database API (TMDB).
        Add this API key to your application.properties file.
    - Run the backend:
        Start the Spring Boot application using your IDE or with the following Maven command:
    
        mvn spring-boot:run

    - The backend server will start at http://localhost:8080


3. **Frontend (Client Branch)**

To set up the frontend (React.js), follow these steps:

        - Clone the repository and switch to the client branch:

            git clone <repo-url>
            cd <repo-name>
            git checkout client

        - Install dependencies:

            npm install

        - Run the frontend:

            npm start

        - The frontend will be available at http://localhost:3000


# GitHub Flow Overview

This project follows the GitHub Flow development strategy, which encourages small, incremental updates and continuous integration through feature branches and pull requests. Here's an outline of the process:

- **Main Branch**:
    This branch starts off with only the README file. It will serve as the production branch and will be updated through pull requests from the server (backend) and client (frontend) branches.
- **Server Branch**:
    All backend development occurs in the server branch. Once the backend is ready, a pull request will be opened to merge it into the main branch.
- **Client Branch**:
    All frontend development occurs in the client branch. Once the frontend is complete, a pull request will be opened to merge it into the main branch.


# Steps to Follow GitHub Flow:


- Feature development:
    Developers work on separate feature branches (e.g., server for backend and client for frontend).
- Pull requests:
    Once development on a branch is complete, a pull request (PR) is opened to merge changes into the main branch.
- Code review:
    Collaborators review the PR, provide feedback, and once approved, the changes are merged into main.
- Deployment:
    The main branch is always deployable.


# Key Highlights in the README:

- **Project Overview**:
    Provides a high-level explanation of what the project is about.
- **GitHub Flow**:
    Emphasizes the use of GitHub Flow for collaborative development.
- **Setup and Installation**:
    Includes step-by-step instructions for setting up both the backend and frontend.
- **Contribution Guidelines**:
    Details how to contribute using GitHub and git commands.