package com.ingestor.common;

import jakarta.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.Map;

public record LogEvent(
    Instant timestamp,

    @NotBlank String service,

    @NotBlank String level,

    @NotBlank String message,

    String traceId,

    String spanId,

    Map<String, String> metadata
) {}
