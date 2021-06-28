package dev.array21.fruitmodule;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.util.Map;

public class MessageEventListener extends ListenerAdapter {

	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		if(event.getAuthor().isBot()) {
			return;
		}

		String message = event.getMessage().getContentDisplay();
		for(Map.Entry<String, String> entry : FruitTypes.fruitMap.entrySet()) {
			if(message.toLowerCase().contains(entry.getKey())) {
                		event.getMessage().addReaction(entry.getValue()).queue();
			}
		}
	}
}
