# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Demand-State Operator Balance
A single shift-average utilization or Yamazumi can hide overload in an event-driven curing process. After Thursday, construct separate observed operator-balance views for NORMAL, BREAK-RELIEF and SURGE/SATURATION states using the same timestamped observations already planned.

For Op1 and Op2, stack observed operator work into: required repetitive/manual work | protected/periodic work | walking/retrieval | abnormal-response hands-on work | recovery work. Keep machine-auto time separate from operator labor. Show outside-support people-minutes beside, not inside, the two-operator bars so borrowed labor cannot make the design appear balanced.

Do not invent a utilization target. Compare Op1 versus Op2 within each observed state and inspect which work elements create imbalance. If one operator repeatedly carries more work while the other has recoverable capacity, rebalance zones/routes/ownership before concluding that two operators lack capacity. If both are occupied and queues/recovery debt grow, that is stronger capacity/surge evidence. If overload exists only during breaks, fix relief. If walking/retrieval is the differentiator, attack motion/layout first.

## Existing analysis retained
- Response-Time Service-Level Curve: event/call → awareness → response start → arrival → containment → clear → route restored; median/P90/max against real requirements and matched shifts.
- Break-Relief Coverage Debt and donor-role displacement.
- Event-Driven Dispatch Priority Ladder.
- PRIMARY/FLEX ownership + handoff trigger.
- Demand-State Exposure Coverage; unobserved important states are NOT TESTED.
- Two-operator saturation exposure.
- Qualification-gated relief.
- Base vs surge load and observed work-combination views.
- Protected-work due-time visual control.
- Time-of-shift robustness: EARLY / MID / LATE / BREAK-RELIEF.
- Recovery Debt and route-restoration time.
- Leader/flex support people-minutes and donor-role displacement.
- Standard-work conformance and matched-condition historical comparison.

## Best current strategy
1. Freeze people, zones, routes, qualifications, relief and plant-authorized reaction rules.
2. Assign PRIMARY/FLEX ownership, observable flex triggers, handback and dispatch priority.
3. Verify qualification-gated break coverage and protected-work due requirements.
4. Freeze matched historical comparison before seeing Thursday's result.
5. Scenario-walk normal work, breaks, competing demands, simultaneous abnormalities, two-person tasks and interruption/recovery.
6. Run Thursday with timestamped abnormal-response milestones, 15-minute workload/exposure windows, queues, saturation and support.
7. Build NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views for Op1 and Op2; keep machine-auto and borrowed labor explicit.
8. Build response-time service-level curves overall and by zone/break/saturation/ownership state.
9. Reconcile every break for Curing backlog, donor-role displacement and restoration.
10. Reconstruct Recovery Debt, Break-Relief Coverage Debt, hidden support, qualification waits and route restoration.
11. Normalize for running press-hours, event demand, mix and downtime; compare matched historical conditions.
12. Diagnose workload imbalance vs capacity vs surge vs response latency vs motion/routing vs dispatch vs qualification vs relief vs equipment vs staffing substitution.
13. Rebalance the demonstrated work elements first; repeat missing/representative exposure before permanent staffing change.

## Immediate next action
Do not add another observer form. Ensure Thursday's existing timestamp log identifies Op1/Op2 work element, start/end, walking/retrieval, abnormal response, recovery, break state and outside-support source. Those fields are sufficient to build the three state-specific balance views after the shift.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Exact plant-authorized containment/restart and response-time requirements have not been supplied here.
- Alarm concurrency is a demand proxy, not operator work interference.
- Shift-average TPMH or utilization can hide state-specific operator imbalance and overload.
- Break relief can falsely validate staffing if it shifts labor/backlog into another role.
- Hidden support, excessive cross-zone FLEX and donor-role displacement can falsely validate 2-operator staffing.
- No saturation on a low-demand Thursday is under-exposure, not proof.
- A single shift can leave important demand states NOT TESTED.
- Prior idle observations are not removable labor until base work, walking, machine-auto time and abnormal reserve are separated.

## Data still needed
1. Actual Thursday Op1, Op2, leader, observer, rescue/shadow and relief assignments.
2. Existing plant safety/quality/equipment containment, restart, abnormal-response priority and any response-time requirements.
3. Verified qualification matrix and one-person vs two-person task list.
4. Frozen Op1/Op2 zone/route map, PRIMARY/FLEX ownership and handoff rules.
5. Exact break schedule, relief source, relief qualifications and donor-role responsibilities.
6. Protected/periodic task list with real due requirements.
7. Thursday timestamped Op1/Op2 work elements with start/end, walk/retrieval, abnormal-response and recovery classification.
8. Thursday response milestones: event/call, awareness, response start, arrival, containment/first effective action, clear and route restored, plus owner/support source.
9. Thursday 15-minute running-press exposure, event starts, workload state, break state, queues, saturation, support, mix, output and downtime.
10. Historical matched shifts with comparable response/workload timestamps if available, plus staffing, press-hours, event counts, mix, support, cured tires, man-hours and TPMH.
11. Historical exposure distributions/quantiles to judge whether Thursday was low, typical or demanding.