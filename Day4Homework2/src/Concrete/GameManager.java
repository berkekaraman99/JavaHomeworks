package Concrete;

import Abstract.IGameManager;
import Entities.Game;

public class GameManager implements IGameManager {
	
	public void add(Game game) {
		System.out.println(game.getGameName() + " adlı oyun eklendi.");
	}
	
	public void update(Game game) {
		System.out.println(game.getGameName() + " adlı oyunun bilgileri güncellendi.");
	}
	
	public void delete(Game game) {
		System.out.println(game.getGameName() + " adlı oyun silindi.");
	}
	
	//Çoklu oyun ekleme, güncelleme ve silme
	public void addMultiple(Game...games) {
		for(Game game : games) {
			System.out.println(game.getGameName() + " adlı oyun eklendi.");
		}
	}
	
	public void updateMultiple(Game...games) {
		for(Game game : games) {
			System.out.println(game.getGameName() + " adlı oyunun bilgileri güncellendi.");
		}
	}
	
	public void deleteMultiple(Game...games) {
		for(Game game : games) {
			System.out.println(game.getGameName() + " adlı oyun silindi.");
		}
	}
}
