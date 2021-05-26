package dev.array21.avocadomodule;

import net.dv8tion.jda.api.requests.GatewayIntent;
import nl.thedutchmc.netherlandsbot.annotations.RegisterBotModule;
import nl.thedutchmc.netherlandsbot.modules.BotModule;

@RegisterBotModule(name = "AvocadoModule", version = "1.0.0", intents = { GatewayIntent.GUILD_MESSAGES })
public class AvocadoModule extends BotModule {

	@Override
	public void onLoad() {
		super.logInfo("Initializing...");
		super.registerEventListener(new MessageEventListener());
		super.logInfo("Initialization complete.");
	}
}
