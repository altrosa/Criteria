package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {

	private FileReader reader;

	public ApplianceReader(String fileName) throws FileNotFoundException {

		reader = new FileReader(fileName);

	}

	public List<String> read(String applianceType) throws IOException {

		if (applianceType == null) {
			return readAll();

		} else {

			return readWithType(applianceType);
		}

	}

	private List<String> readAll() throws IOException {

		List<String> apliances = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(reader)) {

			String app;

			while ((app = br.readLine()) != null) {
				apliances.add(app);
			}
		}

		return apliances;
	}

	private List<String> readWithType(String applianceType) throws IOException {

		List<String> apliances = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(reader)) {

			String app;

			while ((app = br.readLine()) != null) {

				if (app.contains(applianceType)) {
					apliances.add(app);
				}

			}
		}

		return apliances;
	}

}
