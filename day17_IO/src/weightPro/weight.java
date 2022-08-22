package weightPro;

import java.util.ArrayList;

public class weight extends WeightDto{
	
	ArrayList<WeightDto> list = new ArrayList<WeightDto>();
	
	weight() {
		
	}
	
	
	weight(int height, int wight) {
		WeightDto w = new WeightDto(height, weight);
		list.add(w);
	}

}
