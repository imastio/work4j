package io.imast.work4j.channel.worker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * The message for worker that indicates that execution is resumed
 * 
 * @author davitp
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class WorkerExecutionResumed implements WorkerMessage {
    
    /**
     * The execution id
     */
    private String executionId;  
    
    /**
     * The job id
     */
    private String jobId; 
}
