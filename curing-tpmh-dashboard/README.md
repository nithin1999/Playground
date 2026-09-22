# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No measured 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing and clustering therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Pre-Pilot Readiness Gate
The pilot now needs an explicit **GO / CONDITIONAL GO / NO-GO readiness gate** before the 2-operator exposure starts. This does not judge whether two operators are feasible; it judges whether the trial is sufficiently controlled to produce interpretable evidence.

### GO — all critical controls verified
- Actual Op1/Op2 named and task-family qualifications/authorizations verified.
- Zones, normal routes, PRIMARY/FLEX ownership, dispatch priority and handback rule frozen.
- Break schedule and qualified relief method frozen; donor-role impact defined if relief comes from another role.
- Existing plant safety/quality/equipment containment, stop, restart and escalation authority verified.
- Protected/two-person work and actual due-time requirements identified.
- Observer / Authorized Support / Containment roster frozen and intervention logging ready.
- Timestamp/Pending Work/intervention logging method ready and observers briefed.

### CONDITIONAL GO — noncritical analysis gaps remain
Proceed only if plant-required safety/quality/qualification controls are verified and the unresolved item does not make the exposure unsafe or uninterpretable. Mark the unresolved item **NOT VERIFIED** and treat affected conclusions as NOT TESTED. Examples: Maintenance Support model confidence or missing matched historical comparison data.

### NO-GO / restore normal coverage
Do not start or continue the staffing exposure when a required plant safety/quality/authorization control is not satisfied, the actual operators cannot cover required qualified/two-person work, the restoration/escalation path is undefined, or the observation system cannot distinguish two-operator work from outside intervention. Use actual plant rules; no new numeric stop thresholds are invented here.

### Why this improves the pilot
The project has accumulated strong analysis methods, but an uncontrolled pilot can still produce a false pass or an uninterpretable failure. The readiness gate separates **process readiness** from **staffing feasibility** and prevents missing qualifications, relief, containment rules, or hidden support from being discovered only after the trial begins.

## Existing analysis retained
- Observer / Leader Intervention Protocol.
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
1. **Run the readiness gate first; do not confuse an uncontrolled exposure with a valid 2-operator test.**
2. Freeze people, zones, normal routes, verified qualifications/authorizations, relief and plant-authorized reaction rules.
3. Freeze GREEN/YELLOW/RED pilot stop/containment rules from actual plant requirements.
4. Freeze observer roles and intervention protocol; observers do not work or coach unless authorized containment/escalation requires intervention.
5. Freeze/confidence-tag the 736-min workload model; validate the 336-min Maintenance Support element first without delaying a safe pilot solely for an analysis-confidence gap.
6. Map every required work family to qualified Op1/Op2 resources and identify one-person, two-person and skill-restricted tasks.
7. Assign PRIMARY/FLEX ownership, observable flex triggers, handback and dispatch priority; outside support is not normal two-operator capacity unless explicitly part of the frozen operating model.
8. Verify qualification-gated break coverage and protected-work due requirements.
9. Scenario-walk normal work, breaks, simultaneous abnormalities, skill-restricted work, two-person tasks, interruption/recovery, cross-zone response, observer behavior and one RED escalation/restoration scenario.
10. Run Thursday with timestamped work elements, response milestones, 15-minute workload/exposure windows, Pending Work, saturation, qualification waits, support, intervention, interruption and route-deviation tags.
11. Reconcile observed task-category minutes/events to the workload model.
12. Calculate Interval Load Index, qualification feasibility, Interruption Tax, Pending WIP, Route-Deviation Minutes, Surge Recovery and intervention/support dependence.
13. Build NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views including manual work and observed walk/travel time.
14. For every surge, verify whether the two operators independently return Pending Work to the pre-surge level before due-time violations or handoff.
15. Reconstruct Recovery Debt, Break-Relief Coverage Debt, hidden support, qualification waits, intervention minutes, pending-work carryover and cross-zone support.
16. Normalize for running press-hours, event demand, mix and downtime; compare matched historical conditions.
17. Diagnose workload-model error vs sustained overload vs slow recovery vs qualification bottleneck vs fragmentation vs motion/layout vs imbalance vs dispatch vs relief vs staffing substitution/observer contamination.
18. Correct only the demonstrated constraint and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, conduct a short readiness review with the pilot owner and mark each critical item **VERIFIED / NOT VERIFIED / NOT APPLICABLE**. Any required plant safety, quality, authorization, two-person-work, containment/restoration or qualified-relief control that remains NOT VERIFIED must be resolved before the staffing exposure. Analysis-only gaps can remain visible as NOT VERIFIED and limit the conclusions rather than being silently assumed.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- **Readiness itself has not yet been verified; the dashboard must not imply GO until the actual people, qualifications, relief, containment and observation controls are confirmed.**
- Pilot stop/containment thresholds and restoration authority have not been supplied/verified in the project data.
- Observer/leader behavior can contaminate the trial by providing unmeasured cognitive or physical capacity.
- 55.8% average utilization can hide short-duration overload, clustering, skill-constrained capacity, interruption loss and excessive travel.
- Maintenance Support alone is 45.7% of modeled labor; definition, hands-on content, overlap and time distribution still need validation.
- A surge that clears only through outside support or by delaying protected work can falsely look recovered.
- Break relief and hidden support can falsely validate staffing by moving labor/backlog elsewhere.
- No saturation on a low-demand Thursday is under-exposure, not proof.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified task-family qualifications/authorizations.
2. Existing plant-defined stop/escalation/containment criteria and named authority to stop/restart the staffing trial.
3. Thursday observer/support roster and which roles are part of the normal operating model versus pilot-only presence.
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