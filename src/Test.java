/**
 *
 * @author Thiwanka
 */
public class Test {
    public static void main(String[] args) {
        
        desktopPc dp = new desktopPc(new MSI(),new X592());
        dp.createCom();
        laptopPc lp = new laptopPc(new Acer(), new Z124());
        lp.createCom();       
    }  
}


abstract class computerType{  //Super class
    
    Brand brand;
    Model model;
    String RAM = "RAM - 8GB";
    String GPU = "GPU - Nvidia x20 2GB";
    String SSD = "SSD - Kingston 250GB";
    

    public computerType(Brand brand,Model model) {
        this.brand = brand;
        this.model = model;
    }
public abstract void createCom();
}
 


class desktopPc extends computerType{

    public desktopPc(Brand brand,Model model) {
        super(brand,model);
    }
    
    @Override
    public void createCom() {
        System.out.println("Create Desktop Computer");
        model.fillModel();
        brand.fillBrand();
        System.out.println(super.RAM);
        System.out.println(super.GPU);
        System.out.println(super.SSD);
    }
    
}
class laptopPc extends computerType{

    public laptopPc(Brand brand,Model model) {
        super(brand,model);
    }
  
    @Override
    public void createCom() {
        System.out.println("Create Laptop Computer");
        model.fillModel();
        brand.fillBrand();
        System.out.println(super.RAM);
        System.out.println(super.GPU);
        System.out.println(super.SSD);
    }
    
}
interface Brand{
   public abstract void fillBrand(); 
}
class MSI implements Brand{

    @Override
    public void fillBrand() {
        System.out.println("Desktop Brand is MSI");
    }
    
}
class Acer implements Brand{

    @Override
    public void fillBrand() {
        System.out.println("Laptop Brand is Acer");
    }
    
}
interface Model{
    public abstract void fillModel();
}
class X592 implements Model{

    @Override
    public void fillModel() {
        System.out.println("Desktop model is X592");
    }
    
}
class Z124 implements Model{

    @Override
    public void fillModel() {
        System.out.println("Laptop model is Z124"); 
    }
    
}
