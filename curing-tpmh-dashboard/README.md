# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Recovery-Debt / Backlog-Area Metric
Peak backlog alone can misclassify the 2-operator system. A queue of two tasks cleared in five minutes is materially different from the same peak queue persisting for forty minutes. Thursday should therefore preserve **backlog magnitude AND duration**.

For each queue episode record `queue start | peak pending work | oldest pending age | clear/recovery time | protected work overdue? | outside support people-min | route restored time`.

After the pilot, calculate a simple **Recovery Debt Area** from the timestamped backlog trace: sum of `pending work × minutes` across the episode (task-minutes). Keep separate views for NORMAL, BREAK-RELIEF, ABNORMAL-EVENT and DOWNTIME-RECOVERY states. This is a diagnostic, not a plant acceptance threshold.

Interpretation:
- high peak + fast independent recovery = short surge, potentially compatible with 2-op plus defined reserve;
- modest peak + long persistence = weak recovery capacity / ownership / skill / route issue;
- debt concentrated around breaks = relief-design problem;
- debt cleared only after incremental outside labor = staffing/support dependency;
- debt persists after alarm completion = system recovery is incomplete even though the immediate event is closed.

Do not invent a maximum acceptable task-minute value. Use real Safety, Quality, protected-work due times and plant reaction requirements to judge acceptability.

## Pre-Defined Pilot HOLD / Containment Gate
Plant-authorized Safety, Quality, equipment-protection and containment requirements override the experiment. Analytical HOLD applies when incremental third-person normal Curing work, unrecoverable protected-work backlog, growing queues while both operators are committed, unplanned break substitution, or impractical frozen standard work means independent 2-op exposure has been lost. HOLD is not automatically project failure: contain, timestamp, preserve evidence, classify cause and restart only under authorized conditions.

## Leader Reserve-Capacity Test
For every leader/flex assist record `call time | trigger | arrival | assist start/end | people-min | operators committed? | task assumed | backlog prevented/cleared | leader work displaced? | restored time | classification`.
Classify PLANNED LEAN SUPPORT / SURGE CAPACITY / STAFFING SUBSTITUTION / CONTAINMENT.

## Support Displacement Ledger
Every incremental support event must track both help received and donor-role displacement. Use `Adjusted TPMH = Cured Tires / (scheduled Curing labor-hours + incremental staffing-dependent support hours)` as a secondary diagnostic; do not count normal leadership presence or already-planned shared services unless the pilot causes additional work/displacement.

## Work-Interference / Collision Matrix
Record each instance where a new demand arrives while one or both operators are committed. Rank current-work × incoming-demand cells by backlog/delay, incremental support and failure to restore normal route, not frequency alone.

## Standard-Work Conformance / Deviation Log
For each 15-minute window record standard followed?, deviation, reason, workaround and consequence. Classify STANDARD FOLLOWED / JUSTIFIED DEVIATION / STANDARD NOT PRACTICAL.

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
2. Predefine hard-stop/containment rules and analytical HOLD triggers; define leader/flex reserve and protected leader work.
3. Freeze matched historical comparison method before seeing Thursday's result.
4. Scenario-walk breaks, simultaneous demand, flex assist, two-person tasks and one HOLD/restart case.
5. Run Thursday with timestamped exception logging, 15-minute workload windows, hourly plan-vs-actual and explicit queue start/clear timestamps.
6. Preserve backlog magnitude, oldest age and recovery duration; compute Recovery Debt Area after the run rather than judging only peak queue.
7. Record standard-work deviations, collisions and every leader/flex/support event with donor-role displacement.
8. Reconstruct occupancy, queue episodes, backlog aging, recovery debt, relief debt, support chains and route restoration.
9. Normalize against running press-hours, event demand, mix and downtime; compare closest-condition historical shifts.
10. Diagnose persistent capacity vs surge reserve vs recovery weakness vs standard-work practicality vs skill vs motion/routing vs relief vs equipment/process loss vs staffing substitution.
11. Change only the demonstrated constraint and repeat representative/missing exposure before recommending permanent staffing change.

## Immediate next action
Before Thursday, add **queue start / peak pending / oldest age / queue clear / route restored** to the observer sheet. Do not continuously count every task; timestamp meaningful queue formation and clearance. This lets the post-pilot analysis distinguish a brief surge from a system that cannot recover.

## Risks / gaps
- No verified Thursday performance exists yet.
- Exact plant-authorized safety/quality/equipment stop criteria and restart authority have not been supplied here.
- Alarm concurrency is only a proxy for demand; it does not show operator work interference.
- Peak backlog without duration can exaggerate a short surge or hide persistent recovery weakness.
- A single shift can confound staffing with press availability, mix, downtime and abnormal-event demand.
- A quiet shift may under-expose collision combinations; NOT OBSERVED is not PASS.
- Hidden support can falsely validate staffing if donor-role displacement is not followed.
- Leader assistance may be legitimate lean reserve capacity, but repeated normal-work substitution would weaken the 2-op case.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, observer, rescue/shadow and relief assignments.
2. Existing plant safety/quality/equipment hard-stop criteria, containment authority and restart authority.
3. Floor leader's normal responsibilities and which must remain protected while assisting Curing.
4. Exact break/meal schedule and relief source/qualifications/home-role responsibilities.
5. Verified qualification matrix and one-person vs two-person task list.
6. Frozen Op1/Op2 zone/route map and primary/flex ownership.
7. Periodic/protected task list with real due-time/frequency requirements.
8. Existing plant abnormality detection/call, escalation and rescue/containment rules.
9. Thursday hourly plan/actual, running-press exposure, mix and downtime.
10. Timestamped queue start/peak/clear, oldest pending age, route restoration, occupied-work, walking/retrieval, response, HOLD and standard-work deviation data.
11. Leader/flex/support people-minutes, reason, backlog effect and donor-role displacement/restoration.
12. Historical comparable-shift staffing, cured tires/plan, running press-hours, major downtime, alarm/event counts, mix, support condition and man-hours/TPMH.
