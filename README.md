# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항
- 기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.
- 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱이란 힌트를 얻고, 그 힌트를
이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
- 위 숫자 야구게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플 레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 게임 플레이어가 입력한 숫자에 대한 결과를 출력한다.
- 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.

## 제약사항
- 숫자 야구게임을 실행하는 시작점은 src/main/java 폴더의 baseball.Application의 main()이다.
- 숫자 야구게임은 JDK 8 버전에서 실행가능해야 한다. JDK 8에서 정상 동작하지 않을 경우 0점 처리한다.
- JDK에서 제공하는 Random 및 Scanner API 대신 camp.nextstep.edu.missionutils에서 제공하
는 Randoms 및 Console API를 사용하여 구현해야 한다.
- 프로그램 구현을 완료했을 때 src/test/java 폴더의 baseball.ApplicationTest에 있는 2개의 Test Case가 성공해야 한다. 테스트가 실패할 경우 0점 처리한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다. 1까지만 허용한다.
- 자바 8에 추가된 stream api를 사용하지 않고 구현해야 한다. 단, 람다는 사용 가능하다.
- else 예약어를 쓰지 않는다.
- 함수(또는 메소드)의 길이가 10라인을 넘어가지 않도록 구현한다.
- 도메인 로직에 단위 테스트를 구현해야 한다. 단, UI(System.out, System.in, Scanner) 로직은 제외

## 기능 목록
### 야구번호 생성
1. 1~9로 중복되지 않은 서로 다른 세자리 수 ex) 923
2. 새게임마다 랜덤하게 생성

### 사용자 입력
1. 사용자가 입력한 숫자의 자릿수 체크 ex) 12, 3432
2. 중복된 숫자 입력 체크 ex) 322

### 반복 진행
1. 정답을 맞출때까지 반복 입력
2. 사용자의 입력을 받아 게임 진행 여부 처리

## 구조
### common
1. Message: 공통 출력 메세지 모음

### domain
1. BaseBallAnswerGenerator: 게임을 시작할 때 자동으로 정답 생성
2. BaseBallGame: 야구 게임. 게임에 필요한 요소(view, referee)를 가지고 있음.
3. BaseBallReferee: 사용자 입력값과 정답 체크

### util
1. StringUtil: String 관련 처리 담은 util

### value
1. BaseBallGameResult: 게임 결과를 담는 VO

### view
1. BaseBallGameView: 게임 진행 및 결과에 대한 input, output 처리
