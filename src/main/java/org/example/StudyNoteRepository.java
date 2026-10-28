package org.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyNoteRepository
        extends JpaRepository<StudyNote, Long> {
}