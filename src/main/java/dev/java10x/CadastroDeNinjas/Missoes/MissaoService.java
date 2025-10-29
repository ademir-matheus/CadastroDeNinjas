package dev.java10x.CadastroDeNinjas.Missoes;

import java.util.List;

public class MissaoService {

    private MissaoRepository missaoRepository;

    public MissaoService(MissaoRepository missaoRepository) {
        this.missaoRepository = missaoRepository;
    }

    public List<MissaoModel> listarMissoes(){
        return missaoRepository.findAll();
    }

}
