package ec.edu.edusmart.ai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/edusmart")
public class MarketingController {

    private final EduSmartAIService eduSmartAIService;

    public MarketingController(EduSmartAIService eduSmartAIService) {
        this.eduSmartAIService = eduSmartAIService;
    }

    @GetMapping("/publicidad")
    public String generarPublicidad(@RequestParam String tema, @RequestParam String audiencia) {
        return eduSmartAIService.generarPublicidad(tema, audiencia);
    }
}
