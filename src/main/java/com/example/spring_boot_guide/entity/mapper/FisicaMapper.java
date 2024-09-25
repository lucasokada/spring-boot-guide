package com.example.spring_boot_guide.entity.mapper;

import com.example.spring_boot_guide.entity.Acesso;
import com.example.spring_boot_guide.entity.Contato;
import com.example.spring_boot_guide.entity.Endereco;
import com.example.spring_boot_guide.entity.Fisica;

public class FisicaMapper {
    public static void update(Fisica fisicaUpdate, Fisica newFisica) {
        fisicaUpdate.setDataNascimento(newFisica.getDataNascimento());
        fisicaUpdate.setNome(newFisica.getNome());
        Acesso a = fisicaUpdate.getAcesso();
        a.setUsuario(newFisica.getAcesso().getUsuario());
        a.setSenha(newFisica.getAcesso().getSenha());
        fisicaUpdate.setAcesso(a);

        Contato c = fisicaUpdate.getContato();
        c.setTelefoneResidencial(newFisica.getContato().getTelefoneResidencial());
        c.setTelefoneComercial(newFisica.getContato().getTelefoneComercial());
        c.setCelular(newFisica.getContato().getCelular());
        c.setEmail(newFisica.getContato().getEmail());
        fisicaUpdate.setContato(c);

        int i = 0;
        for (Endereco e : fisicaUpdate.getEndereco()){
            Endereco edto = newFisica.getEndereco().get(i);
            e.setRua(edto.getRua());
            e.setNumero(edto.getNumero());
            e.setBairro(edto.getBairro());
            e.setCep(edto.getCep());
            e.setCidade(edto.getCidade());
            e.setEstado(edto.getEstado());
            i++;
        }
    }
}
