package com.rafalcurylo.ee8.jaxrs.client;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@XmlRootElement
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

    @XmlElement
    private String firstName;

    @XmlElement
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate birthday;

    @XmlElement
    @XmlJavaTypeAdapter(GenderAdapter.class)
    private Gender gender;

    private static class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
        public LocalDate unmarshal(String v) {
            return LocalDate.parse(v);
        }

        public String marshal(LocalDate v) {
            return v.toString();
        }
    }

    private static class GenderAdapter extends XmlAdapter<String, Gender> {
        public Gender unmarshal(String v) {
            return Gender.valueOf(v);
        }

        public String marshal(Gender v) {
            return v.toString();
        }
    }

    public enum Gender {

        MALE, FEMALE;

    }

}
