# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Branch
`curing-tpmh-dashboard`

## Current strategy
- Keep two qualified people available at the presses at all times.
- Balance Operator 1 and Operator 2 by actual workload, not press count.
- Standardize routine routes; alarm response stays direct and event-driven.
- Tricycle concept is closed because Safety rejected it. Do not depend on ride-on mobility for the 2-operator design.
- Reduce travel through zone design, central/home positions, point-of-use supplies, material staging, alarm visibility, and approved non-ride-on carts where appropriate.
- Mold and Bladder each reserve 1 hour for planned relief plus 0.5 hour abnormal buffer.
- Protect Mold/Bladder due work; extended abnormalities escalate instead of consuming them for hours.
- Run baseline, then shadow 2-op with the third Curing operator as safety net.
- Run the sustained pilot across consecutive shifts and track Mold/Bladder backlog.
- Move to true 2-op only after coverage, production, safety, workload balance and backlog criteria pass.

## Press alarm data — current status
- 8,779 total alarm rows are present in the combined workbook.
- The comparable August set contains 8,732 August-dated alarm events from 55 press source files.
- A65 is supplied from `A65-alarms-20260901.xlsx`, covering Sep 1–17 rather than August, so it should not be mixed directly into the August zone-balance totals.
- A65 September file contains 47 alarms: 43 Machine Trouble and 4 Process Alarm.
- A65 Machine Trouble median duration is about 0.7 min. Process Alarm median duration is about 209 min. Alarm duration still must not be treated as operator labor time.
- Highest alarm-frequency presses in the comparable August set: A87 (515), A43 (506), A13 (363), A35 (336), A42 (301), A17 (278), A14 (238), A83 (229), A22 (196), A71 (189).
- Current August Section alarm shares: Section 1 = 36.9%, Section 2 = 34.5%, Section 3 = 28.6%. Section 2 remains provisional because A65 is not same-period.
- Same-minute alarm starts across the August observed window: 0 alarms 81.5% of minutes, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Day vs night alarm frequency is very similar overall (about 160.4 vs 163.0 alarm starts per 12-hour equivalent period in the observed window).

## Immediate next steps
1. Map every press ID to its exact physical position on the Curing layout. This is now the highest-priority input.
2. Use alarm frequency as the interim response-workload proxy, then improve it with observed hands-on response time by alarm type/zone.
3. Create an Operator 1 vs Operator 2 Yamazumi using alarm-response labor + GIP/material + inspections/checks + manual work + routine walking.
4. Compare upper/lower ownership with left/right geographic ownership using both workload and travel distance.
5. Normalize alarm frequency by press operating hours/cycles if utilization differs materially; this can also make the September A65 data useful as a sensitivity check without mixing raw periods.
6. Measure current walking distance/time by task and identify the largest travel drivers.
7. Finish the combined break/relief schedule and backup qualification matrix.
8. Validate gantry support demand with observed people-minutes.
9. Run baseline, then shadow 2-op, then sustained pilot.

## View
Open `index.html` in a browser.

## Next data needed
1. Exact press physical positions / press IDs overlaid on the floor layout.
2. Alarm hands-on response time observations by alarm type and zone.
3. Press operating hours or cycles, if available, to normalize alarm counts.
4. Walking distance/time by task and origin/destination.
5. Current GIP/material/documentation locations.
6. Mold required/completed/carryover by shift.
7. Bladder required/completed/carryover by shift.
8. Actual break/lunch pattern for Curing, Mold, Bladder, Gantry and Team Lead.
9. Gantry manual-support people and minutes.
10. Backup qualification matrix.
11. Team Lead activity/availability.
12. Hourly plan vs actual production and TPMH.
13. Attendance/call-in history.
14. August A65 only if available; otherwise use normalized same-rate analysis rather than raw-period mixing.
