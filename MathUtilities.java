 

/**
 * Created by dan on 6/14/17.
 */
public class MathUtilities {

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Integer add(int baseValue, int difference) {
        int sum = 0;
        sum = baseValue + difference;
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Long add(long baseValue, long difference) {
        long sum = 0l;
        sum = baseValue + difference;
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Short add(short baseValue, short difference) {
        short sum = 0;
        sum = (short)(baseValue + difference);
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Byte add(byte baseValue, byte difference) {
        byte sum = 0;
        sum = (byte)(baseValue + difference);
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Float add(float baseValue, float difference) {
        float sum = 0.0f;
        sum = baseValue + difference;
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Double add(double baseValue, double difference) {
        double sum = 0.0d;
        sum = baseValue + difference;
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Integer subtract(int baseValue, int difference) {
        int diff = 0;
        diff = baseValue - difference;
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Long subtract(long baseValue, long difference) {
        long diff = 0l;
        diff = baseValue - difference;
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Short subtract(short baseValue, short difference) {
        short diff = 0;
        diff = (short)(baseValue - difference);
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Byte subtract(byte baseValue, byte difference) {
        byte diff = 0;
        diff = (byte)(baseValue - difference);
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Float subtract(float baseValue, float difference) {
        float diff = 0.0f;
        diff = baseValue - difference;
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Double subtract(double baseValue, double difference) {
        double diff = 0.0d;
        diff = baseValue - difference;
        return diff;
    }


    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Integer divide(int dividend, int divisor) {
        int intDivide;
        intDivide = (int)dividend/divisor;
        return intDivide;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Long divide(long dividend, long divisor) {
        long longDivide;
        longDivide = (long)dividend/divisor;
        return longDivide;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Short divide(short dividend, short divisor) {
        int shortDivide;
        shortDivide = dividend/divisor;
        return (short)shortDivide;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Byte divide(byte dividend, byte divisor) {
        int byteDivide;
        byteDivide = dividend/divisor;
        return (byte)byteDivide;
        
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Float divide(float dividend, float divisor) {
        float floatDivide;
        floatDivide = dividend/divisor;
        return floatDivide;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Double divide(double dividend, double divisor) {
        double doubleDivide;
        doubleDivide = dividend/divisor;
        return doubleDivide;
    }


    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Integer multiply(int multiplicand, int multiplier) {
        int intMultiply;
        intMultiply = multiplicand * multiplier;
        return intMultiply;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Long multiply(long multiplicand, long multiplier) {
        long longMultiply;
        longMultiply = multiplicand * multiplier;
        return longMultiply;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Short multiply(short multiplicand, short multiplier) {
        int shortMultiply;
        shortMultiply = multiplicand * multiplier;
        return (short)(shortMultiply);
    }
    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Byte multiply(byte multiplicand, byte multiplier) {
        int byteMultiply;     
        byteMultiply = multiplicand * multiplier;
        return (byte)(byteMultiply);
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Float multiply(float multiplicand, float multiplier) {
        float floatMultiply;
        floatMultiply = multiplicand * multiplier;
        return floatMultiply;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Double multiply(double multiplicand, double multiplier) {
        double doubleMultiply;
        doubleMultiply = multiplicand * multiplier;
        return doubleMultiply;
    }
}
