// This code is distributed under The MIT license.
package space.freename.uncommons.lang;

public class UncommonStringUtils
{
	public static String removeLeadingBom(String source)
	{
		return source.replace("\uFEFF", "");
	}
}

