package SA;

public class Bus extends Transport{

    int nowPeople;

    public static void main(String[] args) {
        Transport bus = new Transport();

        bus.maxPeoples = 30; //최대승객수 30
        bus.operation = "운행"; //상태 운행
        int rate = 1000; //요금

        //1. 버스 2대 선언
        Bus bus1 = new Bus();
        bus1.num = 1;

        Bus bus2 = new Bus();
        bus2.num = 2;
        System.out.println("출력");
        System.out.println(bus1.num);
        System.out.println(bus2.num);

        System.out.println("-------------------------------");

        bus1.nowPeople = 2;
        bus1.maxPeoples = 30;
        System.out.println("탑승승객수 = " + bus1.nowPeople);
        System.out.println("잔여 승객 수 = " + (bus1.maxPeoples-bus1.nowPeople));
        System.out.println("요금 확인 = " + (bus1.nowPeople * rate));
        System.out.println("-------------------------------");

        bus1.volume = volume-50;
        System.out.println("주유량 = " + bus1.volume);
        System.out.println("-------------------------------");

        bus1.operation = "차고지행";
        bus1.volume = bus1.volume + 10;
        System.out.println("상태 = " + bus1.operation);
        System.out.println("주유량 = " + bus1.volume);

        bus1.operation = "운행중";
        System.out.println("상태 = " + bus1.operation);

        bus1.nowPeople = bus1.nowPeople + 45;
        System.out.println("alert('최대 승객수 초과')");
        System.out.println("-------------------------------");

        bus1.nowPeople = 5;
        bus1.maxPeoples = 30;
        System.out.println("탑승승객수 = " + bus1.nowPeople);
        System.out.println("잔여 승객 수 = " + (bus1.maxPeoples-bus1.nowPeople));
        System.out.println("요금 확인 = " + (bus1.nowPeople * rate));
        System.out.println("-------------------------------");

        bus1.volume = bus1.volume -55;
        bus1.operation = "차고지행";
        System.out.println("주유량 = " + bus1.volume);
        System.out.println("상태 = " + bus1.operation);
        System.out.println("alert('주유 필요')");
    }
}
