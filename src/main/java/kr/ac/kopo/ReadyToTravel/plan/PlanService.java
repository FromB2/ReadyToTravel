package kr.ac.kopo.ReadyToTravel.plan;

import kr.ac.kopo.ReadyToTravel.dto.plan.PlanDTO;

public interface PlanService {
    Long createPlan(PlanDTO plan);

    void updatePlan(PlanDTO plan);

    void removePlan(Long num);

    PlanDTO viewPlan(Long planNum);
}
