module my_application_3 {
	
	//.jar 형태로 배포된(distribution) 모듈 사용하기
	// 우클릭 - build path - 라이브러리 - modulepath - dist 폴더에 있는 .jar 추가하기 (add jars = 같은 패키지 모듈, add external jars = 패키지 외부 모듈)
	requires my_module_a;
	requires my_module_b;
	
}