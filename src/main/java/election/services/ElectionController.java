package election.services;

import election.model.ElectionData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectionController {

    @Autowired
    private ElectionService electionService;

    @RequestMapping("/")
    public String electionMain() {
        return "This is the election application! (DEZSYS_Election_REST) <br/><br/>" +
                "<a href='/election/001/json'>Link to Election/001/json</a><br/>" +
                "<a href='/election/001/xml'>Link to Election/001/xml</a><br/>";
    }

    @RequestMapping(value = "/election/{id}/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public ElectionData getElectionDataJSON(@PathVariable int id) {
        return electionService.getElectionData(id);
    }

    @RequestMapping(value = "/election/{id}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ElectionData getElectionDataXML(@PathVariable int id) {
        return electionService.getElectionData(id);
    }
}
