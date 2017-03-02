package uk.co.dev.paperround;

import uk.co.dev.report.DeliveryReport;
import uk.co.dev.report.StreetReport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Admin on 01/03/2017.
 */
public class PaperRoundService {

    public PaperRoundService(FileService fileService) {
        this.fileService = fileService;
    }

    private FileService fileService;


    public StreetReport getReport(String fileName) {
        StreetReport report = new StreetReport();
        List<Integer> houseNumbers = fileService.getFile(fileName);
        report.setValid(houseNumbers.size() > 0);
        report.setNoOfHousesInAStreet(houseNumbers.size());
        report.setNoOfHousesInNorthSideOfStreet(new Long(houseNumbers.stream().filter(s -> s % 2 > 0).count()).intValue());
        report.setNoOfHousesInSouthSideOfStreet(new Long(houseNumbers.stream().filter(s -> s % 2 == 0).count()).intValue());
        return report;
    }

    public DeliveryReport getDeliveryReportZigzagAproach(String fileName) {
        DeliveryReport deliveryReport = new DeliveryReport();
        List<Integer> houseNumbers = fileService.getFile(fileName).stream().sorted().collect(Collectors.toList());
        List<Integer> northHouseNumbers = houseNumbers.stream().filter(s -> s % 2 > 0).collect(Collectors.toList());
        List<Integer> southHouseNumbers = houseNumbers.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        deliveryReport.setNoOfTimeRoadCrosed(northHouseNumbers.size()>southHouseNumbers.size()?southHouseNumbers.size():northHouseNumbers.size());
        Comparator<Integer> compartorForInt= (i,j)-> i.compareTo(j);
        houseNumbers.sort(compartorForInt);
        deliveryReport.setOrderOfHouse(houseNumbers);
        return deliveryReport;
    }

    public DeliveryReport getDeliveryReportLinearAproach(String fileName) {
        DeliveryReport deliveryReport = new DeliveryReport();
        List<Integer> houseNumbers = fileService.getFile(fileName).stream().sorted().collect(Collectors.toList());
        deliveryReport.setNoOfTimeRoadCrosed(2);
        List<Integer> orderNouseNumbers = new ArrayList<>();
        orderNouseNumbers.addAll(houseNumbers.stream().filter(s -> s % 2 > 0).collect(Collectors.toList()));
        orderNouseNumbers.addAll(houseNumbers.stream().filter(s -> s % 2 == 0).sorted(Collections.reverseOrder()).collect(Collectors.toList()));
        deliveryReport.setOrderOfHouse(orderNouseNumbers);
        return deliveryReport;
    }

}