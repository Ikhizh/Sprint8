public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        name.trim();

        if (name.length() >= 3 && name.length() <= 19 && name.contains(" ")){
            return true;
        }
        else {
            return false;
        }

    }

}