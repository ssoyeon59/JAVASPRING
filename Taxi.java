package SA;

public class Taxi extends Transport{
    String destination; //목적지  ""
    int drive; //목적지까 거리
    int basicDent = 1; //기본거리
    int basicRate = 3000; //기본요금
    int farePerDist = 1000; //거리당 요금

    //기능
    int extraChargePerDist; //거리당 추가요금
    String payment; //요금결제 "cash", "card"

    public static void main(String[] args) {
        Transport taxi = new Transport();

        taxi.maxPeoples = 4;

        System.out.println(taxi.maxPeoples);

    }
}
