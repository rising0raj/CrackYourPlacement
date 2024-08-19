class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list=new ArrayList<String>();  
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<words.length;){
            int j=i+1,len = words[i].length();
            sb.setLength(0);
            for(;j<words.length && len+words[j].length() < maxWidth ;j++)
                len+=words[j].length()+1;

            if(i==j-1){
                sb.append(words[i]);
                while(len<maxWidth){
                    sb.append(" ");
                    len++;
                }
            }else if(j>=words.length){
                
                int sp = maxWidth-len;
                for(int t=i;t<j;t++)
                    sb.append(words[t]+" ");
                if(sp>0){
                    for(int k=1;k<sp;k++)
                        sb.append(" ");
                }else{
                    sb.delete(sb.length()-1,sb.length());
                }
            }else{
                int sp = (maxWidth-len)/(j-i-1);
                len+=sp*(j-i-1);
                int ext = (maxWidth - len);
                if(ext>0) sp++; 
                for(int t=i;t<j-1;t++){
                    sb.append(words[t]);
                    for(int k=0;k<=sp;k++)
                        sb.append(" ");
                    if(--ext == 0) sp--; 
                }
                sb.append(words[j-1]);
            }
            list.add(sb.toString());
            i=j;
        }
        return list;
    }
}
