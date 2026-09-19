# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Cross-Zone Collision Matrix
Average balance and even window-level reserve can still miss a two-operator failure mode: **both operators can be independently loaded but become coupled when abnormalities occur at the same time or when both need the same scarce qualified support resource**. The current August evidence already shows that same-minute alarm starts occur; the next design step is to preserve which proposed operator zone each event belongs to and test observed cross-zone collisions rather than treating alarm arrivals as independent.

For each timestamped abnormal event, retain candidate zone, press, event/reason class, required qualification, initial owner, second-person requirement, shared resource requirement, operator busy/free state, hands-on start/end, displaced protected work and outside support. Build a Zone 1 × Zone 2 collision table from observed overlapping demand. Separate: same-zone overlaps, cross-zone overlaps, events needing only one operator, events needing two people, and events competing for the same relief/Team Lead/Mold/Bladder resource.

Do not calculate collision probability from an assumed Poisson/independence model when timestamped plant data are available. Same-minute alarm starts are only a screening signal until actual hands-on intervals and zone assignment are known. A collision is operationally important when simultaneous demand removes the pair's ability to protect due work or requires incremental outside labor; it is not defined merely by two HMI alarms existing at once.

## Best current strategy
1. Map travel and recurring work; remove avoidable motion and point-of-use gaps.
2. Build a Demand-Weighted Operator Balance; assign provisional zones by work content + travel + abnormal exposure, not equal press count.
3. Preserve fixed-window workload variability and build Variability-Aware Reserve distributions for Op1, Op2 and the pair.
4. Add a Cross-Zone Collision Matrix so zone boundaries minimize observed simultaneous demand and shared-resource conflicts, not just average minutes.
5. Freeze NORMAL routes and ABNORMAL dispatch with one owner per event.
6. Create a plant-approved Protected Work Matrix defining timing, ownership, alternate and escalation.
7. Use a visible NEW → OWNED → WAITING/ESCALATED → RECOVERED queue with Due Time, Age and Recovery Time.
8. Verify demonstrated skill coverage for actual Op1/Op2/relief pairing, including tasks requiring two people or scarce qualifications.
9. Treat breaks as staffing transitions with qualified relief handoff; retain relief person's own due work.
10. Freeze measurement definitions, leader checks, escalation and CONTAIN → STABILIZE → RECORD → RESTART logic.
11. Collect context-characterized 3-op baseline using identical definitions and populate workload/reserve/collision evidence from observed windows.
12. Shadow 2-op; capture periodic confirmations plus exceptions, queue aging/recovery, support people-minutes, containment, actual breaks and collision handling.
13. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
14. Compare matched 3-op/2-op periods: average load, tail windows, negative reserve, cross-zone collisions, recovery and Op1-vs-Op2 imbalance.
15. Pareto overload, collision, support, due-time, motion, skill, relief and recovery exceptions; rebalance zones/work elements.
16. Expand across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
17. Move to true 2-op only after representative conditions pass without hidden labor transfer, recurring overload/collision failure, protected-work failure, missed relief, persistent backlog, duplicate dispatch or qualification-dependent intervention.

## Immediate next action
Take the existing timestamped August alarm data and append **candidate Op1/Op2 zone ownership by press**. Produce a first descriptive cross-zone start-collision table using the observed timestamps, but label it screening-only because hands-on intervals are still missing. During the representative 3-op baseline, capture actual hands-on start/end and busy/free state so the screening table can become a true simultaneous-work collision analysis. Use the result together with the Demand-Weighted Operator Balance to test alternate zone boundaries before freezing the first pilot layout.

## Data still needed
1. Candidate press-to-Op1/Op2 zone map for the first pilot layout.
2. Direct-observed recurring work-element times and frequencies by press/zone, with timestamps/windows retained.
3. Representative travel paths/times and exact press positions.
4. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
5. Event/task requirement for one person vs two people, and required qualification/shared support resource.
6. Existing work instructions/quality/safety requirements defining recurring task timing/frequency.
7. Plant-required qualifications and actual Op1/Op2/relief training status by crew.
8. Running press-hours/cycles by shift/interval, production plan/actual and product/mix indicator.
9. Actual Curing people-hours and outside-support people-minutes by role/reason.
10. Major press/gantry downtime and manual-support people-minutes.
11. Planned/actual breaks, relief handoffs, delay/interruption and relief home-role carryover.
12. Queue entry/due/recovery timestamps and Mold/Bladder required/completed/carryover.
13. Attendance/call-ins and actual staffing by role/crew.
14. Existing plant acceptance, containment/restart and task-priority requirements.
15. Enough timestamped 3-op baseline windows to characterize workload/reserve and observed cross-zone collision/recovery without invented thresholds.
