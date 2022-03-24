package homeWork;

public final class Stantions {
    private String name;

    public Stantions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) throws StationException {
        if (name == "Orsha") {
            throw new StationException("This stantion is close");
        } else {
            this.name = name;
        }
    }
}
