# 🚗 자동차 경주
## ⚙️ 기능 목록 구현

- constants : 에러, 입력, 출력 메시지를 관리한다.
    - ErrorMessage
       - 입력이 비어있는 경우 에러
       - 시도 횟수가 0보다 작을 경우 에러
       - 자동차 이름이 5자 초과인 경우 에러
       - 시도 횟수가 숫자가 아닐 경우 에러

    - ViewMessage
      - 자동차 이름 입력 안내 메시지 출력
      - 시도 횟수 입력 안내 메시지 출력
      - 실행 결과 문구 출력
      - 각 라운드별 이동 결과 출력
      - 우승자 안내 메시지 출력

- domain
    - Car : 객체 생성
    - RandomNumberGenerator : 0~9 사이의 랜덤값을 생성한다.
    - Position : 자동차의 현재 위치를 저장하고 증가시킨다.
    - DefaultPositionCondition : 기본 이동 조건(랜덤값이 4 이상일 때 이동)
    - PositionCondition : 자동차가 움직일지 말지 판단한다.

- view
    - InputView : 자동차 이름을 입력 받는다.
    - OutputView : 실행 결과를 출력한다.

- MainComtroller : view와 domain 연결
