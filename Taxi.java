package SA;

public class Taxi extends Transport{
    String destination; //목적지  ""
    int drive; //목적지까 거리
    int basicDent = 1; //기본거리
    int basicRate = 3000; //기본요금
    int farePerDist = 1000; //거리당 요금
    int people; //승객
    int maxPeople = 4;


    //기능
    int extraChargePerDist = basicDent * farePerDist; //거리당 추가요금
    String payment = "요금 결제"; //요금결제 "cash", "card"

    public static void main(String[] args) {
        Taxi taxi1 = new Taxi();
        taxi1.num = 1;
        Taxi taxi2 = new Taxi();
        taxi2.num = 2;
        Taxi.operation = "일반";

        System.out.println("각 Taxi 번호 다른지 확인 : " + (taxi1.num == taxi2.num));
        System.out.println("주유량 = " + volume);
        System.out.println("상태 = " + operation);
        System.out.println("-------------------------------");

        taxi1.people = 2;
        taxi1.destination = "서울역";
        taxi1.drive = 2;
        Taxi.operation = "운행중";
        System.out.println("탑승 승객 수 = " + taxi1.people);
        System.out.println("잔여 승객 수 = " + (taxi1.maxPeople - taxi1.people));
        System.out.println("기본 요금 확인 = "+ taxi1.basicRate);
        System.out.println("목적지 = " + taxi1.destination);
        System.out.println("목적지까지 거리 = " + taxi1.drive +"km");
        System.out.println("지불할 요금  = " + (taxi1.farePerDist + taxi1.basicRate));
        System.out.println("-------------------------------");

        taxi1.volume = volume - 80;
        System.out.println(taxi1.volume);
        System.out.println(taxi1.payment);
        System.out.println("-------------------------------");

        taxi1.people = taxi1.people + 5;
        System.out.println("alret('최대 승객 수 초과')");
        System.out.println("-------------------------------");

        taxi1.people = 3;
        taxi1.destination = "구로디지털단지역";
        taxi1.drive = 12;
        System.out.println("탑승 승객 수 = " + taxi1.people);
        System.out.println("잔여 승객 수 = " + (taxi1.maxPeople - taxi1.people));
        System.out.println("기본 요금 확인 = "+ taxi1.basicRate);
        System.out.println("목적지 = " + taxi1.destination);
        System.out.println("목적지까지 거리 = " + taxi1.drive +"km");
        System.out.println("지불할 요금  = " + (taxi1.farePerDist * (taxi1.drive-1) + taxi1.basicRate));
        System.out.println("-------------------------------");

        taxi1.volume = 20;
        Taxi.operation = "운행불가";
        System.out.println("주유량 = " + (taxi1.volume - 20));
        System.out.println("상태 = " + operation);
        System.out.println("누적 요금 = " + (taxi1.farePerDist * (taxi1.drive-1) + (taxi1.farePerDist + taxi1.basicRate) + taxi1.basicRate)+"원");
        System.out.println("alret('주유 필요')");
    }
}
