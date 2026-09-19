# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Pilot Leader Standard Work / Adherence Control
The 2-operator pilot needs a defined leader role, not just operator standard work. Without it, a failed exposure can be misclassified as an infeasible manpower model when the actual issue was unclear ownership/non-adherence; the opposite failure is also possible if a team lead silently performs operator work and makes an infeasible 2-op system appear successful.

Use Pilot Leader Standard Work for the authorized floor lead (Dallten or the plant-designated equivalent). The leader should: confirm the pair, qualifications, zone ownership, break-relief plan and current abnormalities before exposure; verify NORMAL/ABNORMAL ownership and visible queue status at defined plant-approved checks and after meaningful abnormalities; reinforce the standard and remove barriers; record deviations and their reasons; authorize escalation/containment under the approved rules; and close the exposure with backlog/support/break/containment review.

Crucially, separate **standard adherence** from **system feasibility**. Classify deviations as: standard not followed/ownership unclear; standard followed but capacity/skill/response failed; external/special cause; or not yet classifiable. Do not label a staffing design failure until the evidence supports it, and do not label the design successful when leader/outside labor substituted for the removed operator.

Leader assistance that performs production/operator work must be logged as outside-support people-minutes and reason. Routine coaching/verification remains leader work. This preserves the integrity of Adjusted TPMH and exposes whether the 2-op design can actually run as designed.

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
11. Add Pilot Leader Standard Work: verify the standard, surface deviations, remove barriers and control escalation without becoming hidden third-operator labor.
12. Freeze measurement definitions, leader checks, escalation and CONTAIN → STABILIZE → RECORD → RESTART logic.
13. Collect context-characterized 3-op baseline using identical definitions and populate workload/reserve/collision/adherence evidence from observed windows.
14. Shadow 2-op; capture periodic confirmations plus exceptions, queue aging/recovery, support people-minutes, containment, actual breaks, collision handling and adherence classification.
15. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
16. Compare matched 3-op/2-op periods: average load, tail windows, negative reserve, cross-zone collisions, qualification blocks, recovery, adherence and Op1-vs-Op2 imbalance.
17. Pareto overload, collision, support, due-time, motion, skill, relief, adherence and recovery exceptions; rebalance zones/work elements and training priorities.
18. Expand across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
19. Move to true 2-op only after representative conditions pass without hidden labor transfer, recurring overload/collision failure, protected-work failure, missed relief, persistent backlog, duplicate dispatch, qualification-dependent intervention or unresolved adherence ambiguity.

## Immediate next action
Create a **one-page Pilot Leader Standard Work sheet** for the designated authoritative floor lead before the first exposure. It should capture: pre-start pair/qualification/zone/break-plan confirmation; open abnormalities; observation/check time; NORMAL/ABNORMAL ownership status; queue/backlog state; deviation observed; deviation reason/class; leader action; any production/operator work personally performed and its people-minutes; escalation/containment; and end-of-exposure backlog/support/break review. Use existing plant authority and escalation requirements rather than inventing new authority. Run the same verification logic during the representative 3-op baseline so leader involvement can be compared fairly.

## Data still needed
1. Plant-designated pilot leader/authority and existing escalation/containment/restart authority.
2. Observed standard-adherence deviations and reasons during baseline/pilot; leader production-assistance people-minutes separately from coaching/verification.
3. Actual first-pilot Op1/Op2/relief roles and plant-approved qualification status by task.
4. Plant definition/evidence for qualification and which tasks procedurally require two people or external support.
5. Candidate press-to-Op1/Op2 zone map for the first pilot layout.
6. Direct-observed recurring work-element times and frequencies by press/zone, with timestamps/windows retained.
7. Representative travel paths/times and exact press positions.
8. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
9. Event/task requirement for one person vs two people, and required qualification/shared support resource.
10. Existing work instructions/quality/safety requirements defining recurring task timing/frequency.
11. Running press-hours/cycles by shift/interval, production plan/actual and product/mix indicator.
12. Actual Curing people-hours and outside-support people-minutes by role/reason.
13. Major press/gantry downtime and manual-support people-minutes.
14. Planned/actual breaks, relief handoffs, delay/interruption and relief home-role carryover.
15. Queue entry/due/recovery timestamps and Mold/Bladder required/completed/carryover.
16. Attendance/call-ins and actual staffing by role/crew.
17. Existing plant acceptance, containment/restart and task-priority requirements.
18. Enough timestamped 3-op baseline windows to characterize workload/reserve, qualification constraints, adherence and observed cross-zone collision/recovery without invented thresholds.
