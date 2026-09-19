# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Operator-Minute Capacity Envelope
The project now separates **scheduled headcount** from **usable operator capacity**. A nominal 2-operator, 12-hour shift contains 1,440 scheduled operator-minutes, but that is not 1,440 minutes of discretionary abnormal-response capacity. Required recurring work, walking, planned break coverage, protected work, training/meetings and observed unavoidable support commitments consume part of that capacity. Actual abnormal-response hands-on labor and recovery demand consume more.

For each existing reporting interval, build an evidence-based capacity ledger:

**Scheduled operator-minutes → minus observed/standard recurring manual work → minus required travel → minus protected/fixed work → minus planned unavailable time → equals pre-abnormal reserve.**

Then charge observed abnormal hands-on work, collision/two-person work and recovery work against that reserve. Keep outside-support people-minutes separate and add them to Effective Labor so a 2-op result cannot look successful by exporting labor.

Do not infer hands-on labor from alarm duration. Do not invent a target utilization or reserve percentage. Use direct observation, plant standard times where valid, and baseline/shadow distributions. A negative or repeatedly near-zero interval reserve is a capacity-design signal; investigate the work elements and condition rather than treating it automatically as proof of failure.

## Best current strategy
1. Map recurring work and travel; remove avoidable motion and point-of-use gaps.
2. Demand-weight Op1/Op2 zones by work content + travel + abnormal exposure, not equal press count.
3. Build the Operator-Minute Capacity Envelope by interval so nominal headcount is separated from usable reserve.
4. Preserve fixed-window variability and test Cross-Zone Collision/shared-resource exposure.
5. Apply Qualification Redundancy / Pair-Robustness Gate.
6. Freeze NORMAL routes and single-owner ABNORMAL dispatch.
7. Use Live Abnormality Ownership Board with explicit event states.
8. Use NORMAL → CONSTRAINED → SATURATED → RECOVERY workload states.
9. Protect due work with a plant-approved Protected Work Matrix and Due-Time Recovery Queue.
10. Close critical single-point skill gaps using demonstrated qualification.
11. Treat breaks as staffing transitions with qualified relief; quantify Break-Relief Debt and relief home-role recovery labor.
12. Use Pilot Leader Standard Work and sample Process Confirmation on critical behaviors.
13. Run the Pre-Pilot Scenario Challenge including relief-home-role and SATURATED-state scenarios.
14. Freeze measurement, escalation and CONTAIN → STABILIZE → RECORD → RESTART definitions.
15. Apply the Pre-Exposure Readiness Gate and log material change points.
16. Collect matched, context-characterized 3-op baseline using the Interval Capacity-Loss / Recovery Board and capacity ledger.
17. Run controlled shadow 2-op with a qualified third operator as rescue capacity only; log every intervention.
18. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH including production assistance, relief and recovery labor.
19. Compare stable-condition segments for operator-minute reserve, workload-state transitions, collisions, response, qualification blocks, work-at-risk, relief debt, adherence, intervention demand and capacity loss.
20. Apply the Time-of-Shift Robustness Gate: stratify the same evidence by hours since shift start and look for recurring late-shift deterioration without inventing thresholds.
21. Pareto exceptions and redesign.
22. Repeat shadow exposure across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
23. Move to true 2-op only after representative evidence shows operation without hidden third-person labor, recurring reserve depletion/saturation/collision failure, protected-work failure, missed relief, persistent relief debt/backlog, dispatch ambiguity, qualification dependency, late-shift deterioration, or an impractical standard-work method.

## Immediate next action
Build the **3-operator baseline capacity ledger before the shadow pilot**. For each existing reporting interval record: scheduled operator-minutes; recurring manual work minutes; travel minutes; protected/fixed work minutes; planned unavailable minutes; abnormal hands-on minutes; recovery minutes; outside-support people-minutes; and resulting reserve. Tag the same interval with Hours Since Shift Start and workload state. This establishes how much real reserve exists today and creates a clean comparison for the 2-op shadow.

## Data still needed
1. Actual proposed Op1/Op2/leader/shadow/relief roles and verified qualifications.
2. Candidate press-to-Op1/Op2 zone map and normal routes.
3. Existing plant acknowledgement/response/escalation/containment requirements.
4. Plant-defined required-by/completion windows and priority rules for protected/deferrable tasks.
5. Timestamped Op1/Op2 work state during events.
6. Existing plant short-interval reporting cadence, plan/actual production and running press exposure.
7. Break-relief source and relief person's home-role work, due windows, recovery and carryover.
8. Which abnormal tasks require two people or external/shared support.
9. Event-level notification/ownership/arrival/hands-on/wait/recovery/close timestamps.
10. Shadow-intervention people-minutes and reason classification.
11. Direct-observed recurring work-element times/frequencies and representative travel times.
12. Running press-hours/cycles, product/mix, major press/gantry downtime and manual-support labor.
13. Actual Curing people-hours and outside-support people-minutes by role/reason.
14. Planned/actual breaks, relief handoffs, interruptions and recovery labor.
15. Queue entry, required-by/time-to-breach, recovery start/finish and carryover.
16. Attendance/call-ins and actual staffing by role/crew.
17. Shift-start timestamps on baseline/shadow observations so time-of-shift can be reconstructed.
18. Interval-level operator-minute ledger inputs so pre-abnormal reserve and actual reserve consumption can be calculated without assumptions.
19. Enough baseline/shadow windows to determine whether reserve depletion or time-of-shift patterns are repeatable rather than special causes.
