package com.ingestor.common;

import java.time.Instant;
import java.util.Map;

public record LogEvent(
    Instant timestamp,
    String service,
    String level,
    String message,
    String traceId,
    String spanId,
    Map<String, String> metadata
) {}
