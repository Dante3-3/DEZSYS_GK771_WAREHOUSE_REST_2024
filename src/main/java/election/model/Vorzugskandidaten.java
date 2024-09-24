package election.model;

public class Vorzugskandidaten {
    private String partyID;
    private int listenNummer;
    private String name;
    private int stimmen;

    public Vorzugskandidaten(String partyID, int listenNummer, String name, int stimmen) {
        this.partyID = partyID;
        this.listenNummer = listenNummer;
        this.name = name;
        this.stimmen = stimmen;
    }

    // Getters and setters
    public String getPartyID() { return partyID; }
    public void setPartyID(String partyID) { this.partyID = partyID; }

    public int getListenNummer() { return listenNummer; }
    public void setListenNummer(int listenNummer) { this.listenNummer = listenNummer; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getStimmen() { return stimmen; }
    public void setStimmen(int stimmen) { this.stimmen = stimmen; }
}
