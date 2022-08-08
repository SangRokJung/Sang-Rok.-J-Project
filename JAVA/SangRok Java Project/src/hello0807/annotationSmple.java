// package hello0805;

// public class smple {
    
// @interface TestInfo{
//     int         count();
//     String      testedBy();
//     String[]    testTools();
//     TestType    testType();     // enum TestType { FIRST, FINAL}
//     DateTime    testDate();     // 자신이 아닌 다른 애너테이션을 포함 할  수 있다.
// }

// @interface DateTime{
//     String yymmdd();    
//     String hhmmss();
// }

// @TestInfo(
//     count = 3, testedBy = "KIM",
//     testTools = {"JUnit", "AutoTester"},
//     testType = TestType.FIRST,
//     testDate = @DateTime(yymmdd = "160101", hhmmss = "235959")
// )

// public class NewClass{
//     ...
// }

// @interface TestInfo{
//     int count() default 1;  //기본값을 1로 지정
// }

// @TestInfo   // @TestInfo(count=1)과 동일
// public class NewClass {
//     ...
// }


// @interface TestInfo{
//     String value();
// }

// @TestINfo("passed")
// class NewClass {
//     ...
// }

// @interface TestInfo{
//     String[] testTools();
// }

// @Test(testTools = {"JUnit", "AutoTester"})  //값이 여러개인 경우
// @Test(testTools = "JUnit")                  //값이 하나일 때는 괄호{} 생략 가능
// @Test(testTools={})                         //값이 없을 때는 괄호{}가 반드시 필요


// @interface TestInfo{
//     String[] info()     default {"aaa", "bbb"};     //기본값이 여러 개인 경우, 괄호{} 사용
//     String[] info2()    default "ccc";                 //기본값이 하나인 경우, 괄호 생략 가능
// }

// @TestInfo               // @TestInfo(info = {"aaa", "bbb"}, info2 = "ccc") 와 동일
// @TestInfo(info2={})     // @TestInfo(info = {"aaa", "bbb"}, info2 = {}) 와 동일
// class NewClass { ... }

// @interface SuppressWarnings {
//     String[] value();
// }

// //@SuppressWarnings (value={"deprecation", "unchecked"})
// @SuppressWarnings ({"deprecation", "unchecked"})
// class NewClass{
//     ...
// }

// @interface TestInfo extends Annotations {   // ERROR. 허용 되지 않는 표현.
//     int     count();
//     String  testedBy();
// }

// package java.lang.annotation;

// public interface Annotation{    // Annotation 자신은 인터페이스다.
//     boolean equals(Object obj);
//     int hashCode();
//     String toString();

//     Class<? extends Annotations> annotationType();  // 애너테이션의 타입을 반환
// }


// Class<AnnotationTest> cls = AnnotationTest.class;
// Annotation[] annoArr = cls.getAnnotations();

// for(Annotation a : annoArr){
//     System.out.println("tos");
// }

// @Targer(ElementType.METHOD)
// @Retention(RetentionPolicy.SOURCE)
// public @interface Override {}   // 마커 에너테이션. 정의된 요소가 하나도 없다.

// @Target(ElementType.METHOD)
// @Retention(RetentionPolicy.SOURCE)
// public @interface Test {}       // 마커 애너테이션. 정의된 요소가 하나도 없다.



// @interface AnnoTest{
//     int id = 100;                       //OK, 상수 선언, static fianl int id = 100;
//     String major(int i, int j);         //에러, 매개변수를 선언할 수 없음
//     String major() throws Exception;    //에러, 예외를 선언할 수 없음
//     ArrayList<T> list();                //에러, 요소의 타입에 매개변수 사용 불가
// }

// }
