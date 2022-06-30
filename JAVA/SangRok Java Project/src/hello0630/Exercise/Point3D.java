package hello0630.Exercise;

public class Point3D {
    public int x, y, z;

    public Point3D(){
        this(0,0,0);
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public boolean equals(Object obj){
        try{
            if((this.x == ((Point3D)obj).x) && (this.y == ((Point3D)obj).y) && 
                (this.z == ((Point3D)obj).z)){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            return false;
        }
    }

    public String toString(){
        return "Point3D[" + x + "," + y + "," + z + "]";
    }
}
