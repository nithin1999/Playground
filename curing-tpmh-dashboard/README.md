# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Time-of-Shift Robustness Gate
A 12-hour staffing design should not be accepted from shift-average performance alone. Add time-of-shift stratification to determine whether the 2-operator method remains stable late in the shift and around break/meal periods rather than masking deterioration inside a good average.

### Robustness logic
1. **TIME-BLOCK THE SHIFT** — use fixed clock blocks consistently across baseline and pilot (for example plant-defined work/break periods or equal-duration blocks). Do not choose favorable windows after seeing results.
2. **KEEP EXPOSURE VISIBLE** — within each block retain running-press exposure, mix, downtime and abnormal demand so time-of-shift is not confused with a production-condition change.
3. **COMPARE STABILITY** — by block compare route/travel burden, abnormal-response waiting/Queue-Minutes, hands-on and recovery people-minutes, protected-work completion, relief debt, outside support and production performance.
4. **FLAG DRIFT, DO NOT DIAGNOSE IT** — worsening late-shift response, motion, backlog or errors is evidence for investigation; do not label fatigue as the cause without supporting evidence.
5. **PROTECT RELIEF** — a staffing model that works only by delaying/skipping breaks or by accumulating relief debt is not independent 2-op proof.
6. **NO INVENTED THRESHOLDS** — use existing plant requirements and baseline/pilot distributions to set decision limits; do not manufacture a late-shift degradation tolerance.

### Evidence rule
A favorable whole-shift TPMH or average response time cannot by itself prove robust 2-operator operation. The method must remain controlled across representative time blocks, especially break/meal windows and the later portion of a 12-hour shift, without hidden support, unrecovered backlog or required-work failure.

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
11. Add a Time-of-Shift Robustness Gate: compare capacity, queue, motion, protected work, relief and support consistently across shift blocks.
12. Use leader standard work, process confirmation and pre-pilot scenario challenge.
13. Collect context-characterized 3-op baseline with running-press exposure, operator states, route burden, hands-on abnormal work, queue behavior and time-block context.
14. Build an Exposure Signature for each baseline/shadow window.
15. Freeze GO / HOLD-REDESIGN / STOP-CONTAIN decision criteria before seeing shadow results.
16. Freeze the Shadow Rescue Intervention Protocol and intervention taxonomy before the first shadow window.
17. Run controlled shadow 2-op; the qualified third operator is rescue capacity, not invisible production capacity.
18. Log every call, queue decision, response, coaching/rescue intervention and outside-support people-minute.
19. Classify each window against the predeclared decision gate; rescued windows are stress-test evidence, not independent 2-op proof.
20. Compare exposure-matched/stratified 3-op vs shadow 2-op windows; retain unmatched stress windows.
21. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
22. Compare response/queue distributions, Queue-Minutes, route burden, reserve, saturation, collisions, skill/coverage gaps, protected work, relief debt, recovery and time-of-shift behavior.
23. Pareto exceptions, redesign, and repeat across representative A/B/C/D conditions before true 2-op.
24. Move to true 2-op only after representative evidence shows operation without hidden third-person labor/coaching, recurring response/coverage failure, protected-work failure, missed relief, persistent queue/backlog, dispatch ambiguity, excessive residual motion, late-shift deterioration requiring support, or an impractical work method.

## Immediate next action
During the next representative 3-op baseline, add **fixed time-block tags** to the existing response/queue observation. For every block summarize running-press exposure, abnormal events, Queue-Minutes, oldest wait, hands-on/recovery people-minutes, route/travel burden, protected-work completion, breaks/relief debt, outside support and production. Use the identical clock-block definitions later during shadow 2-op. Plot Queue-Minutes and response waiting by time block beside breaks and workload state. Investigate any systematic deterioration; do not automatically attribute it to fatigue.

## Risks / gaps
- Whole-shift averages can hide late-shift or break-window overload.
- Time-of-shift effects can be confounded by mix, running presses, downtime and alarm demand; exposure must remain visible.
- Fatigue is a plausible risk on long shifts but cannot be inferred from slower response alone.
- Same-minute alarm counts contain no waiting-duration information.
- Queue time is not labor content; hands-on and recovery people-minutes must remain separate.
- Critical abnormalities must not be delayed merely to preserve FIFO.
- A two-operator system can meet production while response queues, relief debt or displaced required work accumulate.
- Shadow presence can create a support effect and make a weak design look self-sustaining.
- Tricycle rejection means residual walking must fit the work design.

## Data still needed
1. Event-level signal/queue-enter/response-start/hands-on/containment/recovery timestamps for representative abnormalities, with time-of-shift tags.
2. Actual break/meal timing, whether each break was on time, relief source, relief home-role demand and recovery/carryover.
3. Existing plant safety/quality/response stop, containment, priority and escalation rules, including any approved response-time expectations.
4. Simultaneous-event observations showing queue order, dispatch decision, owner, wait age and outcome.
5. Press-area layout with actual operator paths, point-of-use tool/material locations and key destinations.
6. Route-level trip frequency, travel time, retrieval/search time and purpose by operator/role and shift condition.
7. Proposed Op1/Op2/leader/shadow/relief roles and demonstrated task qualifications.
8. Recurring work-element times/frequencies and proposed zone ownership.
9. Protected-work due windows, priorities and two-person/external-support tasks.
10. Running press-hours/cycles, product/mix, major press/gantry downtime and short-interval plan/actual production by the same time blocks.
11. All shadow coaching/rescue/outside-support people-minutes by intervention class, reason and time block.
12. Actual Curing people-hours, attendance/call-ins and staffing by role/crew.
13. Enough baseline/shadow windows across comparable and stress conditions to establish response/queue/time-of-shift distributions and separate staffing effects from exposure, mix, downtime and special causes.
