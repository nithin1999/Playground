# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project is in **pilot-preparation / execution mode**. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Skill-Coverage Gate / Qualified Capacity Matrix
Two operators are not automatically two interchangeable units of capacity. Before Thursday, map every critical/event-driven task against **Op1, Op2 and planned relief** using only demonstrated/authorized capability. Use simple states such as **I = independently qualified, A = may assist but not independently own, N = not qualified/authorized, ? = not verified**. Do not convert unknowns to qualified.

For each critical task, also record whether it is normally **one-person or two-person**, what support role is legitimately required, and whether it can occur during a break or simultaneous abnormality. Flag:
- **single-point skill** — only one of Op1/Op2 can independently perform it;
- **relief gap** — relief cannot independently cover a critical task belonging to the relieved operator;
- **two-person collision** — a legitimate two-person task consumes both operators while another required event can queue;
- **support dependency** — task structurally requires a third role even under normal staffing; classify this separately from 2-op staffing substitution.

This is a **pilot-readiness gate, not a pass/fail staffing threshold**. Existing plant training, safety, quality and authorization requirements govern qualification. Unknown qualification is a gap to verify, not permission to perform the task.

### Thursday skill evidence
For each queued or assisted abnormality, capture `task | required skill | primary operator | independently qualified? | flex operator qualified? | relief qualified? | skill gap contributed to wait? | support required?`.

Interpretation: if a queue occurs while one operator is physically available but not qualified to own the waiting task, classify it as **skill-constrained capacity**, not idle capacity and not automatically a headcount shortage. Repeated skill-constrained queues become a targeted cross-training opportunity, subject to plant authorization.

## Demand-Normalized Work Content
Separate observed operator work into fixed/periodic, event-driven, motion/retrieval and support/relief. Retain running press-hours, production volume and relevant event counts so a quiet or difficult Thursday is not generalized into permanent staffing.

## Operator Occupancy Timeline / Capacity Collision Analysis
For meaningful work intervals record or reconstruct:
`start | end | operator | zone | task/category | protected/abnormal/routine | primary/flex | walking/retrieval? | helper? | displaced work`

Plot Op1 and Op2 on a common time axis after the pilot. Overlay queue starts, break/relief periods, flex assists and incremental third-person help. A queue while both operators are genuinely committed is stronger evidence of a capacity collision. A queue while one operator is physically available requires checking **qualification first**, then ownership, visibility, routing, priority rules or measurement error.

## Abnormal-Demand Queue & Recovery Ledger
For every abnormality that cannot be started immediately, record:
`event time | zone | event/task | required skill | primary owner | operator already committed to | available qualified operator? | wait-to-response start | flex requested? | third-person help? | support class | response start | work complete | displaced/protected work | recovery complete`

Do **not** invent a maximum acceptable queue or response-time threshold before the pilot. Existing safety/quality/process response requirements remain authoritative. Calculate observed queue episodes, peak simultaneous unresolved required tasks, wait-to-response distribution, queue duration, recovery duration, flex-assist involvement and incremental support people-minutes.

## Hourly Pilot Production Control Board
Use one row per clock hour:
`hour | production plan | actual | cumulative gap | running presses / major downtime | queue/abnormality | exposure state | incremental help people-min | break/relief state | protected work due/completed | action | owner`

## Break-Relief Capacity Protection
For every break/meal record: `break start | operator relieved | qualified relief person | relief home role | critical skills covered? | home-role work deferred? | abnormality during relief? | extra help? | break end | backlog at handback | backlog cleared time`.

Use **COVERED**, **DEGRADED**, or **UNRELIEVED / CONTAINED**. Relief debt is required Curing or relief-home-role work displaced during relief that remains incomplete at handback.

## Dual-Mode Pilot Observation
**Mode A — continuous exception/event log:** timestamp abnormalities, flex assist, third-person intervention, exposure-state change, break/relief transition, delayed/protected work, rescue/containment, major downtime and recovery.

**Mode B — fixed 15-minute structured observation each hour:** observe both operators at a preselected clock window. Capture work category, walking/retrieval, waiting/monitoring, machine interaction, zone adherence, overlapping demand, relief state and carryover work. Do not move windows after seeing workload. Samples are diagnostic, not a claim of full-shift utilization.

## Pilot Process Confirmation Card
At each structured observation mark **YES / NO / NOT OBSERVABLE**:
1. Op1/Op2 follow frozen primary ownership unless a logged flex transfer is active.
2. Each abnormality has one clear primary owner.
3. Flex assist follows CALL → CHECK → TRANSFER → WORK → RETURN → RECOVER.
4. Break/meal handoff occurs as designed and relief debt remains visible until recovered.
5. Any third-person production assistance is logged with reason, support class and people-minutes.

## Controlled Flex-Assist Rule
Primary zones remain fixed. When uneven abnormal demand threatens due/protected work, use **CALL → CHECK → TRANSFER → WORK → RETURN → RECOVER**. The assisting operator must be independently qualified for transferred ownership, or remain within the plant-defined scope of an assist. Repeated one-way borrowing is evidence to rebalance zones.

## Support Neutrality Rule
Classify non-Op1/Op2 intervention as **BASELINE-NORMAL**, **INCREMENTAL-2OP**, **AMBIGUOUS**, or **CONTAINMENT/RESCUE** based on work/reason, not helper title. Incremental staffing-substitution people-minutes are charged to Effective Labor.

## Pilot Integrity Exposure States
- **INDEPENDENT 2-OP:** frozen method + normal baseline support only.
- **ASSISTED 2-OP:** incremental third-person staffing substitution occurs.
- **CONTAINED / NOT TESTABLE:** rescue/special cause means the frozen staffing concept is temporarily not being tested.

`Independent Exposure % = Independent 2-op minutes / observable pilot minutes × 100`

## Freeze before Thursday
Name Op1, Op2, floor leader and rescue/shadow; freeze zones/routes, protected work, **task-by-person qualified-capacity matrix**, break relief, NORMAL/ABNORMAL ownership, flex-assist, rescue rules, Support Neutrality definitions and observation windows. Verify critical-task qualification for Op1, Op2 and each planned relief person and identify what happens to relief personnel's home-role work.

## Best current strategy
1. Freeze roles, zones and a task-by-person **Qualified Capacity Matrix** before Thursday; unknown skill status remains a gap.
2. Identify single-point skills, two-person tasks, legitimate normal support dependencies and relief skill gaps.
3. Scenario-walk simultaneous demand, abnormality during break, relief handback, flex assist and a known two-person task.
4. Thursday: continuous exception logging + fixed 15 min/hour structured observations.
5. Build an evidence-backed Op1/Op2 occupancy timeline and overlay queue starts, breaks, flex assists and incremental help.
6. For every queue, distinguish **physical capacity collision vs skill-constrained capacity vs ownership/visibility/routing failure**.
7. Maintain the Queue & Recovery Ledger and hourly production control board; track relief debt and support people-minutes.
8. Calculate Scheduled TPMH, Effective Labor/Adjusted TPMH, Independent Exposure %, demand-normalized work content and collision/queue measures.
9. Pareto causes; target cross-training only where observed skill constraints justify it, and rebalance zones/routes/work elements where the evidence points there.
10. Repeat representative conditions before permanent 2-op staffing.

## Immediate next action
**Build and freeze the Qualified Capacity Matrix before Thursday.** Rows = critical/routine/event-driven Curing tasks; columns = Op1, Op2 and each planned relief person. Mark I/A/N/? from existing training/authorization evidence. Circle any row with fewer than two independently qualified Op1/Op2 resources and any task not independently covered during relief. Use those flagged rows in the pre-pilot scenario walk.

## Risks / gaps
- No verified Thursday performance exists yet.
- Physical availability is not the same as usable capacity when qualification differs.
- An unverified skill matrix can make a queue look like headcount overload when it is actually a cross-training/authorization constraint.
- Cross-training cannot be assumed or improvised during the pilot; plant authorization and safe training remain controlling.
- Alarm-start concurrency is only a demand proxy; it does not establish hands-on workload or overload.
- Continuous full-shift occupancy cannot be inferred from 15-minute samples.
- Shift-end TPMH can hide queues, backlog, delayed response or staffing substitution.
- Break coverage can export workload to another role or expose a skill gap.
- Thursday may be unusually easy or difficult; retain exposure context.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, shadow/rescue and relief assignments.
2. Demonstrated/authorized qualification matrix for critical/cross-zone tasks, including relief personnel.
3. Known one-person vs two-person tasks and legitimate normal support dependencies.
4. Frozen Op1/Op2 zone/route map.
5. Existing plant safety/quality priority, escalation, containment and stop rules.
6. Recent 3-op normal support examples by reason/people-minutes.
7. Exact break/meal plan, relief source, and relief source's home-role responsibilities.
8. Thursday hourly production plan plus running-press exposure, product/mix, downtime and actual production.
9. Observed/reliably timestamped Op1/Op2 task intervals, including walking/retrieval where captured.
10. Event-level abnormal-response timestamps and whether skill availability contributed to waiting.
11. Queue episodes, peak simultaneous unresolved required tasks, wait-to-response and recovery duration.
12. Break relief state, displaced work, relief debt and recovery time.
13. Flex assists and third-person interventions with people-minutes/recovery.
14. Protected-work due/completed/delayed/recovered observations.
