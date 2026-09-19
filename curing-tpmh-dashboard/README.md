# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Interval Capacity-Loss / Recovery Board
The project needs a short-interval visual control that connects production loss to the labor condition that produced it. Shift-average TPMH can hide a 2-operator system that repeatedly falls behind during alarm clusters, breaks, gantry downtime, manual loading or support waits and later catches up under easier conditions.

For each plant-approved short interval, record: planned tires; actual tires; delta; running presses/press-hours or another available exposure measure; Op1/Op2 availability; break/relief state; active abnormality/collision; protected-work or recovery-queue state; outside-support people-minutes; primary reason for loss; containment/recovery action; and whether the interval recovered without carrying debt forward.

Do not invent an interval length or production target. Use an existing plant reporting interval where available; otherwise establish the interval during baseline so it is practical to maintain and sensitive enough to reveal workload peaks. Do not use the board to schedule production or judge individuals. Use it to identify when the staffing design becomes abnormal and to connect that condition to observed causes.

The key analysis is not only `plan vs actual`; compare loss intervals with staffing state, abnormal demand, relief, support and recovery. A 2-operator design is more credible when production and protected work remain controlled across difficult intervals without hidden support or persistent recovery debt—not merely when the 12-hour shift total looks acceptable.

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
11. Treat breaks as staffing transitions with qualified relief handoff; quantify Break-Relief Debt and retain the relief person's home-role due work and recovery labor.
12. Use Pilot Leader Standard Work without hidden third-operator labor.
13. Add Process Confirmation sampling for critical standard-work behaviors; classify deviations rather than hiding them inside outcome metrics.
14. Run the Pre-Pilot Scenario Challenge, including relief-person home-role collision/recovery scenarios, and close ambiguous ownership, skill, relief, route and escalation gaps.
15. Freeze measurement definitions, leader checks and CONTAIN → STABILIZE → RECORD → RESTART logic.
16. Apply the Pre-Exposure Readiness Gate before each baseline/shadow window and log material change points during the exposure.
17. Collect context-characterized 3-op baseline using identical definitions.
18. Add an Interval Capacity-Loss / Recovery Board linking plan-vs-actual performance to running exposure, staffing state, abnormal demand, relief, support and recovery debt.
19. Run controlled shadow 2-op: Op1/Op2 execute the standard while a qualified third operator is rescue capacity only; log every intervention.
20. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH including all production assistance, break-relief coverage and recovery labor attributable to the staffing design.
21. Compare matched stable-condition segments and short intervals for load, negative reserve, collisions, acknowledgement/response, qualification blocks, time-to-breach/recovery, relief debt, process adherence, intervention demand and capacity loss.
22. Pareto overload, duplicate/unowned dispatch, support waits, intervention, due-time, motion, skill, relief debt, adherence, recovery and interval-loss exceptions; redesign.
23. Repeat shadow exposure across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
24. Move to true 2-op only after representative evidence shows operation without hidden third-person labor, recurring overload/collision failure, protected-work failure, missed relief, persistent relief debt/backlog, dispatch ambiguity, qualification-dependent intervention or an impractical standard-work method.

## Immediate next action
Prototype the **Interval Capacity-Loss / Recovery Board** during the next 3-op baseline observation before using it to judge 2-op. For each existing plant reporting interval, capture plan/actual, running exposure, staffing/break state, active abnormality or collision, queue state, support people-minutes, primary loss reason and recovery status. At shift end, Pareto the negative intervals and check whether they coincide with labor-demand peaks, breaks, support waits or equipment loss. Keep production loss and operator workload separate unless the observation actually supports the connection.

## Data still needed
1. Actual proposed Op1/Op2/leader/shadow/relief roles and verified qualifications.
2. Candidate press-to-Op1/Op2 zone map and normal routes.
3. Existing plant acknowledgement/response/escalation/containment requirements; do not invent thresholds.
4. Plant-defined required-by/completion windows and priority rules for protected/deferrable Curing tasks.
5. Existing plant short-interval reporting cadence and planned-vs-actual production by interval, if available.
6. Running press count/press-hours or another production-exposure measure by the same interval.
7. Break-relief source by break and the relief person's home-role tasks, due windows, observed work times, alternate coverage and recovery/carryover.
8. Which abnormal tasks require two people or external/shared support.
9. Scenario Challenge results and unresolved ownership/skill/route/relief issues.
10. Pre-exposure readiness records and timestamped material change points.
11. Process-confirmation opportunities, adherence Y/N, deviation reason and consequence by critical behavior.
12. Event-level NEW/OWNED/arrival/work/wait/recovery/close timestamps and primary owner.
13. Shadow-intervention timestamps, people-minutes and reason classification.
14. Direct-observed recurring work-element times/frequencies and representative travel times.
15. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
16. Running press-hours/cycles, production plan/actual and product/mix indicator.
17. Actual Curing people-hours and outside-support people-minutes by role/reason.
18. Major press/gantry downtime and manual-support people-minutes.
19. Planned/actual breaks, relief handoffs, delay/interruption, relief home-role due work, recovery labor and carryover.
20. Queue entry, required-by/time-to-breach, recovery start/finish, qualification and Mold/Bladder required/completed/carryover.
21. Attendance/call-ins and actual staffing by role/crew.
22. Enough timestamped baseline/shadow windows to establish observed workload, response, support, adherence, relief-debt, interval-loss and recovery distributions before setting numerical gates.
