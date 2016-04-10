package entities;

import java.awt.Graphics;
import java.util.ArrayList;

import hw4.Handler;

public class EntityManager {
	
	private Handler handler;
	private Player player;
	private ArrayList<Entity> entities;
	
	public EntityManager(Handler handler, Player player) {
		this.handler=handler;
		this.player=player;
		entities=new ArrayList<Entity>();
	}
	
	public void tick() {
		for (int i = 0; i <	entities.size(); i++) {
			Entity entity = entities.get(i);
			entity.tick();
		}
		player.tick();
	}
	
	public void render(Graphics graphics) {
		for(Entity entity: entities){
			entity.render(graphics);
		}
		player.render(graphics);
	}
	
	public void addEntity(Entity entity){
		entities.add(entity);
	}
	
	//getters and setters

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}
	
	
}
