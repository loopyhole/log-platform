package com.ingestor.collector.service;

import com.ingestor.common.LogEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class LogIngestionServiceImpl implements LogIngestionService {
    @Override
    public void ingest(List<LogEvent> logs) {
        log.info("received {} logs", logs.size());
    }
}
