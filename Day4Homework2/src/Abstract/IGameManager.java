package Abstract;

import Entities.Game;

public interface IGameManager {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void addMultiple(Game...games);
	void updateMultiple(Game...games);
	void deleteMultiple(Game...games);
}
