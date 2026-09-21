# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project remains in **pilot-preparation / execution mode**. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Workload Variability / Surge-Capacity Profile
The 15-minute grid should measure not only average loading and isolated saturation, but **mura (unevenness)** across the shift. After Thursday, calculate the distribution of combined observed Op1+Op2 occupied operator-minutes by 15-minute window and report median, P90, P95 and maximum, together with queue/backlog and support. Stratify the same profile by **normal running / break-relief / abnormal-event / downtime-recovery** state.

Do not use an arbitrary percentile or utilization value as a staffing pass/fail limit. The purpose is diagnostic: distinguish a continuously high workload from a generally manageable workload with short surges. If high-demand windows are concentrated in identifiable abnormal states, test flex/leader response, cross-training, route reduction or relief design before concluding that a permanent third curing operator is required. If loading and backlog remain broadly elevated across normal-running windows, the permanent capacity hypothesis becomes stronger.

For each 15-minute window retain:
`window | state | Op1 occupied min | Op2 occupied min | walk/retrieval min | abnormal-response min | protected/periodic work min | break/relief state | queue/backlog start/peak/end | incremental support people-min | running presses | abnormal events | production context`

Use **observed occupied minutes**, not alarm duration, as the labor numerator. Available 2-op capacity is 30 operator-minutes per 15-minute window only when both operators are actually present; reduce the denominator for planned break/relief states and classify relief separately rather than hiding it inside capacity.

### Interpretation rule
- Broadly high loading + rising backlog during normal running supports a **persistent capacity** hypothesis.
- Short high-loading tails tied to abnormal events support a **surge-response/flex-capacity** hypothesis.
- Moderate loading with high walking/retrieval supports a **motion/routing** countermeasure before adding labor.
- Low measured loading with delayed response points first to detection, ownership, skill, information, or measurement gaps—not headcount.
- Saturation concentrated around breaks points to **relief design**.

Do **not** create an arbitrary utilization pass/fail threshold before observing the pilot. Anchor acceptability to existing Safety, Quality, process, due-time and escalation requirements.

## Break-Relief Capacity Envelope
Breaks/meals are treated as a planned operating state. Capture break start/end, operator off floor, relief person/qualification, running presses, abnormal events, transferred work, backlog start/peak/handback, incremental support people-minutes and time to restore normal route. Classify **INDEPENDENT / RECOVERED / ASSISTED / CONTAINED / NOT-EXPOSED**.

### Relief-debt rule
Any work displaced by a break remains visible until completed. Record who inherited it and whether it was still pending when the operator returned. Repeated backlog carryover after handback is evidence that the relief design, task ownership, skill coverage, or route balance needs correction even if total-shift TPMH looks acceptable.

## Trigger-Based Abnormal Response Ladder
Use the existing plant-authorized response chain:
**NORMAL ROUTE → ABNORMALITY VISIBLE/CALLED → PRIMARY OWNER → FLEX OWNER WHEN REQUIRED → FLOOR LEADER → CONTAINMENT/RESCUE → BACKLOG RECOVERY → NORMAL ROUTE**

For each meaningful abnormality retain timestamps for visibility/call, owner arrival, flex/leader/rescue, competing work, backlog created and route restoration. Separate detection, ownership, capacity-collision and recovery failures.

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
3. Scenario-walk break + abnormality, simultaneous demand, flex assist and two-person tasks.
4. Run Thursday with continuous exception logging, exposure-state tracking, reaction timestamps, break-window records and hourly plan-vs-actual control.
5. Capture 15-minute workload windows and tag each by operating state.
6. Build the **workload variability/surge profile** (median/P90/P95/max occupied operator-minutes plus backlog/support) overall and by state.
7. Reconstruct occupancy, queues, backlog aging, relief debt, support and route restoration.
8. Normalize against running presses, event demand, mix and downtime; compare early/middle/late shift.
9. Diagnose whether the limiting condition is persistent capacity, surge response, detection/ownership, skill, motion/routing, relief, recovery, equipment/process loss or support dependency.
10. Pareto observed causes and change only the demonstrated constraint; repeat representative/missing exposure before recommending permanent staffing change.

## Immediate next action
**Add an operating-state field to the 48-row Thursday observation grid before the pilot.** Tag each 15-minute window NORMAL / BREAK-RELIEF / ABNORMAL-EVENT / DOWNTIME-RECOVERY (multiple tags allowed where necessary). Preserve timestamps. This allows post-pilot workload percentiles and backlog behavior to be separated by condition rather than treating all 48 windows as equivalent.

## Risks / gaps
- No verified Thursday performance exists yet.
- Shift/hour averages can hide brief overload and recovery debt.
- Averages alone can also hide mura: the same average workload can represent steady demand or severe short-duration surges.
- Alarm duration cannot substitute for hands-on operator work time.
- Observer sampling can miss short work bursts; timestamps and exception logging are needed to reconstruct them.
- A 2-op design may appear feasible during full attendance but fail during normal break/meal states.
- Unqualified relief or hidden third-person assistance can falsely validate the staffing model.
- Undefined abnormal-response ownership can make hesitation look like insufficient manpower.
- Thursday is one controlled exposure, not final proof.

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
10. Exposure minutes/outcomes by critical operating state and 15-minute workload window.