# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Break-Relief Coverage Debt
A 2-operator design must prove that scheduled breaks do not merely transfer Curing work to another role or postpone required work until the operator returns. Treat every break as a planned capacity-loss interval and reconcile the work displaced by it.

For every break/meal capture: break start/end | operator off route | qualified coverage source | coverage source home role | work accepted by relief | work deferred | oldest deferred age | outside-support people-minutes | donor-role work displaced | backlog at return | time normal route restored.

Define Break-Relief Coverage Debt as the required work deferred or displaced during the break plus any donor-role work displaced by relief. Do not invent a numeric pass threshold. The engineering test is whether required breaks occur as planned, qualified coverage is available, protected/abnormal work remains controlled, and both Curing and the donor role recover without hidden labor or persistent backlog.

Interpretation: repeated debt only during breaks = relief-system constraint; debt in the donor role = staffing substitution rather than a clean manpower saving; no debt but missed/shortened breaks = invalid staffing evidence; debt persisting after the operator returns = recovery-capacity issue.

## Existing analysis retained
- Event-Driven Dispatch Priority Ladder for competing work.
- PRIMARY/FLEX ownership + handoff trigger for every press/zone and protected task.
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
3. Freeze a plant-approved dispatch priority ladder for competing work; plant safety/quality/equipment rules override the experiment.
4. Verify qualification-gated coverage and protected-work ownership/due requirements.
5. Freeze the matched historical comparison method before seeing Thursday's result.
6. Scenario-walk normal operation, each break/meal, competing demands, simultaneous abnormalities, flex assist, two-person tasks and interruption/recovery.
7. Run Thursday with timestamped exceptions, 15-minute workload windows, hourly plan-vs-actual, queue timing and saturation episodes.
8. Reconcile every break: coverage source, Curing work deferred, donor-role displacement, backlog at return and route-restoration time.
9. Capture demand-state exposure plus every meaningful reprioritization, deferred-work recovery, flex transfer/assist and handback.
10. Build observed Op1/Op2 work-combination views and separate BASE from SURGE load.
11. Reconstruct recovery debt, break-relief coverage debt, route restoration, support displacement, qualification waits, saturation, deviations, ownership transfers and dispatch decisions.
12. Build a Demand-State Exposure Coverage Matrix and mark unobserved critical states NOT TESTED.
13. Normalize for running press-hours, event demand, mix and downtime.
14. Diagnose capacity vs surge vs recovery vs motion/routing vs dispatch/sequence vs qualification vs relief vs equipment/process loss vs staffing substitution.
15. Change only the demonstrated constraint and repeat missing/representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, scenario-walk every scheduled break/meal using the actual planned relief source. Verify the relief person's qualification, identify their home-role work, define what Curing work they can accept, and define how deferred work and donor-role displacement will be made visible and recovered. A break that is skipped, shortened, covered by unplanned labor, or creates unrecovered donor-role backlog must not be counted as clean evidence for the 2-operator model.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Exact plant-authorized containment/restart criteria and authority have not been supplied here.
- Alarm concurrency is a demand proxy, not operator work interference.
- PRIMARY/FLEX ownership alone does not resolve which competing task should be done first.
- Break relief can falsely validate 2-operator staffing if it shifts labor/backlog into the leader, mold, gantry or another donor role.
- A pilot with skipped or shortened breaks would understate the labor required for a sustainable 12-hour staffing model.
- Unclear dispatch priority can create unnecessary task switching, walking, duplicate response or silent protected-work deferral and falsely resemble insufficient staffing.
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
2. Existing plant safety/quality/equipment containment, abnormal-response priority, restart criteria and authority.
3. Floor leader's normal/protected responsibilities while assisting Curing.
4. Exact break/meal schedule, actual break start/end, relief source, qualifications and relief person's home-role responsibilities.
5. Verified qualification matrix plus one-person vs two-person task list.
6. Frozen Op1/Op2 zone/route map, PRIMARY/FLEX ownership and flex-trigger/handback rules.
7. Periodic/protected task list with real due-time/frequency requirements, ownership and any plant-defined priority.
8. Existing abnormality detection/call, escalation, dispatch priority and rescue/containment rules.
9. Thursday 15-minute running-press/press-hour exposure, event starts, protected/manual-work state and break/relief state, plus hourly plan/actual, mix and downtime.
10. Timestamped manual work, walking/retrieval, machine-auto exposure, queue, response, saturation, protected-work due/completion, qualification waits, deviations, ownership transfers, reprioritizations, deferred-work recovery and route-restoration data.
11. Break-relief coverage source, outside-support people-minutes, Curing backlog at return, donor-role work displaced and donor-role restoration time.
12. Historical comparable-shift exposure distributions/quantiles, staffing, cured tires/plan, running press-hours, major downtime, alarm/event counts, mix, support condition and man-hours/TPMH.