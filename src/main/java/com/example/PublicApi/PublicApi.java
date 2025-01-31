package com.example.PublicApi;

public class PublicApi {
    private String email;
    private String current_datetime;
    private String githubUrl;

    public PublicApi(String email, String current_datetime, String githubUrl){
        this.email = email;
        this.current_datetime = current_datetime;
        this.githubUrl = githubUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrent_datetime() {
        return current_datetime;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCurrent_datetime(String current_datetime) {
        this.current_datetime = current_datetime;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }
}
