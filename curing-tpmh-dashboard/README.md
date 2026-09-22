# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Current evidence
- Latest tracker TPMH: **18.52 on 2026-09-03** (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. This is not a 2-operator pilot result.
- Current workload model: **736 min = 12.27 labor-hours/shift**. Against 22 net labor-hours for two operators, deterministic utilization is **55.8%** with 9.73 labor-hours nominal reserve.
- Maintenance Support = **336 min (45.7%)** of modeled labor. Alarm Response + Maintenance Support + Bladder Support + Changeover Support = **548 min (74.5%)**. Timing, clustering, route geometry and qualification therefore matter as much as the shift total.
- Comparable August alarm set: **8,732 events from 55 presses**. Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%. Alarm duration is not operator hands-on labor.

## Latest improvement — Route-Deviation / Motion-Loss Test
The 55.8% shift-average workload model can still overstate usable reserve if event-driven calls repeatedly pull operators away from their normal zones and create avoidable walking, backtracking, retrieval or cross-zone handoffs. Lean standardized-work practice separates manual work, walk time and machine time, and standardized-work charts make operator movement visible. For machine-intensive processes, the operator route may be driven by abnormal/andon demand rather than a fixed repetitive cycle, so motion should be measured from actual event paths rather than assumed from a cyclic route.

**Do not add a new continuous form.** Use Thursday's existing timestamp/event log and tag only route deviations or retrieval trips that occur because of an abnormal call, handoff, missing item/information, or cross-zone support.

For each tagged event capture: operator, origin zone, destination zone, trigger, whether the trip was required by the standard, retrieval/backtrack yes/no, approximate travel start/end, and whether the operator returned to unfinished work.

Calculate after the shift:
- **Route-Deviation Minutes** = observed walking/travel minutes outside the frozen normal route caused by abnormal demand, handoff, retrieval or backtracking.
- **Retrieval/Backtrack Count** = trips repeated because needed material/tool/information/person was not available at point of use.
- **Cross-Zone Assist Count + Minutes** = PRIMARY/FLEX movement outside normal ownership.
- Stratify by NORMAL, BREAK-RELIEF and SURGE/SATURATION states.

Do not invent a distance or walking threshold. First determine whether motion is materially consuming the nominal reserve and where it originates.

### Diagnostic logic
- High route-deviation minutes with low aggregate load → motion/layout/point-of-use problem before a manpower problem.
- High cross-zone assist time with asymmetric operator loading → zone/PRIMARY ownership imbalance.
- High retrieval/backtracking → point-of-use storage, information or tool-location problem.
- Route deviation concentrated during breaks → relief-zone design problem.
- Route deviation concentrated during simultaneous abnormalities → surge dispatch/zone geometry problem.
- Low route-deviation loss → retain the current route; do not optimize motion that is not material.

## Existing analysis retained
- Pending Work / Recovery Queue: Peak Pending WIP, Pending WIP minutes, Oldest Pending Age, carryover and unowned open work.
- Interruption / Restart-Loss Test: Interruption Tax and Fragmented Task Count.
- Qualification-Constrained Capacity Test.
- Interval Capacity Stress Test using actual availability and due/committed work.
- Workload Confidence + BASE/PERIODIC/SURGE/CONTINGENCY decomposition; validate the 336-min Maintenance Support element first.
- NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views.
- Response-Time Service-Level Curve.
- Break-Relief Coverage Debt and donor-role displacement.
- Event-Driven Dispatch Priority Ladder.
- PRIMARY/FLEX ownership + handoff trigger.
- Demand-State Exposure Coverage; unobserved important states are NOT TESTED.
- Two-operator saturation exposure, qualification-gated relief, protected-work due-time visual control, Recovery Debt, hidden support, standard-work conformance and matched-condition comparison.

## Best current strategy
1. Freeze people, zones, normal routes, verified qualifications/authorizations, relief and plant-authorized reaction rules.
2. Freeze/confidence-tag the 736-min workload model; validate the 336-min Maintenance Support element first.
3. Map every required work family to qualified Op1/Op2 resources and identify one-person, two-person and skill-restricted tasks.
4. Assign PRIMARY/FLEX ownership, observable flex triggers, handback and dispatch priority; outside support is not normal two-operator capacity.
5. Verify qualification-gated break coverage and protected-work due requirements.
6. Scenario-walk normal work, breaks, simultaneous abnormalities, skill-restricted work, two-person tasks, interruption/recovery and one cross-zone abnormal response.
7. Run Thursday with timestamped work elements, response milestones, 15-minute workload/exposure windows, queues, saturation, qualification waits, support, interruption flags and route-deviation tags.
8. Reconcile observed task-category minutes/events to the workload model and separate normal walking from abnormal route-deviation/retrieval loss.
9. Calculate Interval Load Index, qualification feasibility, Interruption Tax, Pending WIP and Route-Deviation Minutes.
10. Build NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views including manual work and observed walk/travel time.
11. Reconstruct Recovery Debt, Break-Relief Coverage Debt, hidden support, qualification waits, pending-work carryover and cross-zone support.
12. Normalize for running press-hours, event demand, mix and downtime; compare matched historical conditions.
13. Diagnose workload-model error vs overload vs qualification bottleneck vs fragmentation vs motion/layout vs imbalance vs surge vs dispatch vs relief vs equipment vs staffing substitution.
14. Correct only the demonstrated constraint and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, freeze the intended Op1/Op2 normal zone routes on one simple layout and scenario-walk one cross-zone abnormal call. Mark origin, destination, handoff, any retrieval/backtrack and return-to-route point. This establishes the reference needed to distinguish necessary response travel from avoidable motion during the pilot.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- 55.8% average utilization can hide short-duration overload, clustering, unusable skill-constrained capacity, interruption loss and excessive travel.
- Maintenance Support alone is 45.7% of modeled labor; definition, hands-on content, overlap and time distribution still need validation.
- No frozen route geometry or observed route-deviation burden is yet available.
- Borrowed leader/flex labor and cross-zone assistance must remain explicit.
- Latest TPMH 18.52 is not evidence that the 2-operator design works.
- Exact plant-authorized containment/restart and response-time requirements have not been supplied.
- Break relief and hidden support can falsely validate staffing by moving labor/backlog elsewhere.
- No saturation on a low-demand Thursday is under-exposure, not proof.

## Data still needed
1. Actual Thursday Op1/Op2 assignments and verified task-family qualifications/authorizations.
2. Frozen Op1/Op2 zone map and normal walking/response routes.
3. Source-level detail behind the 336-min Maintenance Support workload.
4. Whether current task times already include normal walking and interruption/restart/recheck allowances.
5. Thursday route-deviation, retrieval/backtrack and cross-zone-assist timestamps/minutes.
6. Thursday interruption and Pending Work records.
7. Due/committed versus legitimately deferrable work rules.
8. Plant safety/quality/equipment containment, restart, abnormal-response priority and response-time requirements.
9. Exact break schedule, relief source, relief qualifications and donor-role responsibilities.
10. Protected/periodic task list with real due requirements and two-person work requirements.
11. Thursday timestamped workload, response milestones, running-press exposure, queues, saturation, support, mix, output and downtime.
12. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours, TPMH and response/workload timestamps where available.