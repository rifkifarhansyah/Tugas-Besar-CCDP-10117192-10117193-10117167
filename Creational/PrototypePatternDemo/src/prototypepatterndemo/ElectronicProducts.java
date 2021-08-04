package prototypepatterndemo;

/*
    @Author : Fritson Agung Julians Ayomi - 10116076
*/

public class ElectronicProducts extends Products{
    
    public ElectronicProducts (String productId, String productName, double productPrice )
    {
        this.setProductId(productId);
        this.setProductName(productName);
        this.setProductPrice(productPrice);
    }
    
    @Override
    public void getProductType() {
        System.out.println("This is an Electronic Product");
    }
    
}
