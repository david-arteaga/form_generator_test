package com.test.model;

import com.form_generator.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by david on 6/18/17.
 */

@FormEntity
public class Competencia {
    @FormHidden Long id;
    String nombre;
    String descripcion;
    List<ResultadoAprendizaje> resultadosAprendizaje;
}