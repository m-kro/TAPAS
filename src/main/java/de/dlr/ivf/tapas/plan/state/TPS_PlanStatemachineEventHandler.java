package de.dlr.ivf.tapas.plan.state;

import de.dlr.ivf.tapas.plan.state.event.TPS_PlanEvent;

public interface TPS_PlanStatemachineEventHandler {

    void handleEvent(TPS_PlanEvent event);
}
