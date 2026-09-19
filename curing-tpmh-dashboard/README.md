# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Live Abnormality Ownership Board
The current design has single-owner dispatch, a recovery queue, collision analysis and a shadow-rescue protocol, but it still lacks a simple live visual control that tells Op1, Op2 and the leader who owns each abnormality. In a two-operator system, duplicate response wastes scarce capacity while an unowned alarm creates response delay.

Add a pilot visual board/andon view with one row per active abnormality and explicit states: **NEW → OWNED → WORKING → WAITING/ESCALATED → RECOVERY DUE → CLOSED**. Record event/press, detected time, owner, owner-accepted time, current state, protected work affected, support requested, support arrival, recovery owner and close time. Only one primary owner is assigned; assistance is separately identified rather than creating ambiguous shared ownership.

Do not invent response-time limits. Use existing plant safety/quality/process escalation requirements where they exist; otherwise collect actual acknowledgement, arrival, work and closure times during baseline/shadow exposures before proposing a control threshold.

The board is both a visual-management control and a measurement system. It should expose duplicate dispatch, unowned events, waiting for scarce support, qualification blocks, queue aging and recovery ownership at the gemba. Any shadow/leader production assistance remains outside-support labor and must still be counted.

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
13. Run the Pre-Pilot Scenario Challenge and close ambiguous ownership, skill, relief, route and escalation gaps.
14. Freeze measurement definitions, leader checks and CONTAIN → STABILIZE → RECORD → RESTART logic.
15. Collect context-characterized 3-op baseline using identical definitions.
16. Run controlled shadow 2-op: Op1/Op2 execute the standard while a qualified third operator is rescue capacity only; log every intervention.
17. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH including all production assistance.
18. Compare matched periods for load, negative reserve, collisions, acknowledgement/response, qualification blocks, queue/recovery, adherence and intervention demand.
19. Pareto overload, duplicate/unowned dispatch, support waits, intervention, due-time, motion, skill, relief, adherence and recovery exceptions; redesign.
20. Repeat shadow exposure across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
21. Move to true 2-op only after representative evidence shows operation without hidden third-person labor, recurring overload/collision failure, protected-work failure, missed relief, persistent backlog, dispatch ambiguity or qualification-dependent intervention.

## Immediate next action
Create a paper/whiteboard prototype of the Live Abnormality Ownership Board before the first shadow exposure and test it during the 3-op baseline/scenario challenge. For each event capture: Event ID | Press | Detected | State | Primary Owner | Accepted | Arrived | Work Start/End | Protected Work Affected | Support Requested/Arrived | Recovery Owner | Closed. During observation, specifically mark duplicate response, unowned events and waiting-for-support time.

## Data still needed
1. Actual proposed Op1/Op2/leader/shadow/relief roles and verified qualifications.
2. Candidate press-to-Op1/Op2 zone map and normal routes.
3. Existing plant acknowledgement/response/escalation/containment requirements; do not invent thresholds.
4. Which abnormal tasks require two people or external/shared support.
5. Scenario Challenge results and unresolved ownership/skill/route/relief issues.
6. Event-level NEW/OWNED/arrival/work/wait/recovery/close timestamps and primary owner.
7. Shadow-intervention timestamps, people-minutes and reason classification.
8. Direct-observed recurring work-element times/frequencies and representative travel times.
9. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
10. Running press-hours/cycles, production plan/actual and product/mix indicator.
11. Actual Curing people-hours and outside-support people-minutes by role/reason.
12. Major press/gantry downtime and manual-support people-minutes.
13. Planned/actual breaks, relief handoffs, delay/interruption and relief home-role carryover.
14. Queue entry/due/recovery timestamps and Mold/Bladder required/completed/carryover.
15. Attendance/call-ins and actual staffing by role/crew.
16. Enough timestamped baseline/shadow windows to establish observed workload, response, support and recovery distributions before setting numerical gates.
