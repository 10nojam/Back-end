package com.naznjari.service.problem;

import com.naznjari.domain.problem.Problems;
import com.naznjari.domain.problem.ProblemsRepository;
import com.naznjari.web.dto.ProblemsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProblemsService {
    private final ProblemsRepository problemsRepository;

    @Transactional(readOnly = true)
    public List<ProblemsDto> findAllDesc() {
        return problemsRepository.findAllDesc().stream()
                .map(ProblemsDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Optional<Problems> findById(Long id) {
        Optional<Problems> problems = problemsRepository.findById(id);
        return problems;
    }
}
