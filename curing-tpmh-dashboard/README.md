# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project remains in **pilot-preparation / execution mode**. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Matched-Condition Pilot Comparator
A single Thursday shift can be badly confounded by press availability, tire mix, downtime, alarm/event demand and break conditions. Do **not** compare Thursday only with a plant-wide or three-month average and attribute the difference to 2-operator staffing.

Before judging the pilot, build a small reference set of prior **A-shift / comparable curing shifts** and rank matches using the operating conditions actually available: running press-hours, cured volume/plan, product or mold mix where available, major press/gantry downtime, alarm/event counts, shift length and known staffing/support conditions. Preserve every matching variable; do not cherry-pick a favorable historical shift.

### Comparison hierarchy
1. **Primary evidence:** Thursday's direct observations — safety/quality/process compliance, occupied operator-minutes, queues, backlog aging, relief debt, response/recovery, outside support and exposure states.
2. **Matched historical context:** compare Thursday TPMH/output/downtime with several closest-condition historical shifts, not one hand-picked shift.
3. **Broad baseline:** retain the existing three-month average only as context, not as the causal estimate of the staffing change.

### Interpretation rule
- If Thursday has materially easier machine/event exposure than the reference shifts, good TPMH is **not** sufficient proof of 2-op capability.
- If Thursday has harder exposure and the system remains current without hidden support, that is stronger evidence, but still one exposure.
- If TPMH changes while direct-work/backlog/support measures remain healthy, investigate equipment/mix/process effects before blaming or crediting staffing.
- If direct workload saturates and backlog/support rise under matched demand, the capacity-collision hypothesis becomes stronger.
- Record unmatched conditions explicitly; **poor comparability is a validation gap, not a failure or pass.**

This is a blocking/confounding control: the purpose is to reduce the chance that nuisance operating conditions are mistaken for a manpower effect. It does not create a statistical claim from one pilot shift.

## Workload Variability / Surge-Capacity Profile
Use 48 x 15-minute windows and tag NORMAL / BREAK-RELIEF / ABNORMAL-EVENT / DOWNTIME-RECOVERY. After Thursday, report combined observed Op1+Op2 occupied operator-minutes at median, P90, P95 and maximum, together with queue/backlog and support, overall and by operating state. Percentiles are diagnostic, not staffing thresholds.

For each window retain:
`window | state | Op1 occupied min | Op2 occupied min | walk/retrieval min | abnormal-response min | protected/periodic work min | break/relief state | queue/backlog start/peak/end | incremental support people-min | running presses | abnormal events | production context`

Use observed occupied minutes, not alarm duration, as the labor numerator. Available 2-op capacity is 30 operator-minutes per 15-minute window only when both operators are actually present; classify break/relief separately.

## Break-Relief Capacity Envelope
Treat breaks/meals as planned operating states. Capture break start/end, operator off floor, relief person/qualification, running presses, abnormal events, transferred work, backlog start/peak/handback, incremental support people-minutes and time to restore normal route. Keep displaced work visible as **relief debt** until completed. Classify INDEPENDENT / RECOVERED / ASSISTED / CONTAINED / NOT-EXPOSED.

## Trigger-Based Abnormal Response Ladder
Use the existing plant-authorized response chain:
**NORMAL ROUTE → ABNORMALITY VISIBLE/CALLED → PRIMARY OWNER → FLEX OWNER WHEN REQUIRED → FLOOR LEADER → CONTAINMENT/RESCUE → BACKLOG RECOVERY → NORMAL ROUTE**

For meaningful abnormalities retain timestamps for visibility/call, owner arrival, flex/leader/rescue, competing work, backlog created and route restoration. Separate detection, ownership, capacity-collision and recovery failures.

## Hour-by-Hour Demand-to-Capacity Board
For each hour capture:
`Hour | Plan | Actual | Running presses | Abnormal events | Op1 direct work min | Op2 direct work min | Walk/retrieval min | Queue episodes | Oldest backlog | Relief/support min | Independent 2-op min | Major cause`

## Pilot Exposure Coverage Matrix
Track critical states as **OBSERVED-INDEPENDENT / OBSERVED-ASSISTED / CONTAINED / NOT-EXPOSED**. Include normal running, break/meal coverage, simultaneous abnormal demand, two-person-task demand, major gantry/press downtime, interruption/recovery, incremental outside support and late-shift operation. NOT-EXPOSED remains a validation gap.

## Pre-Pilot Readiness Gate
Use **GO / GO-WITH-CONTAINMENT / NOT-READY**. Freeze: (A) standard work/ownership, (B) qualified capacity, (C) abnormal-response rules, (D) relief/handoff, and (E) measurement. Existing plant safety, quality and process requirements remain authoritative.

## Pilot Intervention Firewall
Observer records facts/timestamps and does not coach. Floor leader retains normal plant authority. Rescue/shadow intervenes only under existing rules or agreed containment. Classify interventions **BASELINE-NORMAL / INCREMENTAL-2OP / OBSERVER-INFLUENCED / CONTAINMENT-RESCUE / AMBIGUOUS** and retain people-minutes.

## Protected-Work Backlog Aging
For periodic/protected work retain real due time. Track `task | zone | due | pending since | owner | reason displaced | start | complete | helper`. Review pending count, oldest age, overdue work, break/abnormality backlog and independent vs assisted clearance.

## Qualified Capacity Matrix
Map critical/event-driven tasks against Op1, Op2 and relief: **I = independently qualified, A = assist only, N = not qualified/authorized, ? = not verified**. Flag single-point skills, relief gaps and two-person tasks.

## Demand-Normalized Work Content
Separate fixed/periodic work, event-driven work, motion/retrieval and support/relief. Retain running press-hours, production volume and relevant event counts so a quiet or difficult Thursday is not generalized into permanent staffing.

## Best current strategy
1. Complete readiness Gates A–E and freeze people, zones, routes, qualifications, relief and plant-authorized reaction rules.
2. Freeze break/meal coverage and protected-work ownership; verify relief qualifications and handoff/handback.
3. **Preselect the matched historical comparison method and required fields before seeing Thursday's result.**
4. Scenario-walk break + abnormality, simultaneous demand, flex assist and two-person tasks.
5. Run Thursday with continuous exception logging, exposure-state tracking, reaction timestamps, break-window records and hourly plan-vs-actual control.
6. Capture 15-minute workload windows and tag each by operating state.
7. Reconstruct occupancy, queues, backlog aging, relief debt, support and route restoration.
8. Normalize against running press-hours, event demand, mix and downtime; compare Thursday with several closest-condition historical shifts.
9. Diagnose whether the limiting condition is persistent capacity, surge response, detection/ownership, skill, motion/routing, relief, recovery, equipment/process loss or support dependency.
10. Pareto observed causes and change only the demonstrated constraint; repeat representative/missing exposure before recommending permanent staffing change.

## Immediate next action
**Build the matched-condition reference table before Thursday.** Pull several prior A-shift/comparable curing shifts and capture: `date/shift | staffing | cured tires | plan | running press-hours | major downtime | alarm/event count | mix indicator | support condition | TPMH/man-hours`. Freeze the matching logic before Thursday's outcome is known. If some fields are unavailable, mark them missing rather than estimating them.

## Risks / gaps
- No verified Thursday performance exists yet.
- A single shift can confound staffing with press availability, product/mold mix, downtime and abnormal-event demand.
- Shift/hour averages can hide brief overload, recovery debt and mura.
- Alarm duration cannot substitute for hands-on operator work time.
- Observer sampling can miss short work bursts; timestamps and exception logging are needed.
- A 2-op design may appear feasible during full attendance but fail during normal break/meal states.
- Unqualified relief or hidden third-person assistance can falsely validate the staffing model.
- Undefined abnormal-response ownership can make hesitation look like insufficient manpower.
- Historical matching reduces confounding but does not turn one pilot into causal proof.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, observer, rescue/shadow and relief assignments.
2. Exact break/meal schedule and whether breaks are staggered or overlapping.
3. Relief source, qualifications and normal home-role responsibilities.
4. Verified qualification matrix and one-person vs two-person task list.
5. Frozen Op1/Op2 zone/route map and primary/flex ownership.
6. Periodic/protected task list with actual due-time/frequency requirements.
7. Existing plant abnormality detection/call, escalation and rescue/containment rules.
8. Thursday hourly production plan, actual production, running-press exposure, mix and downtime.
9. Timestamped operator occupied-work, walking/retrieval, break handoff/handback, abnormality response, queue/backlog, support and route-restoration data.
10. **Historical shift-level reference data:** date/shift, staffing, cured tires/plan, running press-hours, major downtime, alarm/event counts, mix indicator, support condition and man-hours/TPMH.