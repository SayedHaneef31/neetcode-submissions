class Solution {

    public String encode(List<String> strs) 
    {
        StringBuilder sb=new StringBuilder();
        for(String s: strs)
        {
            int l=s.length();
            sb.append(l+"*"+s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) 
    {
        int pos=0;
        List<String> output=new ArrayList<String>();
        int i;
        for(i=0;i<str.length();)
        {
            char ch=str.charAt(i);
            if(ch!='*') 
            {
                i++;
            }
            else
            {
                int len=Integer.parseInt(str.substring(pos,i));
                output.add(str.substring(i+1,i+1+len));
                i=i+len+1;
                pos=i;
            }
        }
        return output;
    }
}
