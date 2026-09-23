# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing/clustering and qualification constraints therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Matched-Shift Comparator / Blocking Plan
A single Thursday TPMH result cannot cleanly estimate the effect of the 2-operator design because output and man-hours are also influenced by press-hours, product mix, downtime, alarm/event burden, maintenance support, time-of-shift and outside assistance. Treat those as nuisance/exposure factors rather than silently attributing every difference to staffing.

Before interpreting the pilot, create a **matched historical comparator set** from prior shifts. Match Thursday as closely as available data allow on: running press-hours / available presses, cured-tire demand or mix, downtime, alarm/event burden, Maintenance Support demand, shift/time band, and unusual outside support. Do not force a poor match or manufacture a control shift. If adequate historical matches do not exist, report the pilot as a within-shift feasibility observation rather than a causal staffing comparison.

### Comparison rule
- Report Thursday's raw TPMH, cured tires and man-hours, but do not use TPMH alone as proof.
- Show the matched historical range/median for TPMH, output, downtime and event burden when adequate matches exist.
- Compare state-specific measures already in the pilot plan: Pending Work age, uncovered demand, response/recovery, support interventions, break recovery and qualified reserve.
- Explicitly label major unmatched factors. A favorable TPMH with materially lighter exposure is not equivalent to a like-for-like improvement.
- Preserve the Exposure Adequacy Matrix: matching improves comparison validity but does not turn unobserved surge states into tested states.

This adds experimental blocking logic to the pilot: account for the few nuisance variables most likely to distort the staffing comparison instead of treating one shift as an uncontrolled before/after test.

## Existing analysis retained
Exposure Adequacy Gate; Pilot Reaction Control Plan; Qualification redundancy/cross-training; time-on-shift sustainability; single-owner abnormal response; paired-load concurrency; break-window feasibility and Recovery Debt; NORMAL/BREAK/SURGE standardized-work combination; multidimensional evidence matrix; readiness gate; observer/intervention protocol; surge recovery; route/motion loss; interruption/restart loss; interval capacity stress; workload confidence decomposition; response-time service curve; PRIMARY/FLEX dispatch; demand-state exposure; Pending-Work Aging / Service-Clock Control.

## Best current strategy
1. Run readiness gate; freeze people, zones/routes, relief, qualifications and plant-authorized reaction rules.
2. Validate/confidence-tag the 736-minute model, especially 336 minutes Maintenance Support.
3. Freeze PRIMARY/FLEX, single-owner abnormal response, handoff, break relief and observer/support rules.
4. Predefine the Exposure Adequacy Matrix and distinguish measured production exposure from scenario walk-through.
5. **Predefine matched historical comparator criteria** using press-hours, mix/demand, downtime, event burden, Maintenance Support and outside support; do not select comparators based on whether their TPMH makes the pilot look favorable.
6. Build NORMAL / BREAK-RELIEF / SURGE standardized-work combination, paired-load and break-window views.
7. Set up Pending-Work Aging plus NORMAL / WATCH / CONTAIN / RESTORED reaction control.
8. Scenario-walk only safe, authorized states that may not occur naturally; do not count these as measured performance.
9. Run Thursday with timestamped work, response milestones, Pending Work age/state, paired load, qualification waits, support/intervention, motion, interruption and operating-state tags.
10. Reconstruct qualified capacity, uncovered demand, recovery debt, support dependence and state-specific work sequence; normalize exposure and compare with adequate matched historical shifts where available.
11. Complete both the evidence matrix and exposure-coverage matrix. Correct only demonstrated constraints and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, create a one-page **Comparator Selection Table**. Candidate historical shifts should show date/shift, staffing, running press-hours, cured tires/mix, downtime, alarm/event burden, Maintenance Support demand, outside support, man-hours and TPMH. Predefine the matching variables before looking at which candidate gives the most favorable TPMH. If data are missing, mark them NOT AVAILABLE rather than assuming equivalence.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness itself is not verified.
- A single uncontrolled before/after TPMH comparison can confound staffing with production exposure and downtime.
- A quiet shift can create false confidence if critical operating states are not exposed.
- Walk-through evidence validates method logic but not production capacity or sustainable workload.
- 55.8% average utilization can hide local concurrency, qualification, break, motion, interruption and late-shift constraints.
- Leaders or support personnel can unintentionally mask a weak operating model if interventions are not classified.
- Maintenance Support is 45.7% of modeled labor and still needs hands-on/timing/qualification validation.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified qualification/authorization by task family.
2. Relief/FLEX identities, qualifications and donor-role responsibilities.
3. Existing task-specific due/response requirements and plant stop/escalation/restoration authority.
4. Which tasks require one person, two people, or specific authorization.
5. Exact pilot shift start/end, break schedule and relief plan.
6. Observer/support roster and definition of normal-model versus pilot-only support.
7. Frozen Op1/Op2 zone map and normal walking/response routes.
8. Source-level detail behind the 336-min Maintenance Support workload.
9. Thursday timestamped workload, operating-state exposure, reaction transitions, Pending Work age/state, qualification waits/handoffs, response milestones, running-press exposure, support/intervention, mix, output and downtime.
10. Historical candidate shifts with staffing, running press-hours, event/alarm burden, Maintenance Support demand, mix, downtime, outside support, cured tires, man-hours and TPMH so adequate matched comparators can be selected.