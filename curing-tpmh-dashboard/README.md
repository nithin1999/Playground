# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. **No measured 2-operator success or permanent manpower reduction is claimed.** Tricycle remains closed after Safety rejection. Pilot readiness has not yet been verified.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor and remains a major uncertainty.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Abnormal-Work Dispatch / Ownership Standard
The two-operator model now needs an explicit rule for **who responds to what when multiple demands appear**. Without a dispatch standard, two qualified operators can duplicate response to one event, cross paths unnecessarily, or allow older/protected work to age while chasing the newest alarm. This is a coordination loss, not necessarily a manpower shortage.

Use a simple visual abnormal-work queue during the pilot. Each open item should show: **time raised | machine/zone | task/event | safety/quality/equipment priority per existing plant rules | qualification required | PRIMARY owner | FLEX/backup | status | time accepted | time work started | time cleared**. Preserve existing plant escalation rules; do not invent numerical response thresholds.

Dispatch logic:
1. Existing safety, quality, equipment-protection and authorized stop/escalation rules always override productivity.
2. If only one operator is qualified/authorized, assign that operator and protect the other operator's base work.
3. Otherwise use frozen PRIMARY ownership first to avoid duplicate response and random walking.
4. FLEX crosses zones only when PRIMARY is already committed, unavailable/on break, or the defined reaction condition is reached.
5. When multiple eligible items compete, use existing due/response requirements and oldest pending work to make the next job visible rather than selecting ad hoc.
6. Every ownership transfer is explicit: ACCEPTED / WORKING / CLEARED. If external help is used, retain effective-manning and donor-backlog accounting.

Post-pilot, classify each concurrency episode as **clean dispatch | qualification-constrained | duplicate/unclear ownership | travel-induced delay | external-support dependent | true qualified-capacity saturation**. This distinguishes a bad dispatch design from a genuine need for more labor.

## Best current strategy
1. Run readiness gate and freeze pilot configuration before start.
2. Verify observer measurement system and pre-register decision rules.
3. Validate/confidence-tag the 736-minute workload, especially 336 minutes Maintenance Support.
4. Freeze qualifications, zones/routes, PRIMARY/FLEX, abnormal-response ownership, break relief and normal-model support boundaries.
5. Build NORMAL / BREAK-RELIEF / SURGE standardized-work combination and paired-load views.
6. **Use the visual abnormal-work dispatch queue and explicit PRIMARY/FLEX ownership transfer to prevent duplicate response and random walking.**
7. Use a break-release handshake at every observed break and tag transfer outcome plus recovery debt.
8. Track Effective Manning: core operator hours + every external support/relief episode + donor-role impact.
9. Reconstruct interval Qualified Load Ratio and tag skill/concurrency/break/support constraints instead of relying on 55.8% shift-average utilization.
10. For every overload/surge, measure the Pending-Work recovery curve and classify self-clearing vs support-cleared vs persistent recovery debt.
11. Use Pending-Work Aging and NORMAL/WATCH/CONTAIN/RESTORED reaction control.
12. Run timestamped pilot with operating-state and deviation tags.
13. Separate IN-STANDARD from DEVIATED/CONTAINED exposure; reconstruct qualified capacity, recovery debt, support dependence and state-specific work sequence.
14. Normalize exposure, compare adequate matched shifts, apply frozen decision rules, fix demonstrated constraints and retest representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, add a small **Open Abnormal Work** area to the existing pilot visual/log rather than creating another form: **raised | zone | task | required qualification | PRIMARY | FLEX | accepted | working | cleared**. Scenario-walk one simultaneous-demand case and one qualification-conflict case so Op1/Op2 know who owns the first response and when FLEX crosses zones. Record deviations during the real pilot instead of changing the rule mid-shift.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet; readiness is not verified.
- The 55.8% shift-average utilization can conceal short-duration qualified-load saturation and simultaneous demand.
- Undefined dispatch can create duplicate response, unnecessary cross-zone walking and aged Pending Work that falsely resembles insufficient manpower.
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
5. Existing task-specific priority, due/response and stop/escalation/restoration rules needed to finalize dispatch order.
6. Observer/support roster and explicit normal-model versus pilot-only support boundary.
7. Frozen Op1/Op2 zone map and normal walking/response routes.
8. Source-level detail behind the 336-min Maintenance Support workload.
9. Thursday raw timestamps for work, breaks, external interventions, Pending Work, qualification waits, response milestones, running presses, mix, output and downtime.
10. Pending-Work count and oldest-age history around overload/surge events, including recovery-complete timestamps.
11. External support/relief minutes by role plus donor-role backlog/recovery where people are borrowed.
12. Historical candidate shifts with comparable staffing, exposure, support, output, man-hours and TPMH.
13. Interval-level hands-on work content and qualification tags needed to reconstruct qualified demand versus available qualified operator-minutes.
14. Concurrency episodes with initial owner, any ownership transfer, duplicate response, travel delay and final clearance time.