# software-design-project
학교 소프트웨어 설계 과목 프로젝트(쇼핑몰 백엔드 구성하기)

##개발 목표
<li>스프링기반의 백엔드단을 이해하고 구성하는것을 목표(프론트엔드가 있으면 좋겠지만 일단 HTML, CSS, JS, BootStrap, Thymeleaf같은거로라도 간단히 해보자)</li>
<li>Spring, SpringBoot, JPA, 시큐리티 등의 기술스택을 학습하고, 이런 기술스택으로 어떻게 구성되는지 이해하기 위해 간단한 쇼핑몰 프로젝트 구현</li>
<li>수업때 배운 여러 디자인패턴(Decorator Pattern,템플릿 콜백 패턴 등..)을 참고하여 컴포넌트 기반으로 설계하도록 하자.</li>
<li>간단한 기능 구현 완료를 한다면 대용량문제, 쓰레드 동시성 문제, 보안 문제 등에 고민해보고 이런 문제를 깊이있게 해결해보도록 하자</li>

---

#사용할 기술
<li>MVC pattern</li>
<li>CRUD</li>
<li>spring security
<li>image 업로드</li>

---

#구현해볼 기능+화면
<li>회원=회원가입/로그인,로그아웃</li>
<li>상품=상품 등록 및 관리+수정, 상품 조회화면(메인화면), 상품 상세 설명페이지</li>
<li>주문=상품 주문화면, 사용자가 주문한 내역 조회(구매 이력), 주문 취소</li>
<li>장바구니=담기, 담은거 조회 및 삭제, 담았던 상품 주문</li>



---

#방향성은 어떻게??
<li>데이터베이스 테이블에 정보 저장=(회원정보, 장바구니 담긴 상품, 회원들의 주문 목록, 주문된 상품 정보, 쇼핑몰 상품 정보) <<이런 테이블들 만들거</li>
<li>API는 뭐만들거?=회원가입 페이지(get,post),로그인 페이지(get,post), 장바구니 페이지(get,post(담기)),상품 주문(주문은 post, 주문페이지는 get), 상품 관련(조회 및 등록페이지:get,수정 및 상품 등록요청:post), 주문취소(post)</li>
<li>작업해볼 순서=페이지 레이아웃->회원가입(스프링 시큐리티)->상품 등록,수정,찾기,관련정보 관련->상품 주문, 주문내역, 취소->장바구니</li>
