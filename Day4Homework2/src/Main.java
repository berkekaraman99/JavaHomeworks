import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer();
		customer1.setFirstName("Ahmet Berke");
		customer1.setLastName("Karaman");
		customer1.setId(1);
		customer1.setDateofBirth(LocalDate.of(1999, 11, 1));
		customer1.setNationalityId("10001202174");
		
		customerManager.add(customer1);
		customerManager.update(customer1);
		
		Customer customer2 = new Customer();
		customer2.setFirstName("Yusuf");
		customer2.setLastName("Yazıcı");
		customer2.setId(2);
		customer2.setDateofBirth(LocalDate.of(2000, 5, 12));
		customer2.setNationalityId("12504935923");
		
		customerManager.add(customer2);
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(1, "Minecraft", 85);
		Game game2 = new Game(2, "Among Us", 14);
		Game game3 = new Game(3, "Phasmophobia", 29);
		
		gameManager.addMultiple(game1, game2, game3);
		gameManager.updateMultiple(game1, game2, game3);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Bahar Kampanyası", "Tüm ürünlerde %10 indirim");
		
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sale(customer1, game2);
		salesManager.saleWithCampaign(customer1, game1, campaign);
	}

}
