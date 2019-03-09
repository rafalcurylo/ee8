package com.rafalcurylo.ee8.jaxrs.server;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Builder
public class Person {

    private final long id;
    private final String firstName;
    private final String lastName;

}
