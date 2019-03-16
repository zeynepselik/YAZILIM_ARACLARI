package ornekMavenProje;

import org.junit.*;




public class HesapTest {
	//org.junit.Test
	
	@Test
	public void testTopla() {
		hesaplama h = new hesaplama();
		
		int sonuc = h.topla(345,453);
		Assert.assertEquals(798,sonuc);
		
	}
	@Test
	public void testFaktoriyel() {
		hesaplama h = new hesaplama();
		
		int sonuc = h.faktoriyel(10);
		Assert.assertEquals(3628800,sonuc);
		
	}

}
