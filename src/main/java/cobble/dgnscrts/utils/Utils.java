package cobble.dgnscrts.utils;

import java.awt.Color;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.mojang.realmsclient.gui.ChatFormatting;

import cobble.dgnscrts.SBP;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.HoverEvent;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.world.World;

public class Utils {
	private static final Gson gson = new Gson();
	private static final Pattern STRIP_COLOR_PATTERN = Pattern.compile("(?i)¡×[0-9A-FK-OR]");
	public static int chromaSpeed = 4;
	
	//public static String getCurrentActionBar() throws IllegalAccessException {
		
		//String actionBar = ReflectionHelper.getPrivateValue(GuiIngame.class, Minecraft.getMinecraft().ingameGUI, "field_73838_g");
		//field_73838_g
		//recordPlaying
		//return actionBar;
	//}
	public static String unformatText(String string) {
		String output = "";
		char[] chars = string.toCharArray();
		Boolean prevChar = false;
		for(int i=0;i<chars.length;i++) {
			
			try {
				if((chars[i]+"").equals(Reference.COLOR_CODE_CHAR+"")) {
					if("mlnok".contains(chars[i+1]+"")) {
						output+=chars[i];
						continue;
					}
				}
			}catch(Exception e) {}
			
			
			if(!((chars[i]+"").equals(Reference.COLOR_CODE_CHAR+""))) {
				if(!prevChar) {
					output+=chars[i];
				}
				prevChar = false;
				
			} else if((chars[i]+"").equals(Reference.COLOR_CODE_CHAR+"")) {
				prevChar = true;
			}
		}
		
		return output;
	}
	public static void drawString(String text, int x, int y) {
		//Utils.print(text);
		Minecraft mc = Minecraft.getMinecraft();
		String str = text;
		String str2 = Utils.unformatText(text);
		Boolean shadows = false;
		if(SBP.textStyle == 0) { shadows = true; }
		else if(SBP.textStyle == 1) { drawBoldedString(str2, x, y); }
		String bold = "";
		mc.fontRendererObj.drawString(str.replace(Reference.COLOR_CODE_CHAR+"z", ""), x, y, 0, shadows);
		
		
		int chromaCount = 0;
		char[] charArray = str.toCharArray();
		if(str.contains(Reference.COLOR_CODE_CHAR+"z")) {
		
			for(int i=0;i<charArray.length;i++) {
				try {
					if((charArray[i]+"").equals(Reference.COLOR_CODE_CHAR+"") && (charArray[i+1]+"").equals("z")) {
						chromaCount++;
					}
				} catch(Exception e) { }
			}
		}
		String outputStr = str;
		
		for(int j=0;j<chromaCount;j++) {
		
		if(outputStr.contains(Reference.COLOR_CODE_CHAR+"z")) {
			int beginChroma = -1;
			int endChroma = -1;
			charArray = outputStr.toCharArray();
			
			ArrayList chArr= new ArrayList();
			for(char curr : charArray) {
				chArr.add(curr);
			}
			
			
			for(int i=0;i<chArr.size();i++) {
				
				
				if(beginChroma == -1 && (chArr.get(i)+"").equals(Reference.COLOR_CODE_CHAR+"") && (chArr.get(i+1)+"").equals("z")) {
					beginChroma = i;
				}
				
				else if(beginChroma != -1 && endChroma == -1) {
					if((chArr.get(i)+"").equals(Reference.COLOR_CODE_CHAR+"") || i >= chArr.size()-1) {
						
						endChroma = i;
						if(j == chromaCount-1) { endChroma+=1; }
						
						continue;
					}
				}
			}
			try {
				String preStr = outputStr.substring(0, beginChroma);
				String subStr = outputStr.substring(beginChroma+2, endChroma);
				String postStr = outputStr.substring(endChroma);
				int preWidth = mc.fontRendererObj.getStringWidth(preStr);
				int subWidth = mc.fontRendererObj.getStringWidth(subStr);
				if(str.contains(Colors.BOLD)) {
					subStr = "&l"+subStr;
				}
				drawChromaString(subStr, x+preWidth, y);
				outputStr = preStr+subStr+postStr;
			} catch(Exception e) {
				
			}
			
			
		}
		}
		
	}
	
	
	public static void drawChromaString(String text, int x, int y) {
		
		
		Minecraft mc = Minecraft.getMinecraft();
        int tmpX = x; Boolean allBold = false; String str = text;
        if(text.contains("&l")) { allBold = true; str = text.replace("&l", ""); }
        char[] chArr = str.toCharArray();
        
        for (int j=0;j<chArr.length;j++) {
        	char tc = chArr[j];
        	String output = tc+"";
        	if(tc != Reference.COLOR_CODE_CHAR) {
        		
        		if(allBold) { output = Colors.BOLD+output; }
        		long t = System.currentTimeMillis() - (tmpX * 10 + y * 10);
                int i = Color.HSBtoRGB(t % (int) (chromaSpeed*500f) / (chromaSpeed*500f), 0.8f, 0.8f);
                
                mc.fontRendererObj.drawString(output, tmpX, y, i, false);
                tmpX += mc.fontRendererObj.getStringWidth(output);
                
        	}
        }
        mc.fontRendererObj.drawString(Colors.WHITE, x, y, tmpX);
        
    }
	public static void drawBoldedString(String text, int x, int y) {
		Minecraft mc = Minecraft.getMinecraft();
		
		mc.fontRendererObj.drawString(text, x+1, y, 0, false);
        mc.fontRendererObj.drawString(text, x-1, y, 0, false);
        mc.fontRendererObj.drawString(text, x, y+1, 0, false);
        mc.fontRendererObj.drawString(text, x, y-1, 0, false);
	}
	
	
	public static String stripColor(final String input) {
        return STRIP_COLOR_PATTERN.matcher(input).replaceAll("");
    }
public static String getColorFromInt(int colorID) {
		
		String[] colorList = {Colors.WHITE, Colors.DARK_RED, Colors.RED, Colors.GOLD, Colors.YELLOW, Colors.GREEN, Colors.DARK_GREEN, Colors.AQUA, Colors.DARK_AQUA, Colors.BLUE, Colors.DARK_BLUE, Colors.LIGHT_PURPLE, Colors.DARK_PURPLE, Colors.GRAY, Colors.DARK_GRAY, Colors.BLACK, Colors.CHROMA};
		String output = "";
		try {
			output = colorList[colorID];
		} catch(Exception e) {
			//output = Colors.WHITE;
			//e.printStackTrace();
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
