# PublicApi-Hng0
# Public API for Basic Information
This project is a simple public API built using Springboot framework that returns basic information, including the registered email address, the current UTC datetime in ISO 8601 format, and the GitHub URL of the project's codebase. The API is designed to be accessible to the public and deployed to a publicly accessible endpoint.

# API Endpoint
GET /api
The API exposes a single GET endpoint to retrieve the following details in JSON format:

the registered email address.
The current datetime in ISO 8601 format (UTC).
The GitHub URL of the project’s repository.


# Setup Instructions
# Prerequisites
# Ensure you have the following installed:

Springboot reamework
maven for your package manager
Git (for cloning the repository)

# Running the Project Locally
Clone the repository:
Navigate to the project directory:
Install dependencies
Start the server:
The server should now be running locally. You can test the API by navigating to http://localhost:( whatever port your application is running on).

# API Documentation
Endpoint
URL: GET /api
Response Format: JSON
Example Request
To test the API, simply visit the endpoint using your browser, or any API client (e.g., Postman).

# Response
Status: 200 OK
Content-Type: application/json
Example Response Body
json
Copy
{
  "email": "your-email@example.com",
  "current_datetime": "2025-01-30T09:30:00Z",
  "github_url": "https://github.com/yourusername/your-repo"
}
# CORS Handling
The API is configured to handle Cross-Origin Resource Sharing (CORS) appropriately to ensure that requests from any origin are allowed.

# CORS Configuration
The API supports all origins by default. However, you can customize CORS settings as per your requirement, such as limiting allowed origins, methods, etc.
Version Control
This project is hosted on GitHub:
GitHub Repository: https://github.com/noxxspring/PublicApi-Hng0

# Backlinks
You may find relevant resources for developers folowing this link:
https://hng.tech/hire/java-developers

# Code Quality
The project follows a clean and organized code structure.
The API is designed to return the required information with appropriate HTTP status codes.
The code is modular, and each component has been written with readability and maintainability in mind.

# License
This project is licensed under the MIT License - see the LICENSE file for details.
