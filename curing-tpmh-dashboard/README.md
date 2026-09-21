# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Time-of-Shift Robustness Test
A 12-hour average can hide deterioration late in the shift. Thursday's evidence must therefore be stratified by time-on-task rather than relying only on shift totals. Preserve the existing 15-minute windows, but group them after the run into EARLY / MID / LATE shift blocks and separately tag BREAK-RELIEF periods. Compare occupied operator-minutes, walking/retrieval, queue/recovery debt, protected-work lateness, outside support, standard-work deviations and hourly plan-vs-actual across the blocks.

This is a diagnostic, not a new pass/fail threshold. A 2-operator design is less robust if workload, missed protected work, recovery debt or support dependence systematically worsens later in the shift even when machine/event demand is comparable. Do not attribute a late-shift change to fatigue unless exposure, demand, downtime, mix and abnormal events have first been checked; record it as a time-of-shift effect requiring investigation.

Breaks must remain protected operating states rather than capacity that can be consumed to make the staffing model work. NIOSH guidance for extended/demanding work supports examining workload against shift length and providing regular rest breaks; plant rules and labor agreements remain authoritative for the actual schedule.

## Recovery-Debt / Backlog-Area Metric
For each meaningful queue episode record `queue start | peak pending work | oldest pending age | clear/recovery time | protected work overdue? | outside support people-min | route restored time`. Post-pilot calculate Recovery Debt Area as `pending work × minutes`. Separate NORMAL, BREAK-RELIEF, ABNORMAL-EVENT and DOWNTIME-RECOVERY states. No arbitrary task-minute acceptance limit is assigned.

## Pilot HOLD / Containment Gate
Plant-authorized Safety, Quality, equipment-protection and containment requirements override the experiment. Analytical HOLD applies when incremental third-person normal Curing work, unrecoverable protected-work backlog, growing queues while both operators are committed, unplanned break substitution, or impractical frozen standard work means independent 2-op exposure has been lost. HOLD is not automatically project failure: contain, timestamp, preserve evidence, classify cause and restart only under authorized conditions.

## Leader Reserve + Support Displacement
For every leader/flex/support assist record reason, people-minutes, backlog effect, donor-role displacement and restoration. Classify PLANNED LEAN SUPPORT / SURGE CAPACITY / STAFFING SUBSTITUTION / CONTAINMENT. Use `Adjusted TPMH = Cured Tires / (scheduled Curing labor-hours + incremental staffing-dependent support hours)` as a secondary diagnostic; do not count normal leadership/shared service unless the pilot causes incremental work or displacement.

## Work-Interference / Collision Matrix
Record each instance where a new demand arrives while one or both operators are committed. Rank current-work × incoming-demand cells by backlog/delay, support and failure to restore normal route, not frequency alone.

## Standard-Work Conformance
For each 15-minute window record standard followed?, deviation, reason, workaround and consequence. Classify STANDARD FOLLOWED / JUSTIFIED DEVIATION / STANDARD NOT PRACTICAL.

## Matched-Condition Comparator
Build prior comparable curing shifts using running press-hours, cured volume/plan, mix, major downtime, alarm/event counts, shift length and known staffing/support. Direct Thursday observations remain primary evidence; matched shifts are context.

## Best current strategy
1. Complete readiness gates and freeze people, zones, routes, qualifications, relief and plant-authorized reaction rules.
2. Predefine hard-stop/containment rules, analytical HOLD triggers and leader/flex reserve responsibilities.
3. Freeze the matched historical comparison method before seeing Thursday's result.
4. Scenario-walk breaks, simultaneous demand, flex assist, two-person tasks and one HOLD/restart case.
5. Run Thursday with timestamped exceptions, 15-minute workload windows, hourly plan-vs-actual, queue start/clear and explicit break-relief observations.
6. Preserve backlog magnitude, age and duration; reconstruct recovery debt and route restoration.
7. Record standard-work deviations, collisions and every incremental support event with donor-role displacement.
8. Stratify the same evidence EARLY / MID / LATE shift and BREAK-RELIEF; check whether performance or support dependence changes with time-on-task after considering demand/exposure.
9. Normalize for running press-hours, event demand, mix and downtime; compare matched historical shifts.
10. Diagnose persistent capacity vs surge reserve vs recovery weakness vs time-of-shift robustness vs standard-work practicality vs skill vs motion/routing vs relief vs equipment/process loss vs staffing substitution.
11. Change only the demonstrated constraint and repeat representative/missing exposure before recommending permanent staffing change.

## Immediate next action
Keep the observer sheet manageable: add a `time block` field (EARLY / MID / LATE / BREAK-RELIEF) or derive it from timestamps after the run. Do not add a separate study. Thursday's existing 15-minute windows and exception timestamps are enough if they cover the full 12-hour shift.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Exact plant-authorized stop/restart criteria and authority have not been supplied here.
- Alarm concurrency is a demand proxy, not operator work interference.
- A single shift can confound staffing with press availability, mix, downtime and event demand.
- Shift-average TPMH can hide late-shift deterioration or break-relief fragility.
- A quiet shift may under-expose collision combinations; NOT OBSERVED is not PASS.
- Hidden support can falsely validate staffing if donor-role displacement is not followed.
- Time-of-shift differences must not be labeled fatigue without controlling for operating demand and exposure.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, observer, rescue/shadow and relief assignments.
2. Existing plant safety/quality/equipment hard-stop criteria, containment authority and restart authority.
3. Floor leader's normal/protected responsibilities while assisting Curing.
4. Exact break/meal schedule and relief source/qualifications/home-role responsibilities.
5. Verified qualification matrix and one-person vs two-person task list.
6. Frozen Op1/Op2 zone/route map and primary/flex ownership.
7. Periodic/protected task list with real due-time/frequency requirements.
8. Existing abnormality detection/call, escalation and rescue/containment rules.
9. Thursday hourly plan/actual, running-press exposure, mix and downtime across the full shift.
10. Timestamped queue, occupied-work, walking/retrieval, response, HOLD, standard-work deviation and route-restoration data.
11. Leader/flex/support people-minutes, reason, backlog effect and donor-role displacement/restoration.
12. Historical comparable-shift staffing, cured tires/plan, running press-hours, major downtime, alarm/event counts, mix, support condition and man-hours/TPMH.