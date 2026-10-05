//given array of integers determine minimum element from given array 
//executable class as it contains main(). Note that in java class is a basic unit for every java program.
//so all programming statements must be a part of class definition except for 2 statements 
//a.package b.import 
class Prog1{
	// this is standard type signature of main() method (function)
	public static void main(String args[]){
	//self inititalised array 
	int nos[]={10,0,7-6,17,20};
	System.out.print("nos[]contains");//system is a built in class in java.out
					//represents o/p stream & print() is a method 
	for(int i=0;i<nos.length();i++) //length is a property (data member) of an array 
		System.out.print(nos[i] + " ");
	int min = getMinElement(nos);
	System.out.print("\nMin element from nos[] is " + min);
}
