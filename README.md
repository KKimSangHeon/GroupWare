
# 그룹웨어 개발
그룹웨어는 회원가입, 로그인, 게시판, 일정관리, 사원조회, 쪽지, 마이페이지 기능을 갖고있다.

## ERD
![image](https://kkimsangheon.github.io/2017/10/04/groupware/ERD.PNG)
그룹웨어에서 사용하는 ERD는 위과 같다.

## 보안
그룹웨어 내의 모든 페이지이동은 INTERCEPTOR을 활용하여 페이지 이동 전 권한을 확인한다. 로그인하지 않은 회원이 URL로 페이지 이동을 할 경우 다음과 같은 화면이 출력된다.
![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%9E%98%EB%AA%BB%EB%90%9C_%EC%A0%91%EC%86%8D.PNG)

## 회원가입
그룹웨어를 이용하기 위해서는 회원가입을 거쳐야 한다. 회원가입 후 관리자의 승인 후 로그인이 가능하다.
![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%B4%88%EA%B8%B0%ED%99%94%EB%A9%B4.PNG)
위의 화면에서 회원가입 버튼을 누르면 다음과 같은 폼이 출력된다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%97%90%EB%91%90_%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85.PNG)
정보를 입력하고 가입 요청하기 버튼을 클릭하자.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85_%EC%84%B1%EA%B3%B5.PNG)
정상적으로 가입이 완료되면 다음과 같은 화면이 출력된다. 해당 아이디로 로그인이 불가능하나 관리자의 승인 후 로그인이 가능해진다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EB%AF%B8%EC%8A%B9%EC%9D%B8%EB%A1%9C%EA%B7%B8%EC%9D%B8.PNG)
승인되지 않은 아이디로 로그인 할 경우 위와 같은 화면이 출력된다.

## 관리자의 가입 승인
사전에 지정해 놓은 아이디로 로그인 하여 관리자 화면에 접속하여 신규 가입한 회원에 한해 승인을 해줄 수 있다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EA%B4%80%EB%A6%AC%EC%9E%90_%EB%A1%9C%EA%B7%B8%EC%9D%B8.PNG)
관리자 계정으로 로그인을 할 경우 우측 상단에 관리페이지가 출력된다. 이는 EMPLOYEE 테이블의 ROLE 컬럼값을 통해 판단한다. ROLE컬럼의 값은 USER, ADMIN으로 나뉜다. 관리자가 아님에도 불구하고 URL로 관리자 페이지로 접속할 경우 다음과 같은 화면이 출력된다.
![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EA%B4%80%EB%A6%AC%EC%9E%90%ED%8E%98%EC%9D%B4%EC%A7%80%EC%A0%91%EC%86%8D%EC%8B%9C%EB%8F%84.PNG)

다시 돌아와서 관리자가 로그인을 하고 우측상단의 관리페이지를 접속할 경우 다음과 같은 화면이 출력된다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EA%B4%80%EB%A6%AC%EC%9E%90%ED%8E%98%EC%9D%B4%EC%A7%80.PNG)
관지자는 가입 승인하기 버튼을 클릭하여 가입승인을 할 수 있다. 이후 해당 사용자는 로그인이 가능해진다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EA%B0%80%EC%9E%85%EC%8A%B9%EC%9D%B8.PNG)
가입승인 버튼을 누를 경우 alert창이 생성되며 가입이 승인된다.

## 로그인
이전에 생성한 아이디로 로그인을 진행하자.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%97%90%EB%91%90_%EC%B4%88%EA%B8%B0%ED%99%94%EB%A9%B4.PNG)
위와 같이 로그인이 되었다.

## 게시판
게시판은 공지사항, 자유게시판, 팀 게시판이 존재한다.
게시판 테이블(BOARD)에는 BOARD_AUTHORITY, IS_TEAM 컬럼이 존재하는데 BOARD_AUTHORITY는 글쓰기 권한을 의미한다. 해당 게시판의 BOARD_AUTHORITY가 3일경우 POSITION_ID가 3(전무) 이상인 회원만 게시물 작성이 가능하다.
IS_TEAM 컬럼은 팀게시판 유무이며 TEAM_ID가 같은 즉 같은팀이 작성한 글만 볼 수 있도록 하는 역할이다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EA%B3%B5%EC%A7%80%EC%82%AC%ED%95%AD%EA%B2%8C%EC%8B%9C%ED%8C%90.PNG)
조금전 가입한 에두는 직급이 사원(POSITION_ID = 10)이므로 공지사항 게시판에 글쓰기 버튼이 나타나지 않는다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%9E%90%EC%9C%A0%EA%B2%8C%EC%8B%9C%ED%8C%90.PNG)
자유게시판에는 글씨기 버튼이 나타나며 글 작성이 가능하다.
글 쓰기 버튼을 누를 경우 다음과 같은 화면이 출력된다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%9E%90%EC%9C%A0%EA%B2%8C%EC%8B%9C%ED%8C%90_%EA%B8%80%EC%93%B0%EA%B8%B0.PNG)
위와 같이 글을 작성하는 폼을 통해 글작성이 가능하다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EA%B8%80%EC%93%B0%EA%B8%B0%EC%99%84%EB%A3%8C.PNG)
글을 작성하게되면 게시판으로 돌아오며 위와같이 출력된다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EA%B8%80%EC%83%81%EC%84%B8%EB%B3%B4%EA%B8%B0.PNG)
해당 글을 클릭하여 위와같이 자세히 볼 수 있으며 자신의 글인경우 삭제하기 버튼이 보인다.

## 일정관리
자신의 일정을 추가하여 관리할 수 있는 페이지이다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%9D%BC%EC%A0%95%EA%B4%80%EB%A6%AC%EB%A9%94%EC%9D%B8.PNG)
full callendar 라는 오픈소스를 사용하여 구현하였다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%9D%BC%EC%A0%95%EB%93%B1%EB%A1%9D.PNG)
위와같이 일정등록이 가능하다

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%9D%BC%EC%A0%95%EB%93%B1%EB%A1%9D%EC%99%84%EB%A3%8C.PNG)
일정을 등록하게 되면 위와 같이 일정이 달력에 표시된다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%97%AC%EB%9F%AC%EA%B0%9C%EC%9D%98%EC%9D%BC%EC%A0%95.PNG)
여러개의 일정을 등록할 경우 다음과같이 한눈에 파악이 가능하다.

## 사원조회
모든 사원의 조회가 가능한 페이지이다. jqgrid라는 오픈소스를 활용하였다.
![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%82%AC%EC%9B%90%EC%A1%B0%ED%9A%8C%ED%99%94%EB%A9%B4.PNG)
디폴트로 전체 사원이 검색된다. 또한 메세지 보내기 버튼을 통해 메세지 전송이 가능하다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EA%B0%9C%EB%B0%9C2%ED%8C%80%EA%B2%80%EC%83%89.PNG)
팀명 또는 이름으로 조회가 가능하며 위는 팀명으로만 조회한 경우이다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EA%B9%80%EC%83%81%ED%97%8C%EC%A1%B0%ED%9A%8C.PNG)
위는 김상헌을 조회한 경우이다. 메세지 보내기 버튼을 누르면

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EB%A9%94%EC%84%B8%EC%A7%80%EB%B3%B4%EB%82%B4%EA%B8%B0.PNG)
위와 같은 팝업창이 생성된다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%97%90%EB%91%90_%EB%A9%94%EC%84%B8%EC%A7%80%EB%B3%B4%EB%82%B4%EA%B8%B0.PNG)
위와 같이 메세지를 입력후 전송하기 버튼을 누르면 메세지가 전송된다.

## 쪽지
김상헌의 계정으로 로그인하여 쪽지 탭으로 들어갈 경우 다음과 같이 화면이 출력된다.
![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%AA%BD%EC%A7%80.PNG)
글자수가 23자 이상일 경우 ...이 붙게되며 내용이 생략된다.
해당 메세지를 눌러 자세한 내용을 확인할 수 있으며 답장버튼을 눌러 답장할 수 있으며, 삭제 또한 가능하다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%9E%90%EC%84%B8%ED%9E%88%EB%B3%B4%EA%B8%B0.PNG)
위와 같이 쪽지의 내용이 자세히 보인다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EB%8B%B5%EC%9E%A5.PNG)
답장 버튼을 누를 경우 위와같이 화면이 출력되며 답장이 가능하다.

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EB%8B%B5%EC%9E%A5%EB%B3%B4%EB%82%B4%EA%B8%B0.PNG)
위와 같이 답장을 보내고 에두의 계정으로 로그인 할 경우

![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EC%97%90%EB%91%90_%ED%99%95%EC%9D%B8.PNG)
위와 같이 메세지가 온 것을 확인할 수 있다.

## 마이페이지
개인정보를 수정할 수 있는 마이페이지이다.
사번, 소속, 직급은 수정 불가능하며 비밀번호, 사진, 이름, 이메일이 수정가능하다.
![image](https://kkimsangheon.github.io/2017/10/04/groupware/%EB%A7%88%EC%9D%B4%ED%8E%98%EC%9D%B4%EC%A7%80.PNG)
비밀번호를 제외한 모든 데이터는 마이페이지에 접속할 경우 입력되어 있다.


