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

## Latest improvement — protected routine-work recovery rule
The 2-operator design now needs to test not only whether alarms are answered, but **what planned work is displaced while operators answer them**. In a machine-intensive area, an apparently successful response system can hide overload if GIP/scan, checks, documentation, material replenishment, planned manual work, or relief is repeatedly deferred and recovered later or handed to another role.

Create a **Routine Work Protection Matrix** for predictable work. For each task record: normal owner/zone, planned window or trigger, safety/quality/production criticality, whether it may be deferred under an abnormality, recovery owner, and actual completion/carryover. Do not invent allowable-delay limits; use existing YTMM requirements where they exist and establish operational limits from baseline/shadow evidence where they do not.

### Recovery logic to validate
1. **Normal:** Op 1/Op 2 execute the defined routine sequence in their balanced zones.
2. **Abnormality:** the zone owner responds; qualified cross-support follows the escalation matrix.
3. **Displacement visible:** any routine element interrupted or skipped is marked at the time of the event rather than silently absorbed later.
4. **Recover:** after the abnormality clears, return to the defined sequence and complete protected work according to its plant requirement/priority. Record who recovered it and when.
5. **Escalate capacity, not just alarms:** if routine protected work cannot be recovered without hidden support, missed relief, quality/safety exposure, or carryover, log a staffing-system exception even if production output remains on plan.
6. **Pilot analysis:** Pareto displaced-work minutes and carryover by task, cause, zone and SIC block alongside alarm interventions.

This is not evidence that routine work is currently being missed. It closes a measurement loophole before the pilot: successful alarm response must not be purchased by unmeasured omission or transfer of standard work.

## Skills coverage
Maintain a task-level matrix with critical task/alarm family × Op 1 × Op 2 × Team Lead × Mold × Bladder/other backup. Use only verified qualifications. Any single-qualified critical task is a pre-pilot gap; qualification coverage must remain valid through relief and conflicting due-work windows.

## Abnormal-response ownership & escalation
Maintain a one-page matrix for each alarm/abnormality family with priority class → primary zone owner → cross-support condition → qualified alternate → escalation authority → recovery/return-to-standard condition. Same-minute starts alone do not establish response capacity; measure concurrent occupied-response demand and qualification availability.

## Time-of-shift robustness
Use six 2-hour SIC blocks for baseline and pilot to compare plan attainment, outside-support/intervention minutes, negative capacity-margin intervals, alarm response measures when available, safety/quality abnormalities, missed/delayed relief, and displaced routine work/carryover. Identify day/night crew context.

## Short Interval Control (SIC)
Start with six 2-hour reviews per 12-hour shift unless YTMM already uses a stronger plant-standard cadence. Capture plan vs actual, press-hours/major downtime, safety/quality abnormality, capacity exception, outside support, Mold/Bladder carryover risk, relief exception, displaced protected work, and next action/owner.

## Pilot Measurement Dictionary
Freeze definitions for alarm response, troubleshooting, walking, GIP/material, checks/documentation, manual load/unload, break relief, outside support, backlog/carryover, displaced routine work, press-hours and staffing-attributable downtime. For abnormalities capture event start, notification, arrival, hands-on start/end and equipment clear where available. Use a short dual-observer coding check before formal collection.

## Capacity Margin Profile
`Capacity margin = available operator minutes - (routine occupied minutes + alarm hands-on minutes + necessary walking + relief/support obligation minutes)`

Do not include unattended automatic press processing as occupied labor. Mark negative-margin intervals, displaced protected work and outside interventions, then Pareto causes.

## Break Relief Coverage Matrix
Map Curing Op 1, Curing Op 2, Mold, Bladder, Gantry and Team Lead across the shift. Record planned breaks, due work, qualification, named relief, actual alarm demand and outside-support minutes. Mold/Bladder spare hours count only when they coincide with required relief and do not create carryover.

## Pilot comparison rule
For every baseline and pilot shift record crew/shift, production plan, scheduled production hours, running presses/press-hours, major downtime, gantry abnormalities, attendance/call-ins, relevant mix and outside-support minutes. Keep difficult shifts; characterize rather than discard them.

## Pilot gates
- **Gate 0 — Data/design:** mapped layout, comparable/normalized alarms, workload-balanced zones and alarm visibility.
- **Gate 1 — Standard-work + skills readiness:** route charts, time-phased workload, Routine Work Protection Matrix, abnormal-response ownership/escalation matrix, and verified two-deep coverage for critical tasks expected in the 2-op state.
- **Gate 2 — Relief/capacity readiness:** Break Relief Coverage Matrix plus preliminary 30-minute Capacity Margin Profile; qualification coverage must remain valid through relief windows.
- **Gate 3 — Management/measurement readiness:** acceptance/recovery matrix, Leader Standard Work, visual board/log, escalation authority, frozen measurement dictionary, observer check, SIC owner/cadence.
- **Gate 4 — Baseline/context characterization:** current-state performance with same definitions/instruments, context record, SIC strip, time-of-shift profile, and routine-work completion/carryover baseline.
- **Gate 5 — Shadow 2-op:** log busy/free state, responder, qualification/availability failures, response delay, interventions/support minutes, negative-margin intervals, relief exceptions, displaced routine work/recovery and SIC results.
- **Gate 6 — Revise standard:** Pareto intervention, overload, qualification gaps, displaced work/carryover, routing overrides, interval misses and time-of-shift deterioration; revise zone, route, support, relief, qualification or leader-response rules.
- **Gate 7 — Sustained trial:** full crew rotation; verify results without backlog, missed protected work/relief, recurring negative margin, hidden support, qualification-dependent failures, routing failures or repeatable late-shift deterioration.
- **Gate 8 — True 2-op / Control:** acceptance demonstrated across representative conditions; standards, skills matrix/training ownership, routine-work recovery rules, abnormal-response matrix, relief matrix, capacity triggers, SIC/leader work and visual controls become controlled method.

## Immediate next action
Build the **Routine Work Protection Matrix** before the shadow pilot. Start with GIP/scan, checks/documentation, material replenishment, planned manual load/unload, scheduled monitoring and relief obligations. For each, record normal owner, normal timing/trigger, plant-required deadline/priority if one exists, deferrability, recovery owner and completion/carryover. Add `routine work displaced?`, `task`, `minutes`, `recovered by`, and `recovered when` to the intervention log. Do not assign arbitrary allowable-delay thresholds.

## Data still needed
1. Exact press positions / IDs overlaid on floor layout.
2. Alarm notification, arrival, hands-on start/end and clear timestamps by type/zone.
3. Operator free/busy state when a new abnormality occurs; responder and escalation path.
4. Time-of-day for routine GIP/check/document/manual tasks.
5. **Plant-required timing/priority and actual completion/carryover for routine GIP, scan, checks, documentation, replenishment, manual and monitoring work.**
6. Press operating hours/cycles or press-hours by shift.
7. Walking time/distance by task and origin/destination.
8. Current GIP/material/documentation locations.
9. Mold required/completed/carryover by shift and due time.
10. Bladder required/completed/carryover by shift and due time.
11. Actual break/lunch timing and whether relief occurred as planned across roles.
12. Gantry manual-support people-minutes and abnormality timing.
13. Task-level qualification matrix by person/crew, including who is authorized for each critical alarm/recovery/manual task and relief role.
14. Existing training/JI evidence and who can certify qualification.
15. Team Lead availability and escalation authority.
16. Hourly/interval plan vs actual production and TPMH.
17. Attendance/call-in history by shift/crew.
18. Plant safety/quality/production limits governing pilot acceptance and alarm priority.
19. Production plan/demand, running press count/press-hours, major downtime and product/mix indicator by shift.
20. Agreed activity-code definitions and a short dual-observer coding comparison.
21. Existing YTMM hourly/SIC board cadence and day/night SIC timestamps.
