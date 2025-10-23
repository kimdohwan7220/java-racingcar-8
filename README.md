# 🚗 자동차 경주
## ⚙️ 기능 목록 구현

- constants : 에러 메시지를 관리한다.
    - 예외 발생시 `IllegalArgumentException` 예외를 출력하고 프로그램을 종료한다.
    - 이름이 5자 초과인 경우 에러
    - 입력 없을때 에러
    - 횟수 0보다 작을 경우 에러
    - 횟수에 숫자가 아닐 경우 에러

- ViewMessage : 출력 메시지를 관리한다.
- domain
  - Car : 객체 생성
  - Move : 이동 관련
  - RandomNumberGenerator : 0~9값 구하기
  - MoveRule : 움직일지 말지 판단한다.

- view
  - Inputview : 자동차 이름을 입력 받는다.
  - Outputview : 실행 결과를 출력한다.

- MainComtroller : view와 domain 연결
