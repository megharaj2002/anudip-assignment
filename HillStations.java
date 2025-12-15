class HillStations {
    void location() {
        System.out.println("Location is:");
    }

    void famousFor() {
        System.out.println("Famous for:");
    }

    public static void main(String[] args) {
        HillStations hillStations = new HillStations();
        hillStations.location();
        hillStations.famousFor();

        HillStations manali = new Manali();
        manali.location();
        manali.famousFor();

        HillStations mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        HillStations gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}

class Manali extends HillStations {
    @Override
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    @Override
    void famousFor() {
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends HillStations {
    @Override
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    @Override
    void famousFor() {
        System.out.println("It is Famous for education institutions");
    }
}

class Gulmarg extends HillStations {
    @Override
    void location() {
        System.out.println("Gulmarg is in J&K");
    }

    @Override
    void famousFor() {
        System.out.println("It is Famous for skiing");
    }
}
