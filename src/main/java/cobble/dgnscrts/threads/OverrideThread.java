package cobble.dgnscrts.threads;

import cobble.dgnscrts.commands.functional.SecretOverride;
import cobble.dgnscrts.handlers.RenderGuiHandler;
import cobble.dgnscrts.utils.Utils;

public class OverrideThread extends Thread {
	public void run() {
		if(SecretOverride.argsLength == 0) {
			Utils.errMsg("[sys]: Please supply a valid room size!");
			return;
		} else if(SecretOverride.argsLength == 1) {
			Utils.errMsg("[sys]: Please supply a valid room ID!");
			return;
		} else if(SecretOverride.args0.toLowerCase().equals("1x1") ) {
			RenderGuiHandler.roomShape="1x1";
			//1 Secret
			if(SecretOverride.args1.equals("arrow-trap")) {
				RenderGuiHandler.roomSecretsID = "arrow-trap";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1 (1/2) - Lever behind superboom crypt");
				RenderGuiHandler.currentSecretText.add("Secret 1 (1/2) - Lever behind superboom crypt");
				RenderGuiHandler.currentSecretText.add("Secret 1 (2/2) - Chest");
			} else if(SecretOverride.args1.equals("banners")) {
				RenderGuiHandler.roomSecretsID = "banners";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind painting");
			} else if(SecretOverride.args1.equals("blue-skulls")) {
				RenderGuiHandler.roomSecretsID = "blue-skulls";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
			} else if(SecretOverride.args1.equals("cage")) {
				RenderGuiHandler.roomSecretsID = "cage";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Entrance to chest");
			} else if(SecretOverride.args1.equals("cell")) {
				RenderGuiHandler.roomSecretsID = "cell";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item behind superboom");
			} else if(SecretOverride.args1.equals("duncan")) {
				RenderGuiHandler.roomSecretsID = "duncan";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item Pickup");
				RenderGuiHandler.currentSecretText.add("Secret 1 - How to get there");
			} else if(SecretOverride.args1.equals("golden-oasis")) {
				RenderGuiHandler.roomSecretsID = "golden-oasis";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1/2/3 - Right click on Redstone Skull");
				RenderGuiHandler.currentSecretText.add("Secret 1/2/3 cont - Lever on Redstone Grave");
				RenderGuiHandler.currentSecretText.add("Secret 1/2/3 cont - Lever opens room to fight Miniboss");
				RenderGuiHandler.currentSecretText.add("Secret 1/2/3 cont - Place Redstone Skull on Redstone Block for Secret 1 (Opens Secret 2/3)");
				RenderGuiHandler.currentSecretText.add("Secret 2/3 cont - Go back to the now open Redstone Grave and walk down the stairs");
				RenderGuiHandler.currentSecretText.add("Secret 2/3 cont - Chests");
			} else if(SecretOverride.args1.equals("hanging-vines")) {
				RenderGuiHandler.roomSecretsID = "hanging-vines";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
			} else if(SecretOverride.args1.equals("jumping-skulls")) {
				RenderGuiHandler.roomSecretsID = "jumping-skulls";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
			} else if(SecretOverride.args1.equals("leaves")) {
				RenderGuiHandler.roomSecretsID = "leaves";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
			} else if(SecretOverride.args1.equals("mirror")) {
				RenderGuiHandler.roomSecretsID = "mirror";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
			} else if(SecretOverride.args1.equals("multicolored")) {
				RenderGuiHandler.roomSecretsID = "multicolored";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
			} else if(SecretOverride.args1.equals("mural")) {
				RenderGuiHandler.roomSecretsID = "mural";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
			} else if(SecretOverride.args1.equals("mushroom")) {
				RenderGuiHandler.roomSecretsID = "mushroom";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Click on mushroom for chest");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Click on chest quickly before you are teleported back");
			} else if(SecretOverride.args1.equals("pillars")) {
				RenderGuiHandler.roomSecretsID = "pillars";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
			} else if(SecretOverride.args1.equals("prison-cell")) {
				RenderGuiHandler.roomSecretsID = "prison-cell";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
			} else if(SecretOverride.args1.equals("sanctuary")) {
				RenderGuiHandler.roomSecretsID = "sanctuary";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - lever to chest");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
			} else if(SecretOverride.args1.equals("sand-dragon")) {
				RenderGuiHandler.roomSecretsID = "sand-dragon";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Behind the wood");
			} else if(SecretOverride.args1.equals("sloth")) {
				RenderGuiHandler.roomSecretsID = "sloth";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
			} else if(SecretOverride.args1.equals("steps")) {
				RenderGuiHandler.roomSecretsID = "steps";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Bat");
			} else if(SecretOverride.args1.equals("three-floors")) {
				RenderGuiHandler.roomSecretsID = "three-floors";
				RenderGuiHandler.maxSecrets = 4;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Walk up these stairs");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Turn right");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Go through the hole");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
			}
			// 2 secrets
			else if(SecretOverride.args1.equals("andesite")) {
				RenderGuiHandler.roomSecretsID = "andesite";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - wither essence and item pickup behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - wither essence and item pickup behind superboom wall");
			} else if(SecretOverride.args1.equals("beams")) {
				RenderGuiHandler.roomSecretsID = "beams";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Item");
			} else if(SecretOverride.args1.equals("big-red-flag")) {
				RenderGuiHandler.roomSecretsID = "big-red-flag";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - Item");
			} else if(SecretOverride.args1.equals("black-flag")) {
				RenderGuiHandler.roomSecretsID = "black-flag";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest (upstairs)");
			} else if(SecretOverride.args1.equals("chains")) {
				RenderGuiHandler.roomSecretsID = "chains";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Superboom wall with stuff inside (There's a trap when you immediately blow it up)");
				RenderGuiHandler.currentSecretText.add("Secret 2 - There are stairs which lead up to a chest area");
			} else if(SecretOverride.args1.equals("cobble-wall-pillar")) {
				RenderGuiHandler.roomSecretsID = "cobble-wall-pillar";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest/Secret 2 - Chest");
			} else if(SecretOverride.args1.equals("dip")) {
				RenderGuiHandler.roomSecretsID = "dip";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Lever behind superboom crypt");
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
			} else if(SecretOverride.args1.equals("dome")) {
				RenderGuiHandler.roomSecretsID = "dome";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1/2 - bat and lever");
				RenderGuiHandler.currentSecretText.add("Secret 1/2 - bat and lever");
				RenderGuiHandler.currentSecretText.add("Secret 2 - chest behind lever wall");
			} else if(SecretOverride.args1.equals("drop")) {
				RenderGuiHandler.roomSecretsID = "drop";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Superboom to chest");
			} else if(SecretOverride.args1.equals("granite")) {
				RenderGuiHandler.roomSecretsID = "granite";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secrets 1 & 2 - Wither essence & item");
			} else if(SecretOverride.args1.equals("painting")) {
				RenderGuiHandler.roomSecretsID = "painting";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - item pickup, behind painting");
				RenderGuiHandler.currentSecretText.add("Secret 2 - wither essence in the wall");
			} else if(SecretOverride.args1.equals("perch")) {
				RenderGuiHandler.roomSecretsID = "perch";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
			} else if(SecretOverride.args1.equals("quad-lava")) {
				RenderGuiHandler.roomSecretsID = "quad-lava";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest, Secret 2 - Chest in lava");
			} else if(SecretOverride.args1.equals("scaffolding")) {
				RenderGuiHandler.roomSecretsID = "scaffolding";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Item drop");
			} else if(SecretOverride.args1.equals("slabs")) {
				RenderGuiHandler.roomSecretsID = "slabs";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1 & 2: Chest (Right Click both side of the chest)");
			} else if(SecretOverride.args1.equals("water")) {
				RenderGuiHandler.roomSecretsID = "water";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Bat (may escape)");
			} else if(SecretOverride.args1.equals("waterfall")) {
				RenderGuiHandler.roomSecretsID = "waterfall";
				RenderGuiHandler.maxSecrets = 1;
				RenderGuiHandler.currentSecretText.add("Secret 1/2 - Wither & Bat");
			}
			//3 Secrets
			else if(SecretOverride.args1.equals("bootleg-melon")) {
				RenderGuiHandler.roomSecretsID = "bootleg-melon";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secrets 1/2 - Item and bat behind superboom");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest behind superboom wall (that first chest is a trap chest that will drop tnt)");
			} else if(SecretOverride.args1.equals("knight")) {
				RenderGuiHandler.roomSecretsID = "knight";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secrets 1 & 2 - Lever");
				RenderGuiHandler.currentSecretText.add("Secrets 1 & 2 - Chest (Click both sides)");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Bat (Usually flies out)");
			} else if(SecretOverride.args1.equals("lava-pool")) {
				RenderGuiHandler.roomSecretsID = "lava-pool";
				RenderGuiHandler.maxSecrets = 4;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest (behind superboom wall)");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
			} else if(SecretOverride.args1.equals("lava-skull")) {
				RenderGuiHandler.roomSecretsID = "lava-skull";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Bat / Secret 2a and 3a - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 2b - Bat / Secret 3b - Chest");
			} else if(SecretOverride.args1.equals("lots-of-floors")) {
				RenderGuiHandler.roomSecretsID = "lots-of-floors";
				RenderGuiHandler.maxSecrets = 4;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
			} else if(SecretOverride.args1.equals("mini-rail-track")) {
				RenderGuiHandler.roomSecretsID = "mini-rail-track";
				RenderGuiHandler.maxSecrets = 4;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item pickup");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 3 (1/2) - Chest (way to get there)");
				RenderGuiHandler.currentSecretText.add("Secret 3 (2/2) - Chest is in cave area behind the lava");
			} else if(SecretOverride.args1.equals("mossy")) {
				RenderGuiHandler.roomSecretsID = "mossy";
				RenderGuiHandler.maxSecrets = 5;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item drop behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 2 (1/2) - Pull lever under green skull");
				RenderGuiHandler.currentSecretText.add("Secret 2 (2/2) - Go through here to chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Wither essence");
			} else if(SecretOverride.args1.equals("redstone-key")) {
				RenderGuiHandler.roomSecretsID = "redstone-key";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Right click on redstone skull");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Item behind superboom crypt");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Place the redstone key on the redstone block");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Skull");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest will be in newly opened passage after redstone key is placed");
			} else if(SecretOverride.args1.equals("sarcophagus")) {
				RenderGuiHandler.roomSecretsID = "sarcophagus";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1: Chest behind Superboom Wall");
				RenderGuiHandler.currentSecretText.add("Secrets 2 & 3: Wither Essence & Bat (Note: the bat flew out into the middle)");
			} else if(SecretOverride.args1.equals("spikes")) {
				RenderGuiHandler.roomSecretsID = "spikes";
				RenderGuiHandler.maxSecrets = 2;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2/3 - Bat & Wither essence");
			} else if(SecretOverride.args1.equals("temple")) {
				RenderGuiHandler.roomSecretsID = "temple";
				RenderGuiHandler.maxSecrets = 4;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Entrance");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
			}
			//4 Secrets
			else if(SecretOverride.args1.equals("logs")) {
				RenderGuiHandler.roomSecretsID = "logs";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - Double Chest (Click both sides)");
				RenderGuiHandler.currentSecretText.add("Secret 3 & 4 - Double Chest (Click both sides)");
			} else if(SecretOverride.args1.equals("raccoon")) {
				RenderGuiHandler.roomSecretsID = "raccoon";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 & 3 - 2 Chests through the superboom");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
			} else if(SecretOverride.args1.equals("trinity")) {
				RenderGuiHandler.roomSecretsID = "trinity";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 2 & 3 - 2 Bats");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
			}
			
			
		} else if(SecretOverride.args0.toLowerCase().equals("1x2") ) {
			RenderGuiHandler.roomShape="1x2";
			if(SecretOverride.args1.toLowerCase().equals("archway")) {
				RenderGuiHandler.roomSecretsID = "archway";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Item");
			} else if(SecretOverride.args1.toLowerCase().equals("redstone-warrior")) {
				RenderGuiHandler.roomSecretsID = "redstone-warrior";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item drop behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Lever");
			} else if(SecretOverride.args1.toLowerCase().equals("balcony")) {
				RenderGuiHandler.roomSecretsID = "balcony";
				RenderGuiHandler.maxSecrets = 5;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest under superboom");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 3/4 - Entrances");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
			} else if(SecretOverride.args1.toLowerCase().equals("mage")) {
				RenderGuiHandler.roomSecretsID = "mage";
				RenderGuiHandler.maxSecrets = 3;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3/4 - Bat & wither essence");
			} else if(SecretOverride.args1.toLowerCase().equals("crypt")) {
				RenderGuiHandler.roomSecretsID = "crypt";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest below superboom crypt");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Item");
				RenderGuiHandler.currentSecretText.add("Secrets 4/5 Entrance - Go up stairs");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest behind superboom wall");
			} else if(SecretOverride.args1.toLowerCase().equals("doors")) {
				RenderGuiHandler.roomSecretsID = "doors";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest beneath the superboom crypt");
				RenderGuiHandler.currentSecretText.add("Secret 3/4 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 3/4 cont - Lever behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 3/4 cont - Lever, Secret 5 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 3/4 cont - 2 Chests");
			} else if(SecretOverride.args1.toLowerCase().equals("pedestal")) {
				RenderGuiHandler.roomSecretsID = "pedestal";
				RenderGuiHandler.maxSecrets = 4;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4/5 - Item & Wither essence");
			} else if(SecretOverride.args1.toLowerCase().equals("doors")) {
				RenderGuiHandler.roomSecretsID = "doors";
				RenderGuiHandler.maxSecrets = 7;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Wither essence");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 3 cont - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
			} else if(SecretOverride.args1.toLowerCase().equals("bridges")) {
				RenderGuiHandler.roomSecretsID = "bridges";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Item drop");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Bat behind superboom");
				RenderGuiHandler.currentSecretText.add("Secret 4/5/6 - Wither essence & chest");
				RenderGuiHandler.currentSecretText.add("Secret 4/5/6 - Wither essence & chest");
			} else if(SecretOverride.args1.toLowerCase().equals("pressure-plate")) {
				RenderGuiHandler.roomSecretsID = "pressure-plate";
				RenderGuiHandler.maxSecrets = 9;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item pickup behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest behind door, opened by lever shown in picture");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 4 (1/2) - Item pickup below superboom floor");
				RenderGuiHandler.currentSecretText.add("Secret 4 - (2/2) - Area you fall into");
				RenderGuiHandler.currentSecretText.add("Secret 5 (1/2) - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 5 (2/2) - You get there by going down this hole");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Chest behind this door. To open the door, you need to activate 2 pressure plates.");
				RenderGuiHandler.currentSecretText.add("The pressure plates open the door and are located in this image and where I am standing");
				
			} else if(SecretOverride.args1.toLowerCase().equals("purple-flags")) {
				RenderGuiHandler.roomSecretsID = "purple-flags";
				RenderGuiHandler.maxSecrets = 7;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Wither essence");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 3 cont - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
			}
			
			
			
			
		} else if(SecretOverride.args0.toLowerCase().equals("1x3") ) {
			RenderGuiHandler.roomShape="1x3";
			if(SecretOverride.args1.equals("diagonal")) {
				
				RenderGuiHandler.roomSecretsID = "diagonal";
				RenderGuiHandler.maxSecrets = 4;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Bat & fairy soul");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
				
			} else if(SecretOverride.args1.equals("red-blue")) {
				
				RenderGuiHandler.roomSecretsID = "red-blue";
				RenderGuiHandler.maxSecrets = 5;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Wither Essence");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
				
			} else if(SecretOverride.args1.equals("wizard")) {
				
				RenderGuiHandler.roomSecretsID = "wizard";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Item Drop behind superboom");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest behind superboom");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Chest behind superboom");
				RenderGuiHandler.currentSecretText.add("To get the buff from the wizard you need to find a crystal located near the lava in this room.");
				RenderGuiHandler.currentSecretText.add("Then bring the crystal to wizard located on the second floor near the third secret.");
				
			} else if(SecretOverride.args1.equals("catwalk")) {
				
				RenderGuiHandler.roomSecretsID = "catwalk";
				RenderGuiHandler.maxSecrets = 5;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3/4 - Chest & Wither essence behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Chest");
				
			} else if(SecretOverride.args1.equals("deathmite")) {
				
				RenderGuiHandler.roomSecretsID = "deathmite";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secrets 1/2 - Bat & Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 4 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Item behind superboom wall");
				
			} else if(SecretOverride.args1.equals("gravel")) {
				
				RenderGuiHandler.roomSecretsID = "gravel";
				RenderGuiHandler.maxSecrets = 5;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2/3 - Item & Wither essence");
				RenderGuiHandler.currentSecretText.add("Secret 4/5 - Item & Wither essence");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Bat");
				
			}
			
			
			
		} else if(SecretOverride.args0.toLowerCase().equals("2x2") ) {
			if(SecretOverride.args1.equals("buttons")) {
				RenderGuiHandler.roomSecretsID = "buttons";
				RenderGuiHandler.maxSecrets = 7;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Superboom");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Superboom");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest (Button Puzzle opens door)");
			} else if(SecretOverride.args1.equals("museum")) {
				RenderGuiHandler.roomSecretsID = "museum";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest under superboom");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Wither essence");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest behind superboom");
			} else if(SecretOverride.args1.equals("atlas")) {
				RenderGuiHandler.roomSecretsID = "atlas";
				RenderGuiHandler.maxSecrets = 8;
				RenderGuiHandler.currentSecretText.add("Lever opens the bottom of the cage (which has a lost adventurer inside)");
				RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - Item drop & Lever");
				RenderGuiHandler.currentSecretText.add("Secret 1 & 2 cont - Item drop & Lever");
				RenderGuiHandler.currentSecretText.add("Secret 2 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Wither essence");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Bat");
			} else if(SecretOverride.args1.equals("super-tall")) {
				RenderGuiHandler.roomSecretsID = "super-tall";
				RenderGuiHandler.maxSecrets = 8;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Bat");
				RenderGuiHandler.currentSecretText.add("Use this lever to get to the second floor.");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Item drop");
				RenderGuiHandler.currentSecretText.add("Then use this lever to get to the next area.");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Bat");
				RenderGuiHandler.currentSecretText.add("Use this lever to get to the fourth, fifth, and sixth secret. You can drop down through an iron trap door to get to the door that the lever opens.");
				RenderGuiHandler.currentSecretText.add("Use this lever to get to the fourth, fifth, and sixth secret. You can drop down through an iron trap door to get to the door that the lever opens.");
				RenderGuiHandler.currentSecretText.add("Secret 4/5/6 - Chests");
			}
		} else if(SecretOverride.args0.toUpperCase().equals("L") ) {
			if(SecretOverride.args1.equals("dino-dig-site")) {
				RenderGuiHandler.roomSecretsID = "dino-dig-site";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Item pickup");
				RenderGuiHandler.currentSecretText.add("Photo from different angle");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Bat");
				RenderGuiHandler.currentSecretText.add("Photo from inside the room");
			} else if(SecretOverride.args1.equals("withermancers")) {
				RenderGuiHandler.roomSecretsID = "withermancers";
				RenderGuiHandler.maxSecrets = 7;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Superboom");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Wither essence");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Superboom");
				RenderGuiHandler.currentSecretText.add("Secret 4 cont - Chest");
			} else if(SecretOverride.args1.equals("chambers")) {
				RenderGuiHandler.roomSecretsID = "chambers";
				RenderGuiHandler.maxSecrets = 7;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Superboom wall on either side leading to a chest");
				RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
				RenderGuiHandler.currentSecretText.add("Secret 3 - Lever");
				RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Go down water stream to chest");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest behind superboom wall");
			} else if(SecretOverride.args1.equals("market")) {
				RenderGuiHandler.roomSecretsID = "market";
				RenderGuiHandler.maxSecrets = 4;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 3/4 - Bat & wither essence under superboom");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
			} else if(SecretOverride.args1.equals("melon")) {
				RenderGuiHandler.roomSecretsID = "melon";
				RenderGuiHandler.maxSecrets = 6;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest inside pile of melons (Break the melons)");
				RenderGuiHandler.currentSecretText.add("Secret 2/3 - Bat & Chest behind superboom wall");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 7 - Chest");
			} else if(SecretOverride.args1.equals("well")) {
				RenderGuiHandler.roomSecretsID = "well";
				RenderGuiHandler.maxSecrets = 5;
				RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				RenderGuiHandler.currentSecretText.add("Secret 2/3 - 2 Wither essences");
				RenderGuiHandler.currentSecretText.add("Secret 4 - Item (left), Secret 5 - Chest (right)");
				RenderGuiHandler.currentSecretText.add("Secret 6 - Item");
				RenderGuiHandler.currentSecretText.add("Secret 7 - Chest behind superboom wall");
			}
		} else if(SecretOverride.args0.toLowerCase().equals("puzzles") ) {
			 if(SecretOverride.args1.equals("blaze")) {
					RenderGuiHandler.roomSecretsID = "blaze";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
				} else if(SecretOverride.args1.equals("tictactoe")) {
					RenderGuiHandler.roomSecretsID = "tictactoe";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
				} else if(SecretOverride.args1.equals("crusher")) {
					RenderGuiHandler.roomSecretsID = "crusher";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Lever 1 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Lever for room completion");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
				} else if(SecretOverride.args1.equals("arrow")) {
					RenderGuiHandler.roomSecretsID = "arrow";
					RenderGuiHandler.maxSecrets = 5;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 2 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Bat");
					RenderGuiHandler.currentSecretText.add("Lever for room completion");
				} else if(SecretOverride.args1.equals("open")) {
					RenderGuiHandler.roomSecretsID = "open";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
					RenderGuiHandler.currentSecretText.add("Secret 3/4 - 2 Wither essence");
				}
		} else {
			Utils.errMsg("[sys]: Failed to find secret!");
			return;
		}
	}
}
