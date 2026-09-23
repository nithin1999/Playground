# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor and remains a major uncertainty.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Motion-Burden / Response-Route Map
The pilot now explicitly separates **dispatch delay, travel time, and hands-on response time**. In a machine-intensive area, operators are often routed by abnormal signals rather than a fixed repetitive cycle. A two-operator model can therefore fail because of route geometry and unnecessary motion even when total hands-on workload is below available labor.

During Thursday's pilot, preserve raw timestamps for **event raised | owner assigned/accepted | operator departs | arrives at machine | hands-on start | cleared** and record origin zone and destination zone. Use the actual paths afterward to build a spaghetti/response-route map for Op1 and Op2. Do not ask operators to walk an artificial route merely for measurement.

Classify observed response loss as **dispatch/ownership delay | travel/motion | qualification wait | concurrent qualified work | hands-on task time | external-support dependence**. This prevents travel created by poor zoning or point-of-use design from being mistaken for evidence that a third full-shift operator is required.

For improvement, rank repeated high-frequency/high-time paths first. Candidate countermeasures should follow the evidence: adjust Op1/Op2 zone boundaries, relocate approved point-of-use tools/forms/materials where permitted, change the PRIMARY/FLEX handoff point, or cross-train to avoid unnecessary cross-zone response. Safety, authorization, access, and equipment constraints override travel reduction. No route change is considered validated until observed safely in representative work.

## Best current strategy
1. Run readiness gate and freeze pilot configuration before start.
2. Verify observer measurement system and pre-register decision rules.
3. Validate/confidence-tag the 736-minute workload, especially 336 minutes Maintenance Support.
4. Freeze qualifications, zones/routes, PRIMARY/FLEX, abnormal-response ownership, break relief and normal-model support boundaries.
5. Build NORMAL / BREAK-RELIEF / SURGE standardized-work combination and paired-load views.
6. Use visual abnormal-work dispatch and explicit PRIMARY/FLEX ownership transfer.
7. Use a finite visual Pending-Work queue with FIFO/oldest-due sequencing and a visible CONTAIN reaction when existing due limits are threatened.
8. Use a break-release handshake at every observed break and tag transfer outcome plus recovery debt.
9. Track Effective Manning: core operator hours + every external support/relief episode + donor-role impact.
10. Reconstruct interval Qualified Load Ratio and tag skill/concurrency/break/support constraints instead of relying on 55.8% shift-average utilization.
11. For every overload/surge, measure the Pending-Work recovery curve and classify self-clearing vs support-cleared vs persistent recovery debt.
12. **Separate dispatch delay, travel time and hands-on response; build an actual-path spaghetti/response-route map and rank recurring motion burden.**
13. Run timestamped pilot with operating-state and deviation tags.
14. Separate IN-STANDARD from DEVIATED/CONTAINED exposure; reconstruct qualified capacity, recovery debt, support dependence and state-specific work sequence.
15. Normalize exposure, compare adequate matched shifts, apply frozen decision rules, fix demonstrated constraints and retest representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, ensure the observation sheet can reconstruct **event raised | accepted/owner | depart | arrive | hands-on start | cleared | origin zone | destination zone**. Use the actual pilot paths afterward to produce one Op1/Op2 spaghetti/response-route map and a Pareto of travel minutes by route/reason. Do not create an arbitrary travel target before observing the process.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness is not verified.
- The 55.8% shift-average utilization can conceal short-duration qualified-load saturation and simultaneous demand.
- Travel/motion burden can consume response capacity even when hands-on workload appears feasible; without timestamp separation it can be misdiagnosed as insufficient staffing.
- Open work can accumulate invisibly while TPMH still looks favorable.
- Undefined dispatch can create duplicate response, unnecessary cross-zone walking and aged Pending Work.
- External relief/help can make a nominal two-operator trial look feasible while consuming labor elsewhere.
- Pulling mold/bladder or other personnel for relief can transfer backlog rather than eliminate workload.
- A quiet shift can create false confidence if abnormal states are not exposed.
- Maintenance Support is 45.7% of modeled labor and still needs hands-on/timing/qualification validation.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified qualifications/authorizations by task family.
2. Exact break schedule and approved relief source; whether relief is dedicated/shared and what donor work must continue.
3. Relief/FLEX identities, qualifications and donor-role responsibilities.
4. Which tasks require one person, two people, or specific authorization.
5. Existing task-specific priority, due/response and stop/escalation/restoration rules.
6. Observer/support roster and explicit normal-model versus pilot-only support boundary.
7. Frozen Op1/Op2 zone map and normal walking/response routes.
8. Source-level detail behind the 336-min Maintenance Support workload.
9. Thursday raw timestamps for work, breaks, external interventions, Pending Work, qualification waits, response milestones, running presses, mix, output and downtime.
10. Peak simultaneous Pending Work, oldest-age history and recovery-complete timestamps around overload/surge events.
11. External support/relief minutes by role plus donor-role backlog/recovery where people are borrowed.
12. Historical candidate shifts with comparable staffing, exposure, support, output, man-hours and TPMH.
13. Interval-level hands-on work content and qualification tags needed to reconstruct qualified demand versus available qualified operator-minutes.
14. Concurrency episodes with initial owner, any ownership transfer, duplicate response, travel delay and final clearance time.
15. Event-level origin/destination, depart/arrival timestamps, repeated routes, and location of frequently retrieved tools/forms/materials needed to quantify motion burden.