# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Primary/Flex Ownership + Handoff Trigger
Two operators can lose capacity through duplicated response, cross-traffic and ambiguous ownership even when total labor content is feasible. Before the pilot, every press/zone and protected task should have a PRIMARY owner and a defined FLEX backup. The backup does not automatically respond just because an alarm exists; flex transfer is triggered only when the primary is already committed, a required task would otherwise wait, a two-person task is invoked, or plant containment requires support.

For each flex transfer, capture: time | demand | primary status | flex trigger | transfer/assist | handback time | consequence. This lets the pilot distinguish a true capacity shortage from poor dispatch/ownership. Repeated cross-zone flex calls identify a rebalance opportunity; repeated two-person overlap identifies a structural coverage requirement; duplicated response without a trigger is motion/coordination waste.

Do not invent response-time thresholds. Use plant-authorized rules and Thursday observations. Safety, quality and equipment-protection rules override experimental ownership.

## Existing analysis retained
- Demand-State Exposure Coverage: running-press exposure, event starts, protected/manual work state and break/relief state by 15-minute window; unobserved important states are NOT TESTED.
- Two-operator saturation exposure: timestamp when both operators are committed and additional required work cannot immediately be owned.
- Qualification-gated relief: count relief capacity only where actual qualifications are verified.
- Base vs surge load: separate manual, walk/retrieval, machine-auto, protected/periodic and abnormal/event work.
- Protected-work due-time visual control.
- Time-of-shift robustness: EARLY / MID / LATE / BREAK-RELIEF.
- Recovery debt: queue start, peak pending, oldest age, clear time and route-restored time.
- Plant containment requirements override the experiment; preserve evidence whenever independent 2-op exposure is lost.
- Leader/flex support: record reason, people-minutes, backlog effect, donor-role displacement and restoration.
- Standard-work conformance: record deviations, reason, workaround and consequence.
- Matched-condition comparator: compare Thursday with prior shifts using running press-hours, volume/plan, mix, downtime, events and known staffing/support.

## Best current strategy
1. Freeze people, zones, routes, qualifications, relief and plant-authorized reaction rules.
2. Assign PRIMARY/FLEX ownership for every press/zone and protected task; define observable flex triggers and handback.
3. Verify qualification-gated coverage and protected-work ownership.
4. Freeze the matched historical comparison method before seeing Thursday's result.
5. Scenario-walk normal operation, breaks, simultaneous demand, flex assist, two-person tasks and interruption/recovery.
6. Run Thursday with timestamped exceptions, 15-minute workload windows, hourly plan-vs-actual, queue timing and saturation episodes.
7. Capture demand-state exposure plus every flex transfer/assist and handback.
8. Build observed Op1/Op2 work-combination views and separate BASE from SURGE load.
9. Reconstruct recovery debt, route restoration, support displacement, qualification waits, saturation, deviations and ownership transfers.
10. Build a Demand-State Exposure Coverage Matrix and mark unobserved critical states NOT TESTED.
11. Normalize for running press-hours, event demand, mix and downtime.
12. Diagnose capacity vs surge vs recovery vs motion/routing vs ownership/dispatch vs qualification vs relief vs equipment/process loss vs staffing substitution.
13. Change only the demonstrated constraint and repeat missing/representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, mark every press/zone and protected task PRIMARY = Op1 or Op2 and FLEX = qualified backup. Scenario-walk at least one case where the primary is already occupied when another required demand appears, and verify who takes it, what triggers the transfer, and when ownership returns. Add flex-trigger and handback fields to the pilot exception log.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Exact plant-authorized containment/restart criteria and authority have not been supplied here.
- Alarm concurrency is a demand proxy, not operator work interference.
- Ambiguous ownership can create duplicate response, cross-traffic or unattended work and falsely look like insufficient staffing.
- Excessive cross-zone flex can hide an unbalanced route even if shift-average workload looks acceptable.
- No saturation on a low-demand Thursday would be under-exposure, not proof of staffing adequacy.
- A single shift can leave important demand-state combinations untested even if average TPMH looks good.
- Shift-average TPMH can hide late-shift deterioration or break-relief fragility.
- Hidden support can falsely validate staffing if donor-role displacement is not followed.
- Protected/periodic work can be silently deferred during alarms unless due work is visible.
- Relief/flex coverage is not proven until required qualifications are verified.
- Prior idle-time observations are not removable labor until base work, walking, machine-auto time and abnormal reserve are separated.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, observer, rescue/shadow and relief assignments.
2. Existing plant safety/quality/equipment containment and restart criteria and authority.
3. Floor leader's normal/protected responsibilities while assisting Curing.
4. Exact break/meal schedule and relief source/home-role responsibilities.
5. Verified qualification matrix plus one-person vs two-person task list.
6. Frozen Op1/Op2 zone/route map, PRIMARY/FLEX ownership and flex-trigger/handback rules.
7. Periodic/protected task list with real due-time/frequency requirements and ownership.
8. Existing abnormality detection/call, escalation and rescue/containment rules.
9. Thursday 15-minute running-press/press-hour exposure, event starts, protected/manual-work state and break/relief state, plus hourly plan/actual, mix and downtime.
10. Timestamped manual work, walking/retrieval, machine-auto exposure, queue, response, saturation, protected-work due/completion, qualification waits, deviations, ownership transfers and route-restoration data.
11. Leader/flex/support people-minutes, reason, trigger, backlog effect, handback and donor-role displacement/restoration.
12. Historical comparable-shift exposure distributions/quantiles, staffing, cured tires/plan, running press-hours, major downtime, alarm/event counts, mix, support condition and man-hours/TPMH.