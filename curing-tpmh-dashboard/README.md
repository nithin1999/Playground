# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor and remains a major uncertainty.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Surge Recovery / Queue-Drain Curve
Interval load identifies when demand exceeds locally available qualified labor, but a short overload is not automatically evidence that two operators are infeasible. The critical follow-up is whether the team can **recover after the surge without unsafe shortcuts, unresolved protected work, hidden outside labor, or persistent backlog**.

For each observed surge, break-induced overload, or concurrent abnormal event, timestamp: **surge start | peak pending-work count | oldest pending-work age | surge end | recovery start | recovery complete | external support minutes | protected work unresolved at recovery**. Plot Pending Work (count and oldest age) through time. Preserve raw timestamps.

Interpretation:
- **Self-clearing:** backlog rises temporarily and returns to the pre-event state using the frozen two-operator/approved normal-support model.
- **Support-cleared:** recovery occurs only after external/pilot-only labor is added; do not credit this as standalone two-operator recovery.
- **Persistent recovery debt:** backlog/age remains elevated or protected work remains unresolved; investigate the demonstrated constraint before retest.
- **Not exposed:** no representative surge occurred; do not claim surge capability was validated.

Do not invent an allowable recovery-time threshold. Compare recovery behavior with existing task due/response rules and the pre-event state. This converts the pilot from a static staffing test into a resilience test: can the two-operator design absorb a realistic disturbance and return to standard?

## Best current strategy
1. Run readiness gate and freeze pilot configuration before start.
2. Verify observer measurement system and pre-register decision rules.
3. Validate/confidence-tag the 736-minute workload, especially 336 minutes Maintenance Support.
4. Freeze qualifications, zones/routes, PRIMARY/FLEX, abnormal-response ownership, break relief and normal-model support boundaries.
5. Build NORMAL / BREAK-RELIEF / SURGE standardized-work combination and paired-load views.
6. Use a break-release handshake at every observed break and tag transfer outcome plus recovery debt.
7. Track Effective Manning: core operator hours + every external support/relief episode + donor-role impact.
8. Reconstruct interval Qualified Load Ratio and tag skill/concurrency/break/support constraints instead of relying on 55.8% shift-average utilization.
9. **For every overload/surge, measure the Pending-Work recovery curve and classify self-clearing vs support-cleared vs persistent recovery debt.**
10. Use Pending-Work Aging and NORMAL/WATCH/CONTAIN/RESTORED reaction control.
11. Run timestamped pilot with operating-state and deviation tags.
12. Separate IN-STANDARD from DEVIATED/CONTAINED exposure; reconstruct qualified capacity, recovery debt, support dependence and state-specific work sequence.
13. Normalize exposure, compare adequate matched shifts, apply frozen decision rules, fix demonstrated constraints and retest representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, ensure the observation log can link every overload/concurrent event to its recovery: **event start | Pending Work count/oldest age | event end | recovery complete | support used | protected work status**. Use the same existing raw event log rather than a separate form. After the pilot, plot Pending Work count/age around each surge and determine whether the frozen staffing model actually returned to its pre-event condition.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness is not verified.
- The 55.8% shift-average utilization can conceal short-duration qualified-load saturation and simultaneous demand.
- A short overload may be acceptable only if recovery is controlled; persistent recovery debt can be hidden by shift-end averages.
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
10. Pending-Work count and oldest-age history around overload/surge events, including recovery-complete timestamps.
11. External support/relief minutes by role plus donor-role backlog/recovery where people are borrowed.
12. Historical candidate shifts with comparable staffing, exposure, support, output, man-hours and TPMH.
13. Interval-level hands-on work content and qualification tags needed to reconstruct qualified demand versus available qualified operator-minutes.