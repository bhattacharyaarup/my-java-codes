import java.io.*;
class AllCombi
{
	String word;
	public AllCombi()
	{
		word="";
	}
	public void input()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a word ");
		word=br.readLine();
	}
	void permute()
	{
		int inputLength = word.length();
		boolean used[] = new boolean[inputLength];
		StringBuffer outputString = new StringBuffer();
		char in[]= word.toCharArray( );
  
		combination (in, outputString, used, inputLength, 0);

	}

  void combination ( char in[], StringBuffer outputString, boolean used[], int inputlength, int level)
  {
     if(level == inputlength) 
	 {
		System.out.print (outputString.toString()+"\t"); 
		return;
	 }	

    for(int i = 0; i < inputlength; i++ )
    {       

       if(used[i]) 
			continue;

       outputString.append(in[i]);      
       used[i] = true;       
       combination(in, outputString, used, inputlength, level + 1);       
       used[i] = false;       
       outputString.setLength(outputString.length() - 1);   
    }
 }
 public static void main(String args[])throws IOException
 {
	AllCombi obj=new AllCombi();
	obj.input();
	obj.permute();
 }
 }