# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Due-Time Protected-Work Control
The recovery queue now needs **task criticality and due-time protection**, not just NEW/OWNED/WAITING/RECOVERED status. In a two-operator machine-intensive system, an abnormal event can legitimately interrupt routine work, but the pilot must distinguish work that cannot be delayed from work that can be recovered later. Otherwise a shift can look successful while mandatory checks, GIP/scanning, quality/safety work or other time-sensitive tasks silently age in the queue.

Before the pilot, build a plant-approved **Protected Work Matrix** for recurring Curing tasks: Task/element, safety-quality-production significance, required timing/frequency, maximum permitted deferral if an existing plant rule defines one, primary owner, alternate qualified owner, escalation point/authority, and evidence of completion. Do not invent due-time limits; use existing work standards, quality/safety requirements and supervisor/process-owner decisions.

During baseline and pilot, every displaced task receives **Due Time, Owner, Age, Priority Class (using plant-defined categories), and Recovery Time**. A staffing exposure is not considered stable merely because the queue eventually clears; record any due-time miss separately and trace it to abnormal demand, relief, skill, travel, unclear priority or insufficient two-person capacity.

This strengthens Capacity Reserve + Recovery: reserve is only usable if protected work can still be completed within its required timing. It also makes the abnormal-response rule operational: the zone owner responds, the second operator protects the highest-priority due work, and lower-priority work enters the visible recovery queue.

## Best current strategy
1. Map travel; remove avoidable motion; balance zones on workload + peaks + travel.
2. Freeze NORMAL routes and ABNORMAL dispatch with one owner per event.
3. Create a plant-approved **Protected Work Matrix** defining task significance, required timing, ownership, alternate and escalation; do not invent limits.
4. Use the visible NEW → OWNED → WAITING/ESCALATED → RECOVERED queue with Due Time, Age and Recovery Time; displaced work remains demand until recovered.
5. Verify demonstrated skill coverage for the actual Op1/Op2/relief pairing; close critical gaps with TWI-style instruction/verification.
6. Treat breaks as a planned staffing transition using the Break-Relief Handoff Standard; relief must accept zone + queue ownership before release.
7. Retain the relief person's own due work and measure incremental carryover/support burden rather than hiding transferred labor.
8. Build qualification- and due-time-constrained 30-minute Capacity Reserve + Recovery Profiles, including break windows.
9. Freeze measurement definitions, SIC/leader checks, Green/Amber/Red authority and CONTAIN → STABILIZE → RECORD → RESTART logic.
10. Collect a context-characterized 3-op baseline using identical definitions, including normal outside-support people-minutes, relief handoffs, protected-work due-time performance and time-on-shift behavior.
11. Shadow 2-op; capture periodic confirmations plus consequential exceptions, queue aging/recovery, due-time misses, support people-minutes, containment and actual breaks.
12. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
13. Compare context-matched 3-op/2-op periods; Pareto incremental support, structural overload, due-time misses, duplicate response, backlog, motion, skill, containment, relief and recovery exceptions.
14. Redesign, then expand across underrepresented demand, downtime, break, late-shift and A/B/C/D crew conditions.
15. Move to true 2-op only after representative conditions pass without hidden labor transfer, recurring overload, protected-work failure, missed relief, persistent backlog, duplicate dispatch or qualification-dependent intervention.

## Pilot gates
- Gate 0 — Data/design: layout, alarm evidence, travel study and candidate zones.
- Gate 1 — Standard work/skills: NORMAL route, ABNORMAL ownership/dispatch/recovery, Protected Work Matrix, response matrix, visible queue and demonstrated critical-task coverage.
- Gate 2 — Relief/capacity: qualified relief reservation, Break-Relief Handoff Standard, relief-home-work accounting, plus preliminary due-time-constrained 30-minute Capacity Reserve + Recovery Profile.
- Gate 3 — Management/measurement: measurement dictionary, observer check, leader standard work, visual controls, intervention taxonomy, escalation and containment/restart authority.
- Gate 4 — Baseline/context: 3-op state measured with identical definitions, including protected-work due-time performance, time-on-shift and actual break/relief handoffs.
- Gate 5 — Shadow 2-op: capture context, time on shift, exceptions, queue aging/recovery, due-time misses, support labor, breaks and containment/restart episodes.
- Gate 6 — Matched analysis/revise: compare context-matched exposures using scheduled/effective labor, due-time performance and time-on-shift stratification.
- Gate 7 — Coverage: deliberately cover underrepresented demand, concurrency, break, late-shift, downtime/recovery and crew conditions.
- Gate 8 — True 2-op/control: demonstrated acceptance across representative conditions with controlled standard work, skills, relief, dispatch, escalation, SIC and control plan.

## Immediate next action
Before the first pilot, build the **Protected Work Matrix** from existing plant standards and process-owner requirements. For each recurring task capture: Task, significance, required timing/frequency, permitted deferral if already defined, primary owner, alternate qualified owner, escalation rule/authority and completion evidence. Then add Due Time, Queue Entry, Age, Owner and Recovery Time to the observation sheet and use the same fields in the representative 3-op baseline.

## Data still needed
1. Existing work instructions/quality/safety requirements that define required timing or frequency for recurring Curing tasks; process-owner decisions where timing is not documented.
2. Plant-required qualifications/authorizations and training records for critical Curing tasks.
3. Actual Op1/Op2 candidates plus primary/alternate relief by A/B/C/D crew.
4. Existing plant safety/quality/process acceptance requirements, stop/restart authority and task priority/due requirements.
5. Running press-hours/cycles by shift and interval; production plan/actual and product/mix indicator.
6. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
7. Actual Curing people-hours and outside-support people-minutes by role/reason in 3-op baseline and 2-op exposure.
8. Major press/gantry downtime and manual-support people-minutes.
9. Planned/actual breaks, relief handoff timestamps, relief qualification, delay/interruption and the relief person's displaced home-role work/carryover.
10. Shift start/end timestamps so observations can be stratified by hours since shift start.
11. Routine work-element minutes, required timing, due time, queue entry, ownership and recovery timestamps.
12. Mold/Bladder required, completed and carryover by shift/due time.
13. Attendance/call-ins and actual staffing by role/crew.
14. Exact press positions and representative travel paths/times.
15. Enough 3-op baseline observations to create comparison bands without invented thresholds.
16. Pilot observer availability and a practical pre-frozen confirmation cadence.
17. For every containment/restart episode: trigger, recovery duration, support people-minutes, classification, authorization and recurrence.
