package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudyNoteTest {

    @Test
    void studyNoteCanStoreValues() {
        StudyNote note = new StudyNote();

        note.setTitle("ECS와 Fargate");
        note.setCategory("AWS");
        note.setContent("오늘 배운 내용을 기록한다.");

        Assertions.assertEquals("ECS와 Fargate", note.getTitle());
        Assertions.assertEquals("AWS", note.getCategory());
        Assertions.assertEquals("오늘 배운 내용을 기록한다.", note.getContent());
    }

    @Test
    void reviewStatusCanChange() {
        StudyNote note = new StudyNote();

        Assertions.assertFalse(note.isReviewed());

        note.setReviewed(true);

        Assertions.assertTrue(note.isReviewed());
    }
}