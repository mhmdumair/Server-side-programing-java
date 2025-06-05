package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CovidScraper {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.worldometers.info/coronavirus/").get();
            CovidData covidData = new CovidData();
            covidData.setTotalCases(doc.select("div.maincounter-number span").get(0).text());
            covidData.setTotalDeaths(doc.select("div.maincounter-number span").get(1).text());
            covidData.setRecovered(doc.select("div.maincounter-number span").get(2).text());
            covidData.setActiveCases(doc.select("div.number-table-main").get(0).text());
            covidData.setClosedCases(doc.select("div.number-table-main").get(1).text());
            System.out.println(covidData.printData());


        }catch (Exception e){
            System.out.println(e);;
            System.out.println("Error");
        }

    }

    private static class CovidData{
        private String totalCases;
        private String totalDeaths;
        private String recovered;
        private String activeCases;
        private String closedCases;

        public String getTotalCases() {
            return totalCases;
        }

        public void setTotalCases(String totalCases) {
            this.totalCases = totalCases;
        }

        public String getTotalDeaths() {
            return totalDeaths;
        }

        public void setTotalDeaths(String totalDeths) {
            this.totalDeaths = totalDeths;
        }

        public String getRecovered() {
            return recovered;
        }

        public void setRecovered(String recovered) {
            this.recovered = recovered;
        }

        public String getActiveCases() {
            return activeCases;
        }

        public void setActiveCases(String activeCases) {
            this.activeCases = activeCases;
        }

        public String getClosedCases() {
            return closedCases;
        }

        public void setClosedCases(String closedCases) {
            this.closedCases = closedCases;
        }

        public String printData(){
            return String.format("Total Cases %s\n Total Deaths %s\n Recovered %s\n Active Cases %s\n Closed Cases %s\n",this.totalCases,
                    this.totalDeaths,this.recovered,this.activeCases,this.closedCases);
        }
    }
}
