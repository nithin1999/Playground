# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Shadow-Operator Rescue Protocol
The existing plan called for a shadow 2-operator stage, but it did not define the third operator tightly enough. That creates a major experimental risk: if the third person informally helps with routine work, the exposure can appear successful while actually consuming hidden third-operator labor.

For the first shadow exposure, keep the third qualified operator available under normal plant authority but remove that person from routine Op1/Op2 work. The shadow operator observes and intervenes only when an existing safety, quality, process, escalation or authorized-leader condition requires it. Every intervention becomes measured evidence rather than invisible help.

Log: Intervention ID | timestamp | trigger | requesting role | Op1 state | Op2 state | protected work/queue state | shadow action | hands-on minutes | travel minutes | task/press | reason class | whether the need was caused by 2-op design | recovery complete time.

Classify each intervention as: plant-required/special cause; 2-op capacity or collision; qualification gap; break-relief gap; standard/adherence gap; or not yet classifiable. Do not invent a numerical intervention limit before observing the baseline and shadow exposure. A shadow run is not a 2-op success if the third person repeatedly supplies production labor.

This staged design is consistent with standardized work as a precise, observable baseline for manual work, walking and machine interaction, and with leader standard work that responds to abnormalities without turning the leader into the primary problem solver. It also preserves a controlled fallback while the reduced-manning design is still being learned.

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
15. Run a controlled shadow-2-op exposure: Op1/Op2 execute the proposed standard while a qualified third operator is held as rescue capacity, not routine labor; log every intervention and its people-minutes/reason.
16. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH, explicitly including shadow/outside production assistance.
17. Compare matched 3-op/shadow periods: average load, tail windows, negative reserve, cross-zone collisions, qualification blocks, recovery, adherence, intervention demand and Op1-vs-Op2 imbalance.
18. Pareto overload, collision, support, intervention, due-time, motion, skill, relief, adherence and recovery exceptions; rebalance zones/work elements and training priorities.
19. Repeat shadow exposure across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
20. Move to true 2-op only after representative conditions show the design can operate without hidden third-person production labor, recurring overload/collision failure, protected-work failure, missed relief, persistent backlog, duplicate dispatch, qualification-dependent intervention or unresolved adherence ambiguity.

## Immediate next action
Prepare the first shadow exposure as a controlled experiment. Designate the third qualified operator as **shadow/rescue**, brief that person not to perform routine Op1/Op2 work, and use existing plant safety/quality/process escalation authority for intervention. Add the intervention log to the observer sheet before the exposure. Any shadow production assistance must be counted in Effective Labor/Support Burden; do not erase it because the line recovered.

Minimum intervention record: Intervention ID | Time | Trigger | Op1 state | Op2 state | Queue/protected-work state | Shadow action | Hands-on min | Travel min | Task/press | Reason class | 2-op-design-related? | Recovery time.

## Data still needed
1. Actual proposed Op1/Op2/leader/shadow/relief roles for the first exposure and plant-approved qualifications by task.
2. Candidate press-to-Op1/Op2 zone map and normal routes.
3. Existing escalation/containment/restart authority and task-priority requirements.
4. Which abnormal tasks procedurally require two people or external/shared support.
5. Results of the Pre-Pilot Scenario Challenge: PASS/GAP/NOT YET TESTABLE and unresolved ownership/skill/route/relief issues.
6. Shadow-intervention timestamps, action, people-minutes and reason classification from the first exposure.
7. Direct-observed recurring work-element times and frequencies by press/zone, with timestamps/windows retained.
8. Representative travel paths/times and exact press positions.
9. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
10. Existing work instructions/quality/safety requirements defining recurring task timing/frequency.
11. Running press-hours/cycles by shift/interval, production plan/actual and product/mix indicator.
12. Actual Curing people-hours and outside-support people-minutes by role/reason.
13. Major press/gantry downtime and manual-support people-minutes.
14. Planned/actual breaks, relief handoffs, delay/interruption and relief home-role carryover.
15. Queue entry/due/recovery timestamps and Mold/Bladder required/completed/carryover.
16. Attendance/call-ins and actual staffing by role/crew.
17. Enough timestamped 3-op baseline and shadow windows to characterize workload/reserve, qualification constraints, adherence, intervention demand and observed cross-zone collision/recovery without invented thresholds.
