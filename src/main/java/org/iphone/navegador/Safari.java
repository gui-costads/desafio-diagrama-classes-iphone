package org.iphone.navegador;

public class Safari implements INavegador {
    Pagina pagina;

    @Override
    public void abrirPagina(Pagina pagina) {
        String url = pagina.getUrl();
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo nova aba... ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void paginaAnterior() {
        System.out.println("Voltando para páginma anterior...");
    }

    @Override
    public void proximaPagina() {
        System.out.println("Avançando para proxima página...");

    }
}
