package com.rafalcurylo.ee8.jaxrs.client;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Getter
@Setter
public class Person {

    private String firstName;

}
