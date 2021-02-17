package cobble.dgnscrts.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.HoverEvent;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

public class Utils {
	private static final Gson gson = new Gson();
	private static final Pattern STRIP_COLOR_PATTERN = Pattern.compile("(?i)¡×[0-9A-FK-OR]");
	
	
	public static String getCurrentActionBar() throws IllegalAccessException {
		
		String actionBar = ReflectionHelper.getPrivateValue(GuiIngame.class, Minecraft.getMinecraft().ingameGUI, "field_73838_g");
		//field_73838_g
		//recordPlaying
		return actionBar;
	}
	
	public static String stripColor(final String input) {
        return STRIP_COLOR_PATTERN.matcher(input).replaceAll("");
    }
public static String getColorFromInt(int colorID) {
		
		String[] colorList = {Colors.WHITE, Colors.DARK_RED, Colors.RED, Colors.GOLD, Colors.YELLOW, Colors.GREEN, Colors.DARK_GREEN, Colors.AQUA, Colors.DARK_AQUA, Colors.BLUE, Colors.DARK_BLUE, Colors.LIGHT_PURPLE, Colors.DARK_PURPLE, Colors.GRAY, Colors.DARK_GRAY, Colors.BLACK};
		String output = "";
		try {
			output = colorList[colorID];
		} catch(Exception e) {
			
		}
		return output;
		
		
	}
	
	public static void chatMsgRunCmd(String string, String command) {
		ChatStyle runCommand = new ChatStyle();
		runCommand.setChatClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, command));
		runCommand.setChatHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ChatComponentText(ChatFormatting.AQUA+"Click to show secrets for the "+string+ChatFormatting.AQUA+" room!")));
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(string).setChatStyle(runCommand));
	}
	
	public static void errMsg(String string) {
		sendMessage(ChatFormatting.DARK_AQUA+"[SBP] "+ChatFormatting.RED+string);
	}
	
	public static Boolean checkBlock(World world, int x, int y, int z, Block blockCheckAgainst) {
		if(world.getBlockState(new BlockPos(x, y, z)).getBlock().getRegistryName().equals(blockCheckAgainst.getRegistryName())) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean checkIfArrayContains(ArrayList<String> arrayList, String stringCheck) {
		Boolean tempBoolean = false;
		for(int i=0;i<arrayList.size();i++) {
			if(stringCheck.equals(arrayList.get(i))) {
				tempBoolean = true;
			}
		}
		
		return tempBoolean;
	}
	
	public static boolean isJSONValid(String jsonInString) {
	      try {
	          gson.fromJson(jsonInString, Object.class);
	          return true;
	      } catch(com.google.gson.JsonSyntaxException ex) { 
	          return false;
	      }
	  }
	
	public static long stringToLong(String num) {
		if(num != null) {
		String temp1 = num+"";
		Long temp2 = Long.parseLong(temp1);
		return temp2;
		}
		else return 0;
	}
	
	public static void setApiKey() {
		ChatStyle runCommand = new ChatStyle();
		runCommand.setChatClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/api new"));
		runCommand.setChatHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ChatComponentText(ChatFormatting.YELLOW+"Click to run "+ChatFormatting.AQUA+"/api new")));
		Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
		Utils.sendMessage(ChatFormatting.YELLOW+"Your "+ChatFormatting.GOLD+"SkyblockPersonalized "+ChatFormatting.YELLOW+"API key is not setup properly!");
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(ChatFormatting.YELLOW+"Type "+ChatFormatting.AQUA+"/api new"+ChatFormatting.YELLOW+" to set your API key!").setChatStyle(runCommand));
		Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
	}
	
	public static String formatNums(int num) {
		NumberFormat myFormat = NumberFormat.getInstance();
	    myFormat.setGroupingUsed(true);
	    return myFormat.format(num);
	}
	
	
	public static String secondsToTime(int input) { 
		long hours = TimeUnit.MILLISECONDS
			    .toHours(input);
			input -= TimeUnit.HOURS.toMillis(hours);

			long minutes = TimeUnit.MILLISECONDS
			    .toMinutes(input);
			input -= TimeUnit.MINUTES.toMillis(minutes);

			long seconds = TimeUnit.MILLISECONDS
			    .toSeconds(input);
			
			if(hours > 0) {
				return hours+"h"+minutes+"m"+seconds+"s";
			} else {
				return minutes+"m"+seconds+"s";
			}
	}
	
	
	public static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
	

	
	
	public static void sendMessage(String text) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(text));
	}
	public static void enableMod() {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(ChatFormatting.GOLD+"SkyblockPersonalized "+ChatFormatting.RESET+"has now been"+ChatFormatting.GREEN+" enabled "+ChatFormatting.RESET+"due to you attempting to use it. Use the command again to show the information."));
	}
	
	
	
	public static void print(Object output) {
		System.out.println(output);
	}
	
	
}
