# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Pre-Exposure Readiness Gate + Change-Point Log
The project now has process confirmation during an exposure, but interpretation can still be confounded if a baseline/shadow window begins under a materially different condition than the approved test design. Add a short readiness gate immediately before every baseline or shadow exposure, followed by a change-point log during the window.

Before release, verify the actual Op1/Op2/shadow/leader/relief assignment and qualification, active press/gantry condition, open safety/quality restrictions, unresolved backlog/protected work, break/relief readiness, zone/route standard availability, abnormal-response/escalation method, observer/data-capture readiness, and any unusual maintenance/manual-support condition. Use **READY / CONDITIONALLY READY / HOLD**. Safety, quality, qualification, or required-control gaps use the plant's existing authority and can block the exposure; do not invent numerical release thresholds.

During the exposure, log material change points such as operator substitution, relief change, press/gantry state change, unusual maintenance support, product/mix shift, zone reassignment, procedure change, or major backlog transition. Analyze results by stable-condition segment instead of blending unlike conditions into one shift average.

This is an experimental-validity control, not proof that two operators are sufficient. A READY gate only confirms that the intended test condition is identifiable and controlled enough to learn from.

## Best current strategy
1. Map travel and recurring work; remove avoidable motion and point-of-use gaps.
2. Build a Demand-Weighted Operator Balance; assign provisional zones by work content + travel + abnormal exposure, not equal press count.
3. Preserve fixed-window workload variability and build Variability-Aware Reserve distributions for Op1, Op2 and the pair.
4. Add a Cross-Zone Collision Matrix so zone boundaries minimize observed simultaneous demand and shared-resource conflicts.
5. Apply Qualification Redundancy / Pair-Robustness Gate; capacity counts only when the available person is qualified.
6. Freeze NORMAL routes and ABNORMAL dispatch with one primary owner per event.
7. Use the Live Abnormality Ownership Board: NEW → OWNED → WORKING → WAITING/ESCALATED → RECOVERY DUE → CLOSED.
8. Create a plant-approved Protected Work Matrix defining timing, ownership, alternate and escalation.
9. Maintain the due-work recovery queue and measure queue age/recovery.
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
20. Compare matched stable-condition segments for load, negative reserve, collisions, acknowledgement/response, qualification blocks, queue/recovery, process adherence and intervention demand.
21. Pareto overload, duplicate/unowned dispatch, support waits, intervention, due-time, motion, skill, relief, adherence and recovery exceptions; redesign.
22. Repeat shadow exposure across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
23. Move to true 2-op only after representative evidence shows operation without hidden third-person labor, recurring overload/collision failure, protected-work failure, missed relief, persistent backlog, dispatch ambiguity, qualification-dependent intervention or an impractical standard-work method.

## Immediate next action
Create a one-page Pre-Exposure Readiness Gate and use it before the first baseline/scenario/shadow exposure. Record: planned vs actual Op1/Op2/shadow/leader/relief; qualification status; active presses/gantries; open safety/quality restrictions; starting protected-work/backlog state; break/relief plan; zone/route standard available; abnormal escalation method available; observer/data capture ready; unusual maintenance/manual-support condition; release status READY / CONDITIONALLY READY / HOLD; approver; and reason. During the exposure, timestamp every material change point so analysis can be segmented rather than averaged across different operating conditions.

## Data still needed
1. Actual proposed Op1/Op2/leader/shadow/relief roles and verified qualifications.
2. Candidate press-to-Op1/Op2 zone map and normal routes.
3. Existing plant acknowledgement/response/escalation/containment requirements; do not invent thresholds.
4. Which abnormal tasks require two people or external/shared support.
5. Scenario Challenge results and unresolved ownership/skill/route/relief issues.
6. Pre-exposure readiness records and timestamped material change points.
7. Process-confirmation opportunities, adherence Y/N, deviation reason and consequence by critical behavior.
8. Event-level NEW/OWNED/arrival/work/wait/recovery/close timestamps and primary owner.
9. Shadow-intervention timestamps, people-minutes and reason classification.
10. Direct-observed recurring work-element times/frequencies and representative travel times.
11. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
12. Running press-hours/cycles, production plan/actual and product/mix indicator.
13. Actual Curing people-hours and outside-support people-minutes by role/reason.
14. Major press/gantry downtime and manual-support people-minutes.
15. Planned/actual breaks, relief handoffs, delay/interruption and relief home-role carryover.
16. Queue entry/due/recovery timestamps and Mold/Bladder required/completed/carryover.
17. Attendance/call-ins and actual staffing by role/crew.
18. Enough timestamped baseline/shadow windows to establish observed workload, response, support, adherence and recovery distributions before setting numerical gates.
