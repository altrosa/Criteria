package by.tc.task01.entity;

public class Speakers extends Appliance {

	private int powerConsumption;
	private int numberOfSpeakers;
	private String fregquencyRange;
	private int cordLength;

	public Speakers() {

	}

	public Speakers(int powerConsumption, int numberOfSpeakers, String fregquencyRange, int cordLength) {

		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.fregquencyRange = fregquencyRange;
		this.cordLength = cordLength;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFregquencyRange() {
		return fregquencyRange;
	}

	public void setFregquencyRange(String fregquencyRange) {
		this.fregquencyRange = fregquencyRange;
	}

	public int getCordLength() {
		return cordLength;
	}

	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cordLength;
		result = prime * result + ((fregquencyRange == null) ? 0 : fregquencyRange.hashCode());
		result = prime * result + numberOfSpeakers;
		result = prime * result + powerConsumption;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers other = (Speakers) obj;
		if (cordLength != other.cordLength)
			return false;
		if (fregquencyRange == null) {
			if (other.fregquencyRange != null)
				return false;
		} else if (!fregquencyRange.equals(other.fregquencyRange))
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", fregquencyRange=" + fregquencyRange + ", cordLength=" + cordLength + "]";
	}

}
