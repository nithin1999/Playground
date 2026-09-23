# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor and remains a major uncertainty.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Interval Qualified-Load Saturation Map
Shift-average utilization can hide short periods where the two-operator design is locally overloaded. For the pilot, reconstruct demand in short intervals (default analysis view: 15 minutes, using raw timestamps underneath) and compare **qualified hands-on demand minutes** with **qualified operator minutes actually available** in the same interval. Keep machine automatic time separate from operator labor, and preserve task qualification/authorization requirements.

For each interval calculate a diagnostic **Qualified Load Ratio = qualified hands-on demand minutes / qualified operator minutes available**. A ratio above 1.00 is arithmetic evidence that observed qualified demand exceeded the locally available qualified labor in that interval; it is not a new plant response threshold. Also tag intervals where total minutes appear feasible but the required skill is unavailable, where both operators are concurrently committed, where break coverage removes capacity, and where external support absorbs demand. Use these intervals to build the NORMAL / BREAK / SURGE standardized-work combination view and to identify the actual bottleneck: workload, qualification, motion, concurrency, relief, or support dependence.

Do not infer hands-on demand from alarm duration. Use observed operator timestamps/work elements; mark missing work content as NOT VERIFIED. Preserve raw timestamps so interval size can be changed after the pilot without recollecting data.

## Best current strategy
1. Run readiness gate and freeze pilot configuration before start.
2. Verify observer measurement system and pre-register decision rules.
3. Validate/confidence-tag the 736-minute workload, especially 336 minutes Maintenance Support.
4. Freeze qualifications, zones/routes, PRIMARY/FLEX, abnormal-response ownership, break relief and normal-model support boundaries.
5. Build NORMAL / BREAK-RELIEF / SURGE standardized-work combination and paired-load views.
6. Use a break-release handshake at every observed break and tag transfer outcome plus recovery debt.
7. Track Effective Manning: core operator hours + every external support/relief episode + donor-role impact.
8. **Reconstruct interval Qualified Load Ratio and tag skill/concurrency/break/support constraints instead of relying on 55.8% shift-average utilization.**
9. Use Pending-Work Aging and NORMAL/WATCH/CONTAIN/RESTORED reaction control.
10. Run timestamped pilot with operating-state and deviation tags.
11. Separate IN-STANDARD from DEVIATED/CONTAINED exposure; reconstruct qualified capacity, recovery debt, support dependence and state-specific work sequence.
12. Normalize exposure, compare adequate matched shifts, apply frozen decision rules, fix demonstrated constraints and retest representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, make sure the observation log can reconstruct these fields from raw timestamps: **task/event | start | end | operator | task family | qualification required | break/available state | external support | operating state**. After the shift, calculate 15-minute qualified demand and available qualified operator-minutes, then flag intervals above 1.00 and intervals with skill/concurrency/support constraints. Do not create an arbitrary utilization target from this diagnostic.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness is not verified.
- The 55.8% shift-average utilization can conceal short-duration qualified-load saturation and simultaneous demand.
- External relief/help can make a nominal two-operator trial look feasible while consuming labor elsewhere.
- Pulling mold/bladder or other personnel for relief can transfer backlog rather than eliminate workload.
- A quiet shift can create false confidence if abnormal states are not exposed.
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
12. Interval-level hands-on work content and qualification tags needed to reconstruct qualified demand versus available qualified operator-minutes.