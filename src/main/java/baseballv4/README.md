## 기능 구현 목록

- 클라이언트에게 메세지 문구 출력:

- Random한 3자리 숫자 생성:

  - `조건` 1~9 숫자를 이용해 각 자리마다 숫자가 다른 3자리 수
  - `예외`  중복된 숫자가 있을 경우
    - `처리` 3자리 숫자 다시 생성하기

- 숫자 입력하는 문구 출력

- 숫자 입력:

  - `조건` 중복되지 않은 3자리 숫자를 입력받는다.
  - `예외` 입력값이 숫자가 아닐 경우
  - `예외` 중복된 숫자가 존재하는 경우
  - `예외` 3자리가 아닐 경우
    - `처리` 재입력을 요청

- 입력된 3자리 숫자에 대한 스트라이크 / 볼 판단:

  - `조건` 스트라이크: 3자리 숫자안에 위치와 값이 모두 같을경우
  - `조건` 볼: 3자리 숫자안에 값이 존재하지만 위치는 다를경우

- 계산 결과 출력:

  - `조건1` 정답인 경우(3스트라이크)

    1. 정답 문구를 출력한다

    2. 재실행 여부를 묻는 문구를 출력한다.

    3. 입력값 (재실행 여부)을 숫자로 받는다.

    - `조건` 1을 입력하면 재실행, 2를 입력하면 종료
      - `예외` 1,2외에 다른 문자를 입력할 경우
        - `처리` 재입력을 요청

  - `조건2`  오답인 경우

    1. 0볼 0스트라이크 인경우:
       - "낫싱" 문구를 출력한다.
    2. n 볼 n 스트라이크인 경우:
       - "n볼 n 스트라이크" 출력한다.

