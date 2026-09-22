# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No measured 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing and clustering therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Pilot Stop / Containment Rules
The pilot now needs a pre-agreed **stop/containment ladder** so the team does not trade safety, quality, equipment protection or required work for TPMH. This is a decision-control improvement, not a claim that any failure has occurred.

Before the pilot starts, map actual plant-authorized requirements into three states:
- **GREEN — continue:** two operators are executing the frozen operating model; required work remains controlled; abnormalities are handled within plant rules; any Pending Work remains visible, owned and recoverable.
- **YELLOW — contain + observe:** workload/queue/surge is stressing the operating model but plant safety/quality/equipment rules are still protected. Freeze nonessential/deferrable work as authorized, make Pending Work visible, apply PRIMARY/FLEX dispatch, and continue timing the episode and recovery. Do not silently borrow labor.
- **RED — stop the staffing test / restore authorized coverage:** any plant-defined safety or quality stop condition; required containment/restart cannot be executed with available qualified resources; protected work would violate an actual due requirement; a required two-person task lacks qualified coverage; or plant escalation rules require additional staffing. Outside labor used to protect the process must be recorded as support, not counted as two-operator success.

Do **not** invent numeric stop thresholds. Use existing Safety, Quality, Maintenance and Curing rules. If a required threshold is unknown before the pilot, mark it **NOT VERIFIED** rather than creating one.

### Why this improves the pilot
A two-operator trial is not only a productivity test; it is a controlled test of the operating system. Predefined stop rules prevent post-hoc judgment and protect the integrity of the data. A RED event does not automatically prove two operators are impossible: classify the causal constraint (qualification, simultaneous demand, two-person work, route/dispatch, relief, equipment condition, or true capacity), correct it, and retest. Conversely, a shift that reaches target TPMH by using unrecorded rescue labor or delaying protected work is not a successful validation.

## Existing analysis retained
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
2. **Freeze GREEN/YELLOW/RED pilot stop/containment rules from actual plant requirements before starting.**
3. Freeze/confidence-tag the 736-min workload model; validate the 336-min Maintenance Support element first.
4. Map every required work family to qualified Op1/Op2 resources and identify one-person, two-person and skill-restricted tasks.
5. Assign PRIMARY/FLEX ownership, observable flex triggers, handback and dispatch priority; outside support is not normal two-operator capacity.
6. Verify qualification-gated break coverage and protected-work due requirements.
7. Scenario-walk normal work, breaks, simultaneous abnormalities, skill-restricted work, two-person tasks, interruption/recovery, one cross-zone abnormal response, and one RED escalation/restoration scenario.
8. Run Thursday with timestamped work elements, response milestones, 15-minute workload/exposure windows, Pending Work, saturation, qualification waits, support, interruption flags and route-deviation tags.
9. Reconcile observed task-category minutes/events to the workload model.
10. Calculate Interval Load Index, qualification feasibility, Interruption Tax, Pending WIP, Route-Deviation Minutes and Surge Recovery / Queue-Drain Rate.
11. Build NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views including manual work and observed walk/travel time.
12. For every surge, verify whether the two operators independently return Pending Work to the pre-surge level before due-time violations or handoff.
13. Reconstruct Recovery Debt, Break-Relief Coverage Debt, hidden support, qualification waits, pending-work carryover and cross-zone support.
14. Normalize for running press-hours, event demand, mix and downtime; compare matched historical conditions.
15. Diagnose workload-model error vs sustained overload vs slow recovery vs qualification bottleneck vs fragmentation vs motion/layout vs imbalance vs dispatch vs relief vs staffing substitution.
16. Correct only the demonstrated constraint and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, hold a short pre-pilot review with Curing leadership plus the appropriate Safety/Quality/Maintenance owners and fill in the GREEN/YELLOW/RED ladder using **existing authorized requirements**. Name who has authority to stop the pilot and how normal staffing is restored. Scenario-walk one RED case. Do not run the trial with an invented or ambiguous safety/quality threshold.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Pilot stop/containment thresholds and restoration authority have not been supplied/verified in the project data.
- 55.8% average utilization can hide short-duration overload, clustering, skill-constrained capacity, interruption loss and excessive travel.
- Maintenance Support alone is 45.7% of modeled labor; definition, hands-on content, overlap and time distribution still need validation.
- A surge that clears only through outside support or by delaying protected work can falsely look recovered.
- Exact plant-authorized containment/restart and response-time requirements have not been supplied.
- Break relief and hidden support can falsely validate staffing by moving labor/backlog elsewhere.
- No saturation on a low-demand Thursday is under-exposure, not proof.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified task-family qualifications/authorizations.
2. **Existing plant-defined stop/escalation/containment criteria and named authority to stop/restart the staffing trial.**
3. Frozen Op1/Op2 zone map and normal walking/response routes.
4. Source-level detail behind the 336-min Maintenance Support workload.
5. Whether current task times already include normal walking and interruption/restart/recheck allowances.
6. Thursday Pending Work timestamps sufficient to reconstruct surge start, peak backlog, recovery start and recovery complete.
7. Thursday route-deviation, interruption, retrieval/backtrack and cross-zone-assist timestamps/minutes.
8. Due/committed versus legitimately deferrable work rules and protected-work due requirements.
9. Plant safety/quality/equipment containment, restart, abnormal-response priority and response-time requirements.
10. Exact break schedule, relief source, relief qualifications and donor-role responsibilities.
11. Thursday timestamped workload, response milestones, running-press exposure, queues, saturation, support, mix, output and downtime.
12. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours, TPMH and response/workload timestamps where available.