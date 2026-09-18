# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Abnormal-Work Dispatch + Visible Queue Discipline
The 2-operator design now requires an explicit ownership rule for abnormalities so both operators do not duplicate response while routine work becomes orphaned. The future-state visual control has four states for consequential work: **NEW → OWNED → WAITING/ESCALATED → RECOVERED**.

For every abnormal event, the zone owner is the default first responder. The second operator continues protected due work unless a predefined cross-support trigger is met. When cross-support is required, displaced routine work is placed visibly in the recovery queue with owner and due requirement; it is not allowed to disappear from the workload calculation. If neither qualified operator can absorb the event without violating plant-required safety/quality/process requirements, the event follows the Green/Amber/Red escalation path and outside-support people-minutes are logged.

Do not invent numeric WIP/backlog or response thresholds. Use existing plant requirements where they exist, then use 3-op baseline and pilot observations to establish practical control limits. The purpose is to make abnormal demand, ownership, support and recovery observable enough to distinguish a workable two-person system from one that succeeds by hidden expediting.

## Best current strategy
1. Map presses/travel and remove avoidable motion; compare candidate zone layouts on occupied work + peaks + travel.
2. Freeze NORMAL-mode workload/travel-balanced routes.
3. Freeze ABNORMAL-mode dispatch: zone owner first, explicit cross-support trigger, one visible owner per event, escalation authority and return-to-standard rule.
4. Protect interrupted routine work with the NEW → OWNED → WAITING/ESCALATED → RECOVERED visual queue; retain displaced work as demand until recovered.
5. Build the demonstrated task-skill matrix; verify actual Op1/Op2/relief pairing coverage before exposure.
6. Use TWI Job Instruction/Job Breakdown Sheets to close critical skill gaps; do not equate attendance at training with independent capability.
7. Reserve break-relief capacity while retaining the helper's own due work.
8. Build 30-minute Capacity Reserve + Recovery Profiles with qualification constraints and unrecovered queue demand applied.
9. Freeze measurement definitions, Leader Standard Work, SIC cadence and Green/Amber/Red authority.
10. Freeze the Pilot Context Card, Pilot Decision Scorecard, Exception-Based Observation protocol and intervention taxonomy before seeing 2-op results.
11. Collect a context-characterized 3-op baseline using identical definitions, including normal outside-support people-minutes and abnormal-work ownership/recovery behavior.
12. Shadow 2-op; use periodic process confirmation plus event-triggered exception capture, then compare context-matched 3-op periods on the full scorecard.
13. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH; Pareto incremental support plus structural-overload, duplicate-response, orphaned-work, motion, skill and recovery exceptions.
14. Revise zones, training, standard work, relief and support rules; expand across underrepresented contexts and A/B/C/D crews.
15. Move to true 2-op only after representative conditions pass without hidden labor transfer, recurring overload, protected-work failure, missed relief, persistent backlog, duplicate dispatch or qualification-dependent intervention.

## Pilot gates
- Gate 0 — Data/design: layout, alarm evidence, travel study and candidate zones.
- Gate 1 — Standard work/skills: NORMAL route, ABNORMAL ownership/dispatch/recovery, routine-work matrix, response matrix, visible queue and demonstrated critical-task coverage for the actual pair/relief structure.
- Gate 2 — Relief/capacity: relief reservation plus preliminary 30-minute Capacity Reserve + Recovery Profile with qualification constraints and queue demand.
- Gate 3 — Management/measurement: measurement dictionary, observer check, Leader Standard Work, visual controls, SIC ownership, intervention taxonomy, escalation matrix, Exception-Based Observation protocol and frozen Pilot Decision Scorecard.
- Gate 4 — Baseline/context: current 3-op state measured with identical scorecard, observation, support-labor and abnormal-work ownership definitions plus Pilot Context Card.
- Gate 5 — Shadow 2-op: capture context, periodic process confirmations, all consequential exceptions, queue creation/recovery, outside-support people-minutes and the full decision vector.
- Gate 6 — Matched analysis/revise: compare context-matched exposures using both scheduled and effective labor; Pareto incremental support, duplicate dispatch, backlog/recovery and other exceptions.
- Gate 7 — Coverage: test underrepresented demand, concurrency, break, downtime/recovery and crew conditions.
- Gate 8 — True 2-op/control: demonstrated acceptance across representative conditions with controlled standard work, skills, relief, dispatch, escalation, SIC and control plan.

## Immediate next action
Before the first pilot, add an **Abnormal Event / Recovery Queue** to the one-page observation sheet with: Event ID, Time, Press/Zone, Trigger, Initial Owner, Op1 State, Op2 State, Cross-Support Y/N + reason, Displaced Work, Escalation/Support, Recovery Time, Final State. Use the same fields for a representative 3-op baseline. The observer should specifically flag duplicate response, unowned work, and work that remains pending across observation intervals. Continue collecting outside-support people-minutes and calculating Adjusted TPMH.

## Data still needed
1. Plant-required qualifications/authorizations and existing training records for Curing, alarm response, manual load/unload, GIP/scanning, bladder/mold interfaces and other critical tasks.
2. Actual Op1/Op2 candidates plus primary/alternate relief by A/B/C/D crew, with demonstrated independent capability by critical task.
3. Existing plant safety/quality/process acceptance requirements and task priority/due requirements relevant to Curing staffing.
4. Running press-hours/cycles by shift and 30-minute interval.
5. Production plan/actual and available product/mix indicator by shift.
6. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps; operator busy/free state.
7. Actual Curing people-hours plus outside-support people-minutes by role/reason in both 3-op baseline and 2-op exposure; distinguish normal support from staffing substitution.
8. Major press/gantry downtime and manual-support people-minutes.
9. Planned/actual breaks and primary/alternate relief with helper due work and relief people-minutes.
10. Routine work-element minutes, due timing, displaced-work creation/ownership/recovery timestamps and queue age.
11. Mold/Bladder required, completed and carryover by shift/due time.
12. Attendance/call-ins and actual staffing by role/crew.
13. Exact press positions and representative travel paths/times.
14. Decision/escalation authority and existing abnormal-response priority rules.
15. Enough 3-op baseline observations to create comparison bands for support burden, recovery and queue behavior without invented thresholds.
16. Pilot observer availability and a practical pre-frozen process-confirmation cadence; no universal frequency is assumed.
