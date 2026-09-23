# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing/clustering and qualification constraints therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Qualification Redundancy / Cross-Training Coverage Test
A two-operator design can have adequate total labor capacity and still fail if critical task families depend on only one qualified person. Thursday should therefore test **qualified redundancy**, not just whether each operator is generally trained.

Build a compact operator × task-family matrix for the work that can arise during the pilot: alarm/troubleshooting families, GIP/scan, manual load/unload, bladder support, changeover/mold support, required checks, and the task families hidden inside Maintenance Support. For each task family, mark each person **AUTHORIZED/QUALIFIED, NOT QUALIFIED, or NOT VERIFIED**. Add relief/FLEX only if that person is genuinely part of the frozen operating model.

During the pilot, every qualification-driven wait or handoff should record: task/event, initial owner, required qualification, qualified person available, wait start, handoff/response start, and displaced work. This distinguishes a true manpower shortage from a skill-distribution problem.

### Why this changes the analysis
- 55.8% average utilization does not prove that capacity is fungible between operators.
- If Op1 is busy and Op2 is free but cannot legally/safely perform the waiting task, the constraint is **qualification coverage**, not raw labor minutes.
- If critical task families repeatedly have only one qualified owner, the two-operator design contains a single-point-of-skill failure.
- If qualification-driven waits disappear after approved cross-training, that is a stronger and more targeted countermeasure than adding permanent labor.
- Do **not** assume cross-training is allowed; training, authorization, safety and plant requirements must be verified before changing task ownership.

### Thursday use
Freeze the qualification matrix before the trial. Overlay qualification status on paired-load and abnormal-response observations. Report **qualification-driven wait minutes, qualification-driven handoffs, task families with one qualified owner, and relief/FLEX qualification gaps**. Do not invent an acceptable threshold; classify observed constraints and use plant requirements.

## Existing analysis retained
- Time-on-Shift Sustainability Test (0–4 h / 4–8 h / 8–12 h).
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
- Interval Capacity Stress Test using actual availability and due/committed work.
- Workload Confidence + BASE/PERIODIC/SURGE/CONTINGENCY decomposition; validate 336-min Maintenance Support first.
- Response-Time Service-Level Curve.
- Event-Driven Dispatch Priority Ladder; PRIMARY/FLEX ownership + handoff trigger.
- Demand-State Exposure Coverage; unobserved important states are NOT TESTED.

## Best current strategy
1. Run the readiness gate; do not confuse an uncontrolled exposure with a valid staffing test.
2. Freeze people, zones, routes, relief and plant-authorized reaction rules.
3. **Freeze the operator × task-family qualification matrix** and identify single-owner critical task families before the pilot.
4. Freeze GREEN/YELLOW/RED containment, observer/support rules, PRIMARY/FLEX ownership, single-owner abnormal response, handback and dispatch priority.
5. Validate/confidence-tag the 736-min model, especially 336 min Maintenance Support, and map its tasks to required qualifications.
6. Build intended NORMAL / BREAK-RELIEF / SURGE standardized-work combination views separating manual, walk, machine-auto, wait and handoff/support time.
7. Build break-window and paired-load views showing due work, qualification constraints, event demand, relief capacity, donor-role displacement and simultaneous commitment.
8. Scenario-walk normal work, breaks, one- and two-responder abnormalities, **qualification conflicts**, interruption/recovery, cross-zone response and restoration.
9. Run Thursday with timestamped work, response milestones, 15-minute exposure windows, Pending Work, saturation, qualification waits/handoffs, support/intervention, interruption, route-deviation and ownership tags.
10. Preserve shift-hour exposure for 0–4 h / 4–8 h / 8–12 h comparisons.
11. Reconstruct state-specific work sequences and calculate Interval Load, qualified capacity, qualification-driven wait, Pending WIP, Interruption Tax, motion loss, surge recovery, Break Coverage Load, duplicate response and support dependence.
12. Normalize for press-hours, event demand, mix, downtime and time-on-shift exposure; complete the Pilot Evidence Matrix.
13. Diagnose the demonstrated constraint. If qualification coverage is causal, pursue approved cross-training/authorization before assuming more manpower is required; then repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, create a one-page **operator × task-family qualification matrix** for Op1, Op2 and any planned relief/FLEX. Use only VERIFIED qualification/authorization records; mark uncertainty NOT VERIFIED. Scenario-walk one case where the primary qualified operator is already committed and determine what the second operator is authorized to do.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness itself is not verified.
- 55.8% average utilization can hide skill bottlenecks, break-state overload, sequence conflicts, clustering, interruption loss, travel and late-shift deterioration.
- A critical task family with only one qualified owner creates a single-point-of-skill failure even when total labor minutes look adequate.
- Relief can create hidden labor transfer and may not hold the same qualifications as Op1/Op2.
- Maintenance Support is 45.7% of modeled labor and still needs definition, hands-on/timing and qualification validation.
- Low-demand exposure can leave important demand/qualification conflicts NOT TESTED.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and **verified qualification/authorization by task family**.
2. Relief/FLEX identities, qualifications and donor-role responsibilities.
3. Which tasks legally/operationally require one person, two people, or specific authorization; approved cross-training path where applicable.
4. Exact pilot shift start/end, break schedule and relief plan.
5. Protected-work due requirements and deferral rules.
6. Existing plant stop/escalation/containment criteria and stop/restart authority.
7. Observer/support roster and definition of normal-model versus pilot-only support.
8. Frozen Op1/Op2 zone map and normal walking/response routes.
9. Source-level detail behind the 336-min Maintenance Support workload, including hands-on versus machine/wait time and qualification requirement.
10. Thursday timestamped workload, qualification waits/handoffs, response milestones, Pending Work/recovery, running-press exposure, queues, support/intervention, mix, output and downtime.
11. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours and TPMH where available.
