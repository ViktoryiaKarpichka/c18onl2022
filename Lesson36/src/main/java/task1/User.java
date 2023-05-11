package task1;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class User {

    /*    //даже с применением абстракции все отработает,тк название класса соответствует названию бина с маленькой буквы
        private final Animal cat;
        private final Animal dog;
        public User(Cat cat, Dog dog) {
            this.cat = cat;
            this.dog = dog;
        }*/
//@Qualifier("cat")
    @Autowired
    private Animal object;

    //@Qualifier("dog")
    @Autowired
    private Animal object2;
// если название бина не соответствует классу
//    public User(@Qualifier("cat") Animal object, @Qualifier("dog") Animal object2) {
//        this.object = object;
//        this.object2 = object2;
//    }

    void info() {
        System.out.println(object.getName());
        System.out.println(object2.getName());
    }

}
