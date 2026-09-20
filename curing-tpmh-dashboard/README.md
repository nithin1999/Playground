# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project remains in **pilot-preparation / execution mode**. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Interruption-Recovery Standard
Curing is machine-intensive and event-driven: alarms and abnormal work can interrupt periodic checks, scans, rounds and other required work. Thursday will therefore test not only whether Op1/Op2 respond to abnormalities, but whether the **normal route recovers without hidden backlog or third-person substitution**.

For each meaningful interruption record: `operator | route/task interrupted | interruption start | abnormal task | response complete | next protected task due | route resumed | overdue work at resume | helper | full backlog-clear time`.

Use a simple reaction sequence: **INTERRUPT → MAKE SAFE/RESPOND → CHECK WHAT IS DUE → RESUME AT HIGHEST-PRIORITY DUE WORK → CLEAR BACKLOG → RETURN TO NORMAL ROUTE.** Existing plant safety, quality and escalation rules always override this sequence.

Interpretation:
- abnormality handled + route recovered independently → supports robustness;
- abnormality handled but periodic/protected work becomes overdue → interruption-recovery weakness;
- repeated backlog after one zone's events → zone/work-content imbalance candidate;
- qualified operator available but route still fails to recover → investigate ownership/visibility/priority;
- repeated third-person help to clear backlog → staffing substitution unless it is verified baseline-normal support.

Do **not** invent an allowable backlog or recovery-time threshold. Use actual plant due-time requirements where they exist and otherwise preserve the measured values for comparison.

## Qualified Capacity Matrix
Map every critical/event-driven task against **Op1, Op2 and planned relief** using demonstrated/authorized capability: **I = independently qualified, A = assist only, N = not qualified/authorized, ? = not verified**. Flag single-point skills, relief gaps, two-person tasks, and legitimate normal support dependencies.

## Demand-Normalized Work Content
Separate fixed/periodic work, event-driven work, motion/retrieval and support/relief. Retain running press-hours, production volume and relevant event counts so a quiet or difficult Thursday is not generalized into permanent staffing.

## Operator Occupancy / Queue Analysis
For meaningful work intervals capture `start | end | operator | zone | task/category | primary/flex | walking/retrieval | helper | displaced work`. Overlay queue starts, breaks, flex assists and incremental help. For queued abnormalities retain event time, owner, required skill, response start, work completion and full recovery.

## Break-Relief Capacity Protection
Classify every break **COVERED / DEGRADED / UNRELIEVED-CONTAINED**. Track displaced Curing work and relief-home-role work until recovered. A relief person is not full coverage unless required critical skills are actually covered.

## Pilot observation
**Continuous exception log:** abnormalities, queues, flex assists, third-person intervention, exposure-state changes, break/relief transitions, delayed/protected work, containment, major downtime and recovery.

**Fixed 15-minute structured observation each hour:** both operators' work category, walking/retrieval, waiting/monitoring, machine interaction, zone adherence, overlapping demand, relief state and carryover. Keep windows fixed; they are diagnostic samples, not full-shift utilization.

## Controlled Flex-Assist
Primary zones remain fixed. When uneven abnormal demand threatens required work, use **CALL → CHECK → TRANSFER → WORK → RETURN → RECOVER**. Assisting ownership requires appropriate qualification. Repeated one-way borrowing is evidence to rebalance zones.

## Support neutrality / pilot integrity
Classify outside intervention as **BASELINE-NORMAL, INCREMENTAL-2OP, AMBIGUOUS, or CONTAINMENT/RESCUE**. Pilot exposure states remain **INDEPENDENT 2-OP, ASSISTED 2-OP, CONTAINED/NOT TESTABLE**.

`Independent Exposure % = Independent 2-op minutes / observable pilot minutes × 100`

## Best current strategy
1. Freeze Op1/Op2/leader/relief roles, zones, normal routes, qualifications, break coverage and reaction rules.
2. Mark required periodic/protected work and its existing due-time requirement; do not invent limits.
3. Scenario-walk simultaneous demand, abnormality during break, flex assist, relief handback and known two-person tasks.
4. Rehearse the interruption-recovery sequence before the pilot.
5. Thursday: continuous exception log + fixed 15 min/hour observation + hourly production control.
6. Preserve timestamps to reconstruct occupancy, queues, route interruptions, backlog recovery, relief and support.
7. Diagnose physical-capacity vs skill/ownership/routing failures and normalize against running presses, events, mix and downtime.
8. Compare early/middle/late shift robustness.
9. Review TPMH, Effective Labor, Independent Exposure, support people-minutes, relief debt, queue/recovery and protected-work completion.
10. Pareto observed causes; cross-train, reduce motion or rebalance only where evidence supports it; repeat representative conditions before permanent staffing change.

## Immediate next action
**Before Thursday, mark the normal Op1 and Op2 routes and list every periodic/protected task with its actual plant due-time requirement.** Run one tabletop case in which an alarm interrupts each operator mid-route and verify exactly where they resume, how due work is prioritized, and how backlog is declared cleared. Add the interruption/recovery timestamps to the observer sheet.

## Risks / gaps
- No verified Thursday performance exists yet.
- A two-operator team can respond to alarms successfully while silently accumulating periodic-work backlog.
- Shift averages can hide temporary overload and late-shift deterioration.
- Physical availability is not usable capacity when qualifications differ.
- Alarm-start concurrency is a demand proxy, not hands-on workload.
- Thursday is one controlled exposure, not final proof.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, shadow/rescue and relief assignments.
2. Verified qualification matrix and one-person vs two-person task list.
3. Frozen Op1/Op2 zone/route map.
4. Complete periodic/protected task list with existing plant due-time/frequency requirements.
5. Existing plant safety/quality priority, escalation, containment and stop rules.
6. Exact break/meal plan, relief source and relief source home-role responsibilities.
7. Thursday hourly production plan, actual production, running-press exposure, product/mix and downtime.
8. Timestamped task intervals, interruptions, route-resume and backlog-clear times.
9. Event-level response, completion and recovery timestamps.
10. Queue episodes, flex assists and third-person interventions with people-minutes.
