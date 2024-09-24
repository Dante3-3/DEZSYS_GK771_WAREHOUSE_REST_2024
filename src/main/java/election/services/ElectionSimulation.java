package election.services;

import election.model.ElectionData;
import election.model.Party;
import election.model.Vorzugskandidaten;

import java.util.ArrayList;

public class ElectionSimulation {

	public ElectionData getData(int eID) {
		// Create election data
		ElectionData data = new ElectionData(
				eID, "TGM - Technologisches Gewerbe Museum", "Wexstraße 19-23", "Vienna", "Austria", new ArrayList<>()
		);

		// Create preference candidates
		ArrayList<Vorzugskandidaten> candidates = new ArrayList<>();
		candidates.add(new Vorzugskandidaten("OEVP", 1, "Max Mustermann", 100));
		candidates.add(new Vorzugskandidaten("SPOE", 2, "Anna Musterfrau", 120));

		// Create parties
		ArrayList<Party> parties = new ArrayList<>();
		parties.add(new Party("OEVP", 322, candidates));
		parties.add(new Party("SPOE", 301, new ArrayList<>()));
		parties.add(new Party("FPOE", 231, new ArrayList<>()));
		parties.add(new Party("GRUENE", 211, new ArrayList<>()));

		data.setCountingData(parties);
		return data;
	}
}
