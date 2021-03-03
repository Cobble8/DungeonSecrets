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
			switch (SecretOverride.args1) {
			
				case "dueces":
					RenderGuiHandler.roomSecretsID = "dueces";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - Item and bat behind superboom");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest behind superboom wall (that first chest is a trap chest that will drop tnt)");
					break;
			
				case "small-stairs":
					RenderGuiHandler.roomSecretsID = "small-stairs";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest behind superboom (up the stairs)");
					break;
					
				case "overgrown":
					RenderGuiHandler.roomSecretsID = "overgrown";
					RenderGuiHandler.maxSecrets = 5;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item behind superboom");
					RenderGuiHandler.currentSecretText.add("Secret 2 (1/2) - Pull lever under green skull");
					RenderGuiHandler.currentSecretText.add("Secret 2 (2/2) - Go through here to chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 (2/2) - Go through here to chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Wither essence");
					break;
					
				case "locked-away":
					RenderGuiHandler.roomSecretsID = "locked-away";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Doorway on the left");
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					break;
				case "silvers-sword":
					RenderGuiHandler.roomSecretsID = "silvers-sword";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom");
					break;
					
					
				case "carpets":
					RenderGuiHandler.roomSecretsID = "carpets";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					break;
					
			
				case "arrow-trap":
					RenderGuiHandler.roomSecretsID = "arrow-trap";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 (1/2) - Lever behind superboom crypt");
					RenderGuiHandler.currentSecretText.add("Secret 1 (1/2) - Lever behind superboom crypt");
					RenderGuiHandler.currentSecretText.add("Secret 1 (2/2) - Chest");
					break;
				case "banners":
					RenderGuiHandler.roomSecretsID = "banners";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind painting");
					break;
				case "blue-skulls":
					RenderGuiHandler.roomSecretsID = "blue-skulls";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
					break;
				case "cage":
					RenderGuiHandler.roomSecretsID = "cage";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Entrance to chest");
					break;
				case "cell":
					RenderGuiHandler.roomSecretsID = "cell";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item behind superboom");
					break;
				case "duncan":
					RenderGuiHandler.roomSecretsID = "duncan";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item Pickup");
					RenderGuiHandler.currentSecretText.add("Secret 1 - How to get there");
					break;
				case "golden-oasis":
					RenderGuiHandler.roomSecretsID = "golden-oasis";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1/2/3 - Right click on Redstone Skull");
					RenderGuiHandler.currentSecretText.add("Secret 1/2/3 cont - Lever on Redstone Grave");
					RenderGuiHandler.currentSecretText.add("Secret 1/2/3 cont - Lever opens room to fight Miniboss");
					RenderGuiHandler.currentSecretText.add("Secret 1/2/3 cont - Place Redstone Skull on Redstone Block for Secret 1 (Opens Secret 2/3)");
					RenderGuiHandler.currentSecretText.add("Secret 2/3 cont - Go back to the now open Redstone Grave and walk down the stairs");
					RenderGuiHandler.currentSecretText.add("Secret 2/3 cont - Chests");
					break;
				case "hanging-vines":
					RenderGuiHandler.roomSecretsID = "hanging-vines";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					break;
				case "jumping-skulls":
					RenderGuiHandler.roomSecretsID = "jumping-skulls";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					break;
				case "leaves":
					RenderGuiHandler.roomSecretsID = "leaves";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
					break;
				case "mirror":
					RenderGuiHandler.roomSecretsID = "mirror";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
					break;
				case "multicolored":
					RenderGuiHandler.roomSecretsID = "multicolored";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
					break;
				case "mural":
					RenderGuiHandler.roomSecretsID = "mural";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
					break;
				case "mushroom":
					RenderGuiHandler.roomSecretsID = "mushroom";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Click on mushroom for chest");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Click on chest quickly before you are teleported back");
					break;
				case "pillars":
					RenderGuiHandler.roomSecretsID = "pillars";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					break;
				case "prison-cell":
					RenderGuiHandler.roomSecretsID = "prison-cell";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					break;
				case "sanctuary":
					RenderGuiHandler.roomSecretsID = "sanctuary";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - lever to chest");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					break;
				case "sand-dragon":
					RenderGuiHandler.roomSecretsID = "sand-dragon";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Behind the wood");
					break;
				case "sloth":
					RenderGuiHandler.roomSecretsID = "sloth";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
					break;
				case "steps":
					RenderGuiHandler.roomSecretsID = "steps";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Bat");
					break;
				case "three-floors":
					RenderGuiHandler.roomSecretsID = "three-floors";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Walk up these stairs");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Turn right");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Go through the hole");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					break;
				// 2 secrets
				case "andesite":
					RenderGuiHandler.roomSecretsID = "andesite";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - wither essence and item pickup behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - wither essence and item pickup behind superboom wall");
					break;
				case "beams":
					RenderGuiHandler.roomSecretsID = "beams";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Item");
					break;
				case "big-red-flag":
					RenderGuiHandler.roomSecretsID = "big-red-flag";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - Item");
					break;
				case "black-flag":
					RenderGuiHandler.roomSecretsID = "black-flag";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest (upstairs)");
					break;
				case "chains":
					RenderGuiHandler.roomSecretsID = "chains";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Superboom wall with stuff inside (There's a trap when you immediately blow it up)");
					RenderGuiHandler.currentSecretText.add("Secret 2 - There are stairs which lead up to a chest area");
					break;
				case "cobble-wall-pillar":
					RenderGuiHandler.roomSecretsID = "cobble-wall-pillar";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest/Secret 2 - Chest");
					break;
				case "dip":
					RenderGuiHandler.roomSecretsID = "dip";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Lever behind superboom crypt");
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					break;
				case "dome":
					RenderGuiHandler.roomSecretsID = "dome";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1/2 - bat and lever");
					RenderGuiHandler.currentSecretText.add("Secret 1/2 - bat and lever");
					RenderGuiHandler.currentSecretText.add("Secret 2 - chest behind lever wall");
					break;
				case "drop":
					RenderGuiHandler.roomSecretsID = "drop";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Superboom to chest");
					break;
				case "granite":
					RenderGuiHandler.roomSecretsID = "granite";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secrets 1 & 2 - Wither essence & item");
					break;
				case "painting":
					RenderGuiHandler.roomSecretsID = "painting";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - item pickup, behind painting");
					RenderGuiHandler.currentSecretText.add("Secret 2 - wither essence in the wall");
					break;
				case "perch":
					RenderGuiHandler.roomSecretsID = "perch";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					break;
				case "quad-lava":
					RenderGuiHandler.roomSecretsID = "quad-lava";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest, Secret 2 - Chest in lava");
					break;
				case "scaffolding":
					RenderGuiHandler.roomSecretsID = "scaffolding";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Item drop");
					break;
				case "slabs":
					RenderGuiHandler.roomSecretsID = "slabs";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 & 2: Chest (Right Click both side of the chest)");
					break;
				case "water":
					RenderGuiHandler.roomSecretsID = "water";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat (may escape)");
					break;
				case "waterfall":
					RenderGuiHandler.roomSecretsID = "waterfall";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1/2 - Wither & Bat");
					break;
				//3 Secrets
				case "bootleg-melon":
					RenderGuiHandler.roomSecretsID = "bootleg-melon";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secrets 1/2 - Item and bat behind superboom");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest behind superboom wall (that first chest is a trap chest that will drop tnt)");
					break;
				case "knight":
					RenderGuiHandler.roomSecretsID = "knight";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secrets 1 & 2 - Lever");
					RenderGuiHandler.currentSecretText.add("Secrets 1 & 2 - Chest (Click both sides)");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Bat (Usually flies out)");
					break;
				case "lava-pool":
					RenderGuiHandler.roomSecretsID = "lava-pool";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest (behind superboom wall)");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
					break;
				case "lava-skull":
					RenderGuiHandler.roomSecretsID = "lava-skull";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Bat / Secret 2a and 3a - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 2b - Bat / Secret 3b - Chest");
					break;
				case "lots-of-floors":
					RenderGuiHandler.roomSecretsID = "lots-of-floors";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
					break;
				case "mini-rail-track":
					RenderGuiHandler.roomSecretsID = "mini-rail-track";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item pickup");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
					RenderGuiHandler.currentSecretText.add("Secret 3 (1/2) - Chest (way to get there)");
					RenderGuiHandler.currentSecretText.add("Secret 3 (2/2) - Chest is in cave area behind the lava");
					break;
				case "mossy":
					RenderGuiHandler.roomSecretsID = "mossy";
					RenderGuiHandler.maxSecrets = 5;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item drop behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 2 (1/2) - Pull lever under green skull");
					RenderGuiHandler.currentSecretText.add("Secret 2 (2/2) - Go through here to chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Wither essence");
					break;
				case "redstone-key":
					RenderGuiHandler.roomSecretsID = "redstone-key";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Right click on redstone skull");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Item behind superboom crypt");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Place the redstone key on the redstone block");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Skull");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest will be in newly opened passage after redstone key is placed");
					break;
				case "sarcophagus":
					RenderGuiHandler.roomSecretsID = "sarcophagus";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1: Chest behind Superboom Wall");
					RenderGuiHandler.currentSecretText.add("Secrets 2 & 3: Wither Essence & Bat (Note: the bat flew out into the middle)");
					break;
				case "spikes":
					RenderGuiHandler.roomSecretsID = "spikes";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2/3 - Bat & Wither essence");
					break;
				case "temple":
					RenderGuiHandler.roomSecretsID = "temple";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Entrance");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
					break;
				//4 Secrets
				case "logs":
					RenderGuiHandler.roomSecretsID = "logs";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 & 2 - Double Chest (Click both sides)");
					RenderGuiHandler.currentSecretText.add("Secret 3 & 4 - Double Chest (Click both sides)");
					break;
				case "raccoon":
					RenderGuiHandler.roomSecretsID = "raccoon";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 & 3 - 2 Chests through the superboom");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
					break;
				case "trinity":
					RenderGuiHandler.roomSecretsID = "trinity";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 2 & 3 - 2 Bats");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
					break;
			}
			
		} else if(SecretOverride.args0.toLowerCase().equals("1x2") ) {
			RenderGuiHandler.roomShape="1x2";
			switch (SecretOverride.args1.toLowerCase()) {
				case "gold":
					RenderGuiHandler.roomSecretsID = "gold";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Wither essence");
					break;
				case "skull":
					RenderGuiHandler.roomSecretsID = "skull";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest behind vines");
					break;
				case "archway":
					RenderGuiHandler.roomSecretsID = "archway";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Item");
					break;
				case "redstone-warrior":
					RenderGuiHandler.roomSecretsID = "redstone-warrior";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item drop behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Lever");
					break;
				case "balcony":
					RenderGuiHandler.roomSecretsID = "balcony";
					RenderGuiHandler.maxSecrets = 5;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest under superboom");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
					RenderGuiHandler.currentSecretText.add("Secret 3/4 - Entrances");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
					break;
				case "mage":
					RenderGuiHandler.roomSecretsID = "mage";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3/4 - Bat & wither essence");
					break;
				case "crypt":
					RenderGuiHandler.roomSecretsID = "crypt";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest below superboom crypt");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Item");
					RenderGuiHandler.currentSecretText.add("Secrets 4/5 Entrance - Go up stairs");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest behind superboom wall");
					break;
				case "doors":
					RenderGuiHandler.roomSecretsID = "doors";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest beneath the superboom crypt");
					RenderGuiHandler.currentSecretText.add("Secret 3/4 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 3/4 cont - Lever behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 3/4 cont - Lever, Secret 5 - Bat");
					RenderGuiHandler.currentSecretText.add("Secret 3/4 cont - 2 Chests");
					break;
				case "pedestal":
					RenderGuiHandler.roomSecretsID = "pedestal";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 4/5 - Item & Wither essence");
					break;
				case "purple-flags":
					RenderGuiHandler.roomSecretsID = "purple-flags";
					RenderGuiHandler.maxSecrets = 7;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Wither essence");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 3 cont - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
					break;
				case "bridges":
					RenderGuiHandler.roomSecretsID = "bridges";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Item drop");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Bat behind superboom");
					RenderGuiHandler.currentSecretText.add("Secret 4/5/6 - Wither essence & chest");
					RenderGuiHandler.currentSecretText.add("Secret 4/5/6 - Wither essence & chest");
					break;
				case "pressure-plate":
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
					break;
			}
			
		} else if(SecretOverride.args0.toLowerCase().equals("1x3") ) {
			RenderGuiHandler.roomShape="1x3";
			switch (SecretOverride.args1) {
				case "diagonal":
					RenderGuiHandler.roomSecretsID = "diagonal";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat & fairy soul");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
					break;
				case "red-blue":
					RenderGuiHandler.roomSecretsID = "red-blue";
					RenderGuiHandler.maxSecrets = 5;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Wither Essence");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
					break;
				case "wizard":
					RenderGuiHandler.roomSecretsID = "wizard";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item Drop behind superboom");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest behind superboom");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Chest behind superboom");
					RenderGuiHandler.currentSecretText.add("To get the buff from the wizard you need to find a crystal located near the lava in this room.");
					RenderGuiHandler.currentSecretText.add("Then bring the crystal to wizard located on the second floor near the third secret.");
					break;
				case "catwalk":
					RenderGuiHandler.roomSecretsID = "catwalk";
					RenderGuiHandler.maxSecrets = 5;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3/4 - Chest & Wither essence behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 6 - Chest");
					break;
				case "deathmite":
					RenderGuiHandler.roomSecretsID = "deathmite";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secrets 1/2 - Bat & Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 4 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 6 - Item behind superboom wall");
					break;
				case "gravel":
					RenderGuiHandler.roomSecretsID = "gravel";
					RenderGuiHandler.maxSecrets = 5;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2/3 - Item & Wither essence");
					RenderGuiHandler.currentSecretText.add("Secret 4/5 - Item & Wither essence");
					RenderGuiHandler.currentSecretText.add("Secret 6 - Bat");
					break;
			}

		} else if(SecretOverride.args0.toLowerCase().equals("1x4") ) {
			RenderGuiHandler.roomShape="1x4";
			switch (SecretOverride.args1) {
				case "hallway":
					RenderGuiHandler.roomSecretsID = "hallway";
					RenderGuiHandler.maxSecrets = 3;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest under superboom floor");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Lever opens door to chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
					break;
				case "mossy":
					RenderGuiHandler.roomSecretsID = "mossy";
					RenderGuiHandler.maxSecrets = 5;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 2 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest behind superboom");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Bat");
					break;
				case "pit":
					RenderGuiHandler.roomSecretsID = "pit";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					RenderGuiHandler.currentSecretText.add("Secrets 3/4 - Bat + item behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
					break;
				case "quartz-knight":
					RenderGuiHandler.roomSecretsID = "quartz_knight";
					RenderGuiHandler.maxSecrets = 7;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Bat");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 6 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 7 - Item");
					break;
			}
			
		} else if(SecretOverride.args0.toLowerCase().equals("2x2") ) {
			RenderGuiHandler.roomShape="2x2";
			switch (SecretOverride.args1) {
				case "stairs":
					RenderGuiHandler.roomSecretsID = "stairs";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Item");
					break;
				case "buttons":
					RenderGuiHandler.roomSecretsID = "buttons";
					RenderGuiHandler.maxSecrets = 7;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Superboom");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Superboom");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest (Button Puzzle opens door)");
					break;
				case "museum":
					RenderGuiHandler.roomSecretsID = "museum";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest under superboom");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Wither essence");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest behind superboom");
					break;
				case "atlas":
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
					break;
				case "super-tall":
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
					break;
				case "flags":
					RenderGuiHandler.roomSecretsID = "flags";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 4/5 - 2 Chests");
					RenderGuiHandler.currentSecretText.add("Secret 6 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 7 - Chest");
					break;
				case "cathedral":
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
					break;
				case "rail-track":
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
					break;
			}
		} else if(SecretOverride.args0.toUpperCase().equals("L") ) {
			RenderGuiHandler.roomShape="L";
			switch (SecretOverride.args1) {
				case "dino-dig-site":
					RenderGuiHandler.roomSecretsID = "dino-dig-site";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Item pickup");
					RenderGuiHandler.currentSecretText.add("Photo from different angle");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Bat");
					RenderGuiHandler.currentSecretText.add("Photo from inside the room");
					break;
				case "withermancers":
					RenderGuiHandler.roomSecretsID = "withermancers";
					RenderGuiHandler.maxSecrets = 7;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Superboom");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Wither essence");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Superboom");
					RenderGuiHandler.currentSecretText.add("Secret 4 cont - Chest");
					break;
				case "chambers":
					RenderGuiHandler.roomSecretsID = "chambers";
					RenderGuiHandler.maxSecrets = 7;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Superboom wall on either side leading to a chest");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 3 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Go down water stream to chest");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest behind superboom wall");
					break;
				case "market":
					RenderGuiHandler.roomSecretsID = "market";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3/4 - Bat & wither essence under superboom");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
					break;
				case "lava-ravine":
					RenderGuiHandler.roomSecretsID = "lava-ravine";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest behind superboom");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Item drop");
					RenderGuiHandler.currentSecretText.add("Secret 4/5 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 4/5 cont - Chests");
					RenderGuiHandler.currentSecretText.add("Secret 6 - Bat");
					break;
				case "melon":
					RenderGuiHandler.roomSecretsID = "melon";
					RenderGuiHandler.maxSecrets = 6;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest inside pile of melons (Break the melons)");
					RenderGuiHandler.currentSecretText.add("Secret 2/3 - Bat & Chest behind superboom wall");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 5 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 6 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 7 - Chest");
					break;
				case "well":
					RenderGuiHandler.roomSecretsID = "well";
					RenderGuiHandler.maxSecrets = 5;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2/3 - 2 Wither essences");
					RenderGuiHandler.currentSecretText.add("Secret 4 - Item (left), Secret 5 - Chest (right)");
					RenderGuiHandler.currentSecretText.add("Secret 6 - Item");
					RenderGuiHandler.currentSecretText.add("Secret 7 - Chest behind superboom wall");
					break;
				case "spider":
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
					break;
			}
		} else if(SecretOverride.args0.toLowerCase().equals("puzzles") ) {
			RenderGuiHandler.roomShape="puzzles";
			switch (SecretOverride.args1) {
				case "blaze":
					RenderGuiHandler.roomSecretsID = "blaze";
					RenderGuiHandler.maxSecrets = 1;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					break;
				case "tictactoe":
					RenderGuiHandler.roomSecretsID = "tictactoe";
					RenderGuiHandler.maxSecrets = 2;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					break;
				case "crusher":
					RenderGuiHandler.roomSecretsID = "crusher";
					RenderGuiHandler.maxSecrets = 4;
					RenderGuiHandler.currentSecretText.add("Lever 1 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 1 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Lever for room completion");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Bat");
					break;
				case "arrow":
					RenderGuiHandler.roomSecretsID = "arrow";
					RenderGuiHandler.maxSecrets = 5;
					RenderGuiHandler.currentSecretText.add("Secret 1 - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 2 - Lever");
					RenderGuiHandler.currentSecretText.add("Secret 2 cont - Chest");
					RenderGuiHandler.currentSecretText.add("Secret 3 - Bat");
					RenderGuiHandler.currentSecretText.add("Lever for room completion");
					break;
		
			}
		} else {
			Utils.errMsg("[sys]: Failed to find secret!");
			return;
		}
	}
}
