package dev.array21.fruitmodule;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Arrays;
import java.util.regex.Pattern;

public class MessageEventListener extends ListenerAdapter {

	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		if(event.getAuthor().isBot()) {
			return;
		}
		
		String message = event.getMessage().getContentDisplay();
		Arrays.asList(message.split(Pattern.quote(" ")))
			.stream()
			.forEach(word -> {
				String unicode = FruitTypes.FRUIT_MAP.get(word);
				if(unicode != null) {
					event.getMessage().addReaction(unicode).queue();
				}
			});
	}
}
