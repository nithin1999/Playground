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

## New press alarm data — preliminary findings
- 8,779 total alarm rows are present in the workbook.
- 55 press source files are labeled `20260801`; press A65 is supplied from `20260901`, so A65 is not directly comparable with the August press set yet.
- The 55 August-source presses contain 8,732 August-dated alarm events in the observed Aug 5–31 window.
- Alarm mix: 6,933 Machine Trouble events (79.4%) and 1,799 Process Alarm events (20.6%).
- Highest alarm-frequency presses in the August set: A87 (515), A43 (506), A13 (363), A35 (336), A42 (301), A17 (278), A14 (238), A83 (229), A22 (196), A71 (189).
- Current Section alarm shares: Section 1 = 36.9%, Section 2 = 34.5%, Section 3 = 28.6%. Section 2 is missing comparable August A65 data, so treat the section comparison as provisional.
- Same-minute alarm starts across the August observed window: 0 alarms 81.5% of minutes, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. This supports keeping an abnormal-response rule even if average workload is balanced.
- Day vs night alarm frequency is very similar overall (about 160.4 vs 163.0 alarm starts per 12-hour equivalent period in the observed window).
- Alarm duration must NOT be treated as operator labor time. Machine Trouble median duration is about 0.8 min, while Process Alarm median duration is about 26.9 min; long machine-alarm duration may represent press downtime rather than hands-on operator work.

## Immediate next steps
1. Obtain the August A65 alarm file so every press uses the same period.
2. Map every press ID to its exact physical position on the Curing layout.
3. Use alarm frequency as the interim response-workload proxy, then improve it with observed hands-on response time by alarm type/zone.
4. Create an Operator 1 vs Operator 2 Yamazumi using alarm-response labor + GIP/material + inspections/checks + manual work + routine walking.
5. Compare upper/lower ownership with left/right geographic ownership using both workload and travel distance.
6. Normalize alarm frequency by press operating hours/cycles if press utilization differs materially; otherwise low-running presses may look artificially easy.
7. Measure current walking distance/time by task and identify the largest travel drivers.
8. Finish the combined break/relief schedule and backup qualification matrix.
9. Validate gantry support demand with observed people-minutes.
10. Run baseline, then shadow 2-op, then sustained pilot.

## View
Open `index.html` in a browser.

## Next data needed
1. August A65 alarm file / same-period data for all 56 presses.
2. Exact press physical positions / press IDs overlaid on the floor layout.
3. Alarm hands-on response time observations by alarm type and zone.
4. Press operating hours or cycles, if available, to normalize alarm counts.
5. Walking distance/time by task and origin/destination.
6. Current GIP/material/documentation locations.
7. Mold required/completed/carryover by shift.
8. Bladder required/completed/carryover by shift.
9. Actual break/lunch pattern for Curing, Mold, Bladder, Gantry and Team Lead.
10. Gantry manual-support people and minutes.
11. Backup qualification matrix.
12. Team Lead activity/availability.
13. Hourly plan vs actual production and TPMH.
14. Attendance/call-in history.
