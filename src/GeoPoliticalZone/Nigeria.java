package GeoPoliticalZone;

public enum Nigeria {
    NORTH_CENTRAL ("Benue", "FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NORTH_EAST("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NORTH_WEST ("Kaduna", "Kastina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTH_EAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_SOUTH("Akwa-Ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SOUTH_WEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");

    private String[] states;

    Nigeria(String... states){
        this.states = states;
    }
    public String[] getState(){
        return states;
    }
}
