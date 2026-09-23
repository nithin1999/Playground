# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor and remains a major uncertainty.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Qualification Coverage Gate / Skill-Bottleneck Map
Average labor capacity is not enough to validate a two-operator design if only one operator can perform a critical task. Before the pilot, convert the qualification list into a **task-family × person coverage matrix** for Op1, Op2 and approved relief/FLEX. Mark only verified authorization/competence; unknown is **NOT VERIFIED**, not qualified.

For every task family that can arise during NORMAL, BREAK or SURGE conditions, record: **task family | required authorization/qualification | Op1 | Op2 | relief/FLEX | one- or two-person requirement | backup role | normal-model or pilot-only backup**. Use the matrix as a readiness gate and as an analysis layer over Thursday events.

Classify observed skill coverage as **DUAL-COVERED**, **SINGLE-POINT SKILL**, **RELIEF-DEPENDENT**, **TWO-PERSON REQUIRED**, or **NOT VERIFIED**. A task that is single-point skilled is a resilience constraint even if shift-average utilization is low: if the qualified person is on break or already committed, nominal spare labor from the other operator is not usable capacity for that task. Cross-training is therefore targeted only where observed exposure and the verified matrix show a real skill bottleneck; use a standard job breakdown / TWI Job Instruction approach rather than informal shadowing.

Do not invent a minimum coverage ratio. Safety, quality, licensing/authorization, and plant training requirements remain the governing constraints. If a required qualification is unverified before the pilot, treat that operating state as not validated rather than assuming interchangeability.

## Best current strategy
1. Run readiness gate and freeze pilot configuration before start.
2. Verify observer measurement system and pre-register decision rules.
3. Validate/confidence-tag the 736-minute workload, especially 336 minutes Maintenance Support.
4. **Freeze a verified qualification-coverage matrix for Op1, Op2 and relief/FLEX; identify single-point skills and two-person tasks before start.**
5. Freeze zones/routes, PRIMARY/FLEX, abnormal-response ownership, break relief and normal-model support boundaries.
6. Build NORMAL / BREAK-RELIEF / SURGE standardized-work combination and paired-load views.
7. Use visual abnormal-work dispatch and explicit PRIMARY/FLEX ownership transfer.
8. Use a finite visual Pending-Work queue with FIFO/oldest-due sequencing and a visible CONTAIN reaction when existing due limits are threatened.
9. Use a break-release handshake at every observed break and tag transfer outcome plus recovery debt.
10. Track Effective Manning: core operator hours + every external support/relief episode + donor-role impact.
11. Apply the Shadow-Support / Leader Response Standard so backup protects the process without contaminating the experiment.
12. Reconstruct interval Qualified Load Ratio and tag skill/concurrency/break/support constraints instead of relying on 55.8% shift-average utilization.
13. For every overload/surge, measure the Pending-Work recovery curve and classify self-clearing vs support-cleared vs persistent recovery debt.
14. Separate dispatch delay, travel time and hands-on response; build an actual-path spaghetti/response-route map and rank recurring motion burden.
15. Run timestamped pilot with operating-state and deviation tags.
16. Separate IN-STANDARD from DEVIATED/CONTAINED exposure; reconstruct qualified capacity, recovery debt, support dependence and state-specific work sequence.
17. Normalize exposure, compare adequate matched shifts, apply frozen decision rules, fix demonstrated constraints and retest representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, build and sign off the one-page **qualification coverage matrix** using existing training/authorization records. Scenario-walk at least the break state and a simultaneous-demand state against that matrix. Do not train around or waive an unverified authorization merely to make the pilot executable; record the gap and use approved backup under existing plant rules.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness is not verified.
- The 55.8% shift-average utilization can conceal short-duration qualified-load saturation and simultaneous demand.
- A single-point skill can make nominal spare labor unusable when the only qualified operator is busy or on break.
- Relief may exist physically but still fail to provide capacity if the relief person lacks the required task qualification.
- Leader/helper rescue can contaminate the pilot if intervention is not distinguished from normal future-state support.
- Travel/motion burden can consume response capacity even when hands-on workload appears feasible.
- Open work can accumulate invisibly while TPMH still looks favorable.
- Pulling mold/bladder or other personnel for relief can transfer backlog rather than eliminate workload.
- A quiet shift can create false confidence if abnormal states are not exposed.
- Maintenance Support is 45.7% of modeled labor and still needs hands-on/timing/qualification validation.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified qualifications/authorizations by task family.
2. Exact break schedule and approved relief source; whether relief is dedicated/shared and what donor work must continue.
3. Relief/FLEX identities, verified qualifications and donor-role responsibilities.
4. Which tasks require one person, two people, or specific authorization.
5. Existing training/qualification records or approved skill matrix needed to verify coverage rather than infer it.
6. Existing task-specific priority, due/response and stop/escalation/restoration rules.
7. Observer/support roster and explicit normal-model versus pilot-only support boundary.
8. Existing triggers under which team leaders/supervisors/helpers must intervene, and which interventions are part of the intended future-state operating model.
9. Frozen Op1/Op2 zone map and normal walking/response routes.
10. Source-level detail behind the 336-min Maintenance Support workload.
11. Thursday raw timestamps for work, breaks, external interventions, Pending Work, qualification waits, response milestones, running presses, mix, output and downtime.
12. Peak simultaneous Pending Work, oldest-age history and recovery-complete timestamps around overload/surge events.
13. External support/relief minutes by role plus donor-role backlog/recovery where people are borrowed.
14. Historical candidate shifts with comparable staffing, exposure, support, output, man-hours and TPMH.
15. Interval-level hands-on work content and qualification tags needed to reconstruct qualified demand versus available qualified operator-minutes.
16. Concurrency episodes with initial owner, any ownership transfer, duplicate response, travel delay and final clearance time.
17. Event-level origin/destination, depart/arrival timestamps, repeated routes, and location of frequently retrieved tools/forms/materials needed to quantify motion burden.