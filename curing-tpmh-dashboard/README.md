# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Time-on-Shift Exposure Control
A 12-hour pilot can produce a false positive if the 2-operator system is judged mainly from early-shift observations. Workload, missed/deferred breaks, accumulated queue demand and fatigue can make later-shift performance materially different. The pilot design therefore now stratifies evidence by **time on shift** rather than treating all hours as exchangeable.

For every 3-op baseline and 2-op exposure, tag each observation/event with **hours since shift start** and retain actual break/relief timing. Compare capacity reserve, queue age/recovery, abnormal-response demand, outside-support people-minutes, protected-work completion and containment events by time-on-shift band. Use plant-defined break requirements; do not invent a universal fatigue cutoff or acceptance threshold. A 2-op exposure is not considered representative if it only demonstrates favorable early-shift conditions while late-shift or break-relief conditions remain untested.

NIOSH guidance for extended shifts recommends continuously examining workload, ensuring adequate break coverage and considering workload/fatigue when using long shifts. This does not establish a Curing-specific numeric threshold; it supports deliberately testing the staffing design across the full shift and protecting relief.

## Best current strategy
1. Map travel; remove avoidable motion; balance zones on workload + peaks + travel.
2. Freeze NORMAL routes and ABNORMAL dispatch with one owner per event.
3. Use the visible NEW → OWNED → WAITING/ESCALATED → RECOVERED queue; displaced work remains demand until recovered.
4. Verify demonstrated skill coverage for the actual Op1/Op2/relief pairing; close critical gaps with TWI-style instruction/verification.
5. Reserve real break-relief capacity while retaining the relief person's own due work.
6. Build qualification-constrained 30-minute Capacity Reserve + Recovery Profiles.
7. Freeze measurement definitions, SIC/leader checks, Green/Amber/Red authority and CONTAIN → STABILIZE → RECORD → RESTART logic.
8. Add **time-on-shift** and actual relief timing to the Pilot Context Card and observation sheet.
9. Collect a context-characterized 3-op baseline using identical definitions, including normal outside-support people-minutes and time-on-shift behavior.
10. Shadow 2-op; capture periodic confirmations plus consequential exceptions, queue/recovery, support people-minutes, containment and actual breaks.
11. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
12. Compare context-matched 3-op/2-op periods and stratify by time on shift; Pareto incremental support, structural overload, duplicate response, backlog, motion, skill, containment, relief and recovery exceptions.
13. Redesign, then expand across underrepresented demand, downtime, break, late-shift and A/B/C/D crew conditions.
14. Move to true 2-op only after representative conditions pass without hidden labor transfer, recurring overload, protected-work failure, missed relief, persistent backlog, duplicate dispatch or qualification-dependent intervention.

## Pilot gates
- Gate 0 — Data/design: layout, alarm evidence, travel study and candidate zones.
- Gate 1 — Standard work/skills: NORMAL route, ABNORMAL ownership/dispatch/recovery, response matrix, visible queue and demonstrated critical-task coverage.
- Gate 2 — Relief/capacity: relief reservation plus preliminary 30-minute Capacity Reserve + Recovery Profile.
- Gate 3 — Management/measurement: measurement dictionary, observer check, leader standard work, visual controls, intervention taxonomy, escalation and containment/restart authority.
- Gate 4 — Baseline/context: 3-op state measured with identical definitions, including time-on-shift and actual break/relief timing.
- Gate 5 — Shadow 2-op: capture context, time on shift, exceptions, queue/recovery, support labor, breaks and containment/restart episodes.
- Gate 6 — Matched analysis/revise: compare context-matched exposures using scheduled/effective labor and time-on-shift stratification.
- Gate 7 — Coverage: deliberately cover underrepresented demand, concurrency, break, late-shift, downtime/recovery and crew conditions.
- Gate 8 — True 2-op/control: demonstrated acceptance across representative conditions with controlled standard work, skills, relief, dispatch, escalation, SIC and control plan.

## Immediate next action
Before the first pilot, add **Shift Start Time, Hours Since Shift Start, Planned Break, Actual Break Start/End, Relief Person, Relief Delay/Interruption** to the observation sheet. Use the same fields for a representative 3-op baseline. After the first exposure, compare the time-on-shift profile of Capacity Reserve, queue recovery and outside-support burden rather than reporting only a shift average.

## Data still needed
1. Plant-required qualifications/authorizations and training records for critical Curing tasks.
2. Actual Op1/Op2 candidates plus primary/alternate relief by A/B/C/D crew.
3. Existing plant safety/quality/process acceptance requirements, stop/restart authority and task priority/due requirements.
4. Running press-hours/cycles by shift and interval; production plan/actual and product/mix indicator.
5. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
6. Actual Curing people-hours and outside-support people-minutes by role/reason in 3-op baseline and 2-op exposure.
7. Major press/gantry downtime and manual-support people-minutes.
8. Planned and actual breaks, relief delays/interruptions, relief person and helper due work.
9. Shift start/end timestamps so observations can be stratified by hours since shift start.
10. Routine work-element minutes, due timing and displaced-work creation/ownership/recovery timestamps.
11. Mold/Bladder required, completed and carryover by shift/due time.
12. Attendance/call-ins and actual staffing by role/crew.
13. Exact press positions and representative travel paths/times.
14. Enough 3-op baseline observations to create comparison bands without invented thresholds.
15. Pilot observer availability and a practical pre-frozen confirmation cadence.
16. For every containment/restart episode: trigger, recovery duration, support people-minutes, classification, authorization and recurrence.
