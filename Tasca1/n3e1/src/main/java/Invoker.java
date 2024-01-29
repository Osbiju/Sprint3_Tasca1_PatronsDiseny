public class Invoker {
    Command comandament;

    public void setComando(Command comandament){
        this.comandament = comandament;
    }

    public void executarComando(){
        comandament.executar();
    }

}
