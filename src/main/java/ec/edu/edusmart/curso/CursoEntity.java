package ec.edu.edusmart.curso;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_cursos_base")
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long idCurso;

    @Column(name = "nombre_curso", nullable = false, unique = true, length = 120)
    private String nombreCurso;

    @Column(name = "precio_usd", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioUsd;

    @Column(name = "horas_duracion", nullable = false)
    private Integer horasDuracion;

    protected CursoEntity() {
    }

    public CursoEntity(String nombreCurso, BigDecimal precioUsd, Integer horasDuracion) {
        this.nombreCurso = nombreCurso;
        this.precioUsd = precioUsd;
        this.horasDuracion = horasDuracion;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public BigDecimal getPrecioUsd() {
        return precioUsd;
    }

    public void setPrecioUsd(BigDecimal precioUsd) {
        this.precioUsd = precioUsd;
    }

    public Integer getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(Integer horasDuracion) {
        this.horasDuracion = horasDuracion;
    }
}
