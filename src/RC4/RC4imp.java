package RC4;

class RC4imp
{
	String ptext;
	private String key;
	RC4imp(String k)
	{
		key=k;
	}
	int[] encrypt (String msg)
	{
		ptext=msg;
		int temp=0,i,j=0,z=0,l;
		int s[]=new int[256];
		int k[]=new int[256];
		char ptextc[]=ptext.toCharArray();
		char keyc[]=key.toCharArray();
		int cipher[]=new int[ptext.length()];
		for(i=0;i<255;i++)
		{
			s[i]=i;
			k[i]=(int)keyc[i%key.length()];
		}
		for(i=0;i<255;i++)
		{
			j=(j+s[i]+k[i])%256;
			temp=s[i];
			s[i]=s[j];
			s[j]=temp;
		}
		i=0;
		j=0;
		for(l=0;l<ptext.length();l++)
		{
			i=(l+1)%256;
			j=(j+s[i])%256;
			temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			z=s[(s[i]+s[j])%256];
			cipher[l]=z^(int)ptextc[l];
		}
		return(cipher);
	}
	int[] decrypt (String cipher)
	{
		int temp=0,i,j=0,z=0,l;
		int s[]=new int[256];
		int k[]=new int[256];
		int decrypt[]=new int[cipher.length()];
		char cipherc[]=cipher.toCharArray();
		char keyc[]=key.toCharArray();
		for(i=0;i<255;i++)
		{
			s[i]=i;
			k[i]=(int)keyc[i%key.length()];
		}
		for(i=0;i<255;i++)
		{
			j=(j+s[i]+k[i])%256;
			temp=s[i];
			s[i]=s[j];
			s[j]=temp;
		}
		i=0;
		j=0;
		for(l=0;l<cipherc.length;l++)
		{
			i=(l+1)%256;
			j=(j+s[i])%256;
			temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			z=s[(s[i]+s[j])%256];
			decrypt[l]=z^(int)cipherc[l];
		}
		return(decrypt);
	}
}