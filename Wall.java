public class Wall{
    public String name;
    public double width;
    public double height;

    public Wall(){
    }

    public Wall(double width,double height){
        this.width=width;
        this.height=height;
        if (width<0){
            width=0;
        }
        if (height<0){
            height=0;
        }
    }

    public void getArea(){

    }


}
