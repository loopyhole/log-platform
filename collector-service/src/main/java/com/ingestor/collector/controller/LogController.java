package com.ingestor.collector.controller;

import com.ingestor.collector.dto.IngestionResponse;
import com.ingestor.collector.service.LogIngestionService;
import com.ingestor.collector.service.LogIngestionServiceImpl;
import com.ingestor.common.LogEvent;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/v1/logs")
public class LogController {

    LogIngestionService m_ingestionService;
    LogController() {
        m_ingestionService = new LogIngestionServiceImpl();
    }

    @PostMapping
    public IngestionResponse ingest(
        @RequestBody
        @Validated
        List<LogEvent> logs
    ) {
        m_ingestionService.ingest(logs);
        return new IngestionResponse("accepted");
    }
}
