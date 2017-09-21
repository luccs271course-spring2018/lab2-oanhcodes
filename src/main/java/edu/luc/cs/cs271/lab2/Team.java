package edu.luc.cs.cs271.lab2;

/**
 * A sports team.
 */
public class Team {
    /**
     * The team's name.
     */
    private String name;

    /**
     * The team's head coach.
     */
    private String headcoach;

    /**
     * The team's monetary funding level in thousands of US$.
     */
    private int funding;

    /**
     * Constructs a new team.
     */
    public Team(final String name, final String headcoach, final int funding) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }

        this.name = name;

        // DONE validity checking for headcoach
        // Use Regex to make sure headcoach name only has letters
        if (headcoach == null) {
            throw new IllegalArgumentException("headcoach is null");
        }

        this.headcoach = headcoach;

        // Done validity checking for funding
        if (funding <= 0) {
            throw new IllegalArgumentException("Funding must be greater than 0");
        }

        this.funding = funding;
        // DONE complete this constructor
    }

    /**
     * Returns the team's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the team's head coach.
     */
    public String getHeadcoach() {
        // DONE complete this method
        return this.headcoach;
    }

    /**
     * Returns the team's funding level.
     */
    public int getFunding() {
        // DONE complete this methods
        return this.funding;
    }
}