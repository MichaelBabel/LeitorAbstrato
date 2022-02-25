public class LeitorDigitos extends LeitorAbstrato {

    public LeitorDigitos(String procurarArquivo) {
        super(procurarArquivo);
    }

    @Override
    protected String parseLine(String linha) {
        return linha.replaceAll("[^0-9]", "");
    }
}