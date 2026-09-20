# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Abnormal-Response Clock & Escalation Standard
The 2-operator design now needs a visible response clock for every abnormality. Alarm counts alone cannot show whether two operators can detect, travel to, diagnose, contain and recover from abnormalities without hidden support or protected-work failure.

For every abnormal event, separate the timeline into: **signal → acknowledge → arrival → hands-on start → containment → recovery complete**. Do not combine these into alarm duration. Record the operator/role owning each phase, any queueing behind another abnormality, outside-support people-minutes, and protected work displaced.

### Reaction logic
1. **DETECT** — machine/HMI/andon exposes the abnormality; avoid routine patrol where real-time signaling can direct attention.
2. **ACKNOWLEDGE / OWN** — one named operator accepts ownership; the other continues the defined normal route unless the reaction plan requires two people.
3. **RESPOND** — record travel/queue time separately from hands-on work.
4. **CONTAIN / ESCALATE** — use existing plant safety, quality and response requirements. Do not invent response-time limits.
5. **RECOVER** — abnormality is not operationally closed until displaced protected work, relief debt and recovery queue are controlled.

### Evidence rule
A fast alarm close does not prove a good 2-operator response if another required task was missed, support labor was hidden, or backlog accumulated. Conversely, long machine downtime does not prove high operator workload if the operator's hands-on demand was small. Evaluate response timeline, labor demand and displaced work together.

## Best current strategy
1. Map recurring work/travel and remove avoidable motion and point-of-use gaps.
2. Demand-weight Op1/Op2 zones by work content + travel + abnormal exposure, not equal press count.
3. Build individual Operator-Minute Capacity Envelopes and preserve variability/collision reserve.
4. Build demonstrated skill-readiness and time-phased qualified relief coverage.
5. Freeze NORMAL routes, single-owner ABNORMAL dispatch, protected-work priorities and NORMAL → CONSTRAINED → SATURATED → RECOVERY states.
6. **Implement the abnormal-response clock: signal → acknowledge → arrival → hands-on → containment → recovery.**
7. Account for break-relief debt and relief home-role recovery labor.
8. Use leader standard work, process confirmation and pre-pilot scenario challenge.
9. Collect context-characterized 3-op baseline with running-press exposure, operator states and hands-on abnormal work.
10. Build an Exposure Signature for each baseline/shadow window.
11. Freeze GO / HOLD-REDESIGN / STOP-CONTAIN decision criteria before seeing shadow results.
12. Freeze the Shadow Rescue Intervention Protocol and intervention taxonomy before the first shadow window.
13. Run controlled shadow 2-op; the qualified third operator is rescue capacity, not invisible production capacity.
14. Log every call, response, coaching/rescue intervention and outside-support people-minute.
15. Classify each window against the predeclared decision gate; rescued windows are stress-test evidence, not independent 2-op proof.
16. Compare exposure-matched/stratified 3-op vs shadow 2-op windows; retain unmatched stress windows.
17. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
18. Compare response-clock distributions, reserve, saturation, collisions, skill/coverage gaps, protected work, relief debt, recovery and time-of-shift behavior.
19. Pareto exceptions, redesign, and repeat across representative A/B/C/D conditions before true 2-op.
20. Move to true 2-op only after representative evidence shows operation without hidden third-person labor/coaching, recurring response/coverage failure, protected-work failure, missed relief, persistent backlog, dispatch ambiguity, or an impractical work method.

## Immediate next action
Add an **Abnormal Response Log** to the next 3-operator baseline before using it in a shadow 2-op window. For each abnormality capture: event ID/press, signal time, acknowledge time, owner, arrival time, hands-on start/end, containment time, recovery-complete time, queue reason, second-person need, support people-minutes, protected work displaced, and workload state. Use existing plant response/containment requirements as the reaction limits; leave limits blank where no approved standard exists.

## Risks / gaps
- Alarm duration can badly misrepresent labor demand; response phases must be timestamped separately.
- A two-operator system can meet production while response queues or displaced required work accumulate.
- Poor signaling/visibility can force wasteful patrol and travel in a machine-intensive process.
- Shadow presence can create a support effect and make a weak design look self-sustaining.
- If escalation rules are vague, response ownership can become ambiguous during simultaneous abnormalities.
- Total two-person capacity can hide an individually saturated zone or qualification-constrained task.

## Data still needed
1. Existing plant safety/quality/response stop, containment and escalation rules, including any approved response-time expectations.
2. Event-level signal/acknowledge/arrival/hands-on/containment/recovery timestamps for representative abnormalities.
3. Baseline distributions for response phases where plant limits do not exist.
4. Proposed Op1/Op2/leader/shadow/relief roles and demonstrated task qualifications.
5. Candidate press-to-zone map, routes, recurring work-element times/frequencies and travel times.
6. Protected-work due windows, priorities and two-person/external-support tasks.
7. Actual break windows, relief source, relief home-role demand, recovery and carryover.
8. Running press-hours/cycles, product/mix, major press/gantry downtime and short-interval plan/actual production.
9. All shadow coaching/rescue/outside-support people-minutes by intervention class and reason.
10. Actual Curing people-hours, attendance/call-ins and staffing by role/crew.
11. Enough baseline/shadow windows across comparable and stress conditions to separate staffing effects from exposure, mix, downtime and special causes.
