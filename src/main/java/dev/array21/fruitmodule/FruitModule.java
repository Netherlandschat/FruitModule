package dev.array21.fruitmodule;

import net.dv8tion.jda.api.requests.GatewayIntent;
import nl.thedutchmc.netherlandsbot.annotations.RegisterBotModule;
import nl.thedutchmc.netherlandsbot.modules.BotModule;

@RegisterBotModule(name = "FruitModule", version = "1.0.1", intents = { GatewayIntent.GUILD_MESSAGES })
public class FruitModule extends BotModule {

	@Override
	public void onLoad() {
		super.logInfo("Initializing...");
		super.registerEventListener(new MessageEventListener());
		super.logInfo("Initialization complete.");
	}
}
