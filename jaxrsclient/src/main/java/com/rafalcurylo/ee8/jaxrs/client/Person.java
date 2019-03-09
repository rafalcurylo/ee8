package com.rafalcurylo.ee8.jaxrs.client;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@Getter
@Setter

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

    @XmlElement
    private String firstName;

}
