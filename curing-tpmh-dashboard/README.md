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

## Latest improvement — short-interval control during pilot
Add a lightweight **Short Interval Control (SIC)** loop to the shadow and sustained pilots. End-of-shift TPMH can hide when and why the proposed 2-operator system temporarily loses control. During the pilot, review the most recent operating interval at a fixed cadence and use the next interval for recovery/countermeasure action.

Start with **2-hour review intervals** for the 12-hour shift (six reviews), while retaining the 30-minute Capacity Margin Profile as the engineering analysis layer. Do not create a new arbitrary production target: use the plant's existing interval/shift plan where available. If YTMM already has a stronger hourly-management cadence, use that instead.

At each SIC review record only the critical fields: plan vs actual output, running press-hours/major downtime, safety/quality abnormality, Op 1/Op 2 capacity-margin exception, outside-support/intervention minutes and reason, Mold/Bladder carryover risk, and action/owner for the next interval. The review is a visual-management and recovery mechanism, not extra operator paperwork; use existing HMI/MES/board data wherever possible.

### SIC escalation principle
Do not wait until shift end to discover that hidden support, backlog or overload accumulated. A negative interval triggers documented containment/recovery according to the already-defined abnormal-response ladder and leader authority. Do not invent numeric escalation thresholds before baseline/shadow evidence or plant requirements support them.

## Pilot Measurement Dictionary
Before collecting baseline/shadow evidence, freeze a one-page Pilot Measurement Dictionary so all crews and observers classify the same event the same way. For abnormalities capture event start, notification, arrival, hands-on start/end and equipment clear where available. Never substitute machine alarm duration for operator hands-on labor. Record provider/role and minutes for every outside-support intervention.

Before Gate 4 baseline collection, have two observers independently code the same short representative observation window, reconcile disagreements, revise definitions, and repeat until the team judges the coding sufficiently consistent. Do not invent a numerical agreement threshold unless YTMM has one.

## Capacity Margin Profile
Build a 30-minute profile for each proposed operator zone:

`Capacity margin = available operator minutes - (routine occupied minutes + alarm hands-on minutes + necessary walking + relief/support obligation minutes)`

Do not include unattended automatic press processing as occupied labor. Mark negative-margin intervals and outside interventions, then Pareto their causes.

## Break Relief Coverage Matrix
Build a shift timeline with Curing Op 1, Curing Op 2, Mold, Bladder, Gantry and Team Lead. Record planned breaks, due work, qualification, named relief, actual alarm demand and outside-support minutes. Mold/Bladder aggregate spare hours count only when they coincide with the required relief window and do not create carryover. Stagger Curing breaks where practical so only one Curing operator requires relief at a time.

## Pilot comparison rule
Record crew/shift, production plan, scheduled production hours, running presses/press-hours, major downtime, gantry abnormalities, attendance/call-ins, relevant mix and outside-support minutes for every baseline and pilot shift. Compare pilots with reasonably comparable baseline conditions while also showing the unadjusted overall baseline. Never discard difficult pilot shifts simply because results are poor.

## Pilot gates
- **Gate 0 — Data/design:** mapped layout, comparable/normalized alarms, workload-balanced zones and alarm visibility.
- **Gate 1 — Standard-work readiness:** route charts, time-phased workload, abnormal-response sheet and task-level backup qualifications.
- **Gate 2 — Relief/capacity readiness:** Break Relief Coverage Matrix plus preliminary 30-minute Capacity Margin Profile; unresolved weak intervals have countermeasures or recovery rules.
- **Gate 3 — Management/measurement readiness:** acceptance/recovery matrix, Leader Standard Work, visual board/log, escalation authority, frozen Pilot Measurement Dictionary and observer coding check; SIC review owner/cadence defined.
- **Gate 4 — Baseline/context characterization:** collect current-state performance with exactly the same definitions/instruments used during pilot and record Pilot Context Records.
- **Gate 5 — Shadow 2-op:** third operator intervenes only when proposed system cannot cope; every intervention/outside-support minute and negative-margin interval is logged/coded; run SIC reviews during the shift so deterioration is visible before shift end.
- **Gate 6 — Revise standard:** Pareto intervention/negative-margin causes and SIC interval misses; revise zone, route, support, relief, qualification or leader-response rules through PDCA.
- **Gate 7 — Sustained trial:** consecutive shifts/full crew rotation; verify results without accumulating backlog, missed relief, recurring negative-margin intervals or hidden support labor.
- **Gate 8 — True 2-op / Control:** acceptance families demonstrated across representative operating conditions; standards, relief matrix, capacity triggers, SIC/leader work and visual controls become controlled method.

## Immediate next action
Finish the Pilot Measurement Dictionary/dual-observer check, then add a **six-block 2-hour SIC strip** to the pilot control sheet. For each block show plan/actual, capacity/support exception, backlog risk, major abnormality and next-block action/owner. Use the same strip during the 3-op baseline so the comparison remains valid.

## Data still needed
1. Exact press positions / IDs overlaid on floor layout.
2. Alarm notification, arrival, hands-on start/end and clear timestamps by type/zone.
3. Time-of-day for routine GIP/check/document/manual tasks.
4. Press operating hours/cycles or press-hours by shift.
5. Walking time/distance by task and origin/destination.
6. Current GIP/material/documentation locations.
7. Mold required/completed/carryover by shift and due time.
8. Bladder required/completed/carryover by shift and due time.
9. Actual break/lunch timing across Curing, Mold, Bladder, Gantry and Team Lead.
10. Gantry manual-support people-minutes and abnormality timing.
11. Task-level backup qualification evidence.
12. Team Lead availability and escalation authority.
13. Hourly/interval plan vs actual production and TPMH.
14. Attendance/call-in history by shift/crew.
15. Plant safety/quality/production limits governing pilot acceptance.
16. Production plan/demand, running press count/press-hours, major downtime and product/mix indicator by shift.
17. Agreed activity-code definitions and a short dual-observer coding comparison.
18. Existing YTMM hourly/SIC board cadence, if any, so the pilot uses plant-standard visual management instead of duplicating it.