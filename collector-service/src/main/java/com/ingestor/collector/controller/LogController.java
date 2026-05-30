package com.ingestor.collector.controller;

import com.ingestor.collector.dto.IngestionResponse;
import com.ingestor.common.LogEvent;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/logs")
public class LogController {

    @PostMapping
    public IngestionResponse ingest(
        @RequestBody
        @Validated
        List<LogEvent> logs
    ) {
        System.out.println(
            "received logs = " + logs.size()
        );

        return new IngestionResponse("accepted");
    }
}