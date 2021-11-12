/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class Liskov {
    
}
class BirdGood {
    /** Métodos (Funciones o acciones del objeto) */
    flyGood() {
        console.log('LSP3-Good: Ellos pueden volar!');
    }
}

class EagleGood extends BirdGood {
    constructor() {
        super()
    }
}

class FlyingFishGood extends BirdGood {
    constructor() {
        super()
    }

    /** Métodos (Funciones o acciones del objeto) */
    flyGood() {
        console.log("LSP2-Good: El pez vuela aveces, pero nada más");
    }
}


/** Instancia del objeto en una variable e impresión en consola */
var flyingFishGood = new FlyingFishGood();
flyingFishGood.flyGood();

var eagleGood = new EagleGood();
eagleGood.flyGood();