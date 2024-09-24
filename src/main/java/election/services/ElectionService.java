package election.services;

import election.model.ElectionData;
import org.springframework.stereotype.Service;

@Service
public class ElectionService {
    public ElectionData getElectionData(int eID) {
        ElectionSimulation simulation = new ElectionSimulation();
        return simulation.getData(eID);
    }
}
