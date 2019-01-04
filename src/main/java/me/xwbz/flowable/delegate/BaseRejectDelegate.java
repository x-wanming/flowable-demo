package me.xwbz.flowable.delegate;

import lombok.extern.slf4j.Slf4j;
import me.xwbz.flowable.bean.enums.AuditStatus;
import me.xwbz.flowable.util.FlowUtil;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

@Slf4j
public class BaseRejectDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        log.info("{}已被拒绝", execution.getVariables());
        FlowUtil.end(execution, AuditStatus.REJECT_AUDIT);
    }
}
