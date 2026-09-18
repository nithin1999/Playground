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

## Latest improvement — blocked pilot comparison
Do not judge the 2-operator pilot against an unmatched historical average. Production demand, crew/shift, equipment condition, gantry disruption, attendance, product mix and planned downtime can materially affect TPMH, production and intervention demand. Treat these as nuisance factors and block/match the comparison where practical.

For each shadow/sustained pilot shift, create a **Pilot Context Record** with: crew/shift, scheduled production hours, production plan/demand, actual operating presses or press-hours, major planned/unplanned equipment downtime, gantry abnormality, attendance/call-ins, product/mix indicator if relevant, and outside-support minutes. Compare pilot results first with baseline shifts having similar operating context; also report the raw plant baseline separately.

This does not require a formal randomized experiment on the floor. It applies the engineering DOE principle of accounting for important nuisance factors so staffing effects are not confused with an unusually easy or unusually difficult production day. Do not exclude difficult pilot shifts simply because results are poor; retain them and classify the context.

### Pilot comparison rule
1. Freeze response definitions before the pilot: production, man-hours/TPMH, quality/safety, response workload, capacity margin, relief, backlog and outside-support minutes.
2. Record the Pilot Context Record for every baseline and pilot shift.
3. Use comparable baseline blocks by crew/shift and operating condition where enough observations exist.
4. Show both matched/context-adjusted comparison and unadjusted overall baseline; never cherry-pick only favorable matches.
5. Investigate any apparent gain that coincides with lower demand, fewer running presses, major downtime, unusual attendance, or transferred support labor.
6. Require sustained evidence across the A/B/C/D rotation before standardizing true 2-op.

## Capacity Margin Profile
Build a 30-minute profile for each proposed operator zone:

`Capacity margin = available operator minutes - (routine occupied minutes + alarm hands-on minutes + necessary walking + relief/support obligation minutes)`

Do not include unattended automatic press processing as occupied labor. Mark negative-margin intervals and outside interventions, then Pareto their causes. Do not invent a reserve threshold before baseline/shadow evidence and plant requirements support one.

## Break Relief Coverage Matrix
Build a shift timeline with Curing Op 1, Curing Op 2, Mold, Bladder, Gantry and Team Lead. Record planned breaks, due work, qualification, named relief, actual alarm demand and outside-support minutes. Mold/Bladder aggregate spare hours count only when they coincide with the required relief window and do not create carryover. Stagger Curing breaks where practical so only one Curing operator requires relief at a time.

## Pilot acceptance / recovery matrix
Use the existing 3-operator baseline to establish numeric limits where plant standards do not already exist. Do not invent thresholds before baseline evidence is available.

| Family | Required measures | Decision purpose |
|---|---|---|
| Safety | incidents, near misses, unsafe rushing/reaching, ergonomic/fatigue concerns | Immediate stop/recovery for safety exposure |
| Quality | curing-related defects/holds/rework and missed required checks | Ensure labor reduction does not transfer cost to quality |
| Delivery / Production | tires/shift, hourly plan vs actual, downtime attributable to staffing/response | Verify output is not sacrificed |
| Labor / TPMH | actual man-hours, TPMH, overtime/extra support minutes | Verify productivity gain is real |
| Response / Workload | alarm arrival, hands-on response, overlaps, interventions, zone workload | Test normal and peak demand |
| Capacity margin | available minutes minus occupied work by 30-minute interval | Expose short-duration overload hidden by shift averages |
| Relief feasibility | planned vs actual breaks, named relief, conflicts, missed/delayed breaks | Prove coverage at required times |
| Support-system health | Mold/Bladder carryover, gantry support, Team Lead/backup minutes | Detect hidden labor transfer |
| Standard adherence | missed routine tasks, route deviations, exceptions/escalations | Test whether future-state method is executable |

## Pilot gates
- **Gate 0 — Data/design:** mapped layout, comparable/normalized alarms, workload-balanced zones and alarm visibility.
- **Gate 1 — Standard-work readiness:** route charts, time-phased workload, abnormal-response sheet and task-level backup qualifications.
- **Gate 2 — Relief/capacity readiness:** Break Relief Coverage Matrix plus preliminary 30-minute Capacity Margin Profile show where coverage conflicts or peak overload could occur; unresolved intervals have countermeasures or explicit recovery rules.
- **Gate 3 — Management-system readiness:** acceptance/recovery matrix plus Leader Standard Work, visual board/log, named escalation owner and authority to restore coverage.
- **Gate 4 — Baseline/context characterization:** collect current-state performance with the same definitions/instruments used during pilot and record Pilot Context Records so later comparisons are not confounded by crew, demand or equipment condition.
- **Gate 5 — Shadow 2-op:** third operator intervenes only when proposed system cannot cope; every intervention/outside-support minute and negative-margin interval is logged/coded; context record completed.
- **Gate 6 — Revise standard:** Pareto intervention/negative-margin causes; revise zone, route, support, relief, qualification or leader-response rules through PDCA.
- **Gate 7 — Sustained trial:** consecutive shifts/full crew rotation; compare within relevant context blocks and verify results without accumulating backlog, missed relief, recurring negative-margin intervals or hidden support labor.
- **Gate 8 — True 2-op / Control:** acceptance families demonstrated across representative operating conditions; operator standard work, relief matrix, capacity-margin triggers, Leader Standard Work and visual controls become controlled method.

## Immediate next action
Add a **Pilot Context Record** to the planned baseline/shadow data sheet before the first pilot. Populate it from existing production/attendance/downtime sources wherever possible. This is higher priority than adding another summary KPI because it protects the validity of the manpower conclusion.

## Data still needed
1. Exact press positions / press IDs overlaid on floor layout.
2. Alarm operator-arrival and hands-on response time by type/zone.
3. Time-of-day for routine GIP/check/document/manual tasks.
4. Press operating hours/cycles or press-hours by shift.
5. Walking time/distance by task and origin/destination.
6. Current GIP/material/documentation locations.
7. Mold required/completed/carryover by shift and due time.
8. Bladder required/completed/carryover by shift and due time.
9. Actual break/lunch timing across Curing, Mold, Bladder, Gantry and Team Lead.
10. Gantry manual-support people-minutes and abnormality timing.
11. Task-level backup qualification evidence.
12. Team Lead availability and authority/escalation role during pilot.
13. Hourly plan vs actual production and TPMH.
14. Attendance/call-in history by shift/crew.
15. Current safety/quality/production baseline definitions and plant limits governing pilot acceptance.
16. Production plan/demand, running press count/press-hours, major downtime and product/mix indicator for each baseline and pilot shift.