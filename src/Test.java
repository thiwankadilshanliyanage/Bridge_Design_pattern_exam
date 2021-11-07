/**
 *
 * @author Thiwanka
 */
public class Test {
    public static void main(String[] args) {
        
    }
    
}

abstract class computerType{
    
    String RAM = "8GB";
    String GPU = "Nvidia x20 2GB";
    String SSD = "Kingston 250GB";
    
    Brand brand;
    Model model;

    public computerType(Brand brand,Model model) {
    }
 
public abstract void createCom();
}


class desktopPc extends computerType{

    public desktopPc(Brand brand,Model model) {
        super(brand,model);
    }
    
    @Override
    public void createCom() {
        
    }
    
}
class laptopPc extends computerType{

    public laptopPc(Brand brand,Model model) {
        super(brand,model);
    }
  
    @Override
    public void createCom() {
        
    }
    
}
interface Brand{
   public abstract void fillBrand(); 
}
class MSI implements Brand{

    @Override
    public void fillBrand() {
        
    }
    
}
class Acer implements Brand{

    @Override
    public void fillBrand() {
        
    }
    
}
interface Model{
    public abstract void fillModel();
}
class X592 implements Model{

    @Override
    public void fillModel() {
        
    }
    
}
class Z124 implements Model{

    @Override
    public void fillModel() {
        
    }
    
}
