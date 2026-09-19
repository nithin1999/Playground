# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Qualification Redundancy / Pair-Robustness Gate
A two-operator design can look balanced in minutes yet remain fragile if only one member of the pair can perform a protected or abnormal task. That creates a hidden single point of failure during breaks, simultaneous abnormalities, absence, or when the qualified operator is already committed elsewhere.

Before a pilot pair is treated as feasible, map each protected/abnormal task against Op1, Op2, and the planned relief person using plant-approved qualification status. Classify each task as: **dual-covered**, **single-covered**, **relief-dependent**, or **uncovered**. Keep tasks that require two people or a scarce external qualification separate from ordinary single-person skills.

Do not convert training attendance or informal familiarity into qualification. Use demonstrated/plant-approved status only. Cross-training priorities should come from the tasks that combine high operational consequence with single-point coverage, not from training everyone on everything.

For every proposed pair and break state, test whether required due work and abnormal response remain executable when either operator is unavailable or already occupied. A mathematically positive capacity reserve is not usable reserve when the free minutes belong to someone who is not qualified for the waiting task.

## Best current strategy
1. Map travel and recurring work; remove avoidable motion and point-of-use gaps.
2. Build a Demand-Weighted Operator Balance; assign provisional zones by work content + travel + abnormal exposure, not equal press count.
3. Preserve fixed-window workload variability and build Variability-Aware Reserve distributions for Op1, Op2 and the pair.
4. Add a Cross-Zone Collision Matrix so zone boundaries minimize observed simultaneous demand and shared-resource conflicts.
5. Add a Qualification Redundancy / Pair-Robustness Gate; capacity counts only when the available person is qualified for the due task.
6. Freeze NORMAL routes and ABNORMAL dispatch with one owner per event.
7. Create a plant-approved Protected Work Matrix defining timing, ownership, alternate and escalation.
8. Use a visible NEW → OWNED → WAITING/ESCALATED → RECOVERED queue with Due Time, Age and Recovery Time.
9. Close single-point skill gaps using standardized task breakdowns and demonstrated qualification; prioritize critical single-covered tasks.
10. Treat breaks as staffing transitions with qualified relief handoff; retain relief person's own due work.
11. Freeze measurement definitions, leader checks, escalation and CONTAIN → STABILIZE → RECORD → RESTART logic.
12. Collect context-characterized 3-op baseline using identical definitions and populate workload/reserve/collision evidence from observed windows.
13. Shadow 2-op; capture periodic confirmations plus exceptions, queue aging/recovery, support people-minutes, containment, actual breaks and collision handling.
14. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
15. Compare matched 3-op/2-op periods: average load, tail windows, negative reserve, cross-zone collisions, qualification blocks, recovery and Op1-vs-Op2 imbalance.
16. Pareto overload, collision, support, due-time, motion, skill, relief and recovery exceptions; rebalance zones/work elements and training priorities.
17. Expand across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
18. Move to true 2-op only after representative conditions pass without hidden labor transfer, recurring overload/collision failure, protected-work failure, missed relief, persistent backlog, duplicate dispatch or qualification-dependent intervention.

## Immediate next action
Build a **Task × Person qualification matrix** for the actual first-pilot Op1, Op2 and planned relief person. Start with protected work, alarm/abnormal response, manual load/unload, bladder-related work, GIP/scan/checking tasks, and any task known to require two people or outside support. Mark only verified plant-approved capability. Then overlay that matrix on the proposed Op1/Op2 zones and break plan. Identify single-covered and relief-dependent tasks before finalizing the pair or zone boundary. Use those gaps to define the minimum cross-training plan and Job Instruction breakdowns before pilot exposure.

## Data still needed
1. Actual first-pilot Op1/Op2/relief names or roles and plant-approved qualification status by task.
2. Plant definition/evidence for qualification and which tasks legally/procedurally require two people or external support.
3. Candidate press-to-Op1/Op2 zone map for the first pilot layout.
4. Direct-observed recurring work-element times and frequencies by press/zone, with timestamps/windows retained.
5. Representative travel paths/times and exact press positions.
6. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
7. Event/task requirement for one person vs two people, and required qualification/shared support resource.
8. Existing work instructions/quality/safety requirements defining recurring task timing/frequency.
9. Running press-hours/cycles by shift/interval, production plan/actual and product/mix indicator.
10. Actual Curing people-hours and outside-support people-minutes by role/reason.
11. Major press/gantry downtime and manual-support people-minutes.
12. Planned/actual breaks, relief handoffs, delay/interruption and relief home-role carryover.
13. Queue entry/due/recovery timestamps and Mold/Bladder required/completed/carryover.
14. Attendance/call-ins and actual staffing by role/crew.
15. Existing plant acceptance, containment/restart and task-priority requirements.
16. Enough timestamped 3-op baseline windows to characterize workload/reserve, qualification constraints and observed cross-zone collision/recovery without invented thresholds.
