# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing/clustering therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.
- Pilot readiness has not yet been verified.

## Latest improvement — State-Specific Standardized Work Combination Test
The 736-minute shift total and even a balanced Yamazumi can hide whether two operators can execute the work **in sequence** when machines are running, alarms occur, or one operator is on break. Before judging the pilot, build three compact standardized-work combination views for **NORMAL, BREAK-RELIEF, and SURGE/ABNORMAL** states.

For each operator, show the actual sequence of work elements and distinguish **manual/hands-on time, walking/travel, machine automatic time, waiting/available time, and handoff/support**. Overlay machine/press demand and mark qualification-restricted or two-person elements. Use observed times where available; unverified times remain NOT VERIFIED rather than being converted into standards.

### Why this changes the analysis
- A shift-average 55.8% utilization can still fail if both operators' manual/walk work overlaps at the same moment.
- Machine automatic time is not operator labor and should not be loaded onto the operator bar as if hands-on.
- A balanced total workload can still contain a bad sequence: cross-zone travel, simultaneous calls, break handoffs, or qualification conflicts can create local overburden.
- If the NORMAL state is stable but BREAK or SURGE cannot be executed without borrowed labor, the constraint is relief/abnormal-response design rather than ordinary base staffing.
- If the chart exposes repeated walk/retrieval between required interventions, test point-of-use tools/information or route changes before adding labor.

### Thursday use
Use the timestamp log to reconstruct at least one observed NORMAL period, every observed BREAK-RELIEF period, and every meaningful SURGE/ABNORMAL period. Compare the observed sequence with the intended PRIMARY/FLEX sequence. Record deviations and their reason. Do not fabricate a SURGE chart if no representative surge occurs; mark it NOT TESTED.

## Existing analysis retained
- Multidimensional Pilot Evidence Matrix; TPMH alone cannot pass the model.
- GO / CONDITIONAL GO / NO-GO Pre-Pilot Readiness Gate.
- Observer / Leader Intervention Protocol.
- GREEN / YELLOW / RED Pilot Stop / Containment Rules using existing plant requirements only.
- Surge Recovery / Queue-Drain Test.
- Route-Deviation / Motion-Loss Test.
- Pending Work / Recovery Queue.
- Interruption / Restart-Loss Test.
- Qualification-Constrained Capacity Test.
- Interval Capacity Stress Test using actual availability and due/committed work.
- Workload Confidence + BASE/PERIODIC/SURGE/CONTINGENCY decomposition; validate 336-min Maintenance Support first.
- NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views.
- Response-Time Service-Level Curve.
- Break-Relief Coverage Debt and donor-role displacement.
- Event-Driven Dispatch Priority Ladder; PRIMARY/FLEX ownership + handoff trigger.
- Demand-State Exposure Coverage; unobserved important states are NOT TESTED.
- Qualification-gated relief, protected-work due-time visual control, Recovery Debt, hidden support, standard-work conformance and matched-condition comparison.

## Best current strategy
1. Run the readiness gate; do not confuse an uncontrolled exposure with a valid staffing test.
2. Freeze people, zones, routes, verified qualifications/authorizations, relief and plant-authorized reaction rules.
3. Freeze GREEN/YELLOW/RED containment, observer/support rules, PRIMARY/FLEX ownership, handback and dispatch priority.
4. Validate/confidence-tag the 736-min model, especially 336 min Maintenance Support.
5. Build intended **NORMAL / BREAK-RELIEF / SURGE standardized-work combination views** separating manual, walk, machine-auto, wait and handoff/support time.
6. Scenario-walk normal work, breaks, simultaneous abnormalities, skill conflicts, interruption/recovery, cross-zone response and restoration.
7. Run Thursday with timestamped work, response milestones, 15-minute exposure windows, Pending Work, saturation, qualification waits, support/intervention, interruption and route-deviation tags.
8. Reconstruct observed state-specific work sequences and compare them with intended PRIMARY/FLEX work; identify overlap, travel, handoff and qualification losses.
9. Reconcile observed work to the model and calculate Interval Load, qualified capacity, Pending WIP, Interruption Tax, motion loss, surge recovery and support dependence.
10. Normalize for press-hours, event demand, mix and downtime and complete the Pilot Evidence Matrix.
11. Diagnose the demonstrated constraint; correct that constraint and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, sketch one-page **NORMAL and BREAK-RELIEF standardized-work combination tables** for Op1 and Op2 using only verified work elements/times. Leave uncertain elements visibly NOT VERIFIED. During the pilot, use timestamps to reconstruct the actual sequence. Create the SURGE view only from a representative observed or approved scenario; do not invent exposure.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Readiness itself has not yet been verified.
- 55.8% average utilization can hide sequence conflicts, simultaneous manual work, clustering, skill constraints, interruption loss and travel.
- A Yamazumi/workload total without machine-auto versus hands-on separation can overstate or misplace operator load.
- Maintenance Support is 45.7% of modeled labor and still needs definition/hands-on/timing validation.
- A low-demand Thursday may leave important demand states NOT TESTED.
- Break relief or leader/mold/maintenance assistance can move labor demand elsewhere and falsely validate two-operator staffing.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified task-family qualifications/authorizations.
2. Existing plant stop/escalation/containment criteria and stop/restart authority.
3. Observer/support roster and definition of normal-model versus pilot-only support.
4. Frozen Op1/Op2 zone map and normal walking/response routes.
5. Source-level detail behind the 336-min Maintenance Support workload, including hands-on versus machine/wait time.
6. Work-element times separated into manual, walk, machine-auto, wait and support/handoff where applicable.
7. Protected-work due requirements and due-versus-deferrable rules.
8. Exact break schedule, relief source, relief qualifications and donor-role responsibilities.
9. Thursday timestamped workload, response milestones, Pending Work/recovery, running-press exposure, queues, support/intervention, mix, output and downtime.
10. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours and TPMH where available.
