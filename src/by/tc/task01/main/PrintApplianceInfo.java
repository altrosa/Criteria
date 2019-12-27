package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliances) {

		for (int i = 0; i < appliances.size(); i++) {
			if (appliances.get(i) != null) {
				System.out.println(appliances.get(i).toString());
			} 
		}
		System.out.println();
	}
}
