# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing/clustering and qualification constraints therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Pending-Work Aging / Service-Clock Control
A simple Pending Work count can hide a dangerous condition: the queue can stay numerically small while one protected or qualification-restricted task waits too long. Thursday should therefore measure **age and due-state of pending work**, not only queue size.

For each task/event that cannot be started immediately, capture: **arrival/request time, required-by time if one exists, task family, owner, qualification requirement, protected/non-protected status, start time, close time, and reason for wait**. Display the oldest pending item and its state alongside total Pending WIP.

Do not invent a universal acceptable waiting-time threshold. Use existing plant safety, quality, equipment-protection, production, and work-standard requirements. If no verified due/response requirement exists, mark it **NOT VERIFIED** rather than creating one for the pilot.

### Why this changes the analysis
- Queue count alone does not reveal whether important work is aging toward or beyond an actual requirement.
- A stable queue with increasing oldest-item age indicates the system may not be recovering even if TPMH remains strong.
- If aging occurs while one operator has available but unqualified capacity, the likely constraint is skill coverage/dispatch rather than raw labor.
- If aging occurs while both qualified operators are legitimately committed, it is stronger evidence of a local capacity/concurrency constraint.
- If old work clears only after outside help, the pilot is support-dependent and that intervention must remain visible.
- If the queue grows during a break but returns to its pre-break age/profile afterward without violating requirements, that is different from hidden Recovery Debt that persists.

### Thursday use
Use a small visual queue with columns **NEW / OWNED / IN WORK / COMPLETE** and timestamp each transition. Highlight protected work and show the **oldest pending age**. Preserve reason codes such as BOTH COMMITTED, QUALIFICATION, BREAK/RELIEF, TRAVEL, WAITING ON SUPPORT, TWO-PERSON REQUIREMENT, or OTHER VERIFIED CAUSE. This is an observation/control aid, not permission to override plant priorities.

## Existing analysis retained
- Qualification Redundancy / Cross-Training Coverage Test.
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
- Interruption / Restart-Loss Test.
- Interval Capacity Stress Test using actual availability and due/committed work.
- Workload Confidence + BASE/PERIODIC/SURGE/CONTINGENCY decomposition; validate 336-min Maintenance Support first.
- Response-Time Service-Level Curve.
- Event-Driven Dispatch Priority Ladder; PRIMARY/FLEX ownership + handoff trigger.
- Demand-State Exposure Coverage; unobserved important states are NOT TESTED.

## Best current strategy
1. Run the readiness gate; freeze people, zones, routes, relief and plant-authorized reaction rules.
2. Freeze the operator × task-family qualification matrix and identify single-owner critical task families.
3. Validate/confidence-tag the 736-min model, especially 336 min Maintenance Support, including manual/walk/machine/wait composition and qualification requirements.
4. Freeze GREEN/YELLOW/RED containment, observer/support rules, PRIMARY/FLEX ownership, single-owner abnormal response, handback and dispatch priority.
5. Build intended NORMAL / BREAK-RELIEF / SURGE standardized-work combination views.
6. Build break-window and paired-load views showing due work, qualification constraints, event demand, relief capacity and simultaneous commitment.
7. Add the **Pending-Work Aging / Service-Clock board** so backlog is measured by count, age, due-state and reason for wait.
8. Scenario-walk normal work, breaks, one- and two-responder abnormalities, qualification conflicts, interruption/recovery, cross-zone response and restoration.
9. Run Thursday with timestamped work, response milestones, 15-minute exposure windows, Pending Work transitions/age, saturation, qualification waits/handoffs, support/intervention, interruption, route-deviation and ownership tags.
10. Reconstruct state-specific work sequences and calculate Interval Load, qualified capacity, oldest-pending age, due-state, qualification-driven wait, Interruption Tax, motion loss, surge recovery, Break Coverage Load, duplicate response and support dependence.
11. Stratify by 0–4 h / 4–8 h / 8–12 h and normalize for press-hours, event demand, mix, downtime and breaks; complete the Pilot Evidence Matrix.
12. Diagnose the demonstrated constraint and correct only that constraint; repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, add **arrival time / required-by time / owner / qualification / protected status / start / close / wait reason** to the existing Pending Work log. Verify actual plant due/response requirements where they exist. Scenario-walk one case in which a second task arrives while the first operator is committed and confirm how the queue is prioritized without inventing a new rule.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness itself is not verified.
- 55.8% average utilization can hide local concurrency, qualification, break, motion, interruption and late-shift constraints.
- Queue count without age can hide delayed protected work or incomplete recovery.
- A critical task family with only one qualified owner creates a single-point-of-skill failure.
- Relief can create hidden labor transfer and may not hold the same qualifications as Op1/Op2.
- Maintenance Support is 45.7% of modeled labor and still needs definition, hands-on/timing and qualification validation.
- Low-demand exposure can leave important demand states NOT TESTED.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified qualification/authorization by task family.
2. Relief/FLEX identities, qualifications and donor-role responsibilities.
3. Existing task-specific due/response requirements for safety, quality, equipment protection and protected work; where none is verified, retain NOT VERIFIED.
4. Which tasks require one person, two people, or specific authorization; approved cross-training path where applicable.
5. Exact pilot shift start/end, break schedule and relief plan.
6. Existing plant stop/escalation/containment criteria and stop/restart authority.
7. Observer/support roster and definition of normal-model versus pilot-only support.
8. Frozen Op1/Op2 zone map and normal walking/response routes.
9. Source-level detail behind the 336-min Maintenance Support workload, including hands-on versus machine/wait time and qualification requirement.
10. Thursday timestamped workload, Pending Work transitions/age, qualification waits/handoffs, response milestones, running-press exposure, queues, support/intervention, mix, output and downtime.
11. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours and TPMH where available.
