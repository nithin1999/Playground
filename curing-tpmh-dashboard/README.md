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

## Latest improvement — add a time-phased capacity-margin test
Aggregate utilization and a balanced Yamazumi are necessary but not sufficient for this machine-intensive, interruption-driven process. The two-operator design must also show that occupied work fits inside available operator time in short intervals, because alarm response, routine work, walking and relief can collide even when shift-average utilization is low.

Build a **30-minute Capacity Margin Profile** for each proposed operator zone during baseline and shadow testing:

`Capacity margin = available operator minutes - (routine occupied minutes + alarm hands-on minutes + necessary walking + relief/support obligation minutes)`

Do not include unattended automatic press processing as occupied labor. Lean standardized-work guidance explicitly separates manual work, walk time and machine processing time; the Process Capacity Sheet and Standardized Work Combination Table are intended to expose true capacity/bottlenecks and operator-machine interaction.

### How to use the profile
1. Use 30-minute buckets initially; retain raw timestamps so the interval can later be tightened if needed.
2. Plot Op 1 and Op 2 capacity margin through the 12-hour shift.
3. Mark intervals where margin goes negative or the third operator/backup intervenes.
4. Code the cause: alarm overlap, long hands-on troubleshooting, GIP/material, checks/documentation, manual handling, break relief, gantry support, excessive travel, or other.
5. Pareto negative-margin minutes and intervention minutes after the shadow run.
6. Do not invent a required reserve percentage yet. Establish the normal distribution from the 3-operator baseline and shadow evidence, then set the future control limit/trigger with Operations and Safety.

This adds a stronger distinction between **average feasibility** and **peak feasibility**. A design can have ~55% average utilization and still be unacceptable if recurring short intervals require hidden third-person labor.

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
- **Gate 4 — Baseline:** collect current-state performance with the same definitions/instruments used during pilot, including actual breaks, support minutes and capacity margin.
- **Gate 5 — Shadow 2-op:** third operator intervenes only when proposed system cannot cope; every intervention/outside-support minute and negative-margin interval is logged/coded.
- **Gate 6 — Revise standard:** Pareto intervention/negative-margin causes; revise zone, route, support, relief, qualification or leader-response rules through PDCA.
- **Gate 7 — Sustained trial:** consecutive shifts/full crew rotation; verify results without accumulating backlog, missed relief, recurring negative-margin intervals or hidden support labor.
- **Gate 8 — True 2-op / Control:** acceptance families demonstrated; operator standard work, relief matrix, capacity-margin triggers, Leader Standard Work and visual controls become controlled method.

## Immediate next action
Create the **30-minute Capacity Margin Profile** using the existing workload observations and alarm timestamps, leaving alarm hands-on time explicitly TBD until response observations are available. Overlay the Break Relief Coverage Matrix. This will identify exactly which time blocks require the next targeted observation rather than collecting more undirected time-study data.

## Data still needed
1. Exact press positions / press IDs overlaid on floor layout.
2. Alarm operator-arrival and hands-on response time by type/zone.
3. Time-of-day for routine GIP/check/document/manual tasks.
4. Press operating hours/cycles if alarm normalization is needed.
5. Walking time/distance by task and origin/destination.
6. Current GIP/material/documentation locations.
7. Mold required/completed/carryover by shift and due time.
8. Bladder required/completed/carryover by shift and due time.
9. Actual break/lunch timing across Curing, Mold, Bladder, Gantry and Team Lead.
10. Gantry manual-support people-minutes.
11. Task-level backup qualification evidence.
12. Team Lead availability and authority/escalation role during pilot.
13. Hourly plan vs actual production and TPMH.
14. Attendance/call-in history.
15. Current safety/quality/production baseline definitions and plant limits governing pilot acceptance.
