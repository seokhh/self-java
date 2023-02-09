package sec06.exam02.mycompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {
    Engine engine = new Engine();
    SnowTire tire1 = new SnowTire();
    BigWidthTire tire2 = new BigWidthTire();
    sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
    sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
    /* Tire 객체가 두개가 있기 때문에 금호인지 한국인지를 나누기 위해 패키지명을 다 써준다. */
}
