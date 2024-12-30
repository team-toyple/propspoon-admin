package org.toyple.propspoonadmin.quiz.web.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class QuizResponseDto {
    private Integer quizId;
    private String title;
    private LocalDateTime openAt;
    private String createdAt;
    private String hintUrl;
    private String answers;
    private Integer answerNumber;
    private String tags;
    private String imageUrls;
    private String description;

    // 생성자: Quiz 엔티티에서 DTO로 데이터 복사
    public QuizResponseDto(org.toyple.propspoonadmin.quiz.domain.Quiz entity) {
        this.quizId = entity.getQuizId();
        this.title = entity.getTitle();
        this.openAt = entity.getOpenAt();
        this.createdAt = entity.getCreatedAt();
        this.hintUrl = entity.getHintUrl();
        this.answers = entity.getAnswers();
        this.answerNumber = entity.getAnswerNumber();
        this.tags = entity.getTags();
        this.imageUrls = entity.getImageUrls();
        this.description = entity.getDescription();
    }
}
