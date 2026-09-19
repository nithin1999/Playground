# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Break-Relief Debt / Exported-Work Control
The project already requires qualified break relief, but relief is not free capacity. If a Mold/Bladder operator, Team Lead, or another role covers Curing while their own required work continues to arrive, the apparent 2-operator gain can simply export workload and backlog to another role.

For every relief interval, record: Curing operator relieved; relief person/role; relief start/end; Curing work performed; relief person's home-role work due during coverage; home-role work deferred; alternate who covered that work; recovery start/finish; carryover at end of interval; and any additional person-minutes used to recover it.

Define **Relief Debt** as home-role required work that became deferred because the relief person was covering Curing. Do not convert this to a single time value unless the underlying work-element times are observed or plant-standard. Track the actual tasks and recovery labor first.

A break is operationally successful only when the Curing operator receives the intended break coverage **and** the relief mechanism does not create unmeasured labor, missed protected work, or persistent backlog elsewhere. Any production assistance and recovery labor must remain visible in Effective Labor Hours / Support Burden.

Use the scenario challenge to test at least: normal break coverage, abnormality during relief, relief person recalled to home role, and home-role work becoming due during coverage. Existing safety, quality, labor and break requirements override the experimental staffing design.

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
18. Run controlled shadow 2-op: Op1/Op2 execute the standard while a qualified third operator is rescue capacity only; log every intervention.
19. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH including all production assistance, break-relief coverage and recovery labor attributable to the staffing design.
20. Compare matched stable-condition segments for load, negative reserve, collisions, acknowledgement/response, qualification blocks, time-to-breach/recovery, relief debt, process adherence and intervention demand.
21. Pareto overload, duplicate/unowned dispatch, support waits, intervention, due-time, motion, skill, relief debt, adherence and recovery exceptions; redesign.
22. Repeat shadow exposure across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
23. Move to true 2-op only after representative evidence shows operation without hidden third-person labor, recurring overload/collision failure, protected-work failure, missed relief, persistent relief debt/backlog, dispatch ambiguity, qualification-dependent intervention or an impractical standard-work method.

## Immediate next action
Build a **Break-Relief Debt log** and use it in the next scenario challenge/baseline observation. For each planned break, capture relief person/role, coverage start/end, Curing work performed, home-role work that became due, work deferred, alternate coverage, recovery start/finish, recovery people-minutes and carryover. Test one case where an abnormality occurs during the break and one where the relief person's own protected work becomes due. Do not count the break plan as feasible merely because Curing remains covered; verify the upstream/downstream relief role recovers without hidden labor or persistent backlog.

## Data still needed
1. Actual proposed Op1/Op2/leader/shadow/relief roles and verified qualifications.
2. Candidate press-to-Op1/Op2 zone map and normal routes.
3. Existing plant acknowledgement/response/escalation/containment requirements; do not invent thresholds.
4. Plant-defined required-by/completion windows and priority rules for protected/deferrable Curing tasks.
5. Break-relief source by break and the relief person's home-role tasks, due windows, observed work times, alternate coverage and recovery/carryover.
6. Which abnormal tasks require two people or external/shared support.
7. Scenario Challenge results and unresolved ownership/skill/route/relief issues.
8. Pre-exposure readiness records and timestamped material change points.
9. Process-confirmation opportunities, adherence Y/N, deviation reason and consequence by critical behavior.
10. Event-level NEW/OWNED/arrival/work/wait/recovery/close timestamps and primary owner.
11. Shadow-intervention timestamps, people-minutes and reason classification.
12. Direct-observed recurring work-element times/frequencies and representative travel times.
13. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
14. Running press-hours/cycles, production plan/actual and product/mix indicator.
15. Actual Curing people-hours and outside-support people-minutes by role/reason.
16. Major press/gantry downtime and manual-support people-minutes.
17. Planned/actual breaks, relief handoffs, delay/interruption, relief home-role due work, recovery labor and carryover.
18. Queue entry, required-by/time-to-breach, recovery start/finish, qualification and Mold/Bladder required/completed/carryover.
19. Attendance/call-ins and actual staffing by role/crew.
20. Enough timestamped baseline/shadow windows to establish observed workload, response, support, adherence, relief-debt and recovery distributions before setting numerical gates.
