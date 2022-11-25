//5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn
public class Task5 {
    public static void main(String[] args) {
        System.out.println("1.byte+byte=т,byte+short=ня,byte+char=я,byte+int=ня,byte+long=ня,byte+float=ня,byte+double=ня,byte+boolean=x");
        System.out.println("2.short+byte=я,short+short=т,short+char=я,short+int=ня,short+long=ня,short+float=ня,short+double=ня,short+boolean=x");
        System.out.println("3.char+byte=я,char+short=я,char+char=т,char+int=ня,char+long=ня,char+float=ня,char+double=ня,char+boolean=х");
        System.out.println("4.int+byte=я,int+short=я,int+char=я,int+int=т,int+long=ня,int+float=ня,int+double=ня,int+boolean=х");
        System.out.println("5.long+byte=я,long+short=я,long+char=я,long+int=я,long+long=т,long+float=ня,long+double=ня,long+boolean=х");
        System.out.println("6.float+byte=я,float+short=я,float+char=я,float+int=я,float+long=я,float+float=т,float+double=ня,float+boolean=х");
        System.out.println("7.double+byte=я,double+short=я,double+char=я,double+int=я,double+long=я,double+float=я,double+double=т,double+boolean=х");
        System.out.println("8.boolean+byte+short+char+int+long+float+double=х,boolean+boolean=т");

    }

}