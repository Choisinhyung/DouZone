package weightPro;

public class WeightDto {
	
	protected int weight;
	protected int height;
	
	
	public WeightDto() {
		
	}
	
	public WeightDto(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void display() {
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
//	@Override
//	public String toString() {
//		return "WeightDto [weight=" + weight + ", height=" + height + "]";
//	}
	
}
