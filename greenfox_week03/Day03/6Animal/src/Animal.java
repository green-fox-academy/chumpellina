public class Animal {
    int hunger=50;
    int thirst=50;
    int [] array = {50, 50};

    public int eat (){
       return this.hunger =hunger-1;

    }
    public int drink (){
        return this.thirst =thirst-1;


    }
    public int [] play () {
        return this.array = new int[]{this.hunger = hunger + 1, this.thirst = thirst + 1};


    }
}

