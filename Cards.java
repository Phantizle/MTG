package Draft;

public class Cards {
	
	private String cardName;
	private String color;
	private String cardText;
	private String power;
	private String toughness;
	private String castingCost;
	private String url;
	
	
	
	public Cards(String cardName, String color, String cardText, String power, String toughness, String castingCost,
			String url) {
		super();
		this.cardName = cardName;
		this.color = color;
		this.cardText = cardText;
		this.power = power;
		this.toughness = toughness;
		this.castingCost = castingCost;
		this.url = url;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCardText() {
		return cardText;
	}
	public void setCardText(String cardText) {
		this.cardText = cardText;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getToughness() {
		return toughness;
	}
	public void setToughness(String toughness) {
		this.toughness = toughness;
	}
	public String getCastingCost() {
		return castingCost;
	}
	public void setCastingCost(String castingCost) {
		this.castingCost = castingCost;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
