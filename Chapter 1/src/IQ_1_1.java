import java.util.Hashtable;

public final class IQ_1_1 {

    /**
     * Determines if a string has all unique characters.
     * @param s input string
     * @return  string has all unique characters
     *
     *
     */
    public static boolean isUnique(String s)
    {
        // O(n) complexity with DS
        final boolean noDS = false;
        if (!noDS)
        {
            Hashtable<Character, Boolean> usedChar = new Hashtable<>();
            for (char c: s.toCharArray())
            {
                if (!usedChar.containsKey(c))
                {
                    usedChar.put(c, true);
                }
                else
                {
                    return !usedChar.get(c);
                }
            }
            return true;
        }
        else
        {

            return false;
        }
    }
}
