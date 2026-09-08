class Complex{
int real , imag;
Complex(){
	real = imag=1;
}
Complex(int r, int i){
	real =r;
	imag =i;
}
Complex addComplex(Complex c2){
	Complex temp = new Complex();
	temp.real= real+c2.real;
	temp.imag= imag+c2.imag;
	return temp;

}
void getData(){
	System.out.println("real : "+real);
	System.out.println("imag : "+imag);
}
}
class ComplexMain{
	public static void main(String[] args) {
		Complex c1 = new Complex(2,4);
		Complex c2 = new Complex(5,1);
		Complex c3 = c1.addComplex(c2);
		c3.getData();
	}
}