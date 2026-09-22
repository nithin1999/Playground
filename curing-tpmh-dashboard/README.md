# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No measured 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing and clustering therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Observer / Leader Intervention Protocol
Thursday's pilot needs a frozen **observer non-interference rule**. A heavily observed staffing trial can look feasible if supervisors, engineers, team leads, mold operators, maintenance or other nearby personnel informally prompt, fetch, troubleshoot, cover a zone, answer an alarm, finish deferred work, or redirect operators. That is real system capacity and must not disappear into the observation process.

Before the pilot, assign every non-Op1/Op2 participant one of three roles:
- **OBSERVER:** watches/records only; does not direct, fetch, cover, perform work or pre-emptively solve a problem.
- **AUTHORIZED SUPPORT:** performs work that is part of the frozen normal operating model; source, reason, start/end and task are recorded.
- **CONTAINMENT / RED RESPONSE:** intervenes because an actual plant rule or the frozen GREEN/YELLOW/RED ladder requires it; record the trigger, person/role, task, start/end and what would otherwise have happened.

Record **Intervention Minutes**, **Intervention Count**, **Source Role**, **Reason**, and whether the intervention was **Normal-Model / Containment / Avoidable Coaching**. Do not subtract legitimate normal support from the process; instead distinguish it from extra support created by the pilot environment. If observers must repeatedly coach the operators to follow PRIMARY/FLEX, routes or pending-work rules, the operating model is not yet self-executing.

### Why this improves the pilot
Lean standardized work creates a visible baseline for observing abnormalities and improving the process. Machine-intensive work is especially event-driven, so outside prompting can change when operators respond and how they sequence work. A clean observer protocol protects the validity of the staffing experiment while preserving immediate intervention whenever Safety, Quality, Maintenance or Curing rules require it.

## Existing analysis retained
- Pilot Stop / Containment Rules: GREEN / YELLOW / RED using existing plant-authorized requirements only.
- Surge Recovery / Queue-Drain Test: surge start, peak backlog, recovery start/complete, Net Queue-Drain Rate, Time to Recover, Residual Debt, Independent Recovery.
- Route-Deviation / Motion-Loss Test: abnormal route-deviation minutes, retrieval/backtrack count, cross-zone assist minutes.
- Pending Work / Recovery Queue: Peak Pending WIP, Pending WIP minutes, Oldest Pending Age, carryover and unowned open work.
- Interruption / Restart-Loss Test: Interruption Tax and Fragmented Task Count.
- Qualification-Constrained Capacity Test.
- Interval Capacity Stress Test using actual availability and due/committed work.
- Workload Confidence + BASE/PERIODIC/SURGE/CONTINGENCY decomposition; validate the 336-min Maintenance Support element first.
- NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views.
- Response-Time Service-Level Curve.
- Break-Relief Coverage Debt and donor-role displacement.
- Event-Driven Dispatch Priority Ladder; PRIMARY/FLEX ownership + handoff trigger.
- Demand-State Exposure Coverage; unobserved important states are NOT TESTED.
- Qualification-gated relief, protected-work due-time visual control, Recovery Debt, hidden support, standard-work conformance and matched-condition comparison.

## Best current strategy
1. Freeze people, zones, normal routes, verified qualifications/authorizations, relief and plant-authorized reaction rules.
2. Freeze GREEN/YELLOW/RED pilot stop/containment rules from actual plant requirements before starting.
3. **Freeze observer roles and the intervention protocol: observers do not work or coach unless an authorized containment/escalation rule requires intervention.**
4. Freeze/confidence-tag the 736-min workload model; validate the 336-min Maintenance Support element first.
5. Map every required work family to qualified Op1/Op2 resources and identify one-person, two-person and skill-restricted tasks.
6. Assign PRIMARY/FLEX ownership, observable flex triggers, handback and dispatch priority; outside support is not normal two-operator capacity unless explicitly part of the frozen operating model.
7. Verify qualification-gated break coverage and protected-work due requirements.
8. Scenario-walk normal work, breaks, simultaneous abnormalities, skill-restricted work, two-person tasks, interruption/recovery, cross-zone response, observer behavior and one RED escalation/restoration scenario.
9. Run Thursday with timestamped work elements, response milestones, 15-minute workload/exposure windows, Pending Work, saturation, qualification waits, support, intervention, interruption and route-deviation tags.
10. Reconcile observed task-category minutes/events to the workload model.
11. Calculate Interval Load Index, qualification feasibility, Interruption Tax, Pending WIP, Route-Deviation Minutes, Surge Recovery and intervention/support dependence.
12. Build NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views including manual work and observed walk/travel time.
13. For every surge, verify whether the two operators independently return Pending Work to the pre-surge level before due-time violations or handoff.
14. Reconstruct Recovery Debt, Break-Relief Coverage Debt, hidden support, qualification waits, intervention minutes, pending-work carryover and cross-zone support.
15. Normalize for running press-hours, event demand, mix and downtime; compare matched historical conditions.
16. Diagnose workload-model error vs sustained overload vs slow recovery vs qualification bottleneck vs fragmentation vs motion/layout vs imbalance vs dispatch vs relief vs staffing substitution/observer contamination.
17. Correct only the demonstrated constraint and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, name every person expected to be around the pilot and mark them **OBSERVER / AUTHORIZED SUPPORT / CONTAINMENT**. Brief observers that they should not prompt, fetch, cover or solve work for Op1/Op2. Put one intervention line on the existing log: time, source role, reason, task, start/end, classification. Safety/quality/equipment protection always overrides non-interference.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Pilot stop/containment thresholds and restoration authority have not been supplied/verified in the project data.
- **Observer/leader behavior can contaminate the trial by providing unmeasured cognitive or physical capacity.**
- 55.8% average utilization can hide short-duration overload, clustering, skill-constrained capacity, interruption loss and excessive travel.
- Maintenance Support alone is 45.7% of modeled labor; definition, hands-on content, overlap and time distribution still need validation.
- A surge that clears only through outside support or by delaying protected work can falsely look recovered.
- Exact plant-authorized containment/restart and response-time requirements have not been supplied.
- Break relief and hidden support can falsely validate staffing by moving labor/backlog elsewhere.
- No saturation on a low-demand Thursday is under-exposure, not proof.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified task-family qualifications/authorizations.
2. Existing plant-defined stop/escalation/containment criteria and named authority to stop/restart the staffing trial.
3. **Thursday observer/support roster and which roles are part of the normal operating model versus pilot-only presence.**
4. Frozen Op1/Op2 zone map and normal walking/response routes.
5. Source-level detail behind the 336-min Maintenance Support workload.
6. Whether current task times already include normal walking and interruption/restart/recheck allowances.
7. Thursday Pending Work timestamps sufficient to reconstruct surge start, peak backlog, recovery start and recovery complete.
8. Thursday route-deviation, interruption, retrieval/backtrack, cross-zone-assist and outside-intervention timestamps/minutes.
9. Due/committed versus legitimately deferrable work rules and protected-work due requirements.
10. Plant safety/quality/equipment containment, restart, abnormal-response priority and response-time requirements.
11. Exact break schedule, relief source, relief qualifications and donor-role responsibilities.
12. Thursday timestamped workload, response milestones, running-press exposure, queues, saturation, support, mix, output and downtime.
13. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours, TPMH and response/workload timestamps where available.