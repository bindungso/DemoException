import java.util.HashMap;


public class Test {
	public static void main(String[] args) {

		HashMap<String, Double> mathang = new HashMap<>();
		mathang.put("Quần", 19.9);
		mathang.put("Áo", 18.7);
		mathang.put("Sách",9.9);
		mathang.put("Giày",20.1);
		String tenSP = "Vở";
		try {
			System.out.println(getSanPham(mathang, tenSP));
		} catch (NoSuchProducException e) {
			System.out.println(e.getMessage());
		}
	}
	private static double getSanPham(HashMap<String, Double> hm,String tenSP) throws NoSuchProducException
	{
		if(hm.get(tenSP) == null)
		{
			throw new NoSuchProducException("Không có sản phẩm trong cửa hàng");
		}
		return hm.get(tenSP);
	}
}
