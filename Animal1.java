package Assigment5;

public class Animal1 {
	 
	  class cat extends Animal1{
		public  void getvoice() {
			System.out.println("cat voice is mewoww");
		}
		public void geteat() {
			System.out.println("cat eats insetes");
		}
		public void getdrink() {
			System.out.println("cat dranks the milk");
		}
	 }
		class Dog extends Animal1{
			public  void getvoie() {
				System.out.println("Dog voice is bhubhu");
			}
			public void geteat() {
				System.out.println("dog eats cat");
			}
			public void getdrink() {
				System.out.println("dog dranks the mazaa");
			}
		}
			class cow extends Animal1{
				public  void getvoie() {
					System.out.println("cow voice is bhabha");
				}
				public void geteat() {
					System.out.println("co eats grass");
				}
				public void getdrink() {
					System.out.println("cow dranks the ater");
				}
				
			}
		
	

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 a=new Animal1();
		cat c=new cat();
		c.getdrink();
		c.geteat();
		c.getvoice();
		Dog d=new Dog();
		d.getdrink();
		d.geteat();
		d.getvoie();
		cow c1=new cow();
		c1.getdrink();
		c1.geteat();
		c1.getvoie();
	

	}

			}	

	