# Curing TPMH Dashboard

Project dashboard for the Curing TPMH / 2-operator staffing improvement project.

## Branch
`curing-tpmh-dashboard`

## Current strategy
- Keep two qualified people available at the presses at all times during the proposed 2-operator state.
- Balance Operator 1 and Operator 2 by actual occupied workload, not press count.
- Separate normal demand-state work from abnormal-response work; do not validate 2-op from a single aggregate utilization percentage.
- For this machine-intensive process, do **not** force alarms into a fixed cyclic patrol. Standardize predictable work and use alarm/andon signals to dispatch abnormal work.
- Tricycle concept is closed because Safety rejected it. Reduce travel through zone design, point-of-use supplies, material staging and alarm visibility.
- Mold and Bladder relief/support must be validated against their own due work and carryover.
- Baseline → shadow 2-op → sustained full-rotation trial → true 2-op only after all gates pass.

## Press alarm evidence retained
- Comparable August set: 8,732 August-dated alarm events from 55 press source files.
- A65 supplied file is September-period and remains outside raw August zone totals.
- Highest-frequency presses include A87 (515), A43 (506), A13 (363), A35 (336), A42 (301), A17 (278), A14 (238), A83 (229), A22 (196), A71 (189).
- Same-minute starts: 0 alarms 81.5%, 1 alarm 15.2%, 2 alarms 2.86%, >2 alarms 0.50%.
- Alarm duration is not operator labor; observed hands-on response time is still required.

## Latest improvement — standardized-work package before pilot
The next design gate is no longer only a workload calculation. Before the shadow pilot, create a **future-state standardized-work package for both operators**. This follows machine-intensive Lean practice: standardize predictable work, make movement/material locations visible, and let abnormal work remain signal-driven rather than pretending every task is a repeatable cycle.

The package should contain:
1. **Standardized Work Chart / route map** for Operator 1 and Operator 2: zone boundaries, home position, routine route, press locations, crossover/support path, point-of-use material locations, safety/quality checkpoints.
2. **Standardized Work Combination / time-phased workload view**: manual work, necessary walking, routine checks/material work, break coverage and machine processing separated. Retain the 30-minute Green/Yellow/Red demand profile for event-driven peaks.
3. **Abnormal-response sheet**: alarm ownership, when the second Curing operator cross-supports, when qualified backup is called, and when supervision escalation is required. Do not invent numerical trigger thresholds; calibrate from the shadow pilot.
4. **Backup Job Instruction / qualification sheet**: break press-relief work into major steps, key points/reasons and demonstrated qualification for Mold, Bladder and Team Lead backup. Use preparation → demonstration → trainee trial → follow-up rather than assuming cross-training from job title.
5. **Pilot intervention log**: every third-operator intervention records timestamp, reason, press/zone, duration, who was already occupied, and whether future-state backup could have handled it.

### Why this is a material improvement
The current strategy had a Yamazumi and demand-state test, but it did not yet convert the proposed two-person method into a trainable, auditable standard. A staffing reduction should not be approved against an analytical model alone. The future work method must be explicit enough that different crews can execute the same normal routes, recognize abnormalities and invoke the same support rules. This also creates the baseline documents for the Control phase after the pilot.

## Pilot gates
- **Gate 0 — Data/design readiness:** mapped press layout, comparable/normalized alarm data, workload-balanced zones and alarm visibility.
- **Gate 1 — Standard-work readiness:** both operator route charts, time-phased workload view, abnormal-response sheet, break/relief plan and backup qualification sheets complete.
- **Gate 2 — Baseline:** production, TPMH, backlog, walking, alarms, breaks and support under current staffing.
- **Gate 3 — Shadow 2-op:** third Curing operator is safety net; every intervention logged against the proposed standard.
- **Gate 4 — Revise standard:** use intervention evidence to revise zone ownership, routes, support triggers and qualifications before removing manpower.
- **Gate 5 — Sustained trial:** consecutive shifts/full crew rotation; production, response, support burden and Mold/Bladder carryover stable.
- **Gate 6 — True 2-op / Control:** safety, coverage, production, workload, abnormal-response and backlog criteria demonstrated; standardized-work documents become controlled visual standards and are revised through PDCA.

## Immediate next action
Draft the **blank future-state standard-work package now**, even before every measurement is complete. Populate only measured facts; leave unknown times/thresholds explicitly TBD. This will expose missing data faster than collecting disconnected observations and gives Dallten/operators a concrete artifact to review during the shadow pilot.

## Data still needed
1. Exact press physical positions / press IDs overlaid on the floor layout.
2. Alarm hands-on response time and operator arrival time by alarm type/zone.
3. Time-of-day for routine work elements (GIP, checks, documentation, manual work).
4. Press operating hours/cycles for alarm normalization if utilization differs materially.
5. Walking distance/time by task and origin/destination.
6. Current GIP/material/documentation locations.
7. Mold required/completed/carryover by shift and time due.
8. Bladder required/completed/carryover by shift and time due.
9. Actual break/lunch timing for Curing, Mold, Bladder, Gantry and Team Lead.
10. Gantry manual-support people and minutes.
11. Task-level backup qualification evidence for Mold, Bladder and Team Lead.
12. Team Lead activity/availability.
13. Hourly plan vs actual production and TPMH.
14. Attendance/call-in history.
