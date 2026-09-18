# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — time-phased capacity reserve test
Do not approve the 2-operator design from average utilization or shift-end TPMH. Build a 30-minute **Capacity Reserve Profile** that compares demanded qualified operator-minutes with operator-minutes actually available in each window.

For each 30-minute window capture: protected routine-work minutes due, required walking/travel, measured hands-on abnormal-response minutes, break/relief effect, and staffing-dependent support. Keep displaced/deferred work in the demand side until recovered; otherwise overload can disappear from the calculation.

Calculate **capacity reserve = qualified operator-minutes actually available − demanded operator-minutes**. Also flag qualification conflicts and simultaneous-response periods separately because aggregate minutes alone cannot prove feasibility. During breaks, do not automatically credit a helper as 30 available minutes: credit only the capacity actually available after that helper's own due work.

Plot the reserve by time of shift for the 3-op baseline and shadow 2-op using identical definitions. Review the lowest-reserve windows together with backlog age, outside-support minutes, missed/delayed relief, and Green/Amber/Red escalations. Do not invent a utilization or reserve pass threshold; first establish the baseline distribution and use existing plant safety/quality/process requirements where they govern response or completion time.

This strengthens the staffing decision because Lean standardized work separates manual work, walking and machine time, while extended-shift guidance calls for workload to be examined rather than assumed from averages. The objective is to prove recoverable capacity across the shift, especially abnormal and break windows.

## Best current strategy
1. Map presses/travel and remove avoidable motion; compare candidate zone layouts on occupied work + peaks + travel.
2. Freeze NORMAL-mode workload/travel-balanced routes for predictable work.
3. Freeze ABNORMAL-mode dispatch priority, cross-support, escalation and return-to-standard rules.
4. Protect interrupted routine work with a visible pending-work/recovery queue.
5. Verify two-deep critical-task qualification across crews.
6. Reserve break-relief capacity while retaining the helper's own due work.
7. Build the 30-minute Capacity Reserve Profile for normal, abnormal and break windows; retain deferred work as demand until recovered.
8. Freeze measurement definitions, Leader Standard Work, SIC cadence and Green/Amber/Red authority.
9. Collect a context-characterized 3-op baseline using identical measures and capacity-reserve logic.
10. Shadow 2-op and measure concurrent alarm demand, staffing-dependent support, displaced work, backlog aging, relief, route, qualification conflicts and escalation exceptions.
11. Pareto the lowest-reserve/exception windows; revise zones, standard work and support rules.
12. Run sustained A/B/C/D rotation; move to true 2-op only after representative conditions pass without hidden support, recurring overload, protected-work failure, missed relief or persistent backlog.

## Pilot gates
- **Gate 0 — Data/design:** mapped layout, normalized alarm evidence, travel study and workload/travel-balanced candidate zones.
- **Gate 1 — Standard work/skills:** NORMAL route, ABNORMAL dispatch/recovery standard, routine-work matrix, response matrix, visible pending-work queue and verified critical-task coverage.
- **Gate 2 — Relief/capacity:** Relief Capacity Reservation Matrix plus preliminary 30-minute Capacity Reserve Profile for normal, abnormal and break windows.
- **Gate 3 — Management/measurement:** measurement dictionary, observer check, Leader Standard Work, visual controls, SIC ownership, intervention taxonomy, and Pilot Escalation & Recovery Matrix.
- **Gate 4 — Baseline/context:** current 3-op state measured with identical definitions, including actual relief performance, pending-work recovery and capacity reserve.
- **Gate 5 — Shadow 2-op:** capture busy/free state, response labor, interventions, relief exceptions, displaced work, recovery aging, route exceptions, qualification conflicts and escalation triggers.
- **Gate 6 — Revise:** Pareto low-reserve/exception windows and revise the operating system.
- **Gate 7 — Sustained trial:** full crew rotation without hidden support, recurring overload, missed protected work, failed relief or persistent carryover.
- **Gate 8 — True 2-op/control:** demonstrated acceptance across representative conditions; controlled standard work, skills, relief, escalation, SIC and control plan.

## Immediate next action
Build one **30-minute Capacity Reserve Profile** from a representative current 3-operator shift before the 2-operator pilot. For every interval, total routine work due + measured travel + measured hands-on abnormalities + unresolved/deferred work carried in, then compare with qualified operator-minutes actually available after breaks and other required duties. Mark any outside-support event, qualification conflict, delayed relief and backlog carryover on the same timeline. Use the identical sheet in the shadow 2-op condition.

## Data still needed
1. Existing YTMM safety/quality/process task priorities, response requirements and escalation limits.
2. Named decision authority by shift for abnormal dispatch and Green/Amber/Red responses.
3. Planned and actual break/lunch start/end by role and crew.
4. Primary/alternate qualified relief and helper due work during each break window.
5. Helper support minutes, displaced work and post-break carryover.
6. Exact press positions/IDs and representative origin-destination travel log.
7. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps by type/zone.
8. Operator free/busy state at abnormality arrival; responder and escalation path.
9. Time-of-day and plant-required timing/priority for routine work, with work-element minutes.
10. Pending routine-work creation/recovery timestamps and owner.
11. Press operating hours/cycles or press-hours by shift.
12. Mold and Bladder required/completed/carryover by shift and due time.
13. Gantry manual-support people-minutes and abnormality timing.
14. Task-level qualification matrix by person/crew and certification authority.
15. Team Lead availability and escalation authority.
16. Hourly/SIC plan vs actual production and TPMH.
17. Attendance/call-ins, product/mix context and major downtime by shift.
18. Qualified operator-minutes actually available by 30-minute interval, including break/helper constraints.
