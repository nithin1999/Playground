# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Newly surfaced project data
- Project tracker records latest TPMH 18.52 on 2026-09-03 (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. Five listed shifts average 16.36. This is encouraging TPMH movement, but it is not a 2-operator pilot result.
- Current workload model totals 736 min = 12.27 labor-hours/shift. Against 22 net labor-hours for two operators, the deterministic model gives 55.8% utilization and 9.73 labor-hours nominal remaining capacity.
- Maintenance Support = 336 min (45.7% of modeled workload). Alarm Response 68 + Maintenance Support 336 + Bladder Support 60 + Changeover Support 84 = 548 min (74.5% of the 736-min model). Timing/clustering and qualification therefore matter as much as the shift total.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Qualification-Constrained Capacity Test
The Interval Load Index assumes that available operator-minutes are interchangeable. That is only valid when both operators are qualified and authorized to perform the work that becomes due. A nominal 30 operator-minutes in a 15-minute window can therefore overstate usable capacity if a required task can only be performed by one operator or needs two qualified people simultaneously.

For each required work family observed Thursday (for example alarm/containment, bladder, changeover, protected checks, manual load/unload, maintenance support), record which of Op1 and Op2 are qualified/authorized and whether the task requires one or two people. Do not count leader/flex/rescue qualification as ordinary two-operator capacity.

For each 15-minute window calculate the existing **Interval Load Index = total due/committed work minutes / available two-operator minutes**, then perform a **qualification feasibility check**: for every skill-restricted work family, compare its due/committed minutes with the minutes available from operators qualified for that work during the same window. If total load is below 100% but a skill-restricted workload exceeds its qualified capacity, classify the window as **QUALIFICATION-CONSTRAINED**, not capacity-feasible.

Also flag any event that waits solely because the available operator is not qualified/authorized, and measure qualification-wait minutes. This separates true manpower shortage from cross-training/skill-matrix shortage and prevents aggregate spare capacity from masking unusable capacity.

Do not invent qualifications from job titles or normal assignments; use the verified plant qualification/authorization matrix.

## Existing analysis retained
- Interval Capacity Stress Test using actual availability and due/committed work.
- Workload Confidence + BASE/PERIODIC/SURGE/CONTINGENCY decomposition; validate the 336-min Maintenance Support element first.
- NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views.
- Response-Time Service-Level Curve: event/call → awareness → response start → arrival → containment → clear → route restored.
- Break-Relief Coverage Debt and donor-role displacement.
- Event-Driven Dispatch Priority Ladder.
- PRIMARY/FLEX ownership + handoff trigger.
- Demand-State Exposure Coverage; unobserved important states are NOT TESTED.
- Two-operator saturation exposure.
- Qualification-gated relief.
- Protected-work due-time visual control.
- Recovery Debt and route-restoration time.
- Leader/flex support people-minutes and donor-role displacement.
- Standard-work conformance and matched-condition historical comparison.

## Best current strategy
1. Freeze people, zones, routes, verified qualifications/authorizations, relief and plant-authorized reaction rules.
2. Freeze the 736-min workload model and tag each element by demand type and evidence quality; validate the 336-min Maintenance Support element first.
3. Map every required work family to qualified Op1/Op2 resources and identify one-person, two-person and skill-restricted tasks.
4. Assign PRIMARY/FLEX ownership, observable flex triggers, handback and dispatch priority without treating outside support as normal capacity.
5. Verify qualification-gated break coverage and protected-work due requirements.
6. Scenario-walk normal work, breaks, competing demands, simultaneous abnormalities, skill-restricted work, two-person tasks and interruption/recovery.
7. Run Thursday with timestamped work elements, abnormal-response milestones, 15-minute workload/exposure windows, queues, saturation, qualification waits and support.
8. Reconcile observed task-category minutes/events to the workload model; separate BASE/PERIODIC from SURGE/CONTINGENCY.
9. Calculate Interval Load Index, then test whether each skill-restricted workload fits within the capacity of operators actually qualified and available for it.
10. Build NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views and response-time distributions; identify aggregate-capacity versus qualification-constrained windows.
11. Reconstruct Recovery Debt, Break-Relief Coverage Debt, hidden support, qualification waits and route restoration.
12. Normalize for running press-hours, event demand, mix and downtime; compare matched historical conditions.
13. Diagnose workload-model error vs aggregate overload vs qualification bottleneck vs imbalance vs surge vs motion/routing vs dispatch vs relief vs equipment vs staffing substitution.
14. Correct only the demonstrated constraint; if the constraint is qualification, cross-train/authorize and retest rather than assuming a third operator is required. Repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, convert the qualification matrix into a simple task-family × Op1/Op2 coverage check and mark every task family as BOTH / OP1 ONLY / OP2 ONLY / TWO-PERSON / NOT VERIFIED. Scenario-walk at least one overlap in which the only qualified operator is already committed. During the pilot, timestamp qualification-caused waits separately from ordinary queueing.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- The deterministic 55.8% utilization can hide short-duration overload, clustering and unusable skill-constrained capacity.
- Maintenance Support alone is 45.7% of modeled labor; its definition, hands-on content, overlap and time distribution need validation.
- Aggregate available operator-minutes can falsely imply capacity if only one operator is qualified/authorized for a required task.
- A 15-minute load calculation is only valid if due/committed work is distinguished from legitimately deferrable work and actual operator availability is timestamped.
- Borrowed leader/flex labor and borrowed qualifications must remain explicit; including them as ordinary two-operator capacity would falsely validate the model.
- Latest TPMH 18.52 is not evidence that the 2-operator design works; staffing/conditions for that shift must not be assumed.
- Exact plant-authorized containment/restart and response-time requirements have not been supplied here.
- Break relief and hidden support can falsely validate staffing by moving labor/backlog elsewhere.
- No saturation on a low-demand Thursday is under-exposure, not proof.

## Data still needed
1. Verified task-family qualification/authorization matrix for actual Thursday Op1 and Op2, including one-person vs two-person requirements.
2. Actual Thursday Op1, Op2, leader, observer, rescue/shadow and relief assignments with availability timestamps.
3. Source-level detail behind the 336-min Maintenance Support workload: event definition, event count, hands-on time, overlap rules and time-of-shift distribution.
4. Demand-type/evidence tags for all workload-model rows and actual Thursday category minutes/events.
5. Which work elements are truly due/committed within a 15-minute interval versus legitimately deferrable, based on existing plant requirements.
6. Existing plant safety/quality/equipment containment, restart, abnormal-response priority and response-time requirements.
7. Frozen Op1/Op2 zone/route map, PRIMARY/FLEX ownership and handoff rules.
8. Exact break schedule, relief source, relief qualifications and donor-role responsibilities.
9. Protected/periodic task list with real due requirements.
10. Thursday timestamped work elements, qualification waits, response milestones, running-press exposure, queues, saturation, support, mix, output and downtime.
11. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours, TPMH and workload/response timestamps where available.