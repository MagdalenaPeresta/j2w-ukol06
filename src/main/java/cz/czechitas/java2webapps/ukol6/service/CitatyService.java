package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitatyService {

    private final CitatyRepository repository;
    private final NahodneCisloService service;

    @Autowired
    public CitatyService(CitatyRepository repository, NahodneCisloService service) {
        this.service = service;
        this.repository = repository;
    }

 public String nahodnyCitat (CitatyRepository, NahodneCisloService) {
        String Citat = get
        return nahodnyCitat(CitatyRepository)




 }
}
   /* public ModelAndView nahodnyCitat() {
        int index = random.nextInt(seznamCitatu.size());
        ModelAndView modelAndView = new ModelAndView("citat");
        modelAndView.addObject("citat", seznamCitatu.get(index));
        return modelAndView;*/