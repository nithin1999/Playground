# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor and remains a major uncertainty.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Shadow-Support / Leader Response Standard
The pilot now separates **available backup** from **actual intervention** so that leaders can protect safety/quality/equipment without unintentionally making a nominal two-operator trial look self-sufficient. Lean andon requires abnormalities to be visible and summon a defined response; leader standard work includes response to andons. For the pilot, backup personnel may remain available, but every intervention must be triggered by an existing safety, quality, equipment-protection, authorization, due/response, or escalation requirement—not by an observer's desire to make the trial succeed.

For every leader/helper intervention preserve **trigger | call/andon time | responder | arrival | hands-on start | clear | reason | work performed | normal-model/shared vs pilot-only vs emergency | donor-role impact**. If a leader only observes/coaches without doing operator work, tag it separately from hands-on support. Never delay an intervention required by plant rules for the sake of the study.

At analysis, distinguish **self-managed**, **normal-model support**, **pilot-only rescue**, and **emergency containment**. A shift with strong TPMH but repeated pilot-only rescue is not evidence of a self-sustaining two-operator model. Conversely, approved shared support that is part of the intended future operating system can be evaluated transparently by charging its labor and donor impact to Effective Manning.

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
10. **Use a Shadow-Support / Leader Response Standard: backup remains available, but hands-on intervention is tied to existing plant triggers and fully timestamped/classified.**
11. Reconstruct interval Qualified Load Ratio and tag skill/concurrency/break/support constraints instead of relying on 55.8% shift-average utilization.
12. For every overload/surge, measure the Pending-Work recovery curve and classify self-clearing vs support-cleared vs persistent recovery debt.
13. Separate dispatch delay, travel time and hands-on response; build an actual-path spaghetti/response-route map and rank recurring motion burden.
14. Run timestamped pilot with operating-state and deviation tags.
15. Separate IN-STANDARD from DEVIATED/CONTAINED exposure; reconstruct qualified capacity, recovery debt, support dependence and state-specific work sequence.
16. Normalize exposure, compare adequate matched shifts, apply frozen decision rules, fix demonstrated constraints and retest representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, brief every observer/leader/helper on one rule: **protect the process, but do not silently rescue the experiment.** Confirm existing intervention/escalation triggers and normal future-state support roles. Add intervention timestamps/classification to the existing sheet; do not create arbitrary new response thresholds.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness is not verified.
- The 55.8% shift-average utilization can conceal short-duration qualified-load saturation and simultaneous demand.
- Leader/helper rescue can contaminate the pilot if intervention is not distinguished from normal future-state support.
- Travel/motion burden can consume response capacity even when hands-on workload appears feasible.
- Open work can accumulate invisibly while TPMH still looks favorable.
- Undefined dispatch can create duplicate response, unnecessary cross-zone walking and aged Pending Work.
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
7. Existing triggers under which team leaders/supervisors/helpers must intervene, and which interventions are part of the intended future-state operating model.
8. Frozen Op1/Op2 zone map and normal walking/response routes.
9. Source-level detail behind the 336-min Maintenance Support workload.
10. Thursday raw timestamps for work, breaks, external interventions, Pending Work, qualification waits, response milestones, running presses, mix, output and downtime.
11. Peak simultaneous Pending Work, oldest-age history and recovery-complete timestamps around overload/surge events.
12. External support/relief minutes by role plus donor-role backlog/recovery where people are borrowed.
13. Historical candidate shifts with comparable staffing, exposure, support, output, man-hours and TPMH.
14. Interval-level hands-on work content and qualification tags needed to reconstruct qualified demand versus available qualified operator-minutes.
15. Concurrency episodes with initial owner, any ownership transfer, duplicate response, travel delay and final clearance time.
16. Event-level origin/destination, depart/arrival timestamps, repeated routes, and location of frequently retrieved tools/forms/materials needed to quantify motion burden.