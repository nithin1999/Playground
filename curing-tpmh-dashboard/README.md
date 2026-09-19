# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Due-Time Recovery Queue / Work-at-Risk Control
The project already records protected work and a recovery queue, but queue age alone is not enough. In a two-operator machine-intensive system, deferred routine work can accumulate while both operators respond to abnormalities. The control must show which deferred item is closest to violating its required completion window.

For each deferred task, record: task/press, owner, time deferred, required-by time or plant-defined completion window, estimated remaining hands-on/travel work if known, qualification needed, reason deferred, and current recovery owner. Display the queue in **time-to-breach** order rather than simple FIFO whenever safety/quality/process priority requires it. Existing plant requirements always override queue order.

Use three visual states without inventing numeric limits: **RECOVERABLE** = can be restored within the applicable plant-defined window using the current qualified capacity; **AT RISK** = collision, qualification, relief or accumulated work makes timely recovery uncertain; **ESCALATE** = the applicable plant rule requires leader/support action or the task can no longer be recovered by the proposed two-operator method without violating a required condition. If no plant-defined due window exists, collect baseline/shadow evidence before proposing one.

This converts backlog from an end-of-shift count into an early-warning control. It also prevents a good TPMH result from masking deferred checks, GIP/scanning, recovery work, or other required activity that was simply pushed later.

## Best current strategy
1. Map travel and recurring work; remove avoidable motion and point-of-use gaps.
2. Build a Demand-Weighted Operator Balance; assign provisional zones by work content + travel + abnormal exposure, not equal press count.
3. Preserve fixed-window workload variability and build Variability-Aware Reserve distributions for Op1, Op2 and the pair.
4. Add a Cross-Zone Collision Matrix so zone boundaries minimize observed simultaneous demand and shared-resource conflicts.
5. Apply Qualification Redundancy / Pair-Robustness Gate; capacity counts only when the available person is qualified.
6. Freeze NORMAL routes and ABNORMAL dispatch with one primary owner per event.
7. Use the Live Abnormality Ownership Board: NEW → OWNED → WORKING → WAITING/ESCALATED → RECOVERY DUE → CLOSED.
8. Create a plant-approved Protected Work Matrix defining timing, ownership, alternate and escalation.
9. Control deferred work with the Due-Time Recovery Queue: show required-by/time-to-breach, qualification and recovery owner; prioritize plant safety/quality/process rules over simple FIFO.
10. Close critical single-point skill gaps using demonstrated qualification.
11. Treat breaks as staffing transitions with qualified relief handoff; retain relief person's own due work.
12. Use Pilot Leader Standard Work without hidden third-operator labor.
13. Add Process Confirmation sampling for critical standard-work behaviors; classify deviations rather than hiding them inside outcome metrics.
14. Run the Pre-Pilot Scenario Challenge and close ambiguous ownership, skill, relief, route and escalation gaps.
15. Freeze measurement definitions, leader checks and CONTAIN → STABILIZE → RECORD → RESTART logic.
16. Apply the Pre-Exposure Readiness Gate before each baseline/shadow window and log material change points during the exposure.
17. Collect context-characterized 3-op baseline using identical definitions.
18. Run controlled shadow 2-op: Op1/Op2 execute the standard while a qualified third operator is rescue capacity only; log every intervention.
19. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH including all production assistance.
20. Compare matched stable-condition segments for load, negative reserve, collisions, acknowledgement/response, qualification blocks, time-to-breach/recovery, process adherence and intervention demand.
21. Pareto overload, duplicate/unowned dispatch, support waits, intervention, due-time, motion, skill, relief, adherence and recovery exceptions; redesign.
22. Repeat shadow exposure across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
23. Move to true 2-op only after representative evidence shows operation without hidden third-person labor, recurring overload/collision failure, protected-work failure, missed relief, persistent/at-risk backlog, dispatch ambiguity, qualification-dependent intervention or an impractical standard-work method.

## Immediate next action
Add a Due-Time Recovery Queue to the baseline/scenario/shadow observation sheet. For every deferred task capture: task/press; owner; time deferred; required-by time or applicable plant completion window; estimated remaining work if known; qualification needed; reason deferred; recovery owner; recovery start/finish; and RECOVERABLE / AT RISK / ESCALATE state. During the next scenario challenge, deliberately create one abnormal-response collision and verify that the team can identify what work was deferred, who owns recovery, which item is closest to its required limit, and when existing plant escalation is triggered.

## Data still needed
1. Actual proposed Op1/Op2/leader/shadow/relief roles and verified qualifications.
2. Candidate press-to-Op1/Op2 zone map and normal routes.
3. Existing plant acknowledgement/response/escalation/containment requirements; do not invent thresholds.
4. Plant-defined required-by/completion windows and priority rules for protected/deferrable Curing tasks.
5. Which abnormal tasks require two people or external/shared support.
6. Scenario Challenge results and unresolved ownership/skill/route/relief issues.
7. Pre-exposure readiness records and timestamped material change points.
8. Process-confirmation opportunities, adherence Y/N, deviation reason and consequence by critical behavior.
9. Event-level NEW/OWNED/arrival/work/wait/recovery/close timestamps and primary owner.
10. Shadow-intervention timestamps, people-minutes and reason classification.
11. Direct-observed recurring work-element times/frequencies and representative travel times.
12. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
13. Running press-hours/cycles, production plan/actual and product/mix indicator.
14. Actual Curing people-hours and outside-support people-minutes by role/reason.
15. Major press/gantry downtime and manual-support people-minutes.
16. Planned/actual breaks, relief handoffs, delay/interruption and relief home-role carryover.
17. Queue entry, required-by/time-to-breach, recovery start/finish, qualification and Mold/Bladder required/completed/carryover.
18. Attendance/call-ins and actual staffing by role/crew.
19. Enough timestamped baseline/shadow windows to establish observed workload, response, support, adherence and recovery distributions before setting numerical gates.
