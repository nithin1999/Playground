# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Route Burden & Point-of-Use Motion Gate
The tricycle rejection makes walking reduction a process-design requirement rather than a transportation workaround. Before locking Op1/Op2 zones, create an actual-path spaghetti map for recurring routes and abnormal responses and convert travel into operator-minutes by route frequency. Standardized Work Charts should show operator movement and material locations, while the Combination Table separates manual work, walking and machine processing.

### Motion logic
1. **MAP ACTUAL PATHS** — trace Op1/Op2 walking during representative normal work, alarms, checks, GIP/scan, manual load/unload, bladder support, breaks and supply/tool retrieval.
2. **COUNT TRIPS, NOT JUST DISTANCE** — burden = observed route time × observed frequency. A short high-frequency trip can consume more capacity than a long rare trip.
3. **CLASSIFY PURPOSE** — required process travel, abnormal-response travel, retrieval/search, information/checking, relief/break travel, and avoidable backtracking.
4. **REMOVE BEFORE REBALANCING** — attack search/retrieval, duplicate checks and backtracking with point-of-use tools/materials, visual status, route sequence and staging before assigning the remaining work to two operators.
5. **RECALCULATE ZONES** — weight Op1/Op2 zones using remaining travel + manual work + abnormal exposure; do not split by equal press count.
6. **VALIDATE RESIDUAL MOTION** — carry remaining travel into each operator's capacity envelope and shadow-pilot observation. Do not assume a motion saving until it is observed.

### Evidence rule
Walking is not automatically removable waste: some travel is necessary to operate and respond safely. Only observed eliminated or shortened travel may be credited as capacity improvement. Proposed point-of-use changes remain hypotheses until measured.

## Best current strategy
1. Map actual recurring and abnormal-response routes; quantify trip frequency and travel time.
2. Remove avoidable motion, retrieval/search and point-of-use gaps; verify the reduction at gemba.
3. Demand-weight Op1/Op2 zones by remaining manual work + travel + abnormal exposure, not equal press count.
4. Build individual Operator-Minute Capacity Envelopes and preserve variability/collision reserve.
5. Build demonstrated skill-readiness and time-phased qualified relief coverage.
6. Freeze NORMAL routes, protected-work priorities and NORMAL → CONSTRAINED → SATURATED → RECOVERY states.
7. Use the abnormal-response clock: signal → acknowledge → arrival → hands-on → containment → recovery.
8. Use a visible abnormality queue: approved criticality first, FIFO within equal priority, named owner, waiting age and escalation state.
9. Account for break-relief debt and relief home-role recovery labor.
10. Use leader standard work, process confirmation and pre-pilot scenario challenge.
11. Collect context-characterized 3-op baseline with running-press exposure, operator states, route burden and hands-on abnormal work.
12. Build an Exposure Signature for each baseline/shadow window.
13. Freeze GO / HOLD-REDESIGN / STOP-CONTAIN decision criteria before seeing shadow results.
14. Freeze the Shadow Rescue Intervention Protocol and intervention taxonomy before the first shadow window.
15. Run controlled shadow 2-op; the qualified third operator is rescue capacity, not invisible production capacity.
16. Log every call, queue decision, response, coaching/rescue intervention and outside-support people-minute.
17. Classify each window against the predeclared decision gate; rescued windows are stress-test evidence, not independent 2-op proof.
18. Compare exposure-matched/stratified 3-op vs shadow 2-op windows; retain unmatched stress windows.
19. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
20. Compare response/queue distributions, route burden, reserve, saturation, collisions, skill/coverage gaps, protected work, relief debt, recovery and time-of-shift behavior.
21. Pareto exceptions, redesign, and repeat across representative A/B/C/D conditions before true 2-op.
22. Move to true 2-op only after representative evidence shows operation without hidden third-person labor/coaching, recurring response/coverage failure, protected-work failure, missed relief, persistent queue/backlog, dispatch ambiguity, excessive residual motion, or an impractical work method.

## Immediate next action
Before freezing Op1/Op2 zones, run a **Route Burden Study** during the next representative 3-op baseline. On a press-area layout, trace actual paths and log: timestamp, operator/role, origin, destination, purpose, trigger, one-way/round-trip, travel seconds, retrieval/search seconds, task hands-on seconds, abnormality ID if applicable, and whether the trip was required or potentially avoidable. Summarize by route as trips/shift × median observed travel time to identify the highest operator-minute motion burden. Test point-of-use or route-sequence changes on the largest avoidable burdens, then remeasure before crediting savings.

## Risks / gaps
- Tricycle rejection means the staffing concept cannot depend on powered personal transport; residual walking must fit the work design.
- Equal press-count zones can be badly unbalanced if route length/frequency and abnormal exposure differ.
- A spaghetti map without frequency can overemphasize visually long but rare routes.
- Walking is not automatically waste; required safe travel must remain in the capacity model.
- Alarm duration can badly misrepresent labor demand; response phases must be timestamped separately.
- A two-operator system can meet production while response queues or displaced required work accumulate.
- Without visible dispatch, simultaneous abnormalities can cause cherry-picking, duplicated response, forgotten calls or ambiguous ownership.
- Shadow presence can create a support effect and make a weak design look self-sustaining.

## Data still needed
1. Press-area layout with actual operator paths, point-of-use tool/material locations and key destinations.
2. Route-level trip frequency, travel time, retrieval/search time and purpose by operator/role and shift condition.
3. Existing plant safety/quality/response stop, containment, priority and escalation rules, including any approved response-time expectations.
4. Event-level signal/acknowledge/queue/arrival/hands-on/containment/recovery timestamps for representative abnormalities.
5. Simultaneous-event observations showing queue order, dispatch decision, owner, wait age and outcome.
6. Proposed Op1/Op2/leader/shadow/relief roles and demonstrated task qualifications.
7. Recurring work-element times/frequencies and proposed zone ownership.
8. Protected-work due windows, priorities and two-person/external-support tasks.
9. Actual break windows, relief source, relief home-role demand, recovery and carryover.
10. Running press-hours/cycles, product/mix, major press/gantry downtime and short-interval plan/actual production.
11. All shadow coaching/rescue/outside-support people-minutes by intervention class and reason.
12. Actual Curing people-hours, attendance/call-ins and staffing by role/crew.
13. Enough baseline/shadow windows across comparable and stress conditions to separate staffing effects from exposure, mix, downtime and special causes.
