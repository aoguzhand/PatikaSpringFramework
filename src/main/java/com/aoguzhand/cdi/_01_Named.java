package com.aoguzhand.cdi;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

//Lombok

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

// CDI Bean
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named {
    private Long namedId;
    private String namedData = "Merhaba Named Cdi Bean";
}
