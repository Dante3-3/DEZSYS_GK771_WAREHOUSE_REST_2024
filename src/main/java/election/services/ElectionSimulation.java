package election.services;

import election.model.ElectionData;
import election.model.Party;
import election.model.Vorzugskandidaten;

import java.util.ArrayList;
import java.util.Random;

public class ElectionSimulation {

	public int generateRandomNumber(int bisNummer){
		Random zufall = new Random();
		return zufall.nextInt(bisNummer);
	}

	public ElectionData getData(int eID) {
		// Create election data
		ElectionData data = new ElectionData(
				eID, "TGM - Technologisches Gewerbe Museum", "Wexstraße 19-23", "Vienna", "Austria", new ArrayList<>()
		);

		// Create preference candidates
		ArrayList<Vorzugskandidaten> candidatesO = new ArrayList<>();
		candidatesO.add(new Vorzugskandidaten("OEVP", 1, "Max Mustermann", generateRandomNumber(500)));
		candidatesO.add(new Vorzugskandidaten("OEVP", 1, "Anna Musterfrau", generateRandomNumber(200)));

		ArrayList<Vorzugskandidaten> candidates = new ArrayList<>();
		candidates.add(new Vorzugskandidaten("SPOE", 1, "Max Mustermann", generateRandomNumber(500)));
		candidates.add(new Vorzugskandidaten("SPOE", 1, "Anna Musterfrau", generateRandomNumber(200)));

		// Create parties
		ArrayList<Party> parties = new ArrayList<>();
		parties.add(new Party("OEVP", 322, candidatesO));
		parties.add(new Party("SPOE", 301, candidates));
		parties.add(new Party("FPOE", 231, new ArrayList<>()));
		parties.add(new Party("GRUENE", 211, new ArrayList<>()));

		data.setCountingData(parties);
		return data;
	}
}
