package cobble.dgnscrts.threads;

import com.mojang.realmsclient.gui.ChatFormatting;

import cobble.dgnscrts.commands.menus.SecretFinder;
import cobble.dgnscrts.handlers.RenderGuiHandler;
import cobble.dgnscrts.utils.Utils;

public class SecretsThread extends Thread {
	public void run() {
		if(SecretFinder.argsLength == 0) {
			Utils.errMsg("Please supply a valid room size!");
			Utils.errMsg("Room sizes: 1x1, 1x2, 1x3, 1x4, 2x2, L, puzzles");
			return;
		}  else if(!SecretFinder.args0.toLowerCase().equals("1x1") && !SecretFinder.args0.toLowerCase().equals("1x2") && !SecretFinder.args0.toLowerCase().equals("1x3") && !SecretFinder.args0.toLowerCase().equals("1x4") && !SecretFinder.args0.toLowerCase().equals("2x2") && !SecretFinder.args0.toLowerCase().equals("l") && !SecretFinder.args0.toLowerCase().equals("puzzles")) {
			Utils.errMsg("Please supply a valid room size!");
			return;
		} else if(SecretFinder.argsLength == 1 ) {
			if(!SecretFinder.args0.equals("puzzles")) {
				Utils.errMsg("Please supply a valid secret amount!");
				Utils.errMsg("Room sizes: 1x1, 1x2, 1x3, 1x4, 2x2, L, puzzles");
				return;
			}
			
			
		} else if(!Utils.isNumeric(SecretFinder.args1)){
			
			Utils.errMsg("Please supply a valid secret amount!");
			return;
			}
		
		else if(Integer.parseInt(SecretFinder.args1) > 9 || Integer.parseInt(SecretFinder.args1) < 0) {
			Utils.errMsg("Please supply a valid secret amount!" );
			return;
		}
		int args1 = 0;
		if(!SecretFinder.args0.equals("puzzles")) {
			args1 = Integer.parseInt(SecretFinder.args1);
		}
		
		RenderGuiHandler.roomSecretsID="NONE";
		RenderGuiHandler.maxSecrets=0;
		RenderGuiHandler.currentSecret=0;
		RenderGuiHandler.currentSecretText.clear();
		
		if(SecretFinder.args0.toLowerCase().equals("1x1")) {
			RenderGuiHandler.roomShape="1x1";
			
			if(args1 == 1) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Arrow Trap", "/secretoverride 1x1 arrow-trap");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Banners", "/secretoverride 1x1 banners");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Blue Skulls", "/secretoverride 1x1 blue-skulls");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Cage", "/secretoverride 1x1 cage");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Cell", "/secretoverride 1x1 cell");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Duncan", "/secretoverride 1x1 duncan");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Golden Oasis", "/secretoverride 1x1 golden-oasis");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Hanging Vines", "/secretoverride 1x1 hanging-vines");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Jumping Skulls", "/secretoverride 1x1 jumping-skulls");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Leaves", "/secretoverride 1x1 leaves");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Mirror", "/secretoverride 1x1 mirror");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Multicolored", "/secretoverride 1x1 multicolored");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Mural", "/secretoverride 1x1 mural");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Mushroom", "/secretoverride 1x1 mushroom");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Pillars", "/secretoverride 1x1 pillars");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Prison Cell", "/secretoverride 1x1 prison-cell");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Sanctuary", "/secretoverride 1x1 sanctuary");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Sand Dragon", "/secretoverride 1x1 sand-dragon");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Sloth", "/secretoverride 1x1 sloth");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Steps", "/secretoverride 1x1 steps");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Three Floors", "/secretoverride 1x1 three-floors");
			}
			else if(args1 == 2) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Andesite", "/secretoverride 1x1 andesite");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Beams", "/secretoverride 1x1 beams");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Big Red Flag", "/secretoverride 1x1 big-red-flag");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Black Flag", "/secretoverride 1x1 black-flag");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Chains", "/secretoverride 1x1 chains");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Cobble Wall Pillar", "/secretoverride 1x1 cobble-wall-pillar");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Dip", "/secretoverride 1x1 dip");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Dome", "/secretoverride 1x1 dome");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Drop", "/secretoverride 1x1 drop");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Granite", "/secretoverride 1x1 granite");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Painting", "/secretoverride 1x1 painting");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Perch", "/secretoverride 1x1 perch");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Quad Lava", "/secretoverride 1x1 quad-lava");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Scaffolding", "/secretoverride 1x1 scaffolding");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Slabs", "/secretoverride 1x1 slabs");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Water", "/secretoverride 1x1 water");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Waterfall", "/secretoverride 1x1 waterfall");
			}
			else if(args1 == 3) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Bootleg Melon", "/secretoverride 1x1 bootleg-melon");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Knight", "/secretoverride 1x1 knight");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Lava Pool", "/secretoverride 1x1 lava-pool");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Lava Skull", "/secretoverride 1x1 lava-skull");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Lots of Floors", "/secretoverride 1x1 lots-of-floors");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Mini Rail Track", "/secretoverride 1x1 mini-rail-track");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Mossy", "/secretoverride 1x1 mossy");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Redstone Key", "/secretoverride 1x1 redstone-key");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Sarcophagus", "/secretoverride 1x1 sarcophagus");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Spikes", "/secretoverride 1x1 spikes");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Temple", "/secretoverride 1x1 temple");
			}
			else if(args1 == 4) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Logs", "/secretoverride 1x1 logs");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Raccoon", "/secretoverride 1x1 raccoon");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Trinity", "/secretoverride 1x1 trinity");
			}
			else {
				Utils.errMsg("There is no room shaped "+ChatFormatting.AQUA+SecretFinder.args0+ChatFormatting.RED+" with "+ChatFormatting.AQUA+SecretFinder.args1+ChatFormatting.RED+" secrets!");
			}
		}
		else if(SecretFinder.args0.toLowerCase().equals("1x2")) {
			RenderGuiHandler.roomShape="1x2";
			if(args1 == 1) {
				RenderGuiHandler.roomSecretsID = "gold";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Wither essence");
			}
			else if(args1 == 2) {
				RenderGuiHandler.roomSecretsID = "skull";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest behind vines");
			}
			else if(args1 == 3) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Archway", "/secretoverride 1x2 archway");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Redstone Warrior", "/secretoverride 1x2 redstone-warrior");
			}
			else if(args1 == 4) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Balcony", "/secretoverride 1x2 balcony");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Mage", "/secretoverride 1x2 mage");
			}
			else if(args1 == 5) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Crypt", "/secretoverride 1x2 crypt");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Doors", "/secretoverride 1x2 doors");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Pedestal", "/secretoverride 1x2 pedestal");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Purple Flags", "/secretoverride 1x2 purple-flags");
			}
			else if(args1 == 6) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Bridges", "/secretoverride 1x2 bridges");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Pressure Plate", "/secretoverride 1x2 pressure-plate");
			}
			else {
				Utils.errMsg("There is no room shaped "+ChatFormatting.AQUA+SecretFinder.args0+ChatFormatting.RED+" with "+ChatFormatting.AQUA+SecretFinder.args1+ChatFormatting.RED+" secrets!");
			}
		}
		else if(SecretFinder.args0.toLowerCase().equals("1x3")) {
			RenderGuiHandler.roomShape="1x3";
			if(args1 == 4) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Diagonal", "/secretoverride 1x3 diagonal");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Red-Blue", "/secretoverride 1x3 red-blue");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Wizard", "/secretoverride 1x3 wizard");
			}
			else if(args1 == 6) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Catwalk", "/secretoverride 1x3 catwalk");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Deathmite", "/secretoverride 1x3 deathmite");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Gravel", "/secretoverride 1x3 gravel");
			}
			else {
				Utils.errMsg("There is no room shaped "+ChatFormatting.AQUA+SecretFinder.args0+ChatFormatting.RED+" with "+ChatFormatting.AQUA+SecretFinder.args1+ChatFormatting.RED+" secrets!");
			}
		}
		else if(SecretFinder.args0.toLowerCase().equals("1x4")) {
			RenderGuiHandler.roomShape="1x4";
			if(args1 == 3) {
				RenderGuiHandler.roomSecretsID = "hallway";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest under superboom floor");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Lever opens door to chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
			}
			else if(args1 == 4) {
				RenderGuiHandler.roomSecretsID = "mossy";
				RenderGuiHandler.maxSecrets = 5;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 2 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest behind superboom");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Bat");
			}
			else if(args1 == 5) {
				RenderGuiHandler.roomSecretsID = "pit";
				RenderGuiHandler.maxSecrets = 4;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secrets 3/4 - Bat + item behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
			}
			else if(args1 == 7) {
				RenderGuiHandler.roomSecretsID = "quartz_knight";
				RenderGuiHandler.maxSecrets = 7;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 7 - Item");
			}
			else {
				Utils.errMsg("There is no room shaped "+ChatFormatting.AQUA+SecretFinder.args0+ChatFormatting.RED+" with "+ChatFormatting.AQUA+SecretFinder.args1+ChatFormatting.RED+" secrets!");
			}
		}
		else if(SecretFinder.args0.toLowerCase().equals("2x2")) {
			RenderGuiHandler.roomShape="2x2";
			if(args1 == 4) {
				RenderGuiHandler.roomSecretsID = "stairs";
				RenderGuiHandler.maxSecrets = 4;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Item");
			}
			else if(args1 == 5) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Buttons", "/secretoverride 2x2 buttons");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Museum", "/secretoverride 2x2 museum");
			}
			else if(args1 == 6) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Atlas", "/secretoverride 2x2 atlas");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Super Tall", "/secretoverride 2x2 super-tall");
			}
			else if(args1 == 7) {
				RenderGuiHandler.roomSecretsID = "flags";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 4/5 - 2 Chests");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 7 - Chest");
			}
			else if(args1 == 8) {
				RenderGuiHandler.roomSecretsID = "cathedral";
				RenderGuiHandler.maxSecrets = 8;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest behind superboom");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest underneath crypt");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 7 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 8 - Item");
			}
			else if(args1 == 9) {
				RenderGuiHandler.roomSecretsID = "rail-track";
				RenderGuiHandler.maxSecrets = 8;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 3/4 - 2 Wither Essence");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Superboom to chest");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 7 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 7 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 8/9 - Wither Essence & Item");
			}
			else {
				Utils.errMsg("There is no room shaped "+ChatFormatting.AQUA+SecretFinder.args0+ChatFormatting.RED+" with "+ChatFormatting.AQUA+SecretFinder.args1+ChatFormatting.RED+" secrets!");
			}
		}
		else if(SecretFinder.args0.toUpperCase().equals("L")) {
			RenderGuiHandler.roomShape="L";
			if(args1 == 4) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Dino Dig Site", "/secretoverride L dino-dig-site");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Withermancers", "/secretoverride L withermancers");
			}
			else if(args1 == 5) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Chambers", "/secretoverride L chambers");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Market", "/secretoverride L market");
			}
			else if(args1 == 6) {
				RenderGuiHandler.roomSecretsID = "lava-ravine";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Item drop");
				RenderGuiHandler.currentSecretText.add("Secret 4/5 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 4/5 cont - Chests");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Bat");
			}
			else if(args1 == 7) {
				Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
				Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Melon", "/secretoverride L melon");
				Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Well", "/secretoverride L well");
			}
			else if(args1 == 9) {
				RenderGuiHandler.roomSecretsID = "spider";
				RenderGuiHandler.maxSecrets = 9;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3/4 - Chest & Bat");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest behind superboom");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 7 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 7 cont, Secret 8 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 8 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 9 - Item");
			}
			else {
				Utils.errMsg("There is no room shaped "+ChatFormatting.AQUA+SecretFinder.args0+ChatFormatting.RED+" with "+ChatFormatting.AQUA+SecretFinder.args1+ChatFormatting.RED+" secrets!");
			}
		}
		else if(SecretFinder.args0.toLowerCase().equals("puzzles")) {
			RenderGuiHandler.roomShape="puzzles";
			Utils.sendMessage(ChatFormatting.DARK_RED+"-----------------------------------------------------");
			Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Blaze", "/secretoverride puzzles blaze");
			Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Tic-Tac-Toe", "/secretoverride puzzles tictactoe");
			Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Trap - Crusher", "/secretoverride puzzles crusher");
			Utils.chatMsgRunCmd(ChatFormatting.GOLD+"Trap - Arrow", "/secretoverride puzzles arrow");
			Utils.chatMsgRunCmd(ChatFormatting.YELLOW+"Trap - Open", "/secretoverride puzzles open");
		}
	}
}
