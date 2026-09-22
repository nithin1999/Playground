# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing/clustering therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.
- Pilot readiness has not yet been verified.

## Latest improvement — Time-on-Shift Sustainability Test
A 12-hour two-operator pilot should not be judged only from whole-shift averages. NIOSH guidance on extended shifts notes that workload must be considered with shift length and that later hours of extended shifts can carry greater fatigue, vigilance, reaction-time and error risk. Thursday should therefore test whether the proposed work system remains stable late in the shift rather than allowing strong early-shift performance to mask deterioration.

Split the pilot into **0–4 h / 4–8 h / 8–12 h** exposure bands and compare the same operational measures already being collected: response time, Pending Work, recovery time, route/travel loss, outside intervention, duplicate response/handoffs, protected-work completion, break coverage and operator load. Also retain exact event timestamps so any observed deterioration can be distinguished from a coincident increase in alarm/event demand.

### Why this changes the analysis
- Whole-shift TPMH and utilization can hide late-shift instability.
- A workload model that is feasible mathematically may still be operationally weak if response, recovery or standard-work adherence degrades as time on task accumulates.
- If late-shift performance worsens while demand exposure is comparable, fatigue/work-design risk deserves investigation before permanent staffing change.
- If late-shift performance remains stable under comparable exposure, that is stronger evidence of sustainability than a shift-average result alone.
- Do **not** invent a fatigue threshold or attribute deterioration to fatigue without controlling for demand, downtime, mix, breaks and abnormal events.

### Thursday use
Preserve timestamps and tag each observation by shift-hour band. At review, compare like-for-like exposure where possible. Record whether protected work, break relief, abnormal response and recovery remain stable in the final four hours. Any important state not observed late in the shift remains **NOT TESTED** for late-shift sustainability.

## Existing analysis retained
- Single-Owner Abnormal Response Test and explicit handoff tracking.
- Paired-load concurrency analysis for Op1/Op2.
- Break-Window Feasibility Map and post-break Recovery Debt.
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
- Event-Driven Dispatch Priority Ladder; PRIMARY/FLEX ownership + handoff trigger.
- Demand-State Exposure Coverage; unobserved important states are NOT TESTED.

## Best current strategy
1. Run the readiness gate; do not confuse an uncontrolled exposure with a valid staffing test.
2. Freeze people, zones, routes, verified qualifications/authorizations, relief and plant-authorized reaction rules.
3. Freeze GREEN/YELLOW/RED containment, observer/support rules, PRIMARY/FLEX ownership, single-owner abnormal response, handback and dispatch priority.
4. Validate/confidence-tag the 736-min model, especially 336 min Maintenance Support.
5. Build intended NORMAL / BREAK-RELIEF / SURGE standardized-work combination views separating manual, walk, machine-auto, wait and handoff/support time.
6. Build break-window and paired-load views showing due work, qualification constraints, event demand, relief capacity, donor-role displacement and simultaneous commitment.
7. Scenario-walk normal work, breaks, one- and two-responder abnormalities, skill conflicts, interruption/recovery, cross-zone response and restoration.
8. Run Thursday with timestamped work, response milestones, 15-minute exposure windows, Pending Work, saturation, qualification waits, support/intervention, interruption, route-deviation and ownership/handoff tags.
9. Preserve shift-hour exposure so results can be compared across **0–4 h / 4–8 h / 8–12 h**, especially break and abnormal-response stability late in the shift.
10. Reconstruct observed state-specific work sequences and reconcile actual work to the model; calculate Interval Load, qualified capacity, Pending WIP, Interruption Tax, motion loss, surge recovery, Break Coverage Load, duplicate response and support dependence.
11. Normalize for press-hours, event demand, mix, downtime and time-on-shift exposure; complete the Pilot Evidence Matrix.
12. Diagnose the demonstrated constraint; correct that constraint and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, make sure the timestamp log preserves **shift start time and event/task timestamps** so every observation can be assigned to 0–4 h, 4–8 h or 8–12 h without adding another form. During review, compare late-shift response/recovery/backlog against earlier periods only after checking event demand, downtime, mix and break exposure.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Readiness itself has not yet been verified.
- 55.8% average utilization can hide break-state overload, sequence conflicts, clustering, skill constraints, interruption loss, travel and late-shift deterioration.
- Relief can create hidden labor transfer from mold/leader/maintenance roles.
- Deferred work can make a break look stable while creating post-break Recovery Debt.
- Maintenance Support is 45.7% of modeled labor and still needs definition/hands-on/timing validation.
- A low-demand Thursday may leave important demand states NOT TESTED; a low-demand final four hours may also leave late-shift stress NOT TESTED.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified task-family qualifications/authorizations.
2. Exact pilot shift start/end, break schedule, break duration, relief source, relief qualifications and donor-role responsibilities.
3. Historical alarm/event starts by clock time and, if available, by shift-hour exposure; plus Thursday observed demand.
4. Protected-work due requirements and which work may or may not be deferred across a break.
5. Existing plant stop/escalation/containment criteria and stop/restart authority.
6. Observer/support roster and definition of normal-model versus pilot-only support.
7. Frozen Op1/Op2 zone map and normal walking/response routes.
8. Source-level detail behind the 336-min Maintenance Support workload, including hands-on versus machine/wait time.
9. Work-element times separated into manual, walk, machine-auto, wait and support/handoff where applicable.
10. Thursday timestamped workload, response milestones, Pending Work/recovery, running-press exposure, queues, support/intervention, mix, output and downtime, retained by shift-hour band.
11. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours and TPMH where available.
