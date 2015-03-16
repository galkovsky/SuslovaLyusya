
public class Bookshelf {
int height;
int width;

Bookshelf (int height, int width){
	
	this.height = height;
	this.width = width;
    
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Bookshelf other = (Bookshelf) obj;
    if (height != other.height)
        return false;
    if (width != other.width)
        return false;
    return true;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + height;
    result = prime * result + width;
    return result;
}
}
