package com.jleal6458.aprendizajeAPIFront.models;

public class PsychologistDTO {
    private String professional;
    private String input;

    public PsychologistDTO(String professional, String input) {
        this.professional = professional;
        this.input = input;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
