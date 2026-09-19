# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Pre-Pilot Scenario Challenge / Dry-Run Gate
Before exposing production to the 2-operator design, run a structured tabletop/walk-through of the proposed standard at the gemba. Machine-intensive standardized work must tell operators when to be where, what to do, and how to respond when asynchronous equipment demand interrupts the normal route. A dry run can expose ambiguous ownership, qualification gaps, impossible travel, break-relief conflicts, and shared-resource collisions before those weaknesses contaminate a live pilot.

Challenge the proposed Op1/Op2/leader/relief system with plant-realistic scenarios, one at a time and then in combinations: one alarm during routine work; alarms in both zones; a known two-person intervention; break relief while an abnormality is active; gantry/manual-support condition; protected work becoming due while an operator is occupied; one operator unavailable; and leader/outside support requested. For each scenario, require the team to point to the owner, route, qualification, protected-work decision, queue state, escalation/containment rule, and any outside labor required.

Use the exercise as a **design verification**, not proof of capacity. A tabletop pass does not demonstrate that two operators can run production. It only means the proposed standard is sufficiently explicit to enter observation/pilot testing. Any scenario that has no unambiguous owner, qualified responder, due-work protection, or approved escalation path is a design gap to close before that exposure.

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
12. Run the Pre-Pilot Scenario Challenge at the gemba; close ambiguous ownership, skill, relief, route and escalation gaps before live exposure.
13. Freeze measurement definitions, leader checks, escalation and CONTAIN → STABILIZE → RECORD → RESTART logic.
14. Collect context-characterized 3-op baseline using identical definitions and populate workload/reserve/collision/adherence evidence from observed windows.
15. Shadow 2-op; capture periodic confirmations plus exceptions, queue aging/recovery, support people-minutes, containment, actual breaks, collision handling and adherence classification.
16. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
17. Compare matched 3-op/2-op periods: average load, tail windows, negative reserve, cross-zone collisions, qualification blocks, recovery, adherence and Op1-vs-Op2 imbalance.
18. Pareto overload, collision, support, due-time, motion, skill, relief, adherence and recovery exceptions; rebalance zones/work elements and training priorities.
19. Expand across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
20. Move to true 2-op only after representative conditions pass without hidden labor transfer, recurring overload/collision failure, protected-work failure, missed relief, persistent backlog, duplicate dispatch, qualification-dependent intervention or unresolved adherence ambiguity.

## Immediate next action
Conduct a **30–45 minute Pre-Pilot Scenario Challenge at the gemba** with the proposed Op1, Op2, designated leader and relief/support roles. Use the actual proposed zone map and existing plant rules. Record each scenario as PASS / GAP / NOT YET TESTABLE, with the specific ambiguity or missing evidence. Do not create artificial response-time or workload thresholds. Close design gaps first; leave capacity questions for the measured baseline/shadow/live pilot.

Minimum scenario record: Scenario ID | Trigger | Op1 current state | Op2 current state | Initial owner | Qualified? | Route/response | Protected work due | Queue action | Relief/shared resource needed | Leader action | Escalation/containment | Outcome | Gap/owner.

## Data still needed
1. Actual proposed Op1/Op2/leader/relief roles for the first exposure and plant-approved qualifications by task.
2. Candidate press-to-Op1/Op2 zone map and normal routes.
3. Existing escalation/containment/restart authority and task-priority requirements.
4. Which abnormal tasks procedurally require two people or external/shared support.
5. Results of the Pre-Pilot Scenario Challenge: PASS/GAP/NOT YET TESTABLE and unresolved ownership/skill/route/relief issues.
6. Direct-observed recurring work-element times and frequencies by press/zone, with timestamps/windows retained.
7. Representative travel paths/times and exact press positions.
8. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
9. Existing work instructions/quality/safety requirements defining recurring task timing/frequency.
10. Running press-hours/cycles by shift/interval, production plan/actual and product/mix indicator.
11. Actual Curing people-hours and outside-support people-minutes by role/reason.
12. Major press/gantry downtime and manual-support people-minutes.
13. Planned/actual breaks, relief handoffs, delay/interruption and relief home-role carryover.
14. Queue entry/due/recovery timestamps and Mold/Bladder required/completed/carryover.
15. Attendance/call-ins and actual staffing by role/crew.
16. Enough timestamped 3-op baseline windows to characterize workload/reserve, qualification constraints, adherence and observed cross-zone collision/recovery without invented thresholds.
