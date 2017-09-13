abstract class Pokemon{
    protected String nickname = "";
    protected int x = 0;
    protected int y = 0;
    protected int z = 0;
    protected static int totalPokemon = 0;

    public Pokemon(String nickname, int x, int y, int z){
        this.nickname = nickname;
        this.x = x;
        this.y = y;
        this.z = z;
        totalPokemon = totalPokemon + 1;
    }
    public void getPos(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public void moveUp(){
        y = y + 1;
    }
    public void moveDown(){
        y = y - 1;
    }

    public void moveLeft(){
        x = x - 1;
    }

    public void moveRight(){
        x = x + 1;
    }


}