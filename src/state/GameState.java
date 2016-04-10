
package state;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import org.omg.CORBA.MARSHAL;

import entities.HUD;
import entities.Marks;
import entities.MusicSet;
import entities.Player;
import entities.Sounds;
import gfx.Assets;
import hw4.Handler;
import music.Sound;
import world.World;

public class GameState extends State{
	private Player player;
	public HUD hud;
	private Marks marks;
	private Marks[] musicNotes;
	
	public GameState(Handler handler) {
		super(handler);
		player = new Player(handler, 450, 200);
		musicNotes=new Marks[157];
		hud = new HUD();	
		setUp();
	}
	
	public void setUp(){
		marks = new Marks(handler, (float) 125*6+15, (float)-860.00053796);  musicNotes[0] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-958.62282008);  musicNotes[1] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-1068.97566056);  musicNotes[2] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-1166.2694871200001);  musicNotes[3] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-1273.5673442000002);  musicNotes[4] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-1687.79465552);  musicNotes[5] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-2125.55759252);  musicNotes[6] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-2525.6837708000003);  musicNotes[7] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-2817.57230396);  musicNotes[8] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-2924.51228252);  musicNotes[9] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-2970.8680562);  musicNotes[10] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-3018.74899844);  musicNotes[11] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-3128.9566274);  musicNotes[12] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-3229.17522836);  musicNotes[13] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-3333.83386376);  musicNotes[14] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-3384.59255744);  musicNotes[15] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-3435.20256884);  musicNotes[16] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-3537.38661908);  musicNotes[17] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-3639.6658349599998);  musicNotes[18] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-3740.749883);  musicNotes[19] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-3787.3035452);  musicNotes[20] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-3841.3307289199997);  musicNotes[21] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-3952.13622164);  musicNotes[22] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-4049.59362104);  musicNotes[23] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-4153.48886048);  musicNotes[24] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-4204.7011581199995);  musicNotes[25] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-4254.338241439999);  musicNotes[26] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-4359.58516808);  musicNotes[27] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-4459.95015608);  musicNotes[28] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-4565.21729156);  musicNotes[29] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-4667.28216092);  musicNotes[30] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-4765.06172384);  musicNotes[31] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-4822.82443676);  musicNotes[32] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-4868.85558392);  musicNotes[33] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-4984.60129028);  musicNotes[34] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-5074.273416800001);  musicNotes[35] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-5187.264191360001);  musicNotes[36] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-5283.055913120001);  musicNotes[37] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-5389.527285080001);  musicNotes[38] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-5484.225498200001);  musicNotes[39] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-5594.604705080002);  musicNotes[40] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-5692.568161520002);  musicNotes[41] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-5798.294386880002);  musicNotes[42] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-5901.353960480002);  musicNotes[43] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-5998.790143640002);  musicNotes[44] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-6101.935422320002);  musicNotes[45] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-6207.010826960001);  musicNotes[46] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-6631.421584040001);  musicNotes[47] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-6816.684688880001);  musicNotes[48] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-7026.587116160001);  musicNotes[49] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-7132.431122960001);  musicNotes[50] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-7235.165230400001);  musicNotes[51] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-7342.39244096);  musicNotes[52] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-7444.665163160001);  musicNotes[53] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-7505.61810656);  musicNotes[54] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-7550.3337854);  musicNotes[55] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-7598.7540926);  musicNotes[56] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-7650.04476188);  musicNotes[57] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-7745.90897744);  musicNotes[58] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-7853.40371528);  musicNotes[59] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-7902.27897008);  musicNotes[60] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-7954.8104306000005);  musicNotes[61] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-8060.710473200001);  musicNotes[62] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-8162.2213668800005);  musicNotes[63] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-8269.81418132);  musicNotes[64] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-8370.202289);  musicNotes[65] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-8467.66523036);  musicNotes[66] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-8572.27298024);  musicNotes[67] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-8678.86459664);  musicNotes[68] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-8723.3596592);  musicNotes[69] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-8779.3156256);  musicNotes[70] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-8884.72377404);  musicNotes[71] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-8985.46640144);  musicNotes[72] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-9090.177434000001);  musicNotes[73] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-9191.32742612);  musicNotes[74] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-9287.30891924);  musicNotes[75] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-9392.176583);  musicNotes[76] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-9499.77180464);  musicNotes[77] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-9599.53517816);  musicNotes[78] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-9703.846739120001);  musicNotes[79] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-9806.140565720001);  musicNotes[80] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-9911.62736564);  musicNotes[81] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-10012.03529012);  musicNotes[82] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-10116.17202632);  musicNotes[83] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-10215.84180176);  musicNotes[84] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-10317.5439782);  musicNotes[85] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-10415.75201024);  musicNotes[86] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-10520.344701439999);  musicNotes[87] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-10623.000101239999);  musicNotes[88] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-10730.288161879998);  musicNotes[89] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-10830.130075039999);  musicNotes[90] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-10929.14432756);  musicNotes[91] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-11072.5938002);  musicNotes[92] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-11150.42312912);  musicNotes[93] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-11354.40664868);  musicNotes[94] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-11555.66149088);  musicNotes[95] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-11761.85576312);  musicNotes[96] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-11970.54975536);  musicNotes[97] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-12075.05455844);  musicNotes[98] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-12183.296570120001);  musicNotes[99] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-12280.05024788);  musicNotes[100] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-12376.983173);  musicNotes[101] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-12475.936911320001);  musicNotes[102] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-12578.00491556);  musicNotes[103] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-12682.6666298);  musicNotes[104] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-12783.4449164);  musicNotes[105] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-12847.21207424);  musicNotes[106] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-12894.97344368);  musicNotes[107] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-12992.891276600001);  musicNotes[108] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-13100.32522052);  musicNotes[109] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-13204.73009972);  musicNotes[110] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-13303.52541536);  musicNotes[111] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-13404.25891808);  musicNotes[112] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-13503.112508600001);  musicNotes[113] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-13610.055789920001);  musicNotes[114] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-13716.267135920001);  musicNotes[115] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-13822.460120480002);  musicNotes[116] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-13926.141125480002);  musicNotes[117] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-14025.904051160001);  musicNotes[118] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-14131.484393360002);  musicNotes[119] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-14233.472290520001);  musicNotes[120] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-14330.915583080001);  musicNotes[121] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-14434.453447760001);  musicNotes[122] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-14539.596644000001);  musicNotes[123] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-14640.295775120001);  musicNotes[124] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-14695.516335440001);  musicNotes[125] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-14749.40334584);  musicNotes[126] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-14850.661826840002);  musicNotes[127] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-14951.220168920001);  musicNotes[128] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-15051.597584480001);  musicNotes[129] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-15156.513726800002);  musicNotes[130] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-15259.072113680002);  musicNotes[131] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-15362.764818320002);  musicNotes[132] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-15467.761907360002);  musicNotes[133] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-15573.991446800002);  musicNotes[134] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-15673.207954160003);  musicNotes[135] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-15772.193097080004);  musicNotes[136] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-15871.116998240004);  musicNotes[137] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-15982.573983320004);  musicNotes[138] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-16086.875803760004);  musicNotes[139] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-16192.188450800004);  musicNotes[140] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-16288.880886800003);  musicNotes[141] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-16392.418247720005);  musicNotes[142] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-16496.249726240003);  musicNotes[143] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-16605.84818336);  musicNotes[144] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-16698.860678120003);  musicNotes[145] = marks;
		marks = new Marks(handler, (float) 125*5+15, (float)-16803.827482040004);  musicNotes[146] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-16903.827482120003);  musicNotes[147] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-16974.70362128);  musicNotes[148] = marks;
		marks = new Marks(handler, (float) 125*1+15, (float)-17016.7955288);  musicNotes[149] = marks;
		marks = new Marks(handler, (float) 125*0+15, (float)-17118.27165908);  musicNotes[150] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-17218.348687280002);  musicNotes[151] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-17318.070467840003);  musicNotes[152] = marks;
		marks = new Marks(handler, (float) 125*3+15, (float)-17425.514544080004);  musicNotes[153] = marks;
		marks = new Marks(handler, (float) 125*6+15, (float)-17524.036230560003);  musicNotes[154] = marks;
		marks = new Marks(handler, (float) 125*4+15, (float)-17630.984102240003);  musicNotes[155] = marks;
		marks = new Marks(handler, (float) 125*2+15, (float)-17735.567388920004);  musicNotes[156] = marks;


	}
	
	public void tick(){
		player.tick();
		hud.tick();
		for (int i = 0; i < musicNotes.length; i++) {
			if (musicNotes[i].show=true) {
				musicNotes[i].tick();
			}
			if (i==156&& musicNotes[i].getY()<-20000) {
				setState(handler.getGame().scoreState);
			}
		}
	}
	
	public void render(Graphics graphics) {
		graphics.drawImage(Assets.background1, 0, 0, null);
		hud.render(graphics);
		player.render(graphics);	
		for (int i = 0; i < musicNotes.length; i++) {
			if (musicNotes[i].show=true) {
				musicNotes[i].render(graphics);
			}
		}
	}
}
