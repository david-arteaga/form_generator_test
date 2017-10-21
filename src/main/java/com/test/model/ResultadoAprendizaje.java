package com.test.model;

import com.form_generator.annotation.FormEntity;
import com.form_generator.annotation.FormHidden;

@FormEntity(generateForm = false)
public class ResultadoAprendizaje {
    @FormHidden Long id;
    String nombre;
    String descripcion;
}
