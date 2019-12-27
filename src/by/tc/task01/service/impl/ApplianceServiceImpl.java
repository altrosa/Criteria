package by.tc.task01.service.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) {

		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();

		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances = new ArrayList<Appliance>();

		try {

			appliances = applianceDAO.find(criteria);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return appliances;
	}
}