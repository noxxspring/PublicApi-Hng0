package com.example.PublicApi;

public class PublicApi {
    private String email;
    private String currentDateTime;
    private String githubUrl;

    public PublicApi(String email, String currentDateTime, String githubUrl){
        this.email = email;
        this.currentDateTime = currentDateTime;
        this.githubUrl = githubUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentDateTime() {
        return currentDateTime;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCurrentDateTime(String currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }
}
