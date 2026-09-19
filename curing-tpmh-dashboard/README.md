# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Time-of-Shift Robustness Gate
A 2-operator design should not be validated only from an early/easy portion of a 12-hour shift. Long shifts can change fatigue and recovery risk, and workload peaks may occur at different times. Keep the existing workload-state method, but stratify baseline and shadow evidence by time-of-shift so a good shift average cannot hide late-shift deterioration.

For every baseline/shadow exposure, preserve the existing plant reporting interval and tag each interval with **hours since shift start**. Compare early/middle/late portions descriptively for: NORMAL/CONSTRAINED/SATURATED/RECOVERY minutes, protected-work backlog/carryover, break completion/interruptions, outside-support people-minutes, response/recovery time, short-interval production loss, and observed walking/manual-work burden.

Do not invent a fatigue threshold or assume late-shift degradation. The purpose is to test whether performance is stable across the actual 12-hour operating window. Existing plant safety and break requirements remain controlling. If a recurring late-shift pattern appears, investigate workload, break timing/quality, walking, heat/ergonomic demand, staffing/relief, equipment mix and accumulated recovery debt before accepting 2-op.

## Best current strategy
1. Map recurring work and travel; remove avoidable motion and point-of-use gaps.
2. Demand-weight Op1/Op2 zones by work content + travel + abnormal exposure, not equal press count.
3. Preserve fixed-window variability and build Variability-Aware Reserve distributions.
4. Test Cross-Zone Collision exposure and shared-resource conflicts.
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
16. Collect matched, context-characterized 3-op baseline using the Interval Capacity-Loss / Recovery Board.
17. Run controlled shadow 2-op with a qualified third operator as rescue capacity only; log every intervention.
18. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH including production assistance, relief and recovery labor.
19. Compare stable-condition segments for reserve, workload-state transitions, collisions, response, qualification blocks, work-at-risk, relief debt, adherence, intervention demand and capacity loss.
20. Apply the Time-of-Shift Robustness Gate: stratify the same evidence by hours since shift start and look for recurring late-shift deterioration without inventing thresholds.
21. Pareto exceptions and redesign.
22. Repeat shadow exposure across demand, downtime, break, late-shift and A/B/C/D conditions before true 2-op.
23. Move to true 2-op only after representative evidence shows operation without hidden third-person labor, recurring saturation/collision failure, protected-work failure, missed relief, persistent relief debt/backlog, dispatch ambiguity, qualification dependency, late-shift deterioration, or an impractical standard-work method.

## Immediate next action
Add **Hours Since Shift Start** to the next 3-op baseline/scenario observation and preserve the existing reporting interval. At shift end, compare early/middle/late portions for workload-state minutes, backlog/carryover, break performance, support people-minutes, response/recovery, production loss and observed walking/manual work. This establishes the comparison method before the shadow 2-op exposure and avoids defining arbitrary fatigue limits.

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
18. Enough baseline/shadow windows to determine whether any time-of-shift pattern is repeatable rather than a special cause.
