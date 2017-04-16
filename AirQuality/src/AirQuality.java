import java.awt.Color;

/**
 * An enumeration of all possible AirQuality objects.
 *
 * @author  Prof. David Bernstein, James Madison University
 * @version 1.0
 */
public enum AirQuality
{
    GOOD           ("Good", 0, 50, new Color(0, 228, 0)),
    MODERATE       ("Moderate", 51, 100, new Color(255, 255, 0)),
    SENSITIVE      ("Unhealthy for Sensitive Groups", 101, 150, new Color(255, 126, 0)),
    UNHEALTHY      ("Unhealthy", 151, 200, new Color(255, 0, 0)),
    VERY_UNHEALTHY ("Very Unhealthy", 201, 300, new Color(153, 0, 76)),
    HAZARDOUS      ("Hazardous", 301, 500, new Color(126, 0, 35));
    
    private final Color  color;    
    private final int    max, min;    
    private final String description;
    
    /**
     * Explicit Value Constructor.
     *
     * @param description   A description of this AirQuality object
     * @param min           The minimum AQI for this AirQuality object
     * @param min           The maximum AQI for this AirQuality object
     * @param color         The Color of this AirQuality object
     */
    private AirQuality(String description, int min, int max, Color color)
    {
        this.description = description;
        this.min         = min;
        this.max         = max;
        this.color       = color;
    }

    public Color getColor()
    {
        return color;
    }

    public int getMax()
    {
        return max;
    }

    public int getMin()
    {
        return min;
    }

    public String getDescription()
    {
        return description;
    }
    
    public boolean contains(int aqi)
    {
       return aqi < getMax() && aqi >= getMin();
    }
}
