package lt2020.sveikinimai.sveikinimai.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt2020.sveikinimai.sveikinimai.dao.DBGreetingDAO;
import lt2020.sveikinimai.sveikinimai.model.Greeting;
import lt2020.sveikinimai.sveikinimai.model.ServiceLayerGreeting;

@Service
public class GreetingService {

	@Autowired
	private DBGreetingDAO greetingDao;

	@Transactional
	public List<ServiceLayerGreeting> getGreetings() {
		return greetingDao.findAll().stream()
				.map(sveikinimas -> new ServiceLayerGreeting(sveikinimas.getId(), sveikinimas.getName(),
						sveikinimas.getText(), sveikinimas.getImage(), sveikinimas.getAudio(), sveikinimas.getType(),
						sveikinimas.getDate(), sveikinimas.getTime()))
				.collect(Collectors.toList());
	}

	@Transactional
	public void addGreeting(ServiceLayerGreeting sveikinimas) {
		greetingDao.save(new Greeting(sveikinimas.getName(), sveikinimas.getText(), sveikinimas.getImage(),
				sveikinimas.getAudio(), sveikinimas.getType(), sveikinimas.getDate(), sveikinimas.getTime()));
	}

	@Transactional
	public ServiceLayerGreeting getSingleGreeting(Long id) {
		var sveikinimas = greetingDao.findById(id).orElse(null);
		return new ServiceLayerGreeting(sveikinimas.getId(), sveikinimas.getName(), sveikinimas.getText(),
				sveikinimas.getImage(), sveikinimas.getAudio(), sveikinimas.getType(), sveikinimas.getDate(),
				sveikinimas.getTime());
	}

	@Transactional
	public void updateGreeting(ServiceLayerGreeting sveikinimas) {
		var updatedSveikinimas = greetingDao.findById(sveikinimas.getId()).orElse(null);
		updatedSveikinimas.setName(sveikinimas.getName());
		updatedSveikinimas.setText(sveikinimas.getText());
		updatedSveikinimas.setImage(sveikinimas.getImage());
		updatedSveikinimas.setAudio(sveikinimas.getAudio());
		updatedSveikinimas.setType(sveikinimas.getType());
		updatedSveikinimas.setDate(sveikinimas.getDate());
		updatedSveikinimas.setTime(sveikinimas.getTime());

		greetingDao.save(updatedSveikinimas);
	}

	@Transactional
	public void deleteGreeting(Long id) {
		greetingDao.deleteById(id);
	}

}
