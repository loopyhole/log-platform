package com.ingestor.collector.service;

import com.ingestor.common.LogEvent;
import java.util.List;

public interface LogIngestionService {
    void ingest(List<LogEvent> logs);
}
