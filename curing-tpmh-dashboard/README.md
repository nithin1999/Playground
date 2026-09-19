# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Demand-Weighted Operator Balance
Do not lock the 2-op design as an equal press-count split. Build a **Demand-Weighted Operator Balance (DWOB)** for the candidate Op1/Op2 zones using observed work elements. Each zone's load should include recurring protected work + expected abnormal hands-on work + required travel + break/relief exposure + recovery work. Keep uncertain/unmeasured elements visibly separate rather than estimating them into false precision.

Use a Yamazumi/operator-balance view by zone and time window, with separate stacks for recurring manual work, travel, abnormal response, relief and recovery. Compare the two operators against **available operator minutes in the window**, not machine cycle time: Curing is machine-intensive and much of the operator demand is asynchronous. A balanced average is not sufficient; also inspect peak windows and simultaneous abnormal demand.

The August alarm-start distribution supports testing concurrency but does not supply hands-on minutes. Until response labor is measured, alarm load stays an explicit unknown/sensitivity term. Zone boundaries remain provisional and should move if observed workload/travel shows one operator persistently carries more demand.

## Best current strategy
1. Map travel and recurring work; remove avoidable motion and point-of-use gaps.
2. Build a Demand-Weighted Operator Balance; assign provisional zones by work content + travel + abnormal exposure, not equal press count.
3. Freeze NORMAL routes and ABNORMAL dispatch with one owner per event.
4. Create a plant-approved Protected Work Matrix defining timing, ownership, alternate and escalation.
5. Use a visible NEW → OWNED → WAITING/ESCALATED → RECOVERED queue with Due Time, Age and Recovery Time.
6. Verify demonstrated skill coverage for actual Op1/Op2/relief pairing.
7. Treat breaks as staffing transitions with qualified relief handoff; retain relief person's own due work.
8. Build qualification- and due-time-constrained 30-minute Capacity Reserve + Recovery Profiles for each operator/zone.
9. Freeze measurement definitions, leader checks, escalation and CONTAIN → STABILIZE → RECORD → RESTART logic.
10. Collect context-characterized 3-op baseline using identical definitions and populate the DWOB from observed work.
11. Shadow 2-op; capture periodic confirmations plus exceptions, queue aging/recovery, support people-minutes, containment and actual breaks.
12. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
13. Compare matched 3-op/2-op periods and Op1-vs-Op2 load; Pareto overload, support, due-time, motion, skill, relief and recovery exceptions.
14. Rebalance zone boundaries/work elements, then expand across demand, downtime, break, late-shift and A/B/C/D conditions.
15. Move to true 2-op only after representative conditions pass without hidden labor transfer, recurring overload, protected-work failure, missed relief, persistent backlog, duplicate dispatch or qualification-dependent intervention.

## Immediate next action
Create the first **Demand-Weighted Operator Balance sheet** from a representative 3-op baseline. For each observed work element capture: zone/press, task, recurring vs abnormal, manual minutes, travel minutes, frequency, protected due-time class, qualification requirement and time window. Stack observed minutes by candidate Op1/Op2 zone. Do not impute alarm hands-on minutes that have not been measured. Use the imbalance to revise provisional zone boundaries before the shadow 2-op pilot.

## Data still needed
1. Direct-observed recurring work-element times and frequencies by press/zone.
2. Representative travel paths/times and exact press positions.
3. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
4. Existing work instructions/quality/safety requirements defining recurring task timing/frequency.
5. Plant-required qualifications and actual Op1/Op2/relief training status by crew.
6. Running press-hours/cycles by shift/interval, production plan/actual and product/mix indicator.
7. Actual Curing people-hours and outside-support people-minutes by role/reason.
8. Major press/gantry downtime and manual-support people-minutes.
9. Planned/actual breaks, relief handoffs, delay/interruption and relief home-role carryover.
10. Queue entry/due/recovery timestamps and Mold/Bladder required/completed/carryover.
11. Attendance/call-ins and actual staffing by role/crew.
12. Existing plant acceptance, containment/restart and task-priority requirements.
13. Enough 3-op baseline windows to characterize Op1/Op2 candidate load distributions without invented thresholds.
