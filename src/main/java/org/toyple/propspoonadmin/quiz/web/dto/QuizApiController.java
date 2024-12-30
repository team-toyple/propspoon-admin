package org.toyple.propspoonadmin.quiz.web.dto;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.toyple.propspoonadmin.quiz.domain.Quiz;
import org.toyple.propspoonadmin.quiz.service.QuizService;

@RequiredArgsConstructor
@RestController
public class QuizApiController {

    private final QuizService quizService;

    @GetMapping("/api/v1/quiz/{quizId}")
    public QuizResponseDto findByQuizId(@PathVariable int quizId) {
        return quizService.findByQuizId(quizId);
    }

}
