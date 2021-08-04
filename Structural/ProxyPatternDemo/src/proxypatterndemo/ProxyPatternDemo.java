package proxypatterndemo;

/*
    @Author : Fritson Agung Julians Ayomi - 10116076
*/

public class ProxyPatternDemo {


    public static void main(String[] args) {
        
        ShopEmployee Rizky = new ShopEmployee("OW01", "Rizky Zein", "Owner");
        ProxyWarehouseAccess ownerProxyWarehouseAccess = new ProxyWarehouseAccess(Rizky);
        ownerProxyWarehouseAccess.grantWarehouseAccess();
        
        ShopEmployee Fikih = new ShopEmployee("MG01", "Fikih Zaman", "Warehouse Manager");
        ProxyWarehouseAccess managerProxyWarehouseAccess = new ProxyWarehouseAccess(Fikih);
        managerProxyWarehouseAccess.grantWarehouseAccess();
        
        ShopEmployee Bobby = new ShopEmployee("KS01", "Bobby Chandra", "Cashier");
        ProxyWarehouseAccess cashierProxyWarehouseAccess = new ProxyWarehouseAccess(Bobby);
        cashierProxyWarehouseAccess.grantWarehouseAccess();
    }
    
}
