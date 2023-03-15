
//모듈을 조합하는 모듈
module my_application_2 {
	
	//모듈을 requires 하여 사용
	
	//package explorer에서 my_application_2 프로젝트 우클릭
	//build path - config build path - projects창에서 modulepath에 requires 할 모듈 선택
	//requires my_module_a;
	//requires my_module_b;
	
	// my_module 하나로 my_module_a와 b를 집합시킴 (transitive 사용)
	requires my_module;
	
}