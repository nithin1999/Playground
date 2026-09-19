# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Process Confirmation + Adherence Layer
The design now has explicit NORMAL/ABNORMAL work, visual abnormality ownership and leader standard work, but a pilot can still produce ambiguous results if we do not distinguish whether the designed standard was actually followed. Add a lightweight process-confirmation layer during baseline, scenario challenge and shadow exposure.

For sampled observations, confirm only critical behaviors: operator in assigned ownership/route; abnormality has one primary owner; protected due work is maintained or explicitly queued; assistance/support is logged; break handoff is explicit; and any deviation has a reason code. Record **Opportunity | Standard followed Y/N | Deviation reason | Consequence | Countermeasure owner**. Do not use this as a punitive operator audit; its purpose is to separate design failure, training/clarity failure, abnormal/special cause and simple non-adherence.

Report adherence by opportunity and by critical behavior rather than a single shift-level yes/no. Do not invent a pass percentage yet. First collect observed adherence and failure consequences; any plant safety/quality requirement remains mandatory regardless of observed frequency.

This strengthens experimental validity: a 2-op exposure cannot fairly validate the staffing design if the intended operating method was not executed, while repeated inability to follow the method despite clear instruction is itself evidence that the design may be impractical.

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
16. Collect context-characterized 3-op baseline using identical definitions.
17. Run controlled shadow 2-op: Op1/Op2 execute the standard while a qualified third operator is rescue capacity only; log every intervention.
18. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH including all production assistance.
19. Compare matched periods for load, negative reserve, collisions, acknowledgement/response, qualification blocks, queue/recovery, process adherence and intervention demand.
20. Pareto overload, duplicate/unowned dispatch, support waits, intervention, due-time, motion, skill, relief, adherence and recovery exceptions; redesign.
21. Repeat shadow exposure across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
22. Move to true 2-op only after representative evidence shows operation without hidden third-person labor, recurring overload/collision failure, protected-work failure, missed relief, persistent backlog, dispatch ambiguity, qualification-dependent intervention or an impractical standard-work method.

## Immediate next action
Add a small Process Confirmation section to the observer sheet before the first baseline/scenario-challenge exposure. Sample critical opportunities rather than trying to watch everything continuously: Assigned ownership/route followed? Single abnormality owner? Protected work handled correctly? Support logged? Break handoff followed? If No, record reason and consequence. Review deviations after the exposure and classify them as design, training/clarity, abnormal/special cause, or non-adherence before interpreting TPMH/capacity results.

## Data still needed
1. Actual proposed Op1/Op2/leader/shadow/relief roles and verified qualifications.
2. Candidate press-to-Op1/Op2 zone map and normal routes.
3. Existing plant acknowledgement/response/escalation/containment requirements; do not invent thresholds.
4. Which abnormal tasks require two people or external/shared support.
5. Scenario Challenge results and unresolved ownership/skill/route/relief issues.
6. Process-confirmation opportunities, adherence Y/N, deviation reason and consequence by critical behavior.
7. Event-level NEW/OWNED/arrival/work/wait/recovery/close timestamps and primary owner.
8. Shadow-intervention timestamps, people-minutes and reason classification.
9. Direct-observed recurring work-element times/frequencies and representative travel times.
10. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps plus operator busy/free state.
11. Running press-hours/cycles, production plan/actual and product/mix indicator.
12. Actual Curing people-hours and outside-support people-minutes by role/reason.
13. Major press/gantry downtime and manual-support people-minutes.
14. Planned/actual breaks, relief handoffs, delay/interruption and relief home-role carryover.
15. Queue entry/due/recovery timestamps and Mold/Bladder required/completed/carryover.
16. Attendance/call-ins and actual staffing by role/crew.
17. Enough timestamped baseline/shadow windows to establish observed workload, response, support, adherence and recovery distributions before setting numerical gates.
