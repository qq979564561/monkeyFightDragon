public class Role {
    String name;
    int hitPoint;
    int magicPoint;
    int level;
    int attackDamage;
    int defensivePower;
    Role(int hitPoint, int magicPoint, int level, int attackDamage, int defensivePower){
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
        this.level = level;
        this.attackDamage = attackDamage;
        this.defensivePower = defensivePower;

    }

    Role(){

    }
}

class Dragon{
    String name;
    int hitPoint;
    int magicPoint;
    int level;
    int attackDamage;
    int defensivePower;

    Dragon(int hitPoint, int magicPoint, int level, int attackDamage, int defensivePower){
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
        this.level = level;
        this.attackDamage = attackDamage;
        this.defensivePower = defensivePower;
    }
    Dragon(){

    }
}
