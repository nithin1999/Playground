# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor and remains a major uncertainty.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Effective Manning / Support-Labor Accounting
A two-operator pilot can appear successful while hidden labor is supplied by break relief, leaders, mold/bladder operators, maintenance, or other helpers. Therefore evaluate both **local headcount** and **effective labor consumed**. Timestamp every external intervention or relief episode and classify it as: (1) normal shared support already present in the approved future-state model, (2) pilot-only containment/help, or (3) emergency/safety response. Record person/role, start/end, reason, work performed, and donor-role impact where relevant.

For productivity interpretation, do not silently treat external labor as free. Report **Core 2-Operator Hours** separately from **External Support/Relief Hours** and calculate an exposure-adjusted labor view when support performs work that would otherwise belong to the two-operator model. A break covered by an approved shared relief system may be a valid future-state design, but its labor cost and donor-role feasibility must still be explicit. Pilot-only help cannot be used as evidence that the standalone two-operator model was sustainable.

## Best current strategy
1. Run readiness gate and freeze pilot configuration before start.
2. Verify observer measurement system and pre-register decision rules.
3. Validate/confidence-tag the 736-minute workload, especially 336 minutes Maintenance Support.
4. Freeze qualifications, zones/routes, PRIMARY/FLEX, abnormal-response ownership, break relief and normal-model support boundaries.
5. Build NORMAL / BREAK-RELIEF / SURGE standardized-work combination and paired-load views.
6. Use a break-release handshake at every observed break and tag transfer outcome plus recovery debt.
7. **Track Effective Manning: core operator hours + every external support/relief episode + donor-role impact.**
8. Use Pending-Work Aging and NORMAL/WATCH/CONTAIN/RESTORED reaction control.
9. Run timestamped pilot with operating-state and deviation tags.
10. Separate IN-STANDARD from DEVIATED/CONTAINED exposure; reconstruct qualified capacity, recovery debt, support dependence and state-specific work sequence.
11. Normalize exposure, compare adequate matched shifts, apply frozen decision rules, fix demonstrated constraints and retest representative exposure before permanent staffing change.

## Immediate next action
Add these fields to the existing intervention/break log before Thursday: **support role | start | end | minutes | reason | work performed | normal-model / pilot-only / emergency | donor role affected? | donor backlog/recovery**. At shift end report Core 2-Operator Hours and External Support/Relief Hours separately. Do not invent an allowable support threshold.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness is not verified.
- External relief/help can make a nominal two-operator trial look feasible while consuming labor elsewhere.
- Pulling mold/bladder or other personnel for relief can transfer backlog rather than eliminate workload.
- A quiet shift can create false confidence if abnormal states are not exposed.
- 55.8% average utilization can hide local concurrency, qualification, break, motion and interruption constraints.
- Maintenance Support is 45.7% of modeled labor and still needs hands-on/timing/qualification validation.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified qualifications/authorizations by task family.
2. Exact break schedule and approved relief source; whether relief is dedicated/shared and what donor work must continue.
3. Relief/FLEX identities, qualifications and donor-role responsibilities.
4. Which tasks require one person, two people, or specific authorization.
5. Existing task-specific due/response and stop/escalation/restoration rules.
6. Observer/support roster and explicit normal-model versus pilot-only support boundary.
7. Frozen Op1/Op2 zone map and normal walking/response routes.
8. Source-level detail behind the 336-min Maintenance Support workload.
9. Thursday raw timestamps for work, breaks, external interventions, Pending Work, qualification waits, response milestones, running presses, mix, output and downtime.
10. External support/relief minutes by role plus donor-role backlog/recovery where people are borrowed.
11. Historical candidate shifts with comparable staffing, exposure, support, output, man-hours and TPMH.