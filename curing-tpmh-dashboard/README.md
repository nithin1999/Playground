# Curing TPMH Dashboard

## Current status
**Pilot scheduled for Thursday, September 24, 2026.** Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Pre-Defined Pilot Hold / Containment Gate
Before Thursday starts, separate **plant-authorized hard-stop conditions** from **analytical hold conditions** so the team does not improvise acceptance rules after seeing the result.

### Hard stop / containment
Safety, quality, equipment-protection, or other existing plant-authorized stop/containment requirements always override the experiment. The pilot does not create new safety or quality thresholds.

### Analytical HOLD — staffing configuration is no longer being independently tested
Mark the exposure HOLD and timestamp it when any of these occur:
- an incremental third person begins performing normal Curing operator work to sustain the 2-op configuration;
- required/protected work becomes overdue and cannot be recovered by the defined Op1/Op2 + authorized flex system;
- unresolved work queues continue growing while both operators are committed;
- break coverage cannot be executed as designed without unplanned staffing substitution;
- the frozen route/ownership method becomes impractical enough that the pilot is no longer testing the intended standard work.

A HOLD is **not automatically a failed project**. Contain as required, preserve the timestamps, classify the cause, and determine whether the exposure can restart under the frozen method. Do not erase the event by simply adding labor and continuing to report the period as independent 2-op operation.

This follows jidoka logic: abnormalities should be made visible and acted on rather than hidden by continuing degraded operation. It also prevents post-hoc pass/fail criteria from contaminating the pilot interpretation.

## Leader Reserve-Capacity Test
For every leader/flex assist record `call time | trigger | arrival | assist start/end | people-min | operators committed? | task assumed | backlog prevented/cleared | leader work displaced? | restored time | classification`.
Classify PLANNED LEAN SUPPORT / SURGE CAPACITY / STAFFING SUBSTITUTION / CONTAINMENT.

## Support Displacement Ledger
Every incremental support event must track both help received and donor-role displacement. Use `Adjusted TPMH = Cured Tires / (scheduled Curing labor-hours + incremental staffing-dependent support hours)` as a secondary diagnostic; do not count normal leadership presence or already-planned shared services unless the pilot causes additional work/displacement.

## Work-Interference / Collision Matrix
Record each instance where a new demand arrives while one or both operators are committed. Rank current-work × incoming-demand cells by backlog/delay, incremental support and failure to restore normal route, not frequency alone.

## Standard-Work Conformance / Deviation Log
For each 15-minute window record standard followed?, deviation, reason, workaround and consequence. Classify STANDARD FOLLOWED / JUSTIFIED DEVIATION / STANDARD NOT PRACTICAL.

## Matched-Condition Pilot Comparator
Build a reference set of prior comparable curing shifts using running press-hours, cured volume/plan, mix, major downtime, alarm/event counts, shift length and known staffing/support. Direct Thursday observations remain primary evidence; matched shifts are context.

## 15-Minute Workload / Surge Profile
Use 48 x 15-minute windows tagged NORMAL / BREAK-RELIEF / ABNORMAL-EVENT / DOWNTIME-RECOVERY. Retain Op1/Op2 occupied minutes, walking/retrieval, protected work, backlog start/peak/end, incremental support, running presses and abnormal events. Median/P90/P95/max are diagnostics, not staffing thresholds.

## Break-Relief Capacity Envelope
Treat breaks/meals as planned operating states. Keep displaced work visible as relief debt until completed. Classify INDEPENDENT / RECOVERED / ASSISTED / CONTAINED / NOT-EXPOSED.

## Trigger-Based Abnormal Response Ladder
**NORMAL ROUTE → ABNORMALITY VISIBLE/CALLED → PRIMARY OWNER → FLEX OWNER WHEN REQUIRED → FLOOR LEADER → CONTAINMENT/RESCUE → BACKLOG RECOVERY → NORMAL ROUTE**
Use existing plant-authorized rules; do not invent response-time thresholds.

## Pilot controls retained
- Pre-Pilot Readiness Gate: GO / GO-WITH-CONTAINMENT / NOT-READY.
- Pilot Intervention Firewall: observer records without coaching; normal floor authority remains intact; classify incremental support.
- Pilot Exposure Coverage Matrix: OBSERVED-INDEPENDENT / OBSERVED-ASSISTED / CONTAINED / NOT-EXPOSED.
- Protected-Work Backlog Aging: preserve real due times and oldest pending work.
- Qualified Capacity Matrix: I independently qualified / A assist only / N not authorized / ? not verified.
- Hour-by-Hour Demand-to-Capacity Board: plan/actual, running presses, abnormal events, direct work, walking, queues, backlog, relief/support and independent exposure.

## Best current strategy
1. Complete readiness gates and freeze people, zones, routes, qualifications, relief and plant-authorized reaction rules.
2. Before the pilot, write the hard-stop/containment rules already authorized by the plant and the analytical HOLD triggers above; do not invent thresholds during the run.
3. Define the floor leader/flex role, protected leader responsibilities, break/meal coverage and protected-work ownership.
4. Freeze the matched historical comparison method before seeing Thursday's result.
5. Scenario-walk break + abnormality, simultaneous demand, flex assist, two-person tasks and one HOLD/restart scenario.
6. Run Thursday with exception logging, exposure tracking, reaction timestamps, break records, hourly plan-vs-actual and 15-minute workload windows.
7. When a HOLD trigger occurs, timestamp it, contain/escalate under plant rules, preserve the evidence and classify the cause; do not mask it with hidden labor.
8. Record standard-work deviations, work-interference collisions and every leader/flex/support event with donor-role displacement.
9. Reconstruct occupancy, queues, backlog aging, relief debt, support chains and route restoration.
10. Normalize against running press-hours, event demand, mix and downtime; compare closest-condition historical shifts.
11. Diagnose persistent capacity vs surge reserve vs standard-work practicality vs skill vs motion/routing vs relief vs equipment/process loss vs staffing substitution.
12. Change only the demonstrated constraint and repeat representative/missing exposure before recommending permanent staffing change.

## Immediate next action
Before Thursday, add a small **Pilot HOLD / Containment** box to the observer sheet. Copy the plant's existing safety/quality/equipment stop rules, then list the analytical HOLD triggers. Define who has authority to contain/restart. During the pilot, timestamp every HOLD, reason, intervention, added labor, backlog state and restoration time.

## Risks / gaps
- No verified Thursday performance exists yet.
- Exact plant-authorized safety/quality/equipment stop criteria and restart authority have not been supplied here.
- Alarm concurrency is only a proxy for demand; it does not show operator work interference.
- A single shift can confound staffing with press availability, mix, downtime and abnormal-event demand.
- A quiet shift may under-expose collision combinations; NOT OBSERVED is not PASS.
- Hidden support can falsely validate staffing if donor-role displacement is not followed.
- Leader assistance may be legitimate lean reserve capacity, but repeated normal-work substitution would weaken the 2-op case.
- Shift/hour averages can hide brief overload and recovery debt.

## Data still needed
1. Actual Thursday Op1, Op2, floor leader, observer, rescue/shadow and relief assignments.
2. Existing plant safety/quality/equipment hard-stop criteria, containment authority and restart authority.
3. Floor leader's normal responsibilities and which must remain protected while assisting Curing.
4. Exact break/meal schedule and relief source/qualifications/home-role responsibilities.
5. Verified qualification matrix and one-person vs two-person task list.
6. Frozen Op1/Op2 zone/route map and primary/flex ownership.
7. Periodic/protected task list with real due-time/frequency requirements.
8. Existing plant abnormality detection/call, escalation and rescue/containment rules.
9. Thursday hourly plan/actual, running-press exposure, mix and downtime.
10. Timestamped occupied-work, walking/retrieval, response, queue/backlog, route-restoration, HOLD and standard-work deviation data.
11. Leader/flex/support people-minutes, reason, backlog effect and donor-role displacement/restoration.
12. Historical comparable-shift staffing, cured tires/plan, running press-hours, major downtime, alarm/event counts, mix, support condition and man-hours/TPMH.
