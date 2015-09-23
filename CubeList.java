package Draft;

import java.util.ArrayList;
import java.util.List;

public class CubeList {

	String cardName = "Mox";
	String color = "Brown";
	String cardText = "Stuff";
	String power = "N/A";
	String toughness = null;
	String castingCost = "0";
	String url = "http://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=383022&type=card";

	List<Cards> cube = new ArrayList<Cards>();

	public void generateCube() {
		for (int i = 0; i < 360; i++) {
			String j = Integer.toString(i);
			String toughness = j;
			Cards c = new Cards(cardName, color, cardText, power, toughness, castingCost, url);
			cube.add(c);
		}
		// return cube;
	}

	public void setCube(List<Cards> cube) {
		this.cube = cube;
	}

	@Override
	public String toString() {
		for (Cards cubes : cube) {
			System.out.println("CubeList [cardName=" + cardName + ", color=" + color + ", cardText=" + cardText
					+ ", power=" + power + ", toughness=" + toughness + ", castingCost=" + castingCost + ", url=" + url
					+ ", cube=" + cube + "]" + "\n");
		}
		return "All done";
		// return "CubeList [cardName=" + cardName + ", color=" + color + ",
		// cardText=" + cardText + ", power=" + power
		// + ", toughness=" + toughness + ", castingCost=" + castingCost + ",
		// url=" + url + ", cube=" + cube + "]";
	}

}
