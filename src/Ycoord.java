
//enums må starte på bokstav
public enum Ycoord {
	Y1 (0),
	Y2 (1),
	Y3 (2),
	Y4 (3),
	Y5 (4),
	Y6 (5),
	Y7 (6),
	Y8 (7);
    private final int index;   

    Ycoord(int index) {
        this.index = index;
    }

    public int index() { 
        return index; 
    }

}
