# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing/clustering therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.
- Pilot readiness has not yet been verified.

## Latest improvement — Break-Window Feasibility Map
The 55.8% shift-average utilization does **not** validate break coverage. During a break, the operating system temporarily changes from two operators to one active operator unless qualified relief is explicitly provided. Thursday should therefore test break periods as their own capacity state rather than burying them inside the shift average.

For each planned break window, overlay: **(1) due/protected periodic work, (2) expected or observed abnormal/alarm demand, (3) qualification-restricted work, (4) two-person work, (5) PRIMARY/FLEX ownership, and (6) the relief source and donor-role displacement if relief is used.** Calculate a Break Coverage Load from due/committed hands-on + required travel during the window divided by the qualified operator-minutes actually available. Do not assign a pass threshold until plant due-time, safety, quality, and relief requirements are verified.

### Why this changes the analysis
- Two operators can be comfortable over 12 hours yet one operator can become locally overloaded during a break.
- A relief person is not free capacity: if a mold operator, leader, or other role covers Curing, the work displaced from that donor role must remain visible.
- Repeatedly delaying periodic work until after breaks creates Recovery Debt and can make a break appear successful when work was merely shifted.
- A break window that works only during unusually low event demand is not evidence of robust break relief.
- If break coverage is the only unstable state, the countermeasure should target relief timing/ownership/qualification before rejecting the base two-operator model.

### Thursday use
Before each break, record Pending Work and due/protected work. During the break, record active qualified capacity, alarms/abnormal calls, outside support, deferred work, response milestones and donor-role displacement. Continue observation after the break until Pending Work returns to its pre-break baseline or the remaining debt is explicitly carried forward. Classify the break evidence as SUPPORTED / CONCERN / NOT TESTED / NOT VERIFIED; do not manufacture a numeric acceptance criterion.

## Existing analysis retained
- State-Specific Standardized Work Combination Test for NORMAL / BREAK-RELIEF / SURGE.
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
5. Build intended NORMAL / BREAK-RELIEF / SURGE standardized-work combination views separating manual, walk, machine-auto, wait and handoff/support time.
6. Build a **Break-Window Feasibility Map** showing due work, qualification constraints, expected/observed event demand, relief capacity and donor-role displacement.
7. Scenario-walk normal work, breaks, simultaneous abnormalities, skill conflicts, interruption/recovery, cross-zone response and restoration.
8. Run Thursday with timestamped work, response milestones, 15-minute exposure windows, Pending Work, saturation, qualification waits, support/intervention, interruption and route-deviation tags.
9. Treat every break as a distinct capacity exposure; observe through post-break queue recovery rather than stopping measurement when the operator returns.
10. Reconstruct observed state-specific work sequences and reconcile actual work to the model; calculate Interval Load, qualified capacity, Pending WIP, Interruption Tax, motion loss, surge recovery, Break Coverage Load and support dependence.
11. Normalize for press-hours, event demand, mix and downtime and complete the Pilot Evidence Matrix.
12. Diagnose the demonstrated constraint; correct that constraint and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, create a one-line timeline for each planned break: **break start/end → operator remaining → qualified relief (if any) → protected/due work → donor role → handoff rule → post-break recovery owner**. Use the historical alarm timestamps, if available by clock time, to describe event exposure around those windows; do not move breaks solely from averages without plant approval. During Thursday, measure from the pre-break Pending Work baseline through full post-break recovery.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Readiness itself has not yet been verified.
- 55.8% average utilization can hide break-state overload, sequence conflicts, clustering, skill constraints, interruption loss and travel.
- Relief can create hidden labor transfer from mold/leader/maintenance roles.
- Deferred work can make a break look stable while creating post-break Recovery Debt.
- Maintenance Support is 45.7% of modeled labor and still needs definition/hands-on/timing validation.
- A low-demand Thursday may leave important demand states NOT TESTED.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified task-family qualifications/authorizations.
2. Exact break schedule, break duration, relief source, relief qualifications and donor-role responsibilities.
3. Historical alarm/event starts by clock time around planned break windows, plus Thursday observed break-window demand.
4. Protected-work due requirements and which work may or may not be deferred across a break.
5. Existing plant stop/escalation/containment criteria and stop/restart authority.
6. Observer/support roster and definition of normal-model versus pilot-only support.
7. Frozen Op1/Op2 zone map and normal walking/response routes.
8. Source-level detail behind the 336-min Maintenance Support workload, including hands-on versus machine/wait time.
9. Work-element times separated into manual, walk, machine-auto, wait and support/handoff where applicable.
10. Thursday timestamped workload, response milestones, Pending Work/recovery, running-press exposure, queues, support/intervention, mix, output and downtime.
11. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours and TPMH where available.
