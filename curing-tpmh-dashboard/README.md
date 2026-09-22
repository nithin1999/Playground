# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No measured 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing and clustering therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Surge Recovery / Queue-Drain Test
A temporary overload is not automatically evidence that two operators are infeasible. In an event-driven machine process, the critical question is whether the two operators can return the system to normal after a demand burst **without hidden labor, missed required work, or persistent backlog**. The existing Pending Work queue and 15-minute windows can answer this without another form.

For every observed surge that creates Pending Work, identify:
- **Surge start:** first interval in which due work begins accumulating because demand exceeds immediately usable qualified capacity.
- **Peak backlog:** maximum pending due-work minutes / open required tasks during that episode.
- **Recovery start:** point at which incoming demand falls below usable capacity and the operators begin draining the queue.
- **Recovery complete:** pending due work returns to the pre-surge level with required work completed and no borrowed support masking the recovery.
- **Outside-support minutes:** leader/flex/other labor used during the episode, kept separate from 2-operator capacity.

Calculate after the pilot:
- **Net Queue-Drain Rate** = reduction in pending due-work minutes / recovery minutes.
- **Time to Recover** = recovery-complete time minus peak-backlog time.
- **Residual Debt** = pending due-work minutes still open at break, handoff, or shift end.
- **Independent Recovery?** yes/no — did the two operators clear the episode without outside labor?

Do not invent a numeric recovery target. Compare observed recovery against actual due-time requirements, plant response/containment standards, and matched historical conditions.

### Diagnostic logic
- Short overload + rapid independent recovery + no late protected work → transient surge may be absorbable; do not call it a staffing failure solely because interval load exceeded 100%.
- Backlog continues growing after demand normalizes → true capacity, qualification, dispatch, route, or work-content constraint.
- Recovery occurs only with leader/flex labor → hidden staffing dependency, not independent 2-operator recovery.
- Queue drains but protected/periodic work becomes late → apparent recovery is displacement, not recovery.
- Slow recovery with high route-deviation/retrieval loss → attack motion/point-of-use before concluding manpower is insufficient.
- Slow recovery with asymmetric Op1/Op2 loading → rebalance zones/PRIMARY-FLEX ownership.

## Existing analysis retained
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
2. Freeze/confidence-tag the 736-min workload model; validate the 336-min Maintenance Support element first.
3. Map every required work family to qualified Op1/Op2 resources and identify one-person, two-person and skill-restricted tasks.
4. Assign PRIMARY/FLEX ownership, observable flex triggers, handback and dispatch priority; outside support is not normal two-operator capacity.
5. Verify qualification-gated break coverage and protected-work due requirements.
6. Scenario-walk normal work, breaks, simultaneous abnormalities, skill-restricted work, two-person tasks, interruption/recovery and one cross-zone abnormal response.
7. Run Thursday with timestamped work elements, response milestones, 15-minute workload/exposure windows, Pending Work, saturation, qualification waits, support, interruption flags and route-deviation tags.
8. Reconcile observed task-category minutes/events to the workload model.
9. Calculate Interval Load Index, qualification feasibility, Interruption Tax, Pending WIP, Route-Deviation Minutes and **Surge Recovery / Queue-Drain Rate**.
10. Build NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views including manual work and observed walk/travel time.
11. For every surge episode, verify whether the two operators independently return Pending Work to the pre-surge level before due-time violations or handoff.
12. Reconstruct Recovery Debt, Break-Relief Coverage Debt, hidden support, qualification waits, pending-work carryover and cross-zone support.
13. Normalize for running press-hours, event demand, mix and downtime; compare matched historical conditions.
14. Diagnose workload-model error vs sustained overload vs slow recovery vs qualification bottleneck vs fragmentation vs motion/layout vs imbalance vs dispatch vs relief vs staffing substitution.
15. Correct only the demonstrated constraint and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, define the **pre-surge baseline** for the Pending Work board and make sure each open required task has an owner and real due requirement. During the pilot, when a queue forms, keep observing until it returns to that baseline. Do not stop the observation when the alarm clears; the recovery period is part of the staffing test.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- 55.8% average utilization can hide short-duration overload, clustering, skill-constrained capacity, interruption loss and excessive travel.
- Maintenance Support alone is 45.7% of modeled labor; definition, hands-on content, overlap and time distribution still need validation.
- A surge that clears only through outside support or by delaying protected work can falsely look recovered.
- No observed independent queue-drain/recovery performance is yet available.
- Exact plant-authorized containment/restart and response-time requirements have not been supplied.
- Break relief and hidden support can falsely validate staffing by moving labor/backlog elsewhere.
- No saturation on a low-demand Thursday is under-exposure, not proof.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified task-family qualifications/authorizations.
2. Frozen Op1/Op2 zone map and normal walking/response routes.
3. Source-level detail behind the 336-min Maintenance Support workload.
4. Whether current task times already include normal walking and interruption/restart/recheck allowances.
5. Thursday Pending Work timestamps sufficient to reconstruct surge start, peak backlog, recovery start and recovery complete.
6. Thursday route-deviation, interruption, retrieval/backtrack and cross-zone-assist timestamps/minutes.
7. Due/committed versus legitimately deferrable work rules and protected-work due requirements.
8. Plant safety/quality/equipment containment, restart, abnormal-response priority and response-time requirements.
9. Exact break schedule, relief source, relief qualifications and donor-role responsibilities.
10. Thursday timestamped workload, response milestones, running-press exposure, queues, saturation, support, mix, output and downtime.
11. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours, TPMH and response/workload timestamps where available.