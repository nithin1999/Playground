# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing/clustering and qualification constraints therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Pilot Reaction Control Plan
Thursday should not only collect data; it should run with a **predefined visual reaction loop** so abnormalities are handled consistently without leaders silently becoming a third operator.

Use four leading signals already supported by the pilot design: **(1) protected/due work state, (2) oldest Pending Work age, (3) both-qualified-operators committed / uncovered demand, and (4) outside-support or containment intervention**. For each signal, preassign: **who sees it, who owns the response, what existing plant rule triggers escalation/containment, what work is protected, and what must be logged before normal operation resumes**.

Do **not** invent numeric thresholds for the pilot. Existing safety, quality, equipment-protection, production and authorization requirements govern reaction. Where a response requirement is unknown, mark it **NOT VERIFIED**. Leader response should restore/control the abnormality and preserve traceability; it should not silently perform routine operator work and make the 2-operator model appear stronger than it is.

### Visual control
Use one compact pilot board with four states: **NORMAL / WATCH / CONTAIN / RESTORED**. Every transition gets a timestamp, reason, owner and intervention/support tag. This converts the current measurement plan into an executable control plan and makes the difference between normal two-operator operation and rescue visible.

### Why this changes the analysis
- Strong TPMH with repeated CONTAIN events is not clean evidence of sustainable 2-operator operation.
- Rising Pending Work with no response exposes a control-plan failure even before shift-end output deteriorates.
- If leaders repeatedly need to decide ownership, dispatch or priorities, standardized work/visual management is not yet self-executing.
- If containment is triggered by both operators being legitimately committed, the event becomes high-value evidence for a capacity/concurrency constraint.
- If a free qualified operator exists but work still waits, investigate dispatch/visual control before adding manpower.
- RESTORED should mean the abnormal condition and any associated recovery debt are visibly closed, not merely that the immediate alarm stopped.

## Existing analysis retained
Qualification redundancy/cross-training; time-on-shift sustainability; single-owner abnormal response; paired-load concurrency; break-window feasibility and Recovery Debt; NORMAL/BREAK/SURGE standardized-work combination; multidimensional evidence matrix; readiness gate; observer/intervention protocol; GREEN/YELLOW/RED containment using existing plant requirements; surge recovery; route/motion loss; interruption/restart loss; interval capacity stress; workload confidence decomposition; response-time service curve; PRIMARY/FLEX dispatch; demand-state exposure; Pending-Work Aging / Service-Clock Control.

## Best current strategy
1. Run readiness gate; freeze people, zones/routes, relief, qualifications and plant-authorized reaction rules.
2. Validate/confidence-tag the 736-minute model, especially 336 minutes Maintenance Support.
3. Freeze PRIMARY/FLEX, single-owner abnormal response, handoff, break relief and observer/support rules.
4. Build NORMAL / BREAK-RELIEF / SURGE standardized-work combination, paired-load and break-window views.
5. Set up Pending-Work Aging plus the **NORMAL / WATCH / CONTAIN / RESTORED reaction board** with named ownership and existing plant escalation criteria.
6. Scenario-walk normal work, a break, concurrent demand, qualification conflict, one-/two-person abnormality, containment and restoration.
7. Run Thursday with timestamped work, response milestones, Pending Work age/state, paired load, qualification waits, support/intervention, motion, interruption and reaction-board transitions.
8. Reconstruct qualified capacity, uncovered demand, recovery debt, oldest-pending age, support dependence, break/surge recovery and state-specific work sequence.
9. Normalize for press-hours, event demand, mix, downtime, breaks and time-on-shift; complete the evidence matrix.
10. Correct only the demonstrated constraint and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, put the four reaction signals on one visible sheet and fill in **signal owner / response owner / existing escalation rule / protected work / required log / restoration check**. Scenario-walk one case from NORMAL → WATCH/CONTAIN → RESTORED. Unknown rules stay NOT VERIFIED.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness itself is not verified.
- 55.8% average utilization can hide local concurrency, qualification, break, motion, interruption and late-shift constraints.
- Leaders or support personnel can unintentionally mask a weak operating model if their interventions are not classified.
- A reaction board without verified plant escalation/restoration authority cannot substitute for existing safety/quality rules.
- Maintenance Support is 45.7% of modeled labor and still needs hands-on/timing/qualification validation.
- Low-demand exposure can leave important demand states NOT TESTED.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified qualification/authorization by task family.
2. Relief/FLEX identities, qualifications and donor-role responsibilities.
3. Existing task-specific due/response requirements and plant stop/escalation/restoration authority.
4. Which tasks require one person, two people, or specific authorization.
5. Exact pilot shift start/end, break schedule and relief plan.
6. Observer/support roster and definition of normal-model versus pilot-only support.
7. Frozen Op1/Op2 zone map and normal walking/response routes.
8. Source-level detail behind the 336-min Maintenance Support workload.
9. Thursday timestamped workload, reaction-board transitions, Pending Work age/state, qualification waits/handoffs, response milestones, running-press exposure, support/intervention, mix, output and downtime.
10. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours and TPMH where available.
