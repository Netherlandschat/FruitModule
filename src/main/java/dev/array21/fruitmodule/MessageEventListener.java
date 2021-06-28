package dev.array21.fruitmodule;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.util.Map;
import java.util.Iterator;

public class MessageEventListener extends ListenerAdapter {

	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		if(event.getAuthor().isBot()) {
			return;
		}
		
		Iterator it = FruitTypes.fruitMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();

            if(message.toLowerCase().contains(pair.getKey().toString())) {
                event.getMessage().addReaction(pair.getValue().toString()).queue();
            }
        }

	}
}
