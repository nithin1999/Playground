# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project is in **pilot-preparation / execution mode**. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Break-Relief Capacity Protection
A nominal two-operator system is not a true full-shift design unless breaks can occur without silently exporting Curing work to another role or creating unrecovered backlog. Thursday therefore treats each break/meal as a deliberate capacity transition, not merely an attendance event.

For every break/meal record: `break start | operator relieved | qualified relief person | relief home role | home-role work deferred? | abnormality during relief? | extra help? | break end | backlog at handback | backlog cleared time`.

Use three relief states:
- **COVERED:** qualified relief assumes the frozen Curing responsibility and required work remains controlled.
- **DEGRADED:** relief occurs but work is deferred, another role accumulates backlog, or responsibilities become unclear.
- **UNRELIEVED / CONTAINED:** planned relief cannot be provided or plant rules require containment/escalation.

Do not invent a pass/fail percentage. The purpose of the pilot is to expose whether relief is operationally sustainable and whether the relief source's own work is displaced. Relief home-role debt must remain visible until recovered.

### Relief-debt measure
`Relief debt = required home-role or Curing work displaced during relief that remains incomplete at handback.`

Record recovery time and any extra people-minutes used to clear it. A break is not evidence of successful coverage merely because production continued.

## Dual-Mode Pilot Observation
### Mode A — continuous exception/event log
Continuously timestamp meaningful events: abnormality, flex assist, third-person intervention, exposure-state change, break/relief transition, delayed/protected work, rescue/containment, major downtime and recovery completion.

### Mode B — fixed 15-minute structured observation each hour
At a preselected clock window each hour, observe both operators for 15 minutes. Capture work category, walking/retrieval, waiting/monitoring, machine interaction, zone adherence, overlapping demand, relief state and carryover work. Do not move windows after seeing workload. Samples are diagnostic, not a claim of full-shift utilization.

## Pilot Process Confirmation Card
At each structured observation mark **YES / NO / NOT OBSERVABLE**:
1. Op1/Op2 follow frozen primary ownership unless a logged flex transfer is active.
2. Each abnormality has one clear primary owner.
3. Flex assist follows CALL → CHECK → TRANSFER → WORK → RETURN → RECOVER.
4. Break/meal handoff occurs as designed and relief debt remains visible until recovered.
5. Any third-person production assistance is logged with reason, support class and people-minutes.

## Controlled Flex-Assist Rule
Primary zones remain fixed. When uneven abnormal demand threatens due/protected work, use **CALL → CHECK → TRANSFER → WORK → RETURN → RECOVER**. The assisting operator must be qualified and must not abandon higher-priority/protected work. Repeated one-way borrowing is evidence to rebalance zones.

## Support Neutrality Rule
Classify non-Op1/Op2 intervention as **BASELINE-NORMAL**, **INCREMENTAL-2OP**, **AMBIGUOUS**, or **CONTAINMENT/RESCUE** based on work/reason, not helper title. Incremental staffing-substitution people-minutes are charged to Effective Labor.

## Pilot Integrity Exposure States
- **INDEPENDENT 2-OP:** frozen method + normal baseline support only.
- **ASSISTED 2-OP:** incremental third-person staffing substitution occurs.
- **CONTAINED / NOT TESTABLE:** rescue/special cause means the frozen staffing concept is temporarily not being tested.

`Independent Exposure % = Independent 2-op minutes / observable pilot minutes × 100`

## Freeze before Thursday
Name Op1, Op2, floor leader and rescue/shadow; freeze zones/routes, protected work, qualifications, break relief, NORMAL/ABNORMAL ownership, flex-assist, rescue rules, Support Neutrality definitions and observation windows. For each planned relief person, verify critical-task qualification and identify what happens to that person's home-role work.

## Best current strategy
1. Freeze roles, zones, qualifications and relief by Wednesday.
2. Scenario-walk simultaneous demand, abnormality during break, relief handback, flex assist and a known two-person task.
3. Thursday: continuous exception logging + fixed 15 min/hour structured observations.
4. Treat every break as a capacity transition; classify COVERED / DEGRADED / UNRELIEVED and track relief debt to recovery.
5. Timestamp flex assists, third-person interventions, exposure-state transitions and recovery.
6. Calculate Scheduled TPMH, Effective Labor/Adjusted TPMH, Independent Exposure %, incremental support people-minutes, flex-assist minutes and relief-debt recovery.
7. Separate design failure from execution failure before drawing conclusions.
8. Pareto design/training/special-cause/non-adherence and assistance/relief causes.
9. Redesign and repeat representative conditions before permanent 2-op.

## Immediate next action
**Before Thursday, run one break-relief tabletop scenario.** Pick one planned Op1/Op2 break and walk: who takes the zone, whether that person is qualified for critical work, what happens to the relief person's home work, who owns an alarm during the handoff, and how any displaced work is recovered. Add the relief-state fields to the observer sheet.

## Risks / gaps
- No verified Thursday performance exists yet.
- A nominal 2-op pilot can look successful if break coverage exports workload to another role.
- Relief may be available but not qualified for every critical/cross-zone task.
- Relief home-role backlog can hide the true labor cost.
- Observer overload/coaching can contaminate the experiment.
- Fixed snapshots can miss rare events; continuous exception logging remains mandatory.
- Thursday may be unusually easy or difficult; retain exposure context.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, shadow/rescue and relief assignments.
2. Demonstrated qualification matrix for critical/cross-zone tasks, including relief personnel.
3. Frozen Op1/Op2 zone/route map.
4. Existing plant safety/quality priority, escalation, containment and stop rules.
5. Known one-person vs two-person tasks and scarce-support requirements.
6. Recent 3-op normal support examples by reason/people-minutes.
7. Exact break/meal plan, relief source, and relief source's home-role responsibilities.
8. Thursday running-press exposure, product/mix, downtime and plan/actual production.
9. Event-level abnormal-response timestamps and hands-on/recovery labor.
10. Break relief state, displaced work, relief debt and recovery time.
11. Flex assists and third-person interventions with people-minutes/recovery.
12. Protected-work due/completed/delayed/recovered observations.
