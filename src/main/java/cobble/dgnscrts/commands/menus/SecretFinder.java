package cobble.dgnscrts.commands.menus;

import java.util.ArrayList;
import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import cobble.dgnscrts.handlers.RenderGuiHandler;
import cobble.dgnscrts.threads.SecretsThread;
import cobble.dgnscrts.utils.DataGetter;
import cobble.dgnscrts.utils.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class SecretFinder extends CommandBase{
	private final ArrayList aliases;
	Minecraft MC;
	
	public static String args0;
	public static String args1;
	public static int argsLength;
	
	public SecretFinder() {
		aliases = new ArrayList();
	}
	
	@Override
	public List getCommandAliases() {
		
		aliases.add("scrt");
		aliases.add("scrts");
		aliases.add("secret");
		return aliases;
	}
	
	
	
	@Override
	public String getCommandName() {
		return "secrets";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/secrets [roomSize] [secretCount]";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		try {
			if((Boolean) DataGetter.find("modToggle")) {
				
				if(args.length > 0) args0 = args[0];
				if(args.length > 1) args1 = args[1];
				argsLength = args.length;
				Thread runCmd = new SecretsThread();
				runCmd.start();
				
				
			} else Utils.enableMod();
		} catch (Exception e) {
		}	
	}
	
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return true;
	}
}
