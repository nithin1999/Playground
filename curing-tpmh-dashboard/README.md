# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Newly surfaced project data
- Project tracker records latest TPMH 18.52 on 2026-09-03 (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. Five listed shifts average 16.36. This is encouraging TPMH movement, but it is not a 2-operator pilot result.
- Current workload model totals 736 min = 12.27 labor-hours/shift. Against 22 net labor-hours for two operators, the deterministic model gives 55.8% utilization and 9.73 labor-hours nominal remaining capacity.
- Maintenance Support = 336 min (45.7% of modeled workload). Alarm Response 68 + Maintenance Support 336 + Bladder Support 60 + Changeover Support 84 = 548 min (74.5% of the 736-min model). Timing/clustering and qualification therefore matter as much as the shift total.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Interruption / Restart-Loss Test
The current 736-minute workload model can understate real labor if an operator starts required work, is pulled away by a higher-priority abnormality, then must walk back, re-orient, re-check status, retrieve tools/material, or repeat part of the task before completion. Those restart minutes are neither ordinary alarm labor nor the original task's clean-cycle time; they are interruption-induced workload.

During Thursday's pilot, do not create another continuous observation form. Use the existing timestamp log and flag any work element that is interrupted before completion. For each interruption capture: original task, interruption time, interrupting demand, operator, return time, restart/re-orientation time, any repeated work, and final completion time. Keep required safety/quality rechecks explicit rather than labeling them waste.

After the shift calculate **Interruption Tax = restart/re-orientation + repeated-work minutes caused by interruptions** and **Fragmented Task Count = required tasks interrupted before completion**. Attribute the cause to abnormal response, break/relief, qualification handoff, competing protected work, or other observed cause. Do not invent an acceptable threshold before observing the process.

Interpretation:
- High interruption tax concentrated around abnormalities suggests dispatch/route/ownership design is consuming nominal reserve.
- High tax around breaks suggests relief handoff design is incomplete.
- Repeated interruption of the same protected task indicates insufficient protected execution windows or poor task sequencing.
- Low aggregate Interval Load Index with high interruption tax means the apparent spare capacity is being lost to fragmentation, not necessarily to raw workload.
- If interruption tax is negligible, retain the simpler workload model rather than adding complexity.

## Existing analysis retained
- Qualification-Constrained Capacity Test.
- Interval Capacity Stress Test using actual availability and due/committed work.
- Workload Confidence + BASE/PERIODIC/SURGE/CONTINGENCY decomposition; validate the 336-min Maintenance Support element first.
- NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views.
- Response-Time Service-Level Curve.
- Break-Relief Coverage Debt and donor-role displacement.
- Event-Driven Dispatch Priority Ladder.
- PRIMARY/FLEX ownership + handoff trigger.
- Demand-State Exposure Coverage; unobserved important states are NOT TESTED.
- Two-operator saturation exposure, qualification-gated relief, protected-work due-time visual control, Recovery Debt, hidden support, standard-work conformance and matched-condition comparison.

## Best current strategy
1. Freeze people, zones, routes, verified qualifications/authorizations, relief and plant-authorized reaction rules.
2. Freeze the 736-min workload model and tag each element by demand type and evidence quality; validate the 336-min Maintenance Support element first.
3. Map every required work family to qualified Op1/Op2 resources and identify one-person, two-person and skill-restricted tasks.
4. Assign PRIMARY/FLEX ownership, observable flex triggers, handback and dispatch priority without treating outside support as normal capacity.
5. Verify qualification-gated break coverage and protected-work due requirements.
6. Scenario-walk normal work, breaks, competing demands, simultaneous abnormalities, skill-restricted work, two-person tasks and interruption/recovery.
7. Run Thursday with timestamped work elements, abnormal-response milestones, 15-minute workload/exposure windows, queues, saturation, qualification waits, support, and interruption/restart flags.
8. Reconcile observed task-category minutes/events to the workload model; quantify interruption tax separately before deciding whether it belongs in the future standard-work allowance.
9. Calculate Interval Load Index, qualification feasibility, fragmented-task count and interruption tax.
10. Build NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views and response-time distributions.
11. Reconstruct Recovery Debt, Break-Relief Coverage Debt, hidden support, qualification waits and route restoration.
12. Normalize for running press-hours, event demand, mix and downtime; compare matched historical conditions.
13. Diagnose workload-model error vs aggregate overload vs qualification bottleneck vs interruption/fragmentation vs imbalance vs surge vs motion/routing vs dispatch vs relief vs equipment vs staffing substitution.
14. Correct only the demonstrated constraint and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, add one interruption flag to the existing work-element log and scenario-walk one protected/periodic task being interrupted by a higher-priority abnormal call. Verify how unfinished work remains visible, who owns it, when the operator returns, and whether any recheck/restart work is required. Do not add a generic restart allowance to the 736-minute model until Thursday provides evidence.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- The deterministic 55.8% utilization can hide short-duration overload, clustering, unusable skill-constrained capacity, and interruption-induced restart loss.
- Maintenance Support alone is 45.7% of modeled labor; its definition, hands-on content, overlap and time distribution need validation.
- The current workload model does not yet show whether clean task times already include interruption/restart effects; double counting must be avoided.
- Borrowed leader/flex labor and qualifications must remain explicit.
- Latest TPMH 18.52 is not evidence that the 2-operator design works.
- Exact plant-authorized containment/restart and response-time requirements have not been supplied here.
- Break relief and hidden support can falsely validate staffing by moving labor/backlog elsewhere.
- No saturation on a low-demand Thursday is under-exposure, not proof.

## Data still needed
1. Verified task-family qualification/authorization matrix for actual Thursday Op1 and Op2, including one-person vs two-person requirements.
2. Actual Thursday assignments and availability timestamps.
3. Source-level detail behind the 336-min Maintenance Support workload.
4. Whether existing standard/task times include normal interruption/restart/recheck allowances.
5. Thursday interruption records: original task, interrupting demand, return/restart/repeated-work and completion timestamps.
6. Due/committed versus legitimately deferrable work rules.
7. Existing plant safety/quality/equipment containment, restart, abnormal-response priority and response-time requirements.
8. Frozen zone/route map, PRIMARY/FLEX ownership and handoff rules.
9. Exact break schedule, relief source, relief qualifications and donor-role responsibilities.
10. Protected/periodic task list with real due requirements.
11. Thursday timestamped workload, qualification waits, response milestones, running-press exposure, queues, saturation, support, mix, output and downtime.
12. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours, TPMH and workload/response timestamps where available.