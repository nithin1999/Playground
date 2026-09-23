# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing/clustering and qualification constraints matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Pilot Measurement-System Verification
The pilot now includes a short pre-start verification of the observation system. The decision depends on human-coded timestamps and categories such as task family, abnormal-response state, support intervention, qualification wait, Pending Work state and configuration deviation. If observers interpret these differently, apparent workload or response variation can be measurement variation rather than process variation.

### Pre-start observer calibration
1. Synchronize all observer clocks/phones to the same reference time and record the check.
2. Freeze one-page operational definitions for task start/end, Pending Work arrival/start/close, support intervention, qualification wait, IN-STANDARD/DEVIATED/CONTAINED/RECOVERED, and NORMAL/WATCH/CONTAIN/RESTORED.
3. Before production observation, have observers independently code the same short safe sample or scenario walk without discussing classifications.
4. Compare event count, timestamps and category assignment. Resolve disagreements by clarifying the definition, not by averaging or silently recoding.
5. Version/date the definitions used for the pilot. If a definition must change materially during the shift, timestamp the change and do not silently merge incompatible coding.

### Analysis rule
- Preserve raw timestamps; derive 15-minute summaries later.
- Keep **NOT OBSERVED / NOT VERIFIED** distinct from zero.
- Do not infer operator hands-on time from machine alarm duration.
- If two observers cover different zones, define the handoff boundary so the same event is not double-counted or missed.
- Spot-check a small common event set during the shift when practical. Material observer disagreement is a data-quality flag and should qualify conclusions from affected measures.
- This is a fit-for-purpose verification, not a claim that a formal full Gage R&R or Attribute Agreement Analysis has been completed.

The improvement protects the pilot from a measurement-system failure immediately before a high-stakes staffing decision. Standardized work requires a precise baseline, while measurement-system analysis emphasizes that the method and appraisers themselves can create variation.

## Existing analysis retained
Pilot Configuration Lock + Deviation Accounting; Matched-Shift Comparator / Blocking Plan; Exposure Adequacy Gate; Qualified Reserve Erosion; Pilot Reaction Control Plan; Pending-Work Aging / Service-Clock Control; qualification redundancy/cross-training; time-on-shift sustainability; single-owner abnormal response; paired-load concurrency; break-window feasibility and Recovery Debt; NORMAL/BREAK/SURGE standardized-work combination; multidimensional evidence matrix; readiness gate; observer/intervention protocol; surge recovery; route/motion loss; interruption/restart loss; interval capacity stress; workload confidence decomposition; response-time service curve; PRIMARY/FLEX dispatch; demand-state exposure.

## Best current strategy
1. Run readiness gate and freeze the pilot configuration before start.
2. **Verify the pilot measurement system: synchronized clocks, frozen operational definitions, independent common-sample coding and disagreement resolution.**
3. Validate/confidence-tag the 736-minute model, especially 336 minutes Maintenance Support.
4. Freeze qualifications, zones/routes, PRIMARY/FLEX, single-owner response, handoff, break relief, observer/support boundaries and plant-authorized reaction rules.
5. Predefine Exposure Adequacy Matrix and matched historical comparator criteria.
6. Build NORMAL / BREAK-RELIEF / SURGE standardized-work combination, paired-load and break-window views.
7. Set up Pending-Work Aging plus NORMAL / WATCH / CONTAIN / RESTORED reaction control.
8. Scenario-walk safe authorized states that may not occur naturally; use the walk also to verify observer coding, but do not count it as measured capacity.
9. Run Thursday with raw timestamped work, response milestones, Pending Work, paired load, qualification waits, support/intervention, motion, operating-state and deviation tags.
10. Separate IN-STANDARD from DEVIATED/CONTAINED exposure; reconstruct qualified capacity, uncovered demand, recovery debt, support dependence and state-specific work sequence.
11. Normalize exposure and compare with adequate matched shifts where available. Complete evidence + exposure matrices; correct only demonstrated constraints and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, run a **10-minute observer calibration / dry run** using the actual pilot sheet: synchronize clocks; independently code the same safe sample/scenario; reconcile category and boundary disagreements; freeze/version the operational definitions. Preserve raw timestamps during the pilot and calculate intervals afterward.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness itself is not verified.
- Human-coded observation can manufacture apparent variation if timestamps, boundaries or category definitions differ between observers.
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
6. Observer/support roster, observer zone assignments and definition of normal-model versus pilot-only support.
7. Frozen operational definitions / coding dictionary and confirmation that observer clocks were synchronized.
8. Frozen Op1/Op2 zone map and normal walking/response routes.
9. Source-level detail behind the 336-min Maintenance Support workload.
10. Thursday raw timestamped workload, operating-state exposure, deviations/interventions, Pending Work age/state, qualification waits/handoffs, response milestones, running-press exposure, mix, output and downtime.
11. Historical candidate shifts with staffing, running press-hours, event/alarm burden, Maintenance Support demand, mix, downtime, outside support, cured tires, man-hours and TPMH.