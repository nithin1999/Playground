# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project remains in **pilot-preparation / execution mode**. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Break-Relief Capacity Envelope
Breaks/meals are now treated as a **planned operating state**, not incidental lost time. A two-operator design is not robust if it only works when both operators are continuously present and normal breaks require hidden third-person capacity or allow protected work to accumulate.

For each break/meal window capture:
`break start/end | operator off floor | relief person | relief qualification | presses running | abnormal events | work transferred | queue/backlog at start | peak queue/backlog | incremental support people-minutes | backlog at handback | time to restore normal route`

Classify each break window:
- **INDEPENDENT:** remaining/relief qualified capacity maintains required work with no incremental 2-op support.
- **RECOVERED:** temporary backlog occurs but is cleared under the defined relief design without violating plant requirements.
- **ASSISTED:** incremental capacity outside the defined relief design is needed.
- **CONTAINED:** normal plant rescue/containment is invoked.
- **NOT-EXPOSED:** no meaningful break-state exposure occurred.

Do not create a numerical backlog or response threshold. Existing Safety, Quality and process requirements determine overdue work and escalation. Preserve raw timestamps/counts where no formal limit exists.

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
2. Freeze the **break/meal relief design**: who leaves, who covers, which work transfers, relief qualifications, handoff and handback.
3. Put the abnormal-response ladder on the pilot sheet: primary owner, flex owner, leader path, rescue/containment path and recovery responsibility.
4. Pre-list critical operating states and protected-work due times; establish observer/leader/rescue firewall.
5. Scenario-walk a break plus abnormality, simultaneous demand, flex assist and two-person tasks without inventing escalation thresholds.
6. Run Thursday with continuous exception logging, fixed observation windows, break-window records, exposure-state tracking, reaction timestamps and the hourly demand-to-capacity board.
7. Reconstruct occupancy, queues, backlog aging, **relief debt**, support, interventions and abnormal-response paths.
8. Normalize against running presses, events, mix and downtime; compare early/middle/late robustness.
9. Diagnose degraded periods as detection, ownership, capacity collision, skill constraint, routing/motion, relief, recovery, equipment/process loss or support dependency.
10. Pareto observed causes, change only the demonstrated constraint, and repeat representative conditions before recommending permanent staffing change.

## Immediate next action
**Freeze the Thursday break/meal relief table before the pilot.** For each break identify operator off floor, planned relief/remaining owner, tasks transferred, relief qualifications, handoff method, handback method and escalation path. During the pilot, measure the complete break window through restoration of normal route—not just the nominal break duration.

## Risks / gaps
- No verified Thursday performance exists yet.
- A 2-op design may appear feasible during full attendance but fail during normal break/meal states.
- Unqualified relief can create apparent headcount coverage without usable capacity.
- Hidden third-person assistance during breaks can falsely validate the staffing model.
- Break-created backlog may be cleared later and disappear inside shift-average TPMH.
- Undefined abnormal-response ownership can make hesitation look like insufficient manpower.
- Observer coaching or unclassified help can artificially improve the result.
- Alarm-start concurrency is a demand proxy, not hands-on workload.
- Thursday is one controlled exposure, not final proof.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, observer, rescue/shadow and relief assignments.
2. Exact break/meal schedule and whether breaks are staggered or overlapping.
3. Relief source, relief qualifications and relief person's normal home-role responsibilities.
4. Verified qualification matrix and one-person vs two-person task list.
5. Frozen Op1/Op2 zone/route map and primary/flex ownership.
6. Periodic/protected task list with actual due-time/frequency requirements.
7. Existing plant abnormality detection/call, escalation and rescue/containment rules.
8. Thursday hourly production plan, actual production, running-press exposure, mix and downtime.
9. Timestamped break handoff/handback, abnormality response, queue/backlog, support and route-restoration data.
10. Exposure minutes/outcomes by critical operating state and hourly Op1/Op2 direct-work/walk evidence.