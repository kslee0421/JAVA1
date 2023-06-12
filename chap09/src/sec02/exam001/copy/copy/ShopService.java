package sec02.exam001.copy.copy;

public class ShopService {
	private static ShopService shopservice = new ShopService(); 
	
	private void ShopService(){};
	
	static ShopService getInstance(){
		return shopservice; 
	};
	
	
	
}
