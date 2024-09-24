package com.example.spring_boot_guide.resource;

import com.example.spring_boot_guide.dto.FisicaDTO;
import com.example.spring_boot_guide.dto.assembler.FisicaAssembler;
import com.example.spring_boot_guide.entity.Fisica;
import com.example.spring_boot_guide.service.FisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entidade/v1")
public class FisicaResource {
    @Autowired
    private FisicaService fisicaService;

    @GetMapping("/")
    public List<Fisica> getAllFisica() {
        return fisicaService.findAll();
    }

    @PostMapping("/")
    public boolean saveFisica(@RequestBody FisicaDTO fisicaDTO) {
        boolean insert = false;

        Fisica fisica = FisicaAssembler.dtoToEntityModel(fisicaDTO);
        Fisica fisicaInsert = fisicaService.save(fisica);
        if (fisicaInsert != null) {
            insert = true;
        }

        return insert;
    }

    @GetMapping("/{cpf}")
    public Fisica getFisicaByCpf(@PathVariable(value = "cpf") String cpf) {
        return fisicaService.findByCpf(cpf);
    }

    @DeleteMapping("/{cpf}")
    public boolean delete(@PathVariable(value = "cpf") String cpf) {
        boolean delete = false;
        Fisica fisicaDelete = fisicaService.findByCpf(cpf);

        if (fisicaDelete != null) {
            fisicaService.delete(fisicaDelete);
            delete = true;
        }

        return delete;
    }
}
