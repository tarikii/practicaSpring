package com.example.practicaSpring;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record InstalacionsDades(int anys, int camps_poliesportius, int espais_d_atletisme, int piscines_a_l_aire_lliure, int piscines_cobertes, int pistes_poliesportives, int pavellons, int pistes_de_tennis, int pistes_de_p_del, int sales_esportives, int pistes_d_esquaix, int frontons, int espais_de_petanca, int altres_espais_esportius, int rees_d_activitat_esportiva, int total_espais_censats, int instal_lacions) {
}
