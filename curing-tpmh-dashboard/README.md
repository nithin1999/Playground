# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project remains in **pilot-preparation / execution mode**. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Pre-Pilot Readiness Gate
The project now uses a **GO / GO-WITH-CONTAINMENT / NOT-READY** gate before Thursday exposure. This prevents the pilot from beginning with undefined work ownership, qualification, relief, reaction rules or measurement and then trying to interpret those design gaps as staffing evidence.

The gate is a **process-readiness check, not a performance pass/fail threshold**. Do not invent numeric limits. Existing plant safety, quality and process requirements remain authoritative.

### Gate A — Standard work ready
- Named Op1 and Op2.
- Frozen zones/routes and primary/flex ownership.
- Protected/periodic work identified with actual required frequencies/due times.
- Known two-person tasks identified.

### Gate B — Qualified capacity ready
- Op1/Op2 qualifications verified for assigned work.
- Relief capability verified for the work it is expected to cover.
- Any single-point skill is visible and has an approved response path.

### Gate C — Abnormal response ready
- Existing safety/quality escalation rules are available.
- Normal → flex → leader assessment → containment/rescue → recovery/restart path is understood.
- Simultaneous demand and abnormality-during-break scenarios have been walked through.

### Gate D — Relief ready
- Break/meal ownership is explicit.
- Relief source and its home-role responsibilities are known.
- Hand-off and hand-back are defined so hidden relief debt can be measured.

### Gate E — Measurement ready
- Observer and rescue/shadow are different roles where practical; observer no-coaching rule is understood.
- Exception/intervention log is ready.
- Hourly plan-vs-actual/backlog control is ready.
- Exact timestamps can be captured for response, queue, task completion, recovery and outside help.

**Decision logic:** GO only when all five gates are sufficiently defined to run the intended method safely and interpretably. GO-WITH-CONTAINMENT is appropriate when a known, explicitly controlled limitation remains but the planned exposure is still interpretable under plant authority. NOT-READY means a missing prerequisite would make the test unsafe, uncontrolled or analytically ambiguous; resolve it rather than treating the resulting disruption as evidence against two operators.

## Pilot Intervention Firewall
Separate observation, normal leadership, and rescue. Observer records facts/timestamps and does not direct routing, prioritization, task sequence or workload balancing. Floor leader retains normal plant leadership, safety, quality and escalation authority. Rescue/shadow intervenes only under existing plant rules or the agreed containment boundary. Any observer prompt or physical help that changes behavior is **OBSERVER-INFLUENCED** and cannot be credited as clean independent 2-op exposure.

### Intervention log
Use: `time | person | role | trigger | action/help | classification | people-min | operator/task affected | independent exposure resumed`.

Classifications: **BASELINE-NORMAL / INCREMENTAL-2OP / OBSERVER-INFLUENCED / CONTAINMENT-RESCUE / AMBIGUOUS**.

## Protected-Work Backlog Aging
For every periodic/protected task retain its real plant due time. Track `task | zone | due | pending since | owner | reason displaced | start | complete | helper`. Hourly review pending count, oldest age, overdue work, break/abnormality backlog and independent vs assisted clearance. Do not invent backlog limits.

## Interruption-Recovery Standard
Reaction sequence: **INTERRUPT → MAKE SAFE/RESPOND → CHECK WHAT IS DUE → RESUME HIGHEST-PRIORITY DUE WORK → CLEAR BACKLOG → RETURN TO NORMAL ROUTE.** Existing plant safety, quality and escalation rules override the sequence.

## Qualified Capacity Matrix
Map critical/event-driven tasks against Op1, Op2 and relief: **I = independently qualified, A = assist only, N = not qualified/authorized, ? = not verified**. Flag single-point skills, relief gaps and two-person tasks.

## Demand-Normalized Work Content
Separate fixed/periodic work, event-driven work, motion/retrieval and support/relief. Retain running press-hours, production volume and relevant event counts so a quiet or difficult Thursday is not generalized into permanent staffing.

## Operator Occupancy / Queue Analysis
Capture meaningful intervals as `start | end | operator | zone | task/category | primary/flex | walking/retrieval | helper | displaced work`. Overlay queues, breaks, flex assists and incremental help.

## Break-Relief Capacity Protection
Classify each break **COVERED / DEGRADED / UNRELIEVED-CONTAINED** and track displaced Curing work plus relief-home-role work through recovery.

## Pilot observation
- **Continuous exception log:** abnormalities, queues, flex assists, third-person intervention, observer influence, exposure-state changes, break/relief transitions, delayed work, containment, major downtime and recovery.
- **Fixed 15-minute structured observation each hour:** diagnostic sample only; do not extrapolate to full-shift utilization.
- **Hourly visual control:** plan vs actual, pending protected work, oldest backlog age, overdue work, support people-minutes, break state and major abnormalities.

## Support neutrality / pilot integrity
Pilot exposure states remain **INDEPENDENT 2-OP / ASSISTED 2-OP / CONTAINED-NOT TESTABLE**. Observer-influenced periods are not clean independent exposure.

`Independent Exposure % = Independent 2-op minutes / observable pilot minutes × 100`

## Best current strategy
1. Complete the five-gate readiness review before Thursday; do not start with analytically critical prerequisites undefined.
2. Freeze Op1/Op2/leader/relief/shadow/observer roles, zones, routes, qualifications, break coverage and reaction rules.
3. Establish the intervention firewall: observer records; leader leads normally; rescue intervenes only through plant authority/defined containment.
4. Mark periodic/protected work and real due-time requirements.
5. Scenario-walk simultaneous demand, abnormality during break, flex assist, relief handback and two-person tasks.
6. Rehearse interruption recovery, backlog visibility and rescue handoff without observer coaching.
7. Thursday: continuous exception log + fixed observation windows + hourly production/backlog control.
8. Preserve timestamps to reconstruct occupancy, queues, route interruptions, backlog aging, relief, support and observer/rescue interventions.
9. Diagnose physical-capacity vs skill/ownership/routing failures and normalize against running presses, events, mix and downtime.
10. Compare early/middle/late robustness; review TPMH, Effective Labor, Independent Exposure, support people-minutes, relief debt, queues and protected-work recovery.
11. Pareto observed causes; cross-train, reduce motion or rebalance only where evidence supports it; repeat representative conditions before permanent staffing change.

## Immediate next action
**Run a 15-minute readiness review using Gates A–E and assign an owner to every unresolved prerequisite.** The highest-value outcome is not another metric; it is entering Thursday with one defined operating method and one defined measurement method. Any unresolved item that makes the exposure unsafe or uninterpretable should be closed before the affected pilot exposure.

## Risks / gaps
- No verified Thursday performance exists yet.
- Starting before roles, qualifications, relief or reaction rules are frozen could confound staffing capability with poor pilot preparation.
- Observer coaching or ad-hoc leader help could artificially improve the 2-op result.
- Alarm response can look successful while protected work accumulates.
- Shift averages can hide temporary overload and late-shift deterioration.
- Physical availability is not usable capacity when qualifications differ.
- Alarm-start concurrency is a demand proxy, not hands-on workload.
- Thursday is one controlled exposure, not final proof.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, observer, rescue/shadow and relief assignments.
2. Verified qualification matrix and one-person vs two-person task list.
3. Frozen Op1/Op2 zone/route map and primary/flex ownership.
4. Periodic/protected task list with actual due-time/frequency requirements.
5. Existing plant safety/quality priority, escalation, containment and stop rules.
6. Exact break/meal plan, relief source and relief source home-role responsibilities.
7. Thursday hourly production plan, actual production, running-press exposure, mix and downtime.
8. Timestamped task intervals, interruptions, route-resume and backlog-clear times.
9. Queue episodes, flex assists and all outside interventions with classification and people-minutes.
10. Observer-influenced periods and time independent 2-op exposure resumes.