package tobyspring.helloboot;

/**
 * User : Soo Jung Choi (crystal2840@neowiz.com)
 * Date : 2023.03.27
 * Time : 6:37 PM
 */
public interface HelloRepository {
    Hello findHello(String name);
    void  increaseCount(String name);

    default int countOf(String name){
        Hello hello = findHello(name);
        return  hello == null ? 0 : hello.getCount();
    }
}
