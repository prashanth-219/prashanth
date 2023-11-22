package Interfaces;

class A{//PARENT
	String a;
	int b;
	char c;
	void property() {
		System.out.println("property:"+a+" "+b+" "+c);
	}
}

class B  {//CHILD
	String d;
	float e;
	char f;
	void elements() {
		System.out.println("elements:"+d+" "+e+" "+f);
	}
}
class C {//MULTILEVEL/child
	char c;
	int b;
	void add() {
		System.out.println("elements:"+c+" "+b);
		
	}
}
class D extends A{//child
	String a;
	int b;
	void show() {
		System.out.println("elements :"+a+" "+b);
	}
	
	
}
public class interfaces {

	public static void main(String[] args) {
			A n=new A();
			n.a="spiderman";
			n.b=30;
			n.c='N';
			n.property();
		B o=new B();
		o.d="spiderman";
		o.e=30;
		o.f='N';
		o.elements();
	  C x=new C();
		x.c='N';
		x.b=30;
		x.add();
	D y=new D();
		y.a="spiderman";
		y.b=30;
		y.show();
	}
}
