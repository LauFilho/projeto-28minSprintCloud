package com.in28minutes.rest.webservices.restfulwebservices.user;

import lombok.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
public class User {

    private Integer id;
    @Size(min = 3)
    private String name;
    @Past
    private Date birthDate;

}
