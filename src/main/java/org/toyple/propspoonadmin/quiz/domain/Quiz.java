package org.toyple.propspoonadmin.quiz.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "quiz", schema = "prop-tech")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_id", nullable = false)
    private Integer quizId;

    @Column(name = "title", nullable = true)
    private String title;

    @Column(name = "open_at", nullable = true)
    private LocalDateTime openAt;

    @Column(name = "created_at", nullable = true)
    private String createdAt; // Use String because of DEFAULT CURRENT_TIMESTAMP in DB

    @Column(name = "hint_url", nullable = true)
    private String hintUrl;

    @Column(name = "answers", nullable = true)
    private String answers;

    @Column(name = "answer_number", nullable = true)
    private Integer answerNumber;

    @Column(name = "tags", nullable = true)
    private String tags;

    @Column(name = "image_urls", nullable = true)
    private String imageUrls;

    @Column(name = "desc", nullable = true)
    private String description;

}
