package by.tc.task01.dao.impl;

import java.io.IOException;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {

		String fileName = "resources\\appliances_db.txt";

		ApplianceReader reader = new ApplianceReader(fileName);

		ApplianceMatcher matcher = new ApplianceMatcher();
		ApplianceFactory factory = new ApplianceFactory();

		List<String> strAppliancesData = null;
		List<Appliance> appliances = null;

		strAppliancesData = reader.read(criteria.getGroupSearchName());
		strAppliancesData = matcher.match(strAppliancesData, criteria);

		appliances = factory.create(strAppliancesData);

		return appliances;

	}

}