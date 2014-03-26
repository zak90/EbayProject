package tests;

import java.util.Date;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dataAccessLayer.Buyer;
import dataAccessLayer.Objet;
import dataAccessLayer.Offre;
import dataAccessLayer.Seller;

public class TestEnchere {

		private Buyer buyer;
		private Seller seller;
		
		@Before
		public void setUp() throws Exception
		{
			System.out.println("Start");
			
			this.buyer= new Buyer();
			this.buyer.setMail("MIMI");
			this.buyer.setNom("MAMA");
			this.buyer.setPrenom("MIMI");
			this.buyer.setNumber("MEME");
			this.seller=new Seller();
			this.seller.setMail("TOTO");
			this.seller.setNom("TATAr");
			this.seller.setPrenom("TITI");
			this.seller.setNumber("TETE");
		}
		
		@After
		public void tearDown() throws Exception
		{
			System.out.println("Fin");
		}
		
		
		@Test
		public void testObjetRecognition(){
			Objet i=new Objet(1,"description");
			Assert.assertTrue(1==i.getId());
			Assert.assertFalse(2==i.getId());
		}
		
		public void testOffreRecognition(){
			Offre o= new Offre(this.buyer,1000);
			Assert.assertTrue(o.getBuyer()==this.buyer&&o.getPrix()==1000);
			Assert.assertFalse(o.getSeller==this.seller&&o.getPrix()==1000);
		}
		
		@Test
		public void testOffre(){
			try {
				this.seller.creerEnchere(1, "Descritption de l'objet d'id 1",10,20,5);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Assert.assertFalse(this.buyer.depotOffre(this.seller.creerEnchere(1, "Descritption de l'objet d'id 1",10,20,5), 9));
				this.seller.publishAuction(AuctionHouse.getInstance().getAuction(new Date(2013, 06, 02, 13, 13)).getId());
				
			} catch (Exception e) {
				Assert.fail();
			}		
		}
		
		
	
}
