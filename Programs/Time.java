class TimeDemo{
int hour , min;
TimeDemo(){
	hour = min=1;
}
TimeDemo(int h, int m){
	hour =h;
	min =m;
}
TimeDemo addTime(TimeDemo t2){
	TimeDemo temp = new TimeDemo();
	temp.hour= hour+t2.hour;
	//temp.min= min+t2.min;
	if((min+t2.min)>=60){
		temp.hour+=1;
		temp.min=(min+t2.min)-60;
	}
	else{
		temp.min= min+t2.min;
	}
	return temp;

}
void getData(){
	System.out.println("hour : "+hour);
	System.out.println("min : "+min);
}
}
class Time{
	public static void main(String[] args) {
		TimeDemo t1 = new TimeDemo(1,60);
		TimeDemo t2 = new TimeDemo(1,60);
		TimeDemo t3 = t1.addTime(t2);
		t3.getData();
	}
}