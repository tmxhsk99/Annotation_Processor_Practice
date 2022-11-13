package org.prac.anno;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //MagicMoja가 컴파일 할때 생기지만 , 실제로 소스상에서 쓰지 못한다.
        //실제 소스를 사용할 때 컴파일된 애너테이션이 생성한 클래스를 참조할 수 있어야한다.
        //그렇려면 IDE에서 AnnotationProcessor 기능을 켜야한다.
        //그리고 target하위의 generated-sources의 하위의 항목을 source 디랙터리로 인식시켜야한다.
        //module 에서 적용할 클래스 경로를 sources로 추가해주면 된다.

        //애너테이션 업데이트 후 mvn clean , 후 빌드할 것
        Moja moja = new MagicMoja();
        System.out.println("moja.pullOut() = " + moja.pullOut());

    }
}
