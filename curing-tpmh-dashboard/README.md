# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project is in **pilot-preparation / execution mode**. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Operator Occupancy Timeline / Capacity Collision Analysis
Queue logging tells us that work waited, but it does not show whether the wait was caused by true two-operator capacity saturation, poor zone balance, excessive travel, or an avoidable work-sequencing problem. Thursday should therefore reconstruct the periods in which each operator is actually committed.

For meaningful work intervals, record or reconstruct:
`start | end | operator | zone | task/category | protected/abnormal/routine | primary/flex | walking/retrieval? | helper? | displaced work`

Plot Op1 and Op2 on a common time axis after the pilot. Mark intervals where **both operators are simultaneously committed**, then overlay queue starts, break/relief periods, flex assists and incremental third-person help.

Analyze, without inventing acceptance limits:
- observed minutes with both Op1 and Op2 committed;
- queue starts occurring while both operators are committed;
- queue starts when one operator appears available (possible ownership/visibility/qualification/routing issue rather than pure capacity);
- repeated one-way flex borrowing by zone;
- walking/retrieval embedded in collision periods;
- time from capacity collision to stable recovery.

Interpretation rule: a queue beginning while both operators are genuinely committed is stronger evidence of a capacity collision. A queue beginning while one operator is available requires investigation of qualification, ownership, visibility, routing, priority rules or measurement error before concluding that two operators are insufficient.

## Abnormal-Demand Queue & Recovery Ledger
For every abnormality that cannot be started immediately, record:
`event time | zone | event/task | primary owner | operator already committed to | wait-to-response start | flex requested? | third-person help? | support class | response start | work complete | displaced/protected work | recovery complete`

Do **not** invent a maximum acceptable queue or response-time threshold before the pilot. Existing safety/quality/process response requirements remain authoritative. Calculate observed queue episodes, peak simultaneous unresolved required tasks, wait-to-response distribution, queue duration, recovery duration, flex-assist involvement and incremental support people-minutes.

## Hourly Pilot Production Control Board
Use one row per clock hour and display **plan, actual, cumulative gap, major downtime, abnormality/queue condition, staffing exposure state, incremental help, break/relief state, protected-work status, and action/owner**.

### Hourly row
`hour | production plan | actual | cumulative gap | running presses / major downtime | queue/abnormality | exposure state | incremental help people-min | break/relief state | protected work due/completed | action | owner`

## Break-Relief Capacity Protection
For every break/meal record: `break start | operator relieved | qualified relief person | relief home role | home-role work deferred? | abnormality during relief? | extra help? | break end | backlog at handback | backlog cleared time`.

Use three relief states: **COVERED**, **DEGRADED**, or **UNRELIEVED / CONTAINED**. Relief debt is required Curing or relief-home-role work displaced during relief that remains incomplete at handback. Track recovery time and extra people-minutes.

## Dual-Mode Pilot Observation
### Mode A — continuous exception/event log
Continuously timestamp meaningful events: abnormality, flex assist, third-person intervention, exposure-state change, break/relief transition, delayed/protected work, rescue/containment, major downtime and recovery completion.

### Mode B — fixed 15-minute structured observation each hour
At a preselected clock window each hour, observe both operators for 15 minutes. Capture work category, walking/retrieval, waiting/monitoring, machine interaction, zone adherence, overlapping demand, relief state and carryover work. Do not move windows after seeing workload. Samples are diagnostic, not a claim of full-shift utilization.

During these windows, capture task start/end times accurately enough to build the Operator Occupancy Timeline. Outside the windows, reconstruct only intervals supported by exception timestamps or other reliable records; do not invent continuous activity.

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
1. Freeze roles, zones, qualifications, relief and reaction rules by Wednesday.
2. Scenario-walk simultaneous demand, abnormality during break, relief handback, flex assist and a known two-person task.
3. Thursday: continuous exception logging + fixed 15 min/hour structured observations.
4. Build an Operator Occupancy Timeline from observed/reliably timestamped intervals and overlay queue starts, breaks, flex assists and incremental help.
5. Maintain the Queue & Recovery Ledger whenever required work cannot begin immediately.
6. Update the Hourly Pilot Production Control Board at every hour boundary.
7. Treat every break as a capacity transition; classify COVERED / DEGRADED / UNRELIEVED and track relief debt to recovery.
8. Calculate Scheduled TPMH, Effective Labor/Adjusted TPMH, Independent Exposure %, incremental support people-minutes, flex-assist minutes, queue/recovery measures and observed capacity-collision measures.
9. Separate true capacity collisions from ownership/qualification/routing/visibility failures before drawing conclusions.
10. Pareto causes; rebalance zones/routes/skills/reaction rules and repeat representative conditions before permanent 2-op.

## Immediate next action
**Add start/end/operator/task fields to Thursday's structured observation and exception sheets so an evidence-backed Op1/Op2 occupancy timeline can be reconstructed.** Rehearse one overlapping-demand scenario and verify the observer can distinguish: both operators committed vs one available, queue start, flex/support start, work completion and full recovery.

## Risks / gaps
- No verified Thursday performance exists yet.
- Alarm-start concurrency is only a demand proxy; it does not establish hands-on workload or overload.
- Queue presence alone does not prove insufficient headcount; ownership, qualification, visibility and routing can create avoidable waits.
- Continuous full-shift operator occupancy cannot be inferred from 15-minute samples; only observed or reliably timestamped intervals should be plotted.
- Shift-end TPMH can hide queues, accumulated backlog, delayed response or temporary staffing substitution.
- Break coverage can export workload to another role.
- Relief may be available but not qualified for every critical/cross-zone task.
- Observer overload/coaching can contaminate the experiment.
- Thursday may be unusually easy or difficult; retain exposure context.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, shadow/rescue and relief assignments.
2. Demonstrated qualification matrix for critical/cross-zone tasks, including relief personnel.
3. Frozen Op1/Op2 zone/route map.
4. Existing plant safety/quality priority, escalation, containment and stop rules.
5. Known one-person vs two-person tasks and scarce-support requirements.
6. Recent 3-op normal support examples by reason/people-minutes.
7. Exact break/meal plan, relief source, and relief source's home-role responsibilities.
8. Thursday hourly production plan plus running-press exposure, product/mix, downtime and actual production.
9. Observed/reliably timestamped Op1/Op2 task intervals, including walking/retrieval where captured.
10. Event-level abnormal-response timestamps: event start, response start, hands-on work completion and full system recovery.
11. Queue episodes, peak simultaneous unresolved required tasks, wait-to-response and recovery duration.
12. Break relief state, displaced work, relief debt and recovery time.
13. Flex assists and third-person interventions with people-minutes/recovery.
14. Protected-work due/completed/delayed/recovered observations.
