package Concrete;


import Abstract.ICampaignManager;
import Entities.Campaign;

public class CampaignManager implements ICampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlı kampanya eklendi.");
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlı kampanyanın bilgileri güncellendi.");
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlı kampanya silindi.");
	}
}
