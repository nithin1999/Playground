# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Base Load vs Surge Load Separation
Do not use one overall utilization percentage to size the two-operator system. Curing is machine-intensive and event-driven: automatic machine time can create apparent idle time that is actually the reserve needed for alarms, protected work, walking and recovery.

Build a Standardized Work Combination view for Op1 and Op2 from observed pilot data, separating: (1) repeatable manual work, (2) walking/retrieval, (3) automatic machine time, (4) protected/periodic work, and (5) abnormal/event work. First establish each operator's BASE LOAD from repeatable manual + walk + time-normalized protected work. Then layer observed SURGE LOAD from alarms, simultaneous demand, breaks and recovery debt. Keep machine automatic time visible but do not count it as operator labor.

Use the result as a capacity envelope rather than a single average-utilization target. A two-operator design is stronger when normal work fits with observable reserve and the measured surge demand can be recovered without recurring staffing substitution. A low average utilization by itself is not proof that an operator can be removed; conversely, short high-load periods are not failure if the system independently recovers without overdue protected work or unacceptable backlog.

## Existing analysis retained
- Protected-work due-time visual control: task | owner | due/interval | NEXT/DUE/OVERDUE | completed | displaced by | recovered.
- Time-of-shift robustness: analyze EARLY / MID / LATE / BREAK-RELIEF using the existing timestamps.
- Recovery debt: preserve queue start, peak pending, oldest age, clear time and route-restored time; calculate pending-work x minutes as a diagnostic.
- HOLD/containment: plant Safety, Quality and equipment-protection requirements override the experiment. If independent 2-op exposure is lost, contain, timestamp, preserve evidence, classify and restart only under authorized conditions.
- Leader/flex support: record reason, people-minutes, backlog effect, donor-role displacement and restoration; distinguish planned support, surge capacity, staffing substitution and containment.
- Standard-work conformance: record deviations, reason, workaround and consequence.
- Matched-condition comparator: compare Thursday with prior shifts using running press-hours, volume/plan, mix, downtime, events and known staffing/support.

## Best current strategy
1. Freeze people, zones, routes, qualifications, relief and plant-authorized reaction rules.
2. Convert verified periodic/protected work into a visible owner + due-time queue.
3. Predefine HOLD/containment and leader/flex reserve responsibilities.
4. Freeze the matched historical comparison method before seeing Thursday's result.
5. Scenario-walk breaks, simultaneous demand, flex assist, two-person tasks, protected-work interruption/recovery and one HOLD/restart case.
6. Run Thursday with timestamped exceptions, 15-minute workload windows, hourly plan-vs-actual, queue start/clear and explicit break-relief observations.
7. Build Op1/Op2 Standardized Work Combination views from observed data: manual, walk/retrieval, machine-auto, protected work and abnormal/event work.
8. Separate BASE LOAD from SURGE LOAD; do not use average idle/utilization alone to justify staffing.
9. After abnormal response, check due protected work, recover backlog, then restore the normal route.
10. Reconstruct recovery debt, route restoration, support displacement and standard-work deviations.
11. Stratify evidence EARLY / MID / LATE / BREAK-RELIEF and normalize for running press-hours, event demand, mix and downtime.
12. Diagnose capacity vs surge vs recovery vs motion/routing vs skill vs relief vs equipment/process loss vs staffing substitution.
13. Change only the demonstrated constraint and repeat representative/missing exposure before permanent staffing change.

## Immediate next action
Prepare a blank Op1/Op2 work-combination sheet before Thursday with five categories: manual, walk/retrieval, machine-auto, protected/periodic and abnormal/event. Populate it only from observed pilot timestamps. After the shift, calculate normal base load separately from abnormal surge exposure and identify where walking or sequence changes could create reserve capacity.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- Exact plant-authorized stop/restart criteria and authority have not been supplied here.
- Alarm concurrency is a demand proxy, not operator work interference.
- A single shift can confound staffing with press availability, mix, downtime and event demand.
- Shift-average TPMH can hide late-shift deterioration or break-relief fragility.
- A quiet shift may under-expose collision combinations; NOT OBSERVED is not PASS.
- Hidden support can falsely validate staffing if donor-role displacement is not followed.
- Protected/periodic work can be silently deferred during alarms unless due work is visible.
- The prior idle-time observation must not be interpreted as removable labor until repeatable base work, walking, machine-auto time and abnormal reserve are separated.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, observer, rescue/shadow and relief assignments.
2. Existing plant safety/quality/equipment hard-stop criteria, containment authority and restart authority.
3. Floor leader's normal/protected responsibilities while assisting Curing.
4. Exact break/meal schedule and relief source/qualifications/home-role responsibilities.
5. Verified qualification matrix and one-person vs two-person task list.
6. Frozen Op1/Op2 zone/route map and primary/flex ownership.
7. Periodic/protected task list with real due-time/frequency requirements and ownership.
8. Existing abnormality detection/call, escalation and rescue/containment rules.
9. Thursday hourly plan/actual, running-press exposure, mix and downtime across the full shift.
10. Timestamped manual work, walking/retrieval, machine-auto exposure, queue, response, HOLD, protected-work due/completion, deviations and route-restoration data.
11. Leader/flex/support people-minutes, reason, backlog effect and donor-role displacement/restoration.
12. Historical comparable-shift staffing, cured tires/plan, running press-hours, major downtime, alarm/event counts, mix, support condition and man-hours/TPMH.