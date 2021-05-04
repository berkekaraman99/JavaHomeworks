package Entities;

public class Campaign {
	
	private int id;
	private String campaignName;
	private String description;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String campaignName, String description) {
		this.id = id;
		this.campaignName = campaignName;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
