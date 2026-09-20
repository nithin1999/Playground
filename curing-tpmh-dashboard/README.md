# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Visible Abnormality Queue & Dispatch Standard
The response clock now needs a visible queue/dispatch rule for overlapping abnormalities. In a two-operator machine-intensive system, recording response times after the fact is not enough: when multiple calls exist, operators need an unambiguous way to see what is waiting, who owns each event, and what must be handled first.

### Dispatch logic
1. **MAKE DEMAND VISIBLE** — every active abnormality appears on one visual queue with press, signal time, condition class, owner and current state.
2. **PRIORITIZE BY APPROVED CRITICALITY** — existing safety, quality and plant containment requirements override ordinary sequence. Do not invent criticality thresholds.
3. **FIFO WITHIN THE SAME PRIORITY** — for equivalent-priority work, oldest waiting event is normally next so work is not silently buried or cherry-picked.
4. **ONE OWNER / ONE BACKUP** — one operator owns each event; the other maintains the normal route unless dispatched, qualified backup is required, or the reaction standard requires two people.
5. **AGE THE QUEUE VISIBLY** — track waiting age from signal/acknowledge through response. Queue age is evidence for capacity/dispatch analysis, not an invented pass/fail limit.
6. **ESCALATE / RECOVER** — use approved plant reaction rules when capacity is exceeded; after containment, displaced protected work and relief debt remain visible until recovered.

### Evidence rule
Same-minute alarm starts are only a proxy for potential collision. A queue is not proven manageable until event-level observation shows the operators can prioritize, respond and recover without hidden support, unsafe delay, missed quality/protected work, or persistent carryover. Do not use FIFO blindly when safety/quality criticality requires a different response.

## Best current strategy
1. Map recurring work/travel and remove avoidable motion and point-of-use gaps.
2. Demand-weight Op1/Op2 zones by work content + travel + abnormal exposure, not equal press count.
3. Build individual Operator-Minute Capacity Envelopes and preserve variability/collision reserve.
4. Build demonstrated skill-readiness and time-phased qualified relief coverage.
5. Freeze NORMAL routes, protected-work priorities and NORMAL → CONSTRAINED → SATURATED → RECOVERY states.
6. Implement the abnormal-response clock: signal → acknowledge → arrival → hands-on → containment → recovery.
7. **Add a visible abnormality queue: approved criticality first, FIFO within equal priority, named owner, waiting age and escalation state.**
8. Account for break-relief debt and relief home-role recovery labor.
9. Use leader standard work, process confirmation and pre-pilot scenario challenge.
10. Collect context-characterized 3-op baseline with running-press exposure, operator states and hands-on abnormal work.
11. Build an Exposure Signature for each baseline/shadow window.
12. Freeze GO / HOLD-REDESIGN / STOP-CONTAIN decision criteria before seeing shadow results.
13. Freeze the Shadow Rescue Intervention Protocol and intervention taxonomy before the first shadow window.
14. Run controlled shadow 2-op; the qualified third operator is rescue capacity, not invisible production capacity.
15. Log every call, queue decision, response, coaching/rescue intervention and outside-support people-minute.
16. Classify each window against the predeclared decision gate; rescued windows are stress-test evidence, not independent 2-op proof.
17. Compare exposure-matched/stratified 3-op vs shadow 2-op windows; retain unmatched stress windows.
18. Calculate scheduled TPMH, Effective Labor Hours, Support Burden and Adjusted TPMH.
19. Compare response/queue distributions, reserve, saturation, collisions, skill/coverage gaps, protected work, relief debt, recovery and time-of-shift behavior.
20. Pareto exceptions, redesign, and repeat across representative A/B/C/D conditions before true 2-op.
21. Move to true 2-op only after representative evidence shows operation without hidden third-person labor/coaching, recurring response/coverage failure, protected-work failure, missed relief, persistent queue/backlog, dispatch ambiguity, or an impractical work method.

## Immediate next action
Add a **Visible Abnormality Queue** to the next 3-operator baseline alongside the Abnormal Response Log. For each active event capture: event/press, signal time, condition/approved priority class, acknowledge time, owner, queue-enter time, response/arrival time, queue-exit reason, hands-on start/end, containment, recovery complete, second-person need, support people-minutes, displaced protected work and workload state. During simultaneous events, record why one event was selected ahead of another. Use existing plant safety/quality/containment priorities; where no approved priority exists, flag the rule gap instead of inventing one.

## Risks / gaps
- Alarm duration can badly misrepresent labor demand; response phases must be timestamped separately.
- A two-operator system can meet production while response queues or displaced required work accumulate.
- Without visible dispatch, simultaneous abnormalities can cause cherry-picking, duplicated response, forgotten calls or ambiguous ownership.
- FIFO cannot override safety/quality criticality; the plant's approved reaction hierarchy is still needed.
- Poor signaling/visibility can force wasteful patrol and travel in a machine-intensive process.
- Shadow presence can create a support effect and make a weak design look self-sustaining.
- Total two-person capacity can hide an individually saturated zone or qualification-constrained task.

## Data still needed
1. Existing plant safety/quality/response stop, containment, priority and escalation rules, including any approved response-time expectations.
2. Event-level signal/acknowledge/queue/arrival/hands-on/containment/recovery timestamps for representative abnormalities.
3. Simultaneous-event observations showing queue order, dispatch decision, owner, wait age and outcome.
4. Baseline distributions for response and queue phases where plant limits do not exist.
5. Proposed Op1/Op2/leader/shadow/relief roles and demonstrated task qualifications.
6. Candidate press-to-zone map, routes, recurring work-element times/frequencies and travel times.
7. Protected-work due windows, priorities and two-person/external-support tasks.
8. Actual break windows, relief source, relief home-role demand, recovery and carryover.
9. Running press-hours/cycles, product/mix, major press/gantry downtime and short-interval plan/actual production.
10. All shadow coaching/rescue/outside-support people-minutes by intervention class and reason.
11. Actual Curing people-hours, attendance/call-ins and staffing by role/crew.
12. Enough baseline/shadow windows across comparable and stress conditions to separate staffing effects from exposure, mix, downtime and special causes.
