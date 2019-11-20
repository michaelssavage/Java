public class GroupBoxers{

	public static void main(String[] args){

		//A boxer has a name, height, reach, fights, wins, losses
		Boxer[] boxList = {

			new Boxer("Floyd Mayweather","172cm", "72in", 50, 50, 27),
			new Boxer("Mike Tyson","178cm", "71in", 58, 50, 44),
			new Boxer("Muhammad Ali","191cm", "78in", 61, 56, 37),
			new Boxer("Anthony Joshua","198cm", "82in", 23, 22, 21)
		};

		Boxer best = Best.getBestBoxer(boxList);
		System.out.println(best.getName() + " is the best boxer in terms of" 
			+ " win ratio with " + best.winPercentage() + "%.");

		Boxer tallest = Best.getTallest(boxList);
		System.out.println(tallest.getName() + " is the tallest boxer" 
			+ " with a height of " + tallest.getHeight() + ".");
	}
}
