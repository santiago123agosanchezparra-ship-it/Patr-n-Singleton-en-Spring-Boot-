@RestController

public class EstadisticasController {

    private final EstadisticasService estadisticas;

    public EstadisticasController(EstadisticasService estadisticas){
        this.estadisticas = estadisticas;
    }

    @GetMapping("/estadisticas")

    public String mostrar(){

        return "Aprendices: "
                + estadisticas.getTotalAprendices()
                + "\nInstructores: "
                + estadisticas.getTotalInstructores()
                + "\nProgramas: "
                + estadisticas.getTotalProgramas()
                + "\nTotal: "
                + estadisticas.getTotalGeneral();

    }

}