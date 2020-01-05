package com.avio.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airport {
    private Integer id;
    private String iata;
    private String name;
    private String country;
    private Boolean international;
    private String city;
    private String timeZoneName;
}
