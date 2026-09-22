# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Demand-State Exposure Coverage
A single 12-hour average can hide whether the 2-operator design was actually exposed to the conditions that matter. For each 15-minute window, retain running-press exposure, abnormal/event starts, protected/manual work state, and break/relief state. Pair those with saturation minutes, recovery debt, oldest pending work, outside-support people-minutes, and output/plan.

After Thursday, build an Exposure Coverage Matrix. Use observed distributions or historical quantiles to distinguish low, typical and higher exposure instead of inventing thresholds beforehand. If an important operating state was not experienced, label it NOT TESTED and seek that exposure in a later controlled run rather than extrapolating.

Interpretation: a clean low-demand shift demonstrates feasibility only for that exposure. Evidence becomes stronger when representative and higher-demand states are observed without persistent saturation, protected-work lateness, unrecovered debt or staffing substitution.

## Existing analysis retained
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
2. Verify qualification-gated coverage and protected-work ownership.
3. Freeze the matched historical comparison method before seeing Thursday's result.
4. Scenario-walk normal operation, breaks, simultaneous demand, flex assist, two-person tasks and interruption/recovery.
5. Run Thursday with timestamped exceptions, 15-minute workload windows, hourly plan-vs-actual, queue timing and saturation episodes.
6. Capture demand-state exposure context in every 15-minute window.
7. Build observed Op1/Op2 work-combination views and separate BASE from SURGE load.
8. Reconstruct recovery debt, route restoration, support displacement, qualification waits, saturation and deviations.
9. Build a Demand-State Exposure Coverage Matrix and mark unobserved critical states NOT TESTED.
10. Normalize for running press-hours, event demand, mix and downtime.
11. Diagnose capacity vs surge vs recovery vs motion/routing vs qualification vs relief vs equipment/process loss vs staffing substitution.
12. Change only the demonstrated constraint and repeat missing/representative exposure before permanent staffing change.

## Immediate next action
Add four exposure-context fields to the existing 15-minute pilot log: running presses/press-hours | abnormal/event starts | protected/manual work active | break/relief state. After Thursday, pair these with saturation, recovery debt, support and output to show exactly which demand states the 2-operator model actually experienced.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Exact plant-authorized containment/restart criteria and authority have not been supplied here.
- Alarm concurrency is a demand proxy, not operator work interference.
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
6. Frozen Op1/Op2 zone/route map and primary/flex ownership.
7. Periodic/protected task list with real due-time/frequency requirements and ownership.
8. Existing abnormality detection/call, escalation and rescue/containment rules.
9. Thursday 15-minute running-press/press-hour exposure, event starts, protected/manual-work state and break/relief state, plus hourly plan/actual, mix and downtime.
10. Timestamped manual work, walking/retrieval, machine-auto exposure, queue, response, saturation, protected-work due/completion, qualification waits, deviations and route-restoration data.
11. Leader/flex/support people-minutes, reason, backlog effect and donor-role displacement/restoration.
12. Historical comparable-shift exposure distributions/quantiles, staffing, cured tires/plan, running press-hours, major downtime, alarm/event counts, mix, support condition and man-hours/TPMH.