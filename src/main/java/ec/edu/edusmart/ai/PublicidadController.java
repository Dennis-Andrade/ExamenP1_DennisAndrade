package ec.edu.edusmart.ai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/edusmart")
public class PublicidadController {

    private final EduSmartAIService eduSmartAIService;

    public PublicidadController(EduSmartAIService eduSmartAIService) {
        this.eduSmartAIService = eduSmartAIService;
    }

    @GetMapping("/publicidad")
    public String generarPublicidad(@RequestParam String nombreCurso, @RequestParam String publicoObjetivo) {
        return eduSmartAIService.generarPublicidad(nombreCurso, publicoObjetivo);
    }
}
