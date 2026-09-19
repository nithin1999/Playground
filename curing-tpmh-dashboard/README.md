# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Workload-State Escalation Ladder
Alarm count alone is not a safe dispatch rule. One alarm can consume both operators if the intervention requires two people, while several notifications can create little labor if they are brief or non-hands-on. The 2-operator design therefore needs a visible state based on actual operator availability, protected work, qualification and recovery demand.

Use four states without inventing new time limits:
- **NORMAL:** both operators can execute their assigned routes/owned work and protected work remains controlled.
- **CONSTRAINED:** one operator is committed to abnormal work, break/relief, or another protected task; the other continues the defined priority route and new work is explicitly owned/queued.
- **SATURATED:** both operators are committed, or the only available operator is not qualified, while additional required work arrives or due work becomes at risk. Apply the plant-approved escalation/containment rule and log outside-support labor.
- **RECOVERY:** the abnormal event is contained but deferred protected/routine work remains. Freeze discretionary work and recover by plant priority/required-by rules until the queue is controlled.

Do not set a numerical alarm-count trigger or invented response-time threshold. The state changes should be driven by observed work commitments and existing plant safety/quality/process requirements. Every transition should be timestamped during baseline/shadow work so the project can later quantify minutes in each state, entries into SATURATED, support people-minutes, recovery time and carryover.

This is the missing link between the Live Abnormality Ownership Board and the Due-Time Recovery Queue: ownership tells who has the event; the workload state tells whether the two-person system still has usable reserve.

## Best current strategy
1. Map recurring work and travel; remove avoidable motion and point-of-use gaps.
2. Demand-weight Op1/Op2 zones by work content + travel + abnormal exposure, not equal press count.
3. Preserve fixed-window variability and build Variability-Aware Reserve distributions.
4. Test Cross-Zone Collision exposure and shared-resource conflicts.
5. Apply Qualification Redundancy / Pair-Robustness Gate.
6. Freeze NORMAL routes and single-owner ABNORMAL dispatch.
7. Use Live Abnormality Ownership Board with explicit event states.
8. Add the Workload-State Escalation Ladder: NORMAL → CONSTRAINED → SATURATED → RECOVERY.
9. Protect due work with a plant-approved Protected Work Matrix.
10. Control deferred work with the Due-Time Recovery Queue using required-by/time-to-breach, qualification and recovery ownership.
11. Close critical single-point skill gaps using demonstrated qualification.
12. Treat breaks as staffing transitions with qualified relief; quantify Break-Relief Debt and relief home-role recovery labor.
13. Use Pilot Leader Standard Work without hidden third-operator labor.
14. Sample Process Confirmation on critical standard-work behaviors.
15. Run the Pre-Pilot Scenario Challenge including relief-home-role collisions and SATURATED-state scenarios.
16. Freeze measurement, escalation and CONTAIN → STABILIZE → RECORD → RESTART definitions.
17. Apply the Pre-Exposure Readiness Gate and log material change points.
18. Collect matched, context-characterized 3-op baseline.
19. Use the Interval Capacity-Loss / Recovery Board to connect short-interval output to equipment exposure, staffing state, abnormal demand, relief, support and recovery.
20. Run controlled shadow 2-op with a qualified third operator as rescue capacity only; log every intervention.
21. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH including production assistance, relief and recovery labor.
22. Compare stable-condition segments and short intervals for reserve, workload-state transitions, collisions, response, qualification blocks, work-at-risk, relief debt, adherence, intervention demand and capacity loss.
23. Pareto SATURATED entries, overload, duplicate/unowned dispatch, support waits, due-time misses, motion, skill, relief debt, adherence, recovery and interval-loss exceptions; redesign.
24. Repeat shadow exposure across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
25. Move to true 2-op only after representative evidence shows operation without hidden third-person labor, recurring saturation/collision failure, protected-work failure, missed relief, persistent relief debt/backlog, dispatch ambiguity, qualification dependency or an impractical standard-work method.

## Immediate next action
Add **Workload State** to the next 3-op baseline/scenario-challenge observation sheet. At each event/change point record timestamp, Op1 state/task, Op2 state/task, qualifications needed, protected work at risk, workload state, new owner/queue action, escalation/support, recovery start/finish and carryover. Test at least the already-planned collision scenarios: abnormality while routine work is underway, simultaneous zone demand, abnormality during a break, a two-person task, and relief-home-role conflict. Use existing plant escalation rules; do not invent thresholds.

## Data still needed
1. Actual proposed Op1/Op2/leader/shadow/relief roles and verified qualifications.
2. Candidate press-to-Op1/Op2 zone map and normal routes.
3. Existing plant acknowledgement/response/escalation/containment requirements.
4. Plant-defined required-by/completion windows and priority rules for protected/deferrable tasks.
5. Timestamped Op1/Op2 work state during events so NORMAL/CONSTRAINED/SATURATED/RECOVERY can be reconstructed.
6. Existing plant short-interval reporting cadence, plan/actual production and running press exposure.
7. Break-relief source and relief person's home-role work, due windows, recovery and carryover.
8. Which abnormal tasks require two people or external/shared support.
9. Scenario Challenge results and unresolved ownership/skill/route/relief issues.
10. Pre-exposure readiness records and timestamped material change points.
11. Process-confirmation observations and deviation reasons.
12. Event-level notification/ownership/arrival/hands-on/wait/recovery/close timestamps.
13. Shadow-intervention people-minutes and reason classification.
14. Direct-observed recurring work-element times/frequencies and representative travel times.
15. Running press-hours/cycles, product/mix, major press/gantry downtime and manual-support labor.
16. Actual Curing people-hours and outside-support people-minutes by role/reason.
17. Planned/actual breaks, relief handoffs, interruptions and recovery labor.
18. Queue entry, required-by/time-to-breach, recovery start/finish and carryover.
19. Attendance/call-ins and actual staffing by role/crew.
20. Enough baseline/shadow windows to establish workload-state, response, support, relief-debt, interval-loss and recovery distributions before setting numerical gates.
