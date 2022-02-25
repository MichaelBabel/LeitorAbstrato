import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public abstract class LeitorAbstrato {
    private final Path procurarArquivo;

    protected LeitorAbstrato(String procurarArquivo) {
        this.procurarArquivo = Path.of(procurarArquivo);
    }

    public String getPath() {
        return procurarArquivo.toString();
    }

    public List<String> lerArquivo() throws IOException {
        return Files.lines(procurarArquivo).map(this::parseLine).collect(Collectors.toList());
    }

    protected abstract String parseLine(String linha);
}