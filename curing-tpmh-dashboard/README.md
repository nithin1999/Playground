# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Variability-Aware Workload Reserve
A balanced average workload is not enough to validate two operators. Curing demand is asynchronous, so the staffing design must preserve the **distribution of observed workload by fixed time window** rather than collapsing the shift into one mean utilization number.

For each candidate Op1/Op2 zone, build fixed-window total operator demand from observed recurring work + travel + measured abnormal hands-on work + relief + recovery. Keep each window intact. Then calculate **Reserve = Available qualified operator minutes − observed due workload minutes** for each operator and for the pair. Display the empirical reserve distribution and identify negative-reserve windows, consecutive negative windows, queue growth, recovery time and outside-support demand.

Do not invent a required percentile or acceptable overload rate before baseline/pilot evidence and plant acceptance criteria exist. The purpose is to expose tail behavior: two zones can have the same average load but very different overload risk. Use the August same-minute alarm-start distribution only as evidence that concurrency exists; it still cannot supply hands-on labor minutes.

When matching 3-op and shadow-2-op periods, compare similar press-hours/cycles, production mix, major downtime and time-on-shift. A two-operator design should be judged on whether difficult observed windows remain controllable without recurring hidden labor transfer, protected-work misses or persistent backlog—not only on average TPMH.

## Best current strategy
1. Map travel and recurring work; remove avoidable motion and point-of-use gaps.
2. Build a Demand-Weighted Operator Balance; assign provisional zones by work content + travel + abnormal exposure, not equal press count.
3. Preserve fixed-window workload variability and build a Variability-Aware Reserve distribution for Op1, Op2 and the pair.
4. Freeze NORMAL routes and ABNORMAL dispatch with one owner per event.
5. Create a plant-approved Protected Work Matrix defining timing, ownership, alternate and escalation.
6. Use a visible NEW → OWNED → WAITING/ESCALATED → RECOVERED queue with Due Time, Age and Recovery Time.
7. Verify demonstrated skill coverage for actual Op1/Op2/relief pairing.
8. Treat breaks as staffing transitions with qualified relief handoff; retain relief person's own due work.
9. Freeze measurement definitions, leader checks, escalation and CONTAIN → STABILIZE → RECORD → RESTART logic.
10. Collect context-characterized 3-op baseline using identical definitions and populate workload/reserve distributions from observed windows.
11. Shadow 2-op; capture periodic confirmations plus exceptions, queue aging/recovery, support people-minutes, containment and actual breaks.
12. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
13. Compare matched 3-op/2-op periods: average load plus tail windows, negative reserve, consecutive overload, recovery and Op1-vs-Op2 imbalance.
14. Pareto overload, support, due-time, motion, skill, relief and recovery exceptions; rebalance zones/work elements.
15. Expand across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
16. Move to true 2-op only after representative conditions pass without hidden labor transfer, recurring overload, protected-work failure, missed relief, persistent backlog, duplicate dispatch or qualification-dependent intervention.

## Immediate next action
Build the first **fixed-window workload/reserve table** alongside the Demand-Weighted Operator Balance during a representative 3-op baseline. For each fixed observation window retain: candidate Op1 demand minutes, Op2 demand minutes, available qualified minutes, reserve, queue at start/end, outside-support people-minutes, running press-hours/cycles, production context, break state and major abnormal condition. Do not average the windows together before checking the distribution and consecutive overload/recovery pattern. Do not impute unmeasured alarm hands-on minutes.

## Data still needed
1. Direct-observed recurring work-element times and frequencies by press/zone, with timestamps/windows retained.
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
13. Enough timestamped 3-op baseline windows to characterize workload/reserve distributions and consecutive overload/recovery without invented thresholds.
