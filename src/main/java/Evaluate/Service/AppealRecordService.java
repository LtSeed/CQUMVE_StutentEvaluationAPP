package Evaluate.Service;

import Evaluate.Data.AppealData;
import Evaluate.Data.InSheet.AppealRecord;
import Evaluate.Repository.AppealRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppealRecordService {

    private final AppealRecordRepository appealRecordRepository;

    @Autowired
    public AppealRecordService(AppealRecordRepository appealRecordRepository) {
        this.appealRecordRepository = appealRecordRepository;
    }

    public void saveAppealRecord(AppealData appealData) {
        AppealRecord appealRecord = new AppealRecord();
        appealRecord.setStudent(appealData.getStudent());
        appealRecord.setAppealContent(appealData.getAppealContent());
        appealRecord.setAppealStatus(appealData.getAppealStatus());
        appealRecord.setAppealTime(appealData.getAppealTime());
        appealRecordRepository.save(appealRecord);
    }
}
