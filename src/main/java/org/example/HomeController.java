package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private final StudyNoteRepository repository;

    public HomeController(StudyNoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("notes", repository.findAll());
        model.addAttribute("note", new StudyNote());
        return "index";
    }

    @PostMapping("/notes")
    public String save(@ModelAttribute StudyNote note) {
        repository.save(note);
        return "redirect:/";
    }

    @PostMapping("/notes/{id}/review")
    public String toggleReview(@PathVariable Long id) {
        repository.findById(id).ifPresent(note -> {
            note.setReviewed(!note.isReviewed());
            repository.save(note);
        });

        return "redirect:/";
    }
    @PostMapping("/notes/{id}/delete")
    public String delete(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }
}