# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Branch
`curing-tpmh-dashboard`

## Current strategy
- Keep two qualified people available at the presses at all times.
- Balance Operator 1 and Operator 2 by actual workload, not press count.
- Standardize routine routes; alarm response stays direct and event-driven.
- Mold and Bladder each reserve 1 hour for planned relief plus 0.5 hour abnormal buffer.
- Protect Mold/Bladder due work; extended abnormalities escalate instead of consuming them for hours.
- Run baseline, then shadow 2-op with the third Curing operator as safety net.
- Run the sustained pilot across consecutive shifts and track Mold/Bladder backlog.
- Move to true 2-op only after coverage, production, safety and backlog criteria pass.

## View
Open `index.html` in a browser.

## Next data needed
1. Press IDs and exact physical positions.
2. Per-press alarm timestamps and durations.
3. Mold required/completed/carryover by shift.
4. Bladder required/completed/carryover by shift.
5. Actual break/lunch pattern for Curing, Mold, Bladder, Gantry and Team Lead.
6. Gantry manual-support people and minutes.
7. Backup qualification matrix.
8. Team Lead activity/availability.
9. Hourly plan vs actual production and TPMH.
10. Attendance/call-in history.
