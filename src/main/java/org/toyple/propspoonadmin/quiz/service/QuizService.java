package org.toyple.propspoonadmin.quiz.service;

import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.toyple.propspoonadmin.quiz.domain.Quiz;
import org.toyple.propspoonadmin.quiz.domain.QuizRepository;
import org.toyple.propspoonadmin.quiz.web.dto.QuizResponseDto;

@RequiredArgsConstructor
@Service
public class QuizService {
    private final QuizRepository quizRepository;

    @Transactional(readOnly = true)
    public QuizResponseDto findByQuizId(int quizId) {
        Quiz entity = quizRepository.findByQuizId(quizId)
                .orElseThrow(() -> new IllegalArgumentException("해당 퀴즈가 없습니다. id=" + quizId));

        return new QuizResponseDto(entity);
    }

}
