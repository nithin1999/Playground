# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Current status
Design/validation phase. No 2-operator pilot success or permanent manpower reduction is claimed. Tricycle remains closed after Safety rejection.

## Evidence retained
- Comparable August alarm set: 8,732 events from 55 presses; A65 supplied data are September-period and remain outside raw August totals.
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator hands-on labor; actual response labor is still required.

## Latest improvement — context-matched pilot comparison
Do not judge 2-operator feasibility from a convenient or naturally short-manned shift alone. A machine-intensive curing shift can change materially with running press-hours, production demand, product/mix, alarm burden, gantry downtime/manual recovery, attendance, Mold/Bladder workload, break windows and time of shift. A successful low-load exposure is evidence only for that operating context.

Add a **Pilot Context Card** to every 3-op baseline and shadow/2-op exposure. Freeze the fields before comparing results: crew/shift, scheduled and actual staffing, running press-hours/cycles, plan and actual tires, product/mix proxy available in plant data, alarm events and hands-on abnormal minutes, major gantry/press downtime, Mold/Bladder due/completed/carryover, break/relief windows, attendance/call-ins, and any unusual operating condition.

Classify exposures into context bands using observed plant data rather than invented thresholds. Compare 2-op performance first against 3-op periods with the closest operating context. Report unmatched conditions explicitly. Keep the existing 30-minute Capacity Reserve + recovery logic inside each exposure.

This prevents selection bias: intentionally using naturally short-manned shifts can be a practical and discreet way to obtain early observations, but it must not become the evidence standard if those shifts happen to have unusually low running equipment, production demand or abnormal workload. Representative high-demand, break, alarm-concurrency and downtime/recovery conditions still need validation before a permanent manpower decision.

## Best current strategy
1. Map presses/travel and remove avoidable motion; compare candidate zone layouts on occupied work + peaks + travel.
2. Freeze NORMAL-mode workload/travel-balanced routes for predictable work.
3. Freeze ABNORMAL-mode dispatch priority, cross-support, escalation and return-to-standard rules.
4. Protect interrupted routine work with a visible pending-work/recovery queue.
5. Verify two-deep critical-task qualification across crews.
6. Reserve break-relief capacity while retaining the helper's own due work.
7. Build the 30-minute Capacity Reserve + Recovery Profile for normal, abnormal and break windows.
8. Freeze measurement definitions, Leader Standard Work, SIC cadence and Green/Amber/Red authority.
9. Add the Pilot Context Card and collect a context-characterized 3-op baseline.
10. Shadow 2-op; compare first with context-matched 3-op periods and measure support, backlog, relief, route, qualification and escalation exceptions.
11. Pareto structural-overload and exception windows; revise zones, standard work and support rules.
12. Expand deliberately across underrepresented contexts and A/B/C/D crews; move to true 2-op only after representative conditions pass without hidden support, recurring overload, protected-work failure, missed relief or persistent backlog.

## Pilot gates
- **Gate 0 — Data/design:** mapped layout, normalized alarm evidence, travel study and workload/travel-balanced candidate zones.
- **Gate 1 — Standard work/skills:** NORMAL route, ABNORMAL dispatch/recovery standard, routine-work matrix, response matrix, visible pending-work queue and verified critical-task coverage.
- **Gate 2 — Relief/capacity:** Relief Capacity Reservation Matrix plus preliminary 30-minute Capacity Reserve + Recovery Profile.
- **Gate 3 — Management/measurement:** measurement dictionary, observer check, Leader Standard Work, visual controls, SIC ownership, intervention taxonomy, and Pilot Escalation & Recovery Matrix.
- **Gate 4 — Baseline/context:** current 3-op state measured with identical definitions plus Pilot Context Card.
- **Gate 5 — Shadow 2-op:** capture context, busy/free state, response labor, interventions, relief exceptions, displaced work, recovery aging, route exceptions, qualification conflicts and escalation triggers.
- **Gate 6 — Matched analysis/revise:** compare context-matched exposures; Pareto structural-overload/exception windows and revise the operating system.
- **Gate 7 — Coverage:** deliberately test underrepresented demand, concurrency, break, downtime/recovery and crew conditions.
- **Gate 8 — True 2-op/control:** demonstrated acceptance across representative conditions; controlled standard work, skills, relief, escalation, SIC and control plan.

## Immediate next action
Add the **Pilot Context Card** to the existing observation sheet before the first pilot comparison. Populate it for one representative 3-op baseline shift and every subsequent shadow/2-op exposure. Do not reject naturally short-manned trials; use them as early learning exposures, but label their context and avoid generalizing beyond it.

## Data still needed
1. Running press-hours/cycles by shift and 30-minute interval.
2. Production plan/actual and available product/mix indicator by shift.
3. Alarm notification, arrival, hands-on start/end and equipment-clear timestamps; operator busy/free state.
4. Major press/gantry downtime and manual-support people-minutes.
5. Planned/actual breaks and primary/alternate relief with helper due work.
6. Routine work-element minutes, due timing and pending-work creation/recovery timestamps.
7. Mold/Bladder required, completed and carryover by shift/due time.
8. Attendance/call-ins and actual staffing by role/crew.
9. Exact press positions and representative travel paths/times.
10. Task-level qualification matrix and decision/escalation authority.
11. Existing YTMM safety/quality/process response and completion requirements.
12. Enough 3-op baseline observations to create context bands without inventing thresholds.
