# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current strategy
- Keep two qualified people available at the presses during the proposed 2-operator state.
- Balance Operator 1 and Operator 2 by actual occupied workload, peaks and travel—not press count.
- Standardize predictable work; keep alarm response signal-driven.
- Tricycle remains closed after Safety rejection; reduce travel through zone design, point-of-use staging and alarm visibility.
- Mold/Bladder relief or backup cannot be counted until task qualification and their own due-work/carryover are protected.
- Use baseline → shadow 2-op → revise standard → sustained full-rotation trial → true 2-op only after defined gates pass.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Highest-frequency presses include A87 (515), A43 (506), A13 (363), A35 (336), A42 (301), A17 (278), A14 (238), A83 (229), A22 (196), A71 (189).
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — time-of-shift robustness / fatigue-safe validation
The 2-operator model must not be accepted only on shift-average utilization, TPMH, or total interventions. Because Curing uses 12-hour shifts, test whether performance and workload deteriorate by **time-on-shift**. This is a validation layer, not an assumption that fatigue is currently causing a problem.

Use the existing six 2-hour SIC blocks to avoid adding another collection system. For baseline and pilot, compare by block: plan attainment, outside-support/intervention minutes, negative capacity-margin intervals, alarm response measures when available, safety/quality abnormalities, and missed/delayed relief. Also identify day/night crew context where applicable. Do not invent a fatigue threshold; look for repeatable deterioration patterns and use plant safety requirements where they exist.

### Decision rule
A 2-operator shift is not considered robust if acceptable shift-end TPMH is repeatedly achieved by concentrating overload, missed relief, hidden support, backlog, or abnormal-response deterioration late in the shift. If a time-of-shift pattern appears, first Pareto the mechanism (break coverage, alarm overlap, walking, routine-work timing, staffing support, equipment condition) before attributing it to fatigue.

### Why this matters to the work design
- Protect planned breaks; do not use skipped/delayed breaks as staffing capacity.
- Where practical, schedule predictable strenuous/manual or high-attention work away from already demonstrated peak-demand intervals rather than stacking work.
- Use relief and escalation rules to preserve recovery during extended shifts.
- Compare baseline and pilot with the same SIC structure so the staffing change is not confounded with a new management cadence.

## Short Interval Control (SIC)
Start with six 2-hour reviews per 12-hour shift unless YTMM already uses a stronger plant-standard cadence. At each review capture plan vs actual output, running press-hours/major downtime, safety/quality abnormality, Op 1/Op 2 capacity exception, outside-support/intervention minutes and reason, Mold/Bladder carryover risk, relief exception, and next-interval action/owner. Retain the 30-minute Capacity Margin Profile as the engineering diagnostic layer.

## Pilot Measurement Dictionary
Before baseline/shadow evidence, freeze definitions for alarm response, troubleshooting, walking, GIP/material, checks/documentation, manual load/unload, break relief, outside support, backlog/carryover, press-hours and staffing-attributable downtime. For abnormalities capture event start, notification, arrival, hands-on start/end and equipment clear where available. Two observers should independently code a short representative window and reconcile definitions before formal collection; do not invent an agreement threshold.

## Capacity Margin Profile
For each proposed operator zone:

`Capacity margin = available operator minutes - (routine occupied minutes + alarm hands-on minutes + necessary walking + relief/support obligation minutes)`

Do not include unattended automatic press processing as occupied labor. Mark negative-margin intervals and outside interventions, then Pareto their causes.

## Break Relief Coverage Matrix
Map Curing Op 1, Curing Op 2, Mold, Bladder, Gantry and Team Lead across the shift. Record planned breaks, due work, qualification, named relief, actual alarm demand and outside-support minutes. Mold/Bladder spare hours count only when they coincide with required relief and do not create carryover. Stagger Curing breaks where practical.

## Pilot comparison rule
For every baseline and pilot shift record crew/shift, production plan, scheduled production hours, running presses/press-hours, major downtime, gantry abnormalities, attendance/call-ins, relevant mix and outside-support minutes. Keep difficult shifts; characterize rather than discard them.

## Pilot gates
- **Gate 0 — Data/design:** mapped layout, comparable/normalized alarms, workload-balanced zones and alarm visibility.
- **Gate 1 — Standard-work readiness:** route charts, time-phased workload, abnormal-response sheet and task-level backup qualifications.
- **Gate 2 — Relief/capacity readiness:** Break Relief Coverage Matrix plus preliminary 30-minute Capacity Margin Profile.
- **Gate 3 — Management/measurement readiness:** acceptance/recovery matrix, Leader Standard Work, visual board/log, escalation authority, frozen measurement dictionary, observer check, SIC owner/cadence.
- **Gate 4 — Baseline/context characterization:** current-state performance with the same definitions/instruments, context record, SIC strip, and time-of-shift profile.
- **Gate 5 — Shadow 2-op:** third operator intervenes only when proposed system cannot cope; all intervention/support minutes, negative-margin intervals, relief exceptions and SIC results logged.
- **Gate 6 — Revise standard:** Pareto intervention, overload, interval misses and any time-of-shift deterioration; revise zone, route, support, relief, qualification or leader-response rules.
- **Gate 7 — Sustained trial:** full crew rotation; verify results without backlog, missed relief, recurring negative margin, hidden support, or repeatable late-shift deterioration.
- **Gate 8 — True 2-op / Control:** acceptance demonstrated across representative conditions; standards, relief matrix, capacity triggers, SIC/leader work and visual controls become controlled method.

## Immediate next action
Complete the Measurement Dictionary/dual-observer check and add the six-block SIC strip. **Add a block-number/time-of-shift field and a relief-taken-as-planned field now** so the same baseline data can later test whether the 2-operator state is stable through the full 12 hours. Do not add a separate fatigue study yet.

## Data still needed
1. Exact press positions / IDs overlaid on floor layout.
2. Alarm notification, arrival, hands-on start/end and clear timestamps by type/zone.
3. Time-of-day for routine GIP/check/document/manual tasks.
4. Press operating hours/cycles or press-hours by shift.
5. Walking time/distance by task and origin/destination.
6. Current GIP/material/documentation locations.
7. Mold required/completed/carryover by shift and due time.
8. Bladder required/completed/carryover by shift and due time.
9. Actual break/lunch timing and whether relief occurred as planned across roles.
10. Gantry manual-support people-minutes and abnormality timing.
11. Task-level backup qualification evidence.
12. Team Lead availability and escalation authority.
13. Hourly/interval plan vs actual production and TPMH.
14. Attendance/call-in history by shift/crew.
15. Plant safety/quality/production limits governing pilot acceptance.
16. Production plan/demand, running press count/press-hours, major downtime and product/mix indicator by shift.
17. Agreed activity-code definitions and a short dual-observer coding comparison.
18. Existing YTMM hourly/SIC board cadence.
19. Day/night shift designation and SIC block timestamps for time-of-shift comparison.