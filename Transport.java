package SA;

public class Transport {

    int num;
    static int volume = 100; //주유량 기본값 100
    int speed = 0; //속도 기본값 0
    int maxPeoples; //최대승객수

    //기능
    static String operation;//운행 "운행", "종료"
    int changeSpeed;
    String stateChange; //상태변경 "운행중", "차고지행"
    int passengerBoarding; //승객 탑승


}
