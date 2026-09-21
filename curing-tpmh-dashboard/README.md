# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Work-Interference / Collision Matrix
Same-minute alarm starts alone cannot establish whether two operators collide in real work. During the pilot, record each instance where a new demand arrives while one or both operators are already committed. Code the incumbent work and incoming demand as: **alarm/troubleshoot | GIP/scan/check | manual load-unload | bladder/two-person task | protected/periodic work | break-relief | walking/retrieval | downtime recovery | other**.

For each collision record:
`time | Op1 current work | Op2 current work | incoming demand | primary owner | flex used? | outside support? | work deferred | oldest backlog/delay | recovery time | outcome`

Build a post-pilot matrix of **current-work family × incoming-demand family** and rank cells by frequency, backlog/delay created, incremental support people-minutes, and failure to restore normal route. This converts vague “busy at the same time” observations into specific combinations that cause interference.

### Interpretation
- Frequent collisions with no backlog/support = design absorbs that combination; do not treat frequency alone as failure.
- Repeated collision + growing backlog while both operators are occupied = stronger evidence of a true capacity/surge constraint.
- Collision resolved mainly by long travel or handoffs = routing/ownership/motion countermeasure first.
- Collision repeatedly involving an unqualified flex operator = cross-training/qualification gap.
- Collision concentrated in break windows = relief design gap.
- Rare severe collision requiring plant-authorized rescue = define an abnormal surge/containment rule rather than automatically carrying a third operator continuously.

Do not invent response-time limits. Safety, quality, protected-work due times and existing plant rules remain authoritative.

## Standard-Work Conformance / Deviation Log
For each 15-minute window record standard followed?, deviation, reason, workaround and consequence. Classify **STANDARD FOLLOWED / JUSTIFIED DEVIATION / STANDARD NOT PRACTICAL**. Pareto recurring justified deviations rather than treating them as operator noncompliance.

## Matched-Condition Pilot Comparator
Build a reference set of prior comparable curing shifts using running press-hours, cured volume/plan, mix, major downtime, alarm/event counts, shift length and known staffing/support. Direct Thursday observations remain primary evidence; matched shifts are context.

## 15-Minute Workload / Surge Profile
Use 48 x 15-minute windows tagged NORMAL / BREAK-RELIEF / ABNORMAL-EVENT / DOWNTIME-RECOVERY. Retain Op1/Op2 occupied minutes, walking/retrieval, protected work, backlog start/peak/end, incremental support, running presses and abnormal events. Median/P90/P95/max are diagnostics, not staffing thresholds.

## Break-Relief Capacity Envelope
Treat breaks/meals as planned operating states. Keep displaced work visible as relief debt until completed. Classify INDEPENDENT / RECOVERED / ASSISTED / CONTAINED / NOT-EXPOSED.

## Trigger-Based Abnormal Response Ladder
**NORMAL ROUTE → ABNORMALITY VISIBLE/CALLED → PRIMARY OWNER → FLEX OWNER WHEN REQUIRED → FLOOR LEADER → CONTAINMENT/RESCUE → BACKLOG RECOVERY → NORMAL ROUTE**
Use existing plant-authorized rules; do not invent response-time thresholds.

## Pilot controls retained
- Pre-Pilot Readiness Gate: GO / GO-WITH-CONTAINMENT / NOT-READY.
- Pilot Intervention Firewall: observer records without coaching; normal floor authority remains intact; classify incremental support.
- Pilot Exposure Coverage Matrix: OBSERVED-INDEPENDENT / OBSERVED-ASSISTED / CONTAINED / NOT-EXPOSED.
- Protected-Work Backlog Aging: preserve real due times and oldest pending work.
- Qualified Capacity Matrix: I independently qualified / A assist only / N not authorized / ? not verified.
- Hour-by-Hour Demand-to-Capacity Board: plan/actual, running presses, abnormal events, direct work, walking, queues, backlog, relief/support and independent exposure.

## Best current strategy
1. Complete readiness gates and freeze people, zones, routes, qualifications, relief and plant-authorized reaction rules.
2. Freeze break/meal coverage, protected-work ownership and matched historical comparison method before seeing Thursday's result.
3. Scenario-walk break + abnormality, simultaneous demand, flex assist and two-person tasks.
4. Run Thursday with exception logging, exposure tracking, reaction timestamps, break records, hourly plan-vs-actual and 15-minute workload windows.
5. Record standard-work deviations and **work-interference collisions** whenever a new demand arrives while operators are committed.
6. Reconstruct occupancy, queues, backlog aging, relief debt, support and route restoration.
7. Build the current-work × incoming-demand collision matrix; rank combinations by backlog/delay and incremental support, not frequency alone.
8. Normalize against running press-hours, event demand, mix and downtime; compare closest-condition historical shifts.
9. Diagnose persistent capacity vs surge collision vs standard-work practicality vs skill vs motion/routing vs relief vs equipment/process loss vs support dependency.
10. Change only the demonstrated constraint and repeat representative/missing exposure before recommending permanent staffing change.

## Immediate next action
Add a small event-level collision log to Thursday's observer sheet. The observer only creates a collision row when a new demand arrives while Op1 or Op2 is already committed. Preserve timestamps and what work was deferred so the matrix can be reconstructed after the shift.

## Risks / gaps
- No verified Thursday performance exists yet.
- Alarm concurrency is only a proxy for demand; it does not show operator work interference.
- A single shift can confound staffing with press availability, mix, downtime and abnormal-event demand.
- A quiet shift may under-expose collision combinations; NOT OBSERVED is not PASS.
- Hidden support or workarounds can falsely validate staffing.
- Shift/hour averages can hide brief overload and recovery debt.
- Break/meal states, qualifications and abnormal-response ownership remain critical validation conditions.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, observer, rescue/shadow and relief assignments.
2. Exact break/meal schedule and relief source/qualifications/home-role responsibilities.
3. Verified qualification matrix and one-person vs two-person task list.
4. Frozen Op1/Op2 zone/route map and primary/flex ownership.
5. Periodic/protected task list with real due-time/frequency requirements.
6. Existing plant abnormality detection/call, escalation and rescue/containment rules.
7. Thursday hourly plan/actual, running-press exposure, mix and downtime.
8. Timestamped occupied-work, walking/retrieval, response, queue/backlog, support, route-restoration and standard-work deviation data.
9. **Event-level collision records showing incumbent work, incoming demand, deferred work, support and recovery.**
10. Historical comparable-shift staffing, cured tires/plan, running press-hours, major downtime, alarm/event counts, mix, support condition and man-hours/TPMH.
