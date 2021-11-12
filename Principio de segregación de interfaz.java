/*
 * 
 * 
 *
 */

/**
 *
 * @author diana
 */
public class IFidhBird {
    
    
    interface IFishBird {
    swim();
}

interface IEagleBird {
    fly();
}

class FishISP2 implements IFishBird {
    swim() {
        return 'Simplemente nada';
    }
}


var fishISP2 = new FishISP2();
console.log('ISP5-Good:', fishISP2.swim());


class EageleISP2 implements IEagleBird {
    fly() {
        return 'Simpelmente vuela';
    }
}


var eageleISP2 = new EageleISP2();
console.log('ISP6-Good:', eageleISP2.fly());
    
}
