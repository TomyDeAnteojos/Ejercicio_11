package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Persona
{
    private String nombre;
    private String apellido;
    private Date nacimiento;
}
