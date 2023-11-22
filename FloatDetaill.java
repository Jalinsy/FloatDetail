public class FloatDetaill {
	public static void main(String[] args) {
		
		//java的浮点型常量（具体值）默认为double型，声明float型常量必须加‘f’或‘F’
		float n1 = 1.1F;
		double n2 = 1.1;
		double n3 = 1.1F;
		
	    //十进制数形式如: 3.24     324.0F     .324 (必须有小数点)
		double n5 = .324;
		System.out.println(n5);
		
		//科学计数法形式如: 3.24e2（3.24 * 10的2次方） 3.24E	-2（3.24 / 10的2次方）
		System.out.println(3.24e2);
		System.out.println(3.24E-2);
		
		
		//通常情况下，应该使用double型，应为它比float更精准
		//（举例说明）:
		double n9 = 1.12345678324;
		float n10 = 1.12345678324F;
		System.out.println(n9);
		System.out.println(n10);
		
		//浮点数使用陷阱: 2.7 和 8.1/3 比较
		double n11 = 2.7;
		double n12 = 8.1/3;
		double n13 = 2.7;
		System.out.println(n11);
		System.out.println(n12);//接近2.7的一个小数，而不是2.7
		//得到一个重要的使用点: 当我们对运算结果是小数的进行相等判断时，要小心
		//应该是以两个数的差值，在某个精度范围类判断
		if( n11 == n12) {
			System.out.println("相等");
		}
		if(Math.abs(n11 - n12) < 0.0001) {
			System.out.println("差值非常小，到我的规定范围，认为相等...");
		}
		System.out.println(Math.abs(n11 - n12));//相差值
	}
}