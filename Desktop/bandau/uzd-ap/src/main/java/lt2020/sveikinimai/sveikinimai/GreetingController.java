package lt2020.sveikinimai.sveikinimai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lt2020.sveikinimai.sveikinimai.model.ControllerLayerGreeting;
import lt2020.sveikinimai.sveikinimai.model.ServiceLayerGreeting;
import lt2020.sveikinimai.sveikinimai.service.GreetingService;

@RestController
@RequestMapping(value = "/api/sveikinimai")
public class GreetingController {

	@Autowired
	private GreetingService gService;

	@RequestMapping(method = RequestMethod.GET)
	public List<ServiceLayerGreeting> getGreetings() {
		return gService.getGreetings();
	}

	@RequestMapping(method = RequestMethod.POST)
	public List<ServiceLayerGreeting> addSveikinimas(@RequestBody final ControllerLayerGreeting sveikinimas) {
		gService.addGreeting(
				new ServiceLayerGreeting(sveikinimas.getName(), sveikinimas.getText(), sveikinimas.getImage(),
						sveikinimas.getAudio(), sveikinimas.getType(), sveikinimas.getDate(), sveikinimas.getTime()));
		return gService.getGreetings();
	}

	@RequestMapping(path = "/{sveikinimoId}", method = RequestMethod.GET)
	public ServiceLayerGreeting getSingleGreeting(@PathVariable final Long sveikinimoId) {
		return gService.getSingleGreeting(sveikinimoId);
	}

	@RequestMapping(path = "/{sveikinimoId}", method = RequestMethod.DELETE)
	public void deleteGreeting(@PathVariable final Long sveikinimoId) {
		gService.deleteGreeting(sveikinimoId);
	}

	@RequestMapping(path = "/{sveikinimoId}", method = RequestMethod.PUT)
	public void updateSveikinimas(@PathVariable final Long sveikinimoId,
			@RequestBody final ControllerLayerGreeting sveikinimas) {
		gService.updateGreeting(new ServiceLayerGreeting(sveikinimoId, sveikinimas.getName(), sveikinimas.getText(),
				sveikinimas.getImage(), sveikinimas.getAudio(), sveikinimas.getType(), sveikinimas.getDate(),
				sveikinimas.getTime()));
	}

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String forTestPurposes() {
		return "Hello";
	}

}
