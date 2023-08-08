public class Item01 {
    public static void main(String[] args) {
        // 2장 - 객체 생성과 파괴

    }

    // 메서드 시그니처 : 메소드 이름, 메소드 파라미터
    // 장점 5가지가 있음
    // 1. 이름이 있음. -> 기본 생성자아 다르게 이름이 있기떄문에 바로 확인이 가능함.
    // 2. 호출 마다 인스턴스를 재 생성안해도됨. 불변 클래스유지가능, 플레이웨이트 패턴(구조)과 비슷한 기법임.
    // 플레이 웨이트 패턴 : 각 객체에 모든 데이터를 유지하는 대신 여러 객체들 간에 상태의 공통 부분들을 공유하여 사용할 수 있는 RAM에 더 많은 객체들을 포함할 수 있도록 하는 구조 디자인 패턴
    // 3. 반환 타입의 하위 타입 객체를 반환 할수있다. -> companion object ( 클래스 정보 적재와 객체 선언이 동시에 이루어짐)
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

}
