class CLA{
	public static void main(String[] args) {
		int add=0;
		for(int i =0 ; i< args.length;i++){
			int a =Integer.parseInt(args[i]);
			add=add+a;
		}
		System.out.println(add);
	}
}