/*
 * All rights by DomeDD
 * You are allowed to modify this code
 * You are allowed to use this code in your plugins for private projects
 * You are allowed to publish your plugin including this code as long as your plugin is for free 
 * You are NOT allowed to claim this plugin as your own
 * You are NOT allowed to publish this plugin or your modified version of this plugin
 * 
 */
package de.domedd.betternick.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import de.domedd.betternick.api.nickedplayer.NickedPlayer;

public class PlayerNickEvent extends Event {

	public static HandlerList handlers = new HandlerList();
	private NickedPlayer player;
	private String nick;
	
	public PlayerNickEvent(NickedPlayer arg0, String arg1) {
		player = arg0;
		nick = arg1;
	}
	public NickedPlayer getNickedPlayer() {
		return player;
	}
	public Player getPlayer() {
		return player;
	}
	public String getNickName() {
		return nick;
	}
	public void setNickMessage(String arg0) {
		player.sendMessage(arg0);
	}
	public void setNickActionbarMessage(String arg0) {
		player.sendActionbar(arg0);
	}
	public void stopNickActionbarMessage() {
		player.endActionbar();
	}
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	public static HandlerList getHandlerList() {
		return handlers;
	}
}
