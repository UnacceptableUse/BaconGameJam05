package org.bgj05.entity;

import org.bgj05.main.MainComponent;
import org.lwjgl.util.vector.Vector2f;

public class DynamicEntity implements IEntity {
	private Vector2f position;
	public Vector2f position() { return position; }
	public void setPosition(Vector2f ny) { position = ny; }
	
	private Vector2f velocity;
	public Vector2f velocity() { return velocity; }
	public void setVelocity(Vector2f ny) { velocity = ny; }
	public void addVelocity(Vector2f ny) { 
		this.velocity.x += ny.x; 
		this.velocity.y += ny.y;
	}
	
	private String textureName;
	public String textureName() { return textureName; }
	
	public DynamicEntity(String texture_name, Vector2f pos, Vector2f init_vel) {
		this.textureName = texture_name;
		this.position = pos;
		this.velocity = init_vel;
	}
	
	public void render() {
		MainComponent.content().getTexture(textureName).render(position);
	}

	public void update() { 
		position.x += velocity.x;
		position.y += velocity.y;
	}
}