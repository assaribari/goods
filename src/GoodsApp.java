
public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Goods camera = new Goods();
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		Goods camera2 = new Goods("Canon", 200, 300, 500000);
		
		System.out.println("상품이름:" + camera.getName() );
		System.out.println("상품가격:" + camera.getPrice());
		System.out.println("재고수량:" + camera.getCountStock());
		System.out.println("팔린수량:" + camera.getCountSold());
		System.out.println("상품이름:" + camera2.getName() );
		System.out.println("상품가격:" + camera2.getPrice());
		System.out.println("재고수량:" + camera2.getCountStock());
		System.out.println("팔린수량:" + camera2.getCountSold());
		
	}	

}
