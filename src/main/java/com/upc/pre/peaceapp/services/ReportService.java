package com.upc.pre.peaceapp.services;

import com.upc.pre.peaceapp.models.Report;
import com.upc.pre.peaceapp.repositories.ReportRepository;
import com.upc.pre.peaceapp.schemas.ReportSchema;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {
    private final ReportRepository repository;

    public ReportService(ReportRepository repository) {
        this.repository = repository;
    }

    public Report saveReport(ReportSchema report) {
        Report newReport = repository.save(new Report(report.title(), report.detail(), report.type(), report.user_id()));
        return newReport;
    }

    public Report findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Report> findByUserId(Long userId) {
        return repository.findByUserId(userId);
    }

}
