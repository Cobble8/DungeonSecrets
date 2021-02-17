package cobble.dgnscrts.commands.functional;

import cobble.dgnscrts.handlers.RenderGuiHandler;
import cobble.dgnscrts.threads.OverrideThread;
import cobble.dgnscrts.utils.Utils;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class SecretOverride extends CommandBase {

	public static String args0;
	public static String args1;
	public static int argsLength;
	
	@Override
	public String getCommandName() {
		return "secretoverride";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/weirdchamp";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		RenderGuiHandler.roomSecretsID="NONE";
		RenderGuiHandler.maxSecrets=0;
		RenderGuiHandler.currentSecret=0;
		RenderGuiHandler.currentSecretText.clear();
		if(args.length > 0) args0 = args[0];
		if(args.length > 1) args1 = args[1];
		argsLength = args.length;
		Thread override = new OverrideThread();
		override.start();
		
		
	}
	
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return true;
	}

}
