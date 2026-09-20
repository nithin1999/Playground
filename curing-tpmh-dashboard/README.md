# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project is in **pilot-preparation / execution mode**. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Controlled Flex-Assist Rule
Fixed Op1/Op2 zones create clear ownership, but a rigid boundary can leave one operator overloaded while the other has recoverable capacity. Thursday should therefore keep **primary zones** but use a controlled, visible handoff when cross-zone assistance is actually needed.

### Default
Each operator owns the frozen route, routine/protected work and abnormalities in the assigned primary zone. Do not continuously rebalance or chase alarms across both zones.

### Flex-assist sequence
1. **CALL:** home-zone owner identifies a condition that cannot be absorbed without jeopardizing due/protected work, recovery, or an approved abnormal-response requirement.
2. **CHECK:** potential assisting operator must be qualified and must not abandon higher-priority/protected work in the home zone.
3. **TRANSFER:** one specific task/event is explicitly accepted by the assisting operator. Ownership must be clear; assistance must not create two uncoordinated responders.
4. **WORK:** record assist start/end, task/event, reason and any displaced work/travel.
5. **RETURN:** assisting operator returns to the primary zone when the transferred work is complete or approved containment/recovery changes the condition.
6. **RECOVER:** displaced work is made visible and recovered; unresolved backlog remains evidence.

Do **not** invent a numerical flex trigger before the pilot. Use existing plant safety/quality/process priority and escalation rules. Flex assist is a pilot observation mechanism, not permission to bypass qualification or plant authority.

### Why this matters
Machine-intensive work is often event-driven rather than perfectly cyclic. Primary zones preserve clear ownership and reduce random walking; controlled flex provides a testable way to share capacity during uneven abnormal demand. Every assist also becomes evidence for whether the proposed zone balance is correct.

### Flex-assist record
`time | from zone | to zone | task/event | reason | requested by | accepted by | qualified? | assist start/end | travel | displaced home-zone work | recovered? | outside support?`

Post-pilot, Pareto flex assists by zone, task and reason. Repeated one-way borrowing is evidence that zone/work allocation may need redesign; do not normalize chronic imbalance by making flex assistance routine.

## Support Neutrality Rule
For every non-Op1/Op2 intervention classify support as **BASELINE-NORMAL**, **INCREMENTAL-2OP**, **AMBIGUOUS**, or **CONTAINMENT/RESCUE** based on the reason and work performed, not the helper's title. Incremental staffing-substitution people-minutes are charged to Effective Labor. If causality is unclear, preserve it as AMBIGUOUS rather than forcing a conclusion.

## Pilot Integrity Exposure States
- **INDEPENDENT 2-OP:** frozen method + normal baseline support only.
- **ASSISTED 2-OP:** incremental third-person staffing substitution occurs.
- **CONTAINED / NOT TESTABLE:** rescue/special cause means the frozen staffing concept is temporarily not being tested.

`Independent Exposure % = Independent 2-op minutes / observable pilot minutes × 100`

A flex assist between Op1 and Op2 does **not** by itself make the exposure ASSISTED 2-OP because total Curing staffing remains two; it must be logged to test zone balance and displaced-work risk.

## Freeze before Thursday
1. Name Op1, Op2, floor leader and qualified rescue/shadow roles.
2. Freeze primary Op1/Op2 zones/routes and critical protected work.
3. Verify demonstrated qualifications for critical tasks.
4. Freeze break/meal relief ownership and handoff.
5. Freeze NORMAL/ABNORMAL ownership and the Controlled Flex-Assist Rule.
6. Freeze rescue/containment triggers using existing plant rules.
7. Brief crew, leader and observer from one common instruction sheet.
8. Freeze Support Neutrality definitions before results are seen.

## Minimum viable pilot record
For each meaningful exception capture: `time | exposure state | Op1 activity | Op2 activity | abnormality | owner | flex assist? | assist from/to | response start | extra helper? | helper role/reason | helper start/end | support class | displaced/delayed work | recovery complete | note`.

Also record actual staffing, running presses/major downtime, production plan/actual, breaks/relief, unusual maintenance and special conditions.

## Primary pilot question
**Can two operators sustain the frozen method while absorbing uneven abnormal demand through controlled internal flex, without hidden third-person labor, unacceptable delayed work, failed relief, or unrecovered backlog?**

## Best current strategy
1. **Now through Wednesday:** freeze roles, primary zones, qualifications, relief, abnormal ownership, flex-assist rule, rescue rules and observation definitions.
2. Scenario-walk the flex rule: alarm in one zone while the other operator is free; simultaneous demand; protected work due; abnormality during break; known two-person task.
3. **Thursday:** execute the frozen method. Keep primary ownership; use explicit flex transfer only when needed.
4. Timestamp flex assists, third-person interventions and exposure-state transitions; do not silently redistribute work.
5. Calculate Scheduled TPMH, Effective Labor/Adjusted TPMH, Independent Exposure %, incremental support people-minutes, flex-assist minutes and displaced/recovery work.
6. Pareto flex assists and ASSISTED/CONTAINED causes after the pilot.
7. Redesign zone boundaries/work allocation if borrowing is repeatedly one-way or causes protected-work risk.
8. Treat Thursday as one controlled exposure, not final proof; repeat across representative crews/conditions before permanent 2-op.

## Immediate next action
Before Thursday, add the **Controlled Flex-Assist Rule** to the scenario walkthrough and pilot instruction sheet. Walk at least one case where Op1 is busy and Op2 appears available. Require the team to state: who owns the event, whether Op2 is qualified/free to assist, what home-zone work could be displaced, how the transfer is communicated, and when Op2 returns.

## Risks / gaps
- No verified Thursday performance exists yet.
- Uncontrolled cross-zone helping can create random walking, duplicate response and abandoned home-zone work.
- Rigid zones can create local overload even when total two-person capacity appears adequate.
- Repeated one-way flex can hide a bad zone balance.
- Hidden third-person help can make a weak 2-op design appear successful.
- Break coverage can export work to Mold/Bladder/Team Lead; capture displaced work and recovery.
- Thursday may be unusually easy or difficult; retain production/mix/downtime context.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, shadow/rescue and relief assignments.
2. Demonstrated qualification matrix for critical tasks, including cross-zone tasks.
3. Frozen primary Op1/Op2 zone/route map.
4. Existing plant safety/quality priority, escalation, containment and stop rules.
5. Known one-person vs two-person tasks and scarce-support requirements.
6. Recent 3-op normal support examples by reason and people-minutes.
7. Break/meal plan and qualified relief source, including relief person's home-role work.
8. Thursday running-press exposure, product/mix, major press/gantry downtime and production plan/actual.
9. Event-level abnormal-response timestamps and actual hands-on/recovery labor.
10. Every flex assist and third-person intervention with people-minutes, reason, displaced work and recovery.
11. Protected-work due/completed/delayed/recovered observations.
12. Actual Curing people-hours and staffing/attendance for the pilot shift.
