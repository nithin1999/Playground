# Curing TPMH Dashboard

## Current status
Pilot scheduled for Thursday, September 24, 2026. Project remains in pilot-preparation / execution mode. No 2-operator success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Newly surfaced project data
- Project tracker records latest TPMH 18.52 on 2026-09-03 (1,306 cured tires / 70.5 man-hours), versus baseline 14.57 and target 20.97. Five listed shifts average 16.36. This is encouraging TPMH movement, but it is not a 2-operator pilot result.
- Current workload model totals 736 min = 12.27 labor-hours/shift. Against 22 net labor-hours for two operators, the deterministic model gives 55.8% utilization and 9.73 labor-hours nominal remaining capacity.
- The workload is highly concentrated: Maintenance Support = 336 min (45.7% of modeled workload). Alarm Response 68 + Maintenance Support 336 + Bladder Support 60 + Changeover Support 84 = 548 min (74.5% of the 736-min model). These are not all necessarily steady/repetitive base work, so timing/clustering matters as much as the shift total.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — Interval Capacity Stress Test
The 55.8% shift-average utilization can hide local overload. Use the existing 15-minute pilot windows to calculate a time-local capacity test instead of adding another observer form.

For each 15-minute window, calculate **Available Operator-Minutes** from the people actually available to Curing. Two fully available operators provide 30 operator-minutes in a 15-minute window; if one is on break or unavailable, capacity must reflect that actual availability. Keep leader/flex/outside-support minutes separate rather than silently increasing the two-operator denominator.

Calculate **Due/Committed Work Minutes** as labor that had to occur in that window: active abnormal-response hands-on work, protected/periodic work actually due, required manual work, and recovery work that could not be deferred without consequence. Flexible work that can legitimately move to another window should not be forced into the numerator.

Then calculate **Interval Load Index = Due/Committed Work Minutes / Available 2-Operator Minutes** and pair it with queue growth, oldest waiting work, Recovery Debt, response latency, and outside-support minutes. A window above 100% means the due/committed labor demand exceeded the available two-operator labor capacity for that interval; the consequence must appear as deferral, queue/debt, support, or missed/late work. Do not invent a lower acceptance threshold before observing the plant process.

This directly tests whether the 9.73 nominal labor-hour reserve is usable reserve or merely capacity that exists at the wrong times. Analyze the maximum and upper-tail interval load, not only the shift average, and separate NORMAL, BREAK-RELIEF and SURGE/SATURATION windows.

## Existing analysis retained
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
1. Freeze people, zones, routes, qualifications, relief and plant-authorized reaction rules.
2. Freeze the 736-min workload model and tag each element by demand type and evidence quality; validate the 336-min Maintenance Support element first.
3. Assign PRIMARY/FLEX ownership, observable flex triggers, handback and dispatch priority.
4. Verify qualification-gated break coverage and protected-work due requirements.
5. Scenario-walk normal work, breaks, competing demands, simultaneous abnormalities, two-person tasks and interruption/recovery.
6. Run Thursday with timestamped work elements, abnormal-response milestones, 15-minute workload/exposure windows, queues, saturation and support.
7. Reconcile observed task-category minutes/events to the workload model; separate BASE/PERIODIC from SURGE/CONTINGENCY rather than relying on the 55.8% shift-average utilization.
8. For each 15-minute window, calculate actual available 2-operator minutes, due/committed work minutes and Interval Load Index; keep borrowed support outside the denominator.
9. Build NORMAL / BREAK-RELIEF / SURGE-SATURATION operator-balance views and response-time distributions; identify windows where local capacity, not shift-average capacity, is the constraint.
10. Reconstruct Recovery Debt, Break-Relief Coverage Debt, hidden support, qualification waits and route restoration.
11. Normalize for running press-hours, event demand, mix and downtime; compare matched historical conditions.
12. Diagnose workload-model error vs interval overload vs imbalance vs surge vs motion/routing vs dispatch vs qualification vs relief vs equipment vs staffing substitution.
13. Correct the demonstrated constraint/model assumption and repeat representative exposure before permanent staffing change.

## Immediate next action
Before Thursday, keep the existing observation form but confirm it can reconstruct actual operator availability and due/committed work in each 15-minute window. Audit the 336-min Maintenance Support line first. After the pilot, calculate Interval Load Index beside saturation, queue growth, Recovery Debt and support minutes. This is the direct stress test of whether the nominal 9.73-hour reserve is available when demand actually occurs.

## Risks / gaps
- No verified Thursday 2-operator performance exists yet.
- The deterministic 55.8% utilization can hide short-duration overload and clustering.
- Maintenance Support alone is 45.7% of modeled labor; its definition, hands-on content, overlap and time distribution need validation.
- A 15-minute load calculation is only valid if due/committed work is distinguished from legitimately deferrable work and actual operator availability is timestamped.
- Borrowed leader/flex labor must remain explicit; including it as ordinary two-operator capacity would falsely validate the model.
- Latest TPMH 18.52 is not evidence that the 2-operator design works; staffing/conditions for that shift must not be assumed.
- Exact plant-authorized containment/restart and response-time requirements have not been supplied here.
- Break relief and hidden support can falsely validate staffing by moving labor/backlog elsewhere.
- No saturation on a low-demand Thursday is under-exposure, not proof.

## Data still needed
1. Actual Thursday Op1, Op2, leader, observer, rescue/shadow and relief assignments with availability timestamps.
2. Source-level detail behind the 336-min Maintenance Support workload: event definition, event count, hands-on time, overlap rules and time-of-shift distribution.
3. Demand-type/evidence tags for all workload-model rows and actual Thursday category minutes/events.
4. Which work elements are truly due/committed within a 15-minute interval versus legitimately deferrable, based on existing plant requirements.
5. Existing plant safety/quality/equipment containment, restart, abnormal-response priority and response-time requirements.
6. Verified qualification matrix and one-person vs two-person task list.
7. Frozen Op1/Op2 zone/route map, PRIMARY/FLEX ownership and handoff rules.
8. Exact break schedule, relief source, relief qualifications and donor-role responsibilities.
9. Protected/periodic task list with real due requirements.
10. Thursday timestamped work elements, response milestones, running-press exposure, queues, saturation, support, mix, output and downtime.
11. Historical matched shifts with staffing, press-hours, event counts, mix, support, cured tires, man-hours, TPMH and workload/response timestamps where available.