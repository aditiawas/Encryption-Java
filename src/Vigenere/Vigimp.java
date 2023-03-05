package Vigenere;

public class Vigimp
{
	private String key;
	
	public Vigimp (String k)
	{
		key = k.toUpperCase();
	}
	
	String getKey()
	{
		   return key;
	}
	
    String encrypt(String message)
    {
        String res = "";
        message = message.toUpperCase();
        for (int i = 0, j = 0; i < message.length(); i++)
        {
            char c = message.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
 
    String decrypt(String cipher)
    {
        String res = "";
        cipher = cipher.toUpperCase();
        for (int i = 0, j = 0; i < cipher.length(); i++)
        {
            char c = cipher.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
}