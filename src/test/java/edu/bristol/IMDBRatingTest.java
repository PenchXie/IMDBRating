package edu.bristol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IMDBRatingTest
{
    @Test
    public void testAverageRating()
    {
        float averageRating;
        IMDBRating rater = new IMDBRating();

        averageRating = rater.addNewRating(0);
        assertTrue(averageRating == 0.0, "Adding 1st rating: average should be 2.0");

        averageRating = rater.addNewRating(2);
        assertTrue(averageRating == 1.0, "Adding 1st rating: average should be 2.0");

        averageRating = rater.addNewRating(10);
        assertTrue(averageRating == 4.0, "Adding 2nd rating: average should be 3.0");

        averageRating = rater.addNewRating(-5);
        assertTrue(averageRating == 4.0, "Adding 3rd rating: average should be 3.0 as well");

        averageRating = rater.addNewRating(11);
        assertTrue(averageRating == 4.0, "Adding 3rd rating: average should be 3.0 as well");
    }
}
