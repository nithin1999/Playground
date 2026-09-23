# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing/clustering and qualification constraints matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Pilot Configuration Lock + Deviation Accounting
The remaining risk immediately before the pilot is changing the operating method during the trial and then treating the full shift as one consistent 2-operator test. Freeze the intended operating configuration before start: Op1/Op2 identities, qualifications, zones/routes, PRIMARY/FLEX ownership, break relief, one-/two-person abnormal-response rules, normal outside-support boundary, and planned work sequence.

During the pilot, do **not** prevent necessary safety, quality, equipment-protection or authorized support actions. Instead, timestamp every material departure from the frozen configuration and classify it: SAFETY/QUALITY containment, qualification substitution, break-relief substitution, leader/support intervention, route/zone change, ownership/handoff change, staffing change, or other.

### Analysis rule
- Divide the shift into **IN-STANDARD** and **DEVIATED/CONTAINED** exposure rather than averaging everything together.
- Record deviation start, end, reason, initiator/support resource, affected operator/task and recovery completion.
- Report raw shift TPMH, but separately evaluate whether protected work, Pending Work age, response/recovery and support dependence were acceptable during IN-STANDARD exposure.
- Do not count a leader, mold operator, maintenance resource or other helper as evidence that the two-operator model carried the work unless that support is explicitly part of the intended permanent operating model.
- A deviation is data, not automatically a failure. Repeated deviations of the same type identify where standardized work or the staffing concept needs redesign.
- If the frozen configuration changes materially mid-shift, treat the post-change period as a different configuration rather than combining it with the original pilot condition.

This creates a clean baseline for kaizen: standardized work requires a defined sequence and baseline; without configuration control, variation introduced during the experiment can be mistaken for capability of the proposed operating model.

## Existing analysis retained
Matched-Shift Comparator / Blocking Plan; Exposure Adequacy Gate; Pilot Reaction Control Plan; qualification redundancy/cross-training; time-on-shift sustainability; single-owner abnormal response; paired-load concurrency; break-window feasibility and Recovery Debt; NORMAL/BREAK/SURGE standardized-work combination; multidimensional evidence matrix; readiness gate; observer/intervention protocol; surge recovery; route/motion loss; interruption/restart loss; interval capacity stress; workload confidence decomposition; response-time service curve; PRIMARY/FLEX dispatch; demand-state exposure; Pending-Work Aging / Service-Clock Control.

## Best current strategy
1. Run readiness gate and **freeze the pilot configuration** before start.
2. Validate/confidence-tag the 736-minute model, especially 336 minutes Maintenance Support.
3. Freeze qualifications, zones/routes, PRIMARY/FLEX, single-owner response, handoff, break relief, observer/support boundaries and plant-authorized reaction rules.
4. Predefine Exposure Adequacy Matrix and matched historical comparator criteria.
5. Build NORMAL / BREAK-RELIEF / SURGE standardized-work combination, paired-load and break-window views.
6. Set up Pending-Work Aging plus NORMAL / WATCH / CONTAIN / RESTORED reaction control.
7. Scenario-walk safe authorized states that may not occur naturally; do not count walk-through as measured capacity.
8. Run Thursday with timestamped work, response milestones, Pending Work, paired load, qualification waits, support/intervention, motion and operating-state tags.
9. **Tag every material configuration deviation and split IN-STANDARD from DEVIATED/CONTAINED exposure.**
10. Reconstruct qualified capacity, uncovered demand, recovery debt, support dependence and state-specific work sequence; normalize exposure and compare with adequate matched shifts where available.
11. Complete evidence + exposure matrices. Correct only demonstrated constraints and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, complete a one-page **Pilot Configuration Sheet** with: Op1, Op2, qualifications, zone/route, PRIMARY/FLEX task ownership, break-relief source, abnormal-response ownership, two-person tasks, normal support boundary and authorized containment/escalation. Add one deviation-log line to the existing timestamp sheet: **start | end | deviation type | reason | support/person | affected work | recovery complete**. Do not create a separate burdensome form.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness itself is not verified.
- Mid-pilot method/staffing changes can invalidate a single-shift average if not separated analytically.
- A quiet shift can create false confidence if critical operating states are not exposed.
- Walk-through evidence validates method logic but not production capacity or sustainable workload.
- 55.8% average utilization can hide local concurrency, qualification, break, motion, interruption and late-shift constraints.
- Leaders/support personnel can mask a weak operating model if interventions are not timestamped and classified.
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
9. Thursday timestamped workload, operating-state exposure, deviations/interventions, Pending Work age/state, qualification waits/handoffs, response milestones, running-press exposure, mix, output and downtime.
10. Historical candidate shifts with staffing, running press-hours, event/alarm burden, Maintenance Support demand, mix, downtime, outside support, cured tires, man-hours and TPMH.