package toy.annotationPractice;

import java.lang.reflect.Method;

public class PrintMethodAnnotationExample {
	
	
	public static void printLine(methodAnnotation anno) {
		
		if(anno != null) {
			int number = anno.number();
			for(int i=0; i<number; i++) {
				System.out.print(anno.value());
			}
		}System.out.println();
	}

	
	
	public static void main(String[] args) throws Exception {
		
		Method[] declaredMethods = myService.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			methodAnnotation anno = method.getAnnotation(methodAnnotation.class);
			
			printLine(anno);
			
			method.invoke(new myService());
			
			printLine(anno);
		}

	}

}
