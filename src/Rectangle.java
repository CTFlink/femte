public class Rectangle {

    public int x;
    public int y;
    public int width, height;

    public Rectangle(int x, int y, int w, int h) {
        // This initializes our x, y, width, and height properties to what is passed in.
        this.x = x;    // We set our current object's x property to the x we're given.
        this.y = y;    // We have to specify which y is which, so we use this.y to indicate the current object, and y to specify the parameter we're given.
        width = w;     // We can leave off the "this" part if there's nothing else named "width" visible in the method.
        height = h;
    }

}