package Evaluate.Service;

import Evaluate.Data.InSheet.EvaluationItem;
import Evaluate.Repository.EvaluationItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@SuppressWarnings("ClassCanBeRecord")
@Service
public class EvaluationItemService {

    private final EvaluationItemRepository evaluationItemRepository;

    @Autowired
    public EvaluationItemService(EvaluationItemRepository evaluationItemRepository) {
        this.evaluationItemRepository = evaluationItemRepository;
    }

    public List<EvaluationItem> getEvaluationItems() {
        return evaluationItemRepository.findAll();
    }

    public void saveEvaluationItem(EvaluationItem item) {
        evaluationItemRepository.save(item);
    }
}
