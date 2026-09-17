# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Branch
`curing-tpmh-dashboard`

## Current strategy
- Keep two qualified people available at the presses at all times during the proposed 2-operator state.
- Balance Operator 1 and Operator 2 by actual occupied workload, not press count.
- Separate **normal demand-state work** from abnormal-response work. Do not validate 2-op from a single aggregate utilization percentage.
- Standardize predictable routine/material routes; alarm response stays direct and event-driven.
- Tricycle concept is closed because Safety rejected it. Do not depend on ride-on mobility for the 2-operator design.
- Reduce travel through zone design, central/home positions, point-of-use supplies, material staging and alarm visibility.
- Mold and Bladder relief/support must be validated against their own due work and carryover; do not assume spare capacity from averages alone.
- Run baseline, then shadow 2-op with the third Curing operator as safety net.
- Run the sustained pilot across consecutive shifts and track production plus Mold/Bladder backlog.
- Move to true 2-op only after coverage, production, safety, workload balance, abnormal-response and backlog criteria pass.

## Press alarm data — current status
- The comparable August set contains 8,732 August-dated alarm events from 55 press source files.
- A65 is supplied from `A65-alarms-20260901.xlsx`, covering September rather than August, so it should not be mixed directly into the August zone-balance totals.
- Highest alarm-frequency presses in the comparable August set include A87 (515), A43 (506), A13 (363), A35 (336), A42 (301), A17 (278), A14 (238), A83 (229), A22 (196), A71 (189).
- Current August Section alarm shares: Section 1 = 36.9%, Section 2 = 34.5%, Section 3 = 28.6%. Section 2 remains provisional because A65 is not same-period.
- Same-minute alarm starts: 0 alarms 81.5% of minutes, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration must not be treated as operator labor time; use observed hands-on response labor when available.

## Latest improvement — demand-state validation
The current ~55% aggregate future utilization is a useful screening result, but it can hide time-phased overload. Before the shadow pilot, build a **12-hour demand-state workload profile** for the two proposed Curing operators.

Divide the shift into practical time buckets (prefer 30 minutes; 60 minutes if data is sparse) and calculate occupied labor for each operator from:
- alarm-response hands-on minutes,
- GIP/material work,
- checks/documentation,
- manual load/unload and other routine work,
- necessary walking,
- planned break/lunch coverage,
- observed abnormal support.

Classify each bucket:
- **Green:** both operators can perform assigned work and maintain required press coverage.
- **Yellow:** temporary cross-support is required but the two-operator system can recover without outside help.
- **Red:** the two operators cannot maintain required coverage/work within the bucket and qualified backup is required.

Do not invent Green/Yellow/Red numerical thresholds in advance. Establish them from observed shadow-pilot interventions and response-time data.

This converts the project question from “Is average utilization low enough?” to “Can two operators cover the work throughout the shift, including peaks, breaks and abnormalities?”

## Immediate next steps
1. Build the 12-hour demand-state profile using existing time-study frequencies plus alarm timestamps.
2. Map every press ID to its exact physical position on the Curing layout.
3. Create Operator 1 vs Operator 2 workload/Yamazumi totals, but retain the time-bucket profile so averages do not hide overload.
4. During the shadow pilot, record every third-operator intervention: timestamp, reason, press/zone, duration, operators already occupied, and whether qualified Mold/Bladder/Team Lead support could have covered it.
5. Compare upper/lower ownership with left/right geographic ownership using workload, peak demand and travel distance.
6. Normalize alarm frequency by press operating hours/cycles if utilization differs materially.
7. Finish the combined break/relief schedule and backup qualification matrix.
8. Validate Mold/Bladder carryover and gantry support demand before permanent staffing change.

## Pilot gates
- **Gate 0 — Design readiness:** mapped press layout, comparable/normalized alarm data, balanced zones, alarm visibility, backup qualifications and feasible relief plan.
- **Gate 1 — Demand-state readiness:** 12-hour time-bucket profile shows where Green/Yellow/Red conditions occur; proposed response rules exist for non-Green periods.
- **Gate 2 — Baseline:** collect production, TPMH, backlog, walking, alarms, breaks and support under current staffing.
- **Gate 3 — Shadow 2-op:** third Curing operator remains available but intervenes only when the proposed two-person system cannot cope; every intervention is logged.
- **Gate 4 — Sustained trial:** consecutive shifts/full crew rotation; monitor production, response, support burden and Mold/Bladder closing backlog.
- **Gate 5 — True 2-op:** proceed only after safety, coverage, production, workload, abnormal-response and backlog stability are demonstrated.

## Next data needed
1. Exact press physical positions / press IDs overlaid on the floor layout.
2. Alarm hands-on response time observations by alarm type and zone.
3. Time-of-day for routine work elements (GIP, checks, documentation, manual work), not only total frequency per shift.
4. Press operating hours or cycles, if available, to normalize alarm counts.
5. Walking distance/time by task and origin/destination.
6. Current GIP/material/documentation locations.
7. Mold required/completed/carryover by shift and time due.
8. Bladder required/completed/carryover by shift and time due.
9. Actual break/lunch timing for Curing, Mold, Bladder, Gantry and Team Lead.
10. Gantry manual-support people and minutes.
11. Backup qualification matrix.
12. Team Lead activity/availability.
13. Hourly plan vs actual production and TPMH.
14. Attendance/call-in history.
