package com.part.seven.item.fifty;

import java.util.Date;

/**
 * Item 50: Make defensive copies when needed.
 *
 * Always make defensive copies of mutable objects passed to or returned from your methods to prevent
 * unintended modifications to internal state.
 */
public class MakeDefensiveCopiesWhenNeeded {

    // Bad Example: Returning mutable internal state
    static class PeriodBad {
        private final Date start;
        private final Date end;

        public PeriodBad(Date start, Date end) {
            this.start = start;
            this.end = end;
        }

        public Date getStart() {
            return start; // Exposes internal state
        }

        public Date getEnd() {
            return end; // Exposes internal state
        }
    }

    // Good Example: Defensive copies
    static class Period {
        private final Date start;
        private final Date end;

        public Period(Date start, Date end) {
            this.start = new Date(start.getTime());
            this.end = new Date(end.getTime());
        }

        public Date getStart() {
            return new Date(start.getTime());
        }

        public Date getEnd() {
            return new Date(end.getTime());
        }
    }

    public static void main(String[] args) {
        System.out.println("Make Defensive Copies When Needed\n");

        // Bad Example
        Date start = new Date();
        Date end = new Date(start.getTime() + 1000000);
        PeriodBad periodBad = new PeriodBad(start, end);
        System.out.println("Bad Example: Start = " + periodBad.getStart());
        periodBad.getStart().setTime(0); // Modifies internal state
        System.out.println("Bad Example: Start (Modified) = " + periodBad.getStart());

        // Good Example
        Period period = new Period(start, end);
        System.out.println("Good Example: Start = " + period.getStart());
        period.getStart().setTime(0); // Does not modify internal state
        System.out.println("Good Example: Start (Unmodified) = " + period.getStart());
    }
}
