# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Abnormality Queue-Minutes Congestion Gate
Same-minute collision counts are useful screening evidence but do not measure whether two operators can absorb stochastic abnormal demand. Add a time-based congestion measure to the response clock and dispatch queue.

### Queue logic
1. **MEASURE WAITING LOAD** — Queue-Minutes = sum of each abnormality's waiting time before response starts. Equivalent interpretation: area under the waiting-queue-depth-versus-time curve.
2. **KEEP LABOR SEPARATE** — queue time is not hands-on labor. Continue measuring hands-on and recovery people-minutes separately.
3. **TRACK CONGESTION SHAPE** — record peak waiting queue depth, oldest waiting age, minutes with queue >0, and whether the queue clears before another event arrives.
4. **STRATIFY** — compare by zone, shift phase, break/non-break, production exposure and workload state so a pooled average does not hide local congestion.
5. **PRIORITIZE SAFELY** — approved plant safety/quality/containment criticality overrides sequence; FIFO applies only within equivalent priority.
6. **NO INVENTED LIMITS** — do not set a queue-age or Queue-Minute acceptance threshold until existing plant requirements and observed baseline/pilot distributions support one.

### Evidence rule
A collision is not automatically a staffing failure, and a low collision count is not proof of adequate staffing. The feasibility question is whether abnormalities create sustained waiting, hidden support, displaced required work, or unrecovered backlog.

## Best current strategy
1. Map actual recurring and abnormal-response routes; quantify trip frequency and travel time.
2. Remove avoidable motion, retrieval/search and point-of-use gaps; verify the reduction at gemba.
3. Demand-weight Op1/Op2 zones by remaining manual work + travel + abnormal exposure, not equal press count.
4. Build individual Operator-Minute Capacity Envelopes and preserve variability/collision reserve.
5. Build demonstrated skill-readiness and time-phased qualified relief coverage.
6. Freeze NORMAL routes, protected-work priorities and NORMAL → CONSTRAINED → SATURATED → RECOVERY states.
7. Use the abnormal-response clock: signal → acknowledge → arrival → hands-on → containment → recovery.
8. Use a visible abnormality queue: approved criticality first, FIFO within equal priority, named owner, waiting age and escalation state.
9. Calculate Queue-Minutes, peak waiting depth, oldest waiting age, time with queue >0 and queue-clear recovery.
10. Account for break-relief debt and relief home-role recovery labor.
11. Use leader standard work, process confirmation and pre-pilot scenario challenge.
12. Collect context-characterized 3-op baseline with running-press exposure, operator states, route burden, hands-on abnormal work and queue behavior.
13. Build an Exposure Signature for each baseline/shadow window.
14. Freeze GO / HOLD-REDESIGN / STOP-CONTAIN decision criteria before seeing shadow results.
15. Freeze the Shadow Rescue Intervention Protocol and intervention taxonomy before the first shadow window.
16. Run controlled shadow 2-op; the qualified third operator is rescue capacity, not invisible production capacity.
17. Log every call, queue decision, response, coaching/rescue intervention and outside-support people-minute.
18. Classify each window against the predeclared decision gate; rescued windows are stress-test evidence, not independent 2-op proof.
19. Compare exposure-matched/stratified 3-op vs shadow 2-op windows; retain unmatched stress windows.
20. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
21. Compare response/queue distributions, Queue-Minutes, route burden, reserve, saturation, collisions, skill/coverage gaps, protected work, relief debt, recovery and time-of-shift behavior.
22. Pareto exceptions, redesign, and repeat across representative A/B/C/D conditions before true 2-op.
23. Move to true 2-op only after representative evidence shows operation without hidden third-person labor/coaching, recurring response/coverage failure, protected-work failure, missed relief, persistent queue/backlog, dispatch ambiguity, excessive residual motion, or an impractical work method.

## Immediate next action
During the next representative 3-op baseline, add an **Abnormality Queue Log** to the response study. Capture timestamp/event, approved priority class, owner, queue-enter time, response-start time, hands-on end, recovery complete, support used, displaced work and workload state. From those timestamps calculate Queue-Minutes, peak waiting depth, oldest waiting age, minutes with queue >0 and whether the queue fully cleared. Plot waiting queue depth versus time alongside Op1/Op2 state. Use the same definitions later during shadow 2-op.

## Risks / gaps
- Same-minute alarm counts can understate or overstate staffing risk because they contain no waiting-duration information.
- Low average response time can hide a small number of long waits; retain distributions and oldest-age behavior.
- Queue time is not labor content; hands-on and recovery people-minutes must remain separate.
- Critical abnormalities must not be delayed merely to preserve FIFO.
- A two-operator system can meet production while response queues or displaced required work accumulate.
- Shadow presence can create a support effect and make a weak design look self-sustaining.
- Tricycle rejection means residual walking must fit the work design.

## Data still needed
1. Event-level signal/queue-enter/response-start/hands-on/containment/recovery timestamps for representative abnormalities.
2. Existing plant safety/quality/response stop, containment, priority and escalation rules, including any approved response-time expectations.
3. Simultaneous-event observations showing queue order, dispatch decision, owner, wait age and outcome.
4. Press-area layout with actual operator paths, point-of-use tool/material locations and key destinations.
5. Route-level trip frequency, travel time, retrieval/search time and purpose by operator/role and shift condition.
6. Proposed Op1/Op2/leader/shadow/relief roles and demonstrated task qualifications.
7. Recurring work-element times/frequencies and proposed zone ownership.
8. Protected-work due windows, priorities and two-person/external-support tasks.
9. Actual break windows, relief source, relief home-role demand, recovery and carryover.
10. Running press-hours/cycles, product/mix, major press/gantry downtime and short-interval plan/actual production.
11. All shadow coaching/rescue/outside-support people-minutes by intervention class and reason.
12. Actual Curing people-hours, attendance/call-ins and staffing by role/crew.
13. Enough baseline/shadow windows across comparable and stress conditions to establish response/queue distributions and separate staffing effects from exposure, mix, downtime and special causes.
