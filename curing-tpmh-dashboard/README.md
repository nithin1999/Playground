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

## Latest improvement — abnormal-response ownership & escalation matrix
The 2-operator model now needs an explicit **abnormal-response decision rule**, not just balanced zones and an intervention log. With two operators, the critical failure mode is not average alarm frequency; it is what happens when the primary operator is already occupied and another abnormality occurs.

Create a one-page matrix for each alarm/abnormality family with: **priority class → primary zone owner → cross-support condition → backup role → escalation authority → recovery/return-to-standard condition**. Use plant safety and quality rules as the highest priority. Do not invent response-time limits; establish them from YTMM requirements plus measured notification/arrival/hands-on/recovery data.

### Proposed operating logic to validate
1. **Normal state:** each Curing operator owns abnormalities in the assigned workload-balanced geographic zone; no routine patrol solely to watch automatic presses where alarms/visibility provide reliable abnormality detection.
2. **Cross-support state:** if a zone owner is already committed to an abnormality and another qualifying event occurs, the other Curing operator responds when safe/qualified and their own zone condition permits.
3. **Escalation state:** if both operators are committed, the abnormality exceeds the operator's qualified scope, or safety/quality/production rules require additional response, summon the named qualified backup/leader. Record provider, reason and minutes.
4. **Recovery state:** after containment/recovery, operators return to zone ownership and restore any displaced routine work; any carryover is made visible rather than silently absorbed.

This is a hypothesis for the shadow pilot, not a claim that the rules already work. The shadow third operator should observe whether the matrix correctly routes work and should intervene only under the defined recovery/safety conditions. Every override becomes evidence for revising the rule.

### Why this changes the pilot
Same-minute alarm starts alone do not establish response capacity because service duration and operator occupancy are still unknown. The shadow pilot should therefore measure **concurrent occupied-response demand**: when a new abnormality starts, record whether Op 1 is free/busy, Op 2 is free/busy, who responds, response delay, hands-on minutes, outside support and resulting routine-work carryover. This converts alarm counts into a queue/coverage test of the proposed two-person system.

## Time-of-shift robustness
Use the existing six 2-hour SIC blocks for baseline and pilot to compare plan attainment, outside-support/intervention minutes, negative capacity-margin intervals, alarm response measures when available, safety/quality abnormalities, and missed/delayed relief. Identify day/night crew context. A good shift-end result is not robust if it repeatedly depends on late-shift overload, delayed/missed relief, hidden support or backlog recovery.

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
- **Gate 1 — Standard-work readiness:** route charts, time-phased workload, abnormal-response ownership/escalation matrix and task-level backup qualifications.
- **Gate 2 — Relief/capacity readiness:** Break Relief Coverage Matrix plus preliminary 30-minute Capacity Margin Profile.
- **Gate 3 — Management/measurement readiness:** acceptance/recovery matrix, Leader Standard Work, visual board/log, escalation authority, frozen measurement dictionary, observer check, SIC owner/cadence.
- **Gate 4 — Baseline/context characterization:** current-state performance with the same definitions/instruments, context record, SIC strip, and time-of-shift profile.
- **Gate 5 — Shadow 2-op:** third operator intervenes only when proposed system cannot cope; log operator busy/free state at new abnormalities, routing, response delay, all intervention/support minutes, negative-margin intervals, relief exceptions and SIC results.
- **Gate 6 — Revise standard:** Pareto intervention, overload, routing overrides, interval misses and time-of-shift deterioration; revise zone, route, support, relief, qualification or leader-response rules.
- **Gate 7 — Sustained trial:** full crew rotation; verify results without backlog, missed relief, recurring negative margin, hidden support, repeated routing failures or repeatable late-shift deterioration.
- **Gate 8 — True 2-op / Control:** acceptance demonstrated across representative conditions; standards, abnormal-response matrix, relief matrix, capacity triggers, SIC/leader work and visual controls become controlled method.

## Immediate next action
Draft the **Abnormal-Response Ownership & Escalation Matrix** using current alarm families and the proposed two zones. During the next representative observation/shadow window, add only five event fields beyond the existing timestamps: **Op 1 free/busy, Op 2 free/busy, responder, escalation/backup used, displaced-work/carryover**. This is now the fastest way to determine whether rare overlapping demand is actually a two-operator constraint.

## Data still needed
1. Exact press positions / IDs overlaid on floor layout.
2. Alarm notification, arrival, hands-on start/end and clear timestamps by type/zone.
3. Operator free/busy state when a new abnormality occurs; responder and escalation path.
4. Time-of-day for routine GIP/check/document/manual tasks.
5. Press operating hours/cycles or press-hours by shift.
6. Walking time/distance by task and origin/destination.
7. Current GIP/material/documentation locations.
8. Mold required/completed/carryover by shift and due time.
9. Bladder required/completed/carryover by shift and due time.
10. Actual break/lunch timing and whether relief occurred as planned across roles.
11. Gantry manual-support people-minutes and abnormality timing.
12. Task-level backup qualification evidence.
13. Team Lead availability and escalation authority.
14. Hourly/interval plan vs actual production and TPMH.
15. Attendance/call-in history by shift/crew.
16. Plant safety/quality/production limits governing pilot acceptance and alarm priority.
17. Production plan/demand, running press count/press-hours, major downtime and product/mix indicator by shift.
18. Agreed activity-code definitions and a short dual-observer coding comparison.
19. Existing YTMM hourly/SIC board cadence.
20. Day/night shift designation and SIC block timestamps for time-of-shift comparison.