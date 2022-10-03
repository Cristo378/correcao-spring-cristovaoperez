package cristovaoperez.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cristovaoperez.models.Aluno;
import cristovaoperez.repositories.AlunosRepository;

@Controller
@RequestMapping("/alunos")
public class AlunosController {
    @Autowired
    private AlunosRepository alunosRepo;

    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("alunos", this.alunosRepo.findAll());
        return "list";
    }

    @RequestMapping("insert")
    public String insert() {
        return "insert";
    }

   @RequestMapping(value = "insert", method = RequestMethod.POST)
   public String insert(@RequestParam("nome") String nome, @RequestParam("idade") int idade) {  
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setIdade(idade);
        alunosRepo.save(aluno);
        return "redirect:/alunos/list";
        
    }

}