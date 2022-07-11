package pe.gob.osinergmin.grh.sgsv.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceBase")
public class ServiceBase {

	@Autowired
	protected ModelMapper modelMapper;

}
