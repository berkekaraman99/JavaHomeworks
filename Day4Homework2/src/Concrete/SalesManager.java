package Concrete;

import Abstract.ISalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements ISalesManager {
	 
	public void sale(Customer customer, Game game) {
		System.out.println(customer.getFirstName() + " adlı kullanıcı " + game.getGameName() + " adlı oyunu satın aldı.");
	}
	
	public void saleWithCampaign(Customer customer, Game game, Campaign campaign) {
		System.out.println(customer.getFirstName() + " adlı kullanıcı " + campaign.getCampaignName() + 
				" adlı kampanyadan yararlanarak " + game.getGameName() + " adlı oyunu satın aldı.");
	}
}
