

//모듈은 프로잭트로 생성함
module my_module_a {
	
	//모듈 블록에 pack1, pack2를 exports로 공개한다는 뜻
	//exports로 공개하지 않은 모듈은 사용할 수 없음
	exports pack1;
	//exports pack2;
	
	requires transitive my_module_b;
}